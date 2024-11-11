package net.spacegateir.dwarfadventuremod.event.handlers;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.enchantment.ModEnchantments;

public class LumberJackEnchantmentHandler {

    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            ItemStack tool = player.getMainHandStack();
            int level = EnchantmentHelper.getLevel(ModEnchantments.LUMBER_JACK, tool);

            // Check if the tool has the Lumber Jack enchantment and isn't on cooldown
            if (level > 0 && !player.getItemCooldownManager().isCoolingDown(tool.getItem())) {
                int blocksBroken = 0;

                // Perform tree chopping based on enchantment level
                if (level == 1) {
                    blocksBroken = chopTree(world, pos); // Level 1 behavior: only vertical
                } else if (level == 2) {
                    blocksBroken = chopTreeWithRadius(world, pos, 2); // Start with a radius of 2
                }

                // Apply durability damage based on the number of blocks broken
                tool.damage(blocksBroken, player, (p) -> p.sendToolBreakStatus(player.getActiveHand()));

                // Set cooldown for the specific tool used to break the block
                player.getItemCooldownManager().set(tool.getItem(), blocksBroken);
            }
            return true;
        });
    }

    // Level 1 - Chops tree vertically and returns the number of blocks broken
    private static int chopTree(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        int blocksBroken = 0;

        if (isLog(state)) {
            world.breakBlock(pos, true);
            blocksBroken += 1 + chopTree(world, pos.up()); // Recursively chop upwards
        }

        return blocksBroken;
    }

    // Level 2 - Chops tree vertically and within a radius, returns the total number of blocks broken
    private static int chopTreeWithRadius(World world, BlockPos pos, int radius) {
        int blocksBroken = 0;

        // Break logs vertically above the initial position
        BlockPos abovePos = pos.up();
        while (isLog(world.getBlockState(abovePos))) {
            world.breakBlock(abovePos, true);
            blocksBroken += 1 + chopTreeWithRadius(world, abovePos, radius); // Chain reaction on each vertically broken log
            abovePos = abovePos.up();
        }

        // Break logs in a radius around each broken log
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) { // Include both upwards and downwards
                for (int dz = -radius; dz <= radius; dz++) {
                    if (dx == 0 && dy == 0 && dz == 0) continue; // Skip the initial block position

                    BlockPos targetPos = pos.add(dx, dy, dz);
                    BlockState targetState = world.getBlockState(targetPos);

                    if (isLog(targetState)) {
                        world.breakBlock(targetPos, true);
                        blocksBroken += 1;
                        blocksBroken += chopTreeWithRadius(world, targetPos, radius);
                    }
                }
            }
        }

        return blocksBroken;
    }

    // Utility method to check if a block is a log
    private static boolean isLog(BlockState state) {
        return state.isOf(Blocks.OAK_LOG) || state.isOf(Blocks.SPRUCE_LOG) || state.isOf(Blocks.BIRCH_LOG) ||
                state.isOf(Blocks.JUNGLE_LOG) || state.isOf(Blocks.ACACIA_LOG) || state.isOf(Blocks.DARK_OAK_LOG);
    }
}
