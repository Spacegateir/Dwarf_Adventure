package net.spacegateir.dwarfadventuremod.event.handlers;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.block.FernBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.spacegateir.dwarfadventuremod.enchantment.ModEnchantments;

import java.util.HashSet;
import java.util.Set;

public class PlantShrederEnchantmentHandler {

    // Register event handler for breaking leaf, vine, grass, fern, and tall fern blocks
    public static void register() {
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (!world.isClient() && world instanceof ServerWorld serverWorld) {
                // Call the plant-block-breaking handler if the broken block is a leaf, vine, grass, fern, or tall fern block
                handlePlantBlockBreak(player, serverWorld, pos);
            }
            return ActionResult.PASS;
        });
    }

    // Main handler method to trigger vein-mining for leaves, vines, grass, and ferns
    public static void handlePlantBlockBreak(PlayerEntity player, ServerWorld world, BlockPos originPos) {
        ItemStack tool = player.getMainHandStack();

        // Check if the tool has PlantShrederEnchantment and is not on cooldown
        if (EnchantmentHelper.getLevel(ModEnchantments.PLANT_SHREDER, tool) > 0 // Use the registered enchantment instance
                && !player.getItemCooldownManager().isCoolingDown(tool.getItem())) {

            // Set to keep track of blocks already visited to avoid infinite loops
            Set<BlockPos> visitedBlocks = new HashSet<>();

            // Break connected leaf, vine, grass, fern, and tall fern blocks of the same type
            breakConnectedPlantBlocks(world, originPos, tool, player, visitedBlocks);

            // Set a cooldown for the tool after breaking all connected plant blocks
            player.getItemCooldownManager().set(tool.getItem(), visitedBlocks.size());
        }
    }

    // Recursive method to break all connected leaf, vine, grass, fern, and tall fern blocks of the same type
    private static void breakConnectedPlantBlocks(ServerWorld world, BlockPos pos, ItemStack tool, PlayerEntity player, Set<BlockPos> visitedBlocks) {
        // Base case: avoid revisiting the same block
        if (visitedBlocks.contains(pos)) return;
        visitedBlocks.add(pos);

        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        // Only process leaf, vine, grass, fern, or tall fern blocks
        if (!(block instanceof LeavesBlock || block instanceof VineBlock || block instanceof FernBlock)) return;

        // Break the current block
        world.breakBlock(pos, true);

        // Damage the tool by 1 durability for each block broken
        tool.damage(1, player, (p) -> p.sendToolBreakStatus(Hand.MAIN_HAND));

        // Recursively check and break adjacent plant blocks of the same type
        for (Direction direction : Direction.values()) {
            BlockPos adjacentPos = pos.offset(direction);
            BlockState adjacentState = world.getBlockState(adjacentPos);

            // Check if the adjacent block is the same type of plant (leaf, vine, grass, fern, or tall fern)
            if (adjacentState.getBlock() == block) {
                breakConnectedPlantBlocks(world, adjacentPos, tool, player, visitedBlocks);
            }
        }
    }
}
