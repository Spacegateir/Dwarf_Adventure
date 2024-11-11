package net.spacegateir.dwarfadventuremod.event.handlers;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.enchantment.ModEnchantments;

import java.util.HashSet;
import java.util.Set;

public class EarthSplitterEnchantmentHandler {

    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            ItemStack tool = player.getMainHandStack();
            int level = EnchantmentHelper.getLevel(ModEnchantments.EARTH_SPLITTER, tool);

            // Check if the enchantment is on the tool and the block is mineable with a shovel or hoe
            if (level > 0 && isBlockMineable(state) && !player.getItemCooldownManager().isCoolingDown(tool.getItem())) {
                int blocksBroken = 0;

                // Set the radius based on the enchantment level
                int radius = 10 + (level - 1) * 10; // Level 1 = 10, Level 2 = 20, Level 3 = 30

                // Perform vein breaking based on enchantment level
                blocksBroken = breakVein(world, player, pos, state, radius, level);

                // Apply durability damage based on the number of blocks broken
                tool.damage(blocksBroken, player, (p) -> p.sendToolBreakStatus(player.getActiveHand()));

                // Set cooldown for the specific tool used to break the block
                player.getItemCooldownManager().set(tool.getItem(), blocksBroken);

                // Return false to prevent the default block breaking behavior
                return false;
            }

            // Return true to allow default block breaking if enchantment is not present or conditions not met
            return true;
        });
    }

    private static boolean isBlockMineable(BlockState state) {
        // Check if the block is either shovel or hoe mineable
        return state.isIn(BlockTags.SHOVEL_MINEABLE) || state.isIn(BlockTags.HOE_MINEABLE);
    }

    private static int breakVein(World world, PlayerEntity player, BlockPos originPos, BlockState state, int radius, int level) {
        Set<BlockPos> minedBlocks = new HashSet<>();
        int totalBlocksMined = mineConnectedBlocks(world, originPos, state.getBlock(), minedBlocks, player, radius, level);

        // Apply a cooldown for each block mined (this can be adjusted if needed)
        return totalBlocksMined;
    }

    private static int mineConnectedBlocks(World world, BlockPos origin, Block block, Set<BlockPos> minedBlocks, PlayerEntity player, int radius, int level) {
        int totalBlocksMined = 0;

        // Iterate over all positions within the radius (10 for level 1, 20 for level 2, 30 for level 3)
        for (BlockPos pos : BlockPos.iterateOutwards(origin, radius, radius, radius)) {
            if (minedBlocks.size() >= level * 10) {
                break; // Stop if we've mined enough blocks (10 blocks per level)
            }

            // Check if the block is within the radius, matches the block type, and hasn't been mined yet
            BlockState blockState = world.getBlockState(pos);
            if (!minedBlocks.contains(pos) && blockState.getBlock() == block && isBlockMineable(blockState)) {
                minedBlocks.add(pos); // Add to the set of mined blocks
                totalBlocksMined++; // Increment the mined blocks counter

                // Mine the block and damage the tool
                world.breakBlock(pos, true, player);
                ItemStack tool = player.getMainHandStack();
                tool.damage(1, player, (p) -> p.sendToolBreakStatus(player.getActiveHand()));
            }
        }

        return totalBlocksMined;
    }
}
