package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeleportTrapBlock extends Block {

    public TeleportTrapBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);

        if (entity instanceof LivingEntity) {
            // Search for blocks within a 50-block radius of the current position
            BlockPos targetPos = findPriorityBlockWithinRadius(world, pos, 50);

            if (targetPos != null) {
                // Calculate the center of the block and teleport the entity 1 block above
                double centerX = targetPos.getX() + 0.5;
                double centerY = targetPos.getY() + 1; // 1 block above the block
                double centerZ = targetPos.getZ() + 0.5;

                // Teleport the entity to the calculated coordinates
                entity.teleport(centerX, centerY, centerZ);
            }
        }
    }

    private BlockPos findPriorityBlockWithinRadius(World world, BlockPos pos, int radius) {
        List<BlockPos> firstPositions = new ArrayList<>();
        List<BlockPos> secondPositions = new ArrayList<>();
        List<BlockPos> thirdPositions = new ArrayList<>();

        // Iterate through a 50-block radius around the teleport trap block
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                for (int y = 0; y <= 50; y++) { // Checking within 50 blocks vertically as well
                    BlockPos checkPos = pos.add(x, y, z);
                    BlockState blockState = world.getBlockState(checkPos);

                    // Check if the block at the current position is Dwarf Gold Block (highest priority)
                    if (blockState.isOf(ModBlocks.DWARF_GOLD_BLOCK)) {
                        return checkPos; // Return immediately if Dwarf Gold Block is found
                    }

                    // Check if the block at the current position (second priority)
                    if (blockState.isOf(ModBlocks.DISORIENT_BLOCK)) {
                        secondPositions.add(checkPos);
                    }

                    // Check if the block at the current position is Stone (third priority)
                    if (blockState.isOf(Blocks.STONE)) {
                        thirdPositions.add(checkPos);
                    }
                }
            }
        }

        // If no Dwarf Gold Block was found, try quicksand
        if (!secondPositions.isEmpty()) {
            Random random = new Random();
            return secondPositions.get(random.nextInt(secondPositions.size()));
        }

        // If no Dwarf Gold Block or Quicksand was found, try Stone
        if (!thirdPositions.isEmpty()) {
            Random random = new Random();
            return thirdPositions.get(random.nextInt(thirdPositions.size()));
        }

        // Return null if no prioritized blocks are found within the radius
        return null;
    }
}
