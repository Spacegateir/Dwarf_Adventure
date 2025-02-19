package net.spacegateir.dwarfadventuremod.block.MythrilBuddingCluster;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;

public class BuddingMythrilBlock extends AmethystBlock {
	public static final int GROW_CHANCE = 5;
	private static final Direction[] DIRECTIONS = Direction.values();

	public BuddingMythrilBlock(Settings settings) {
		super(settings);
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (random.nextInt(5) == 0) {
			Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
			BlockPos blockPos = pos.offset(direction);
			BlockState blockState = world.getBlockState(blockPos);
			Block block = null;
			if (canGrowIn(blockState)) {
				block = ModBlocks.SMALL_MYTHRIL_BUD;
			} else if (blockState.isOf(ModBlocks.SMALL_MYTHRIL_BUD) && blockState.get(MythrilClusterBlock.FACING) == direction) {
				block = ModBlocks.MEDIUM_MYTHRIL_BUD;
			} else if (blockState.isOf(ModBlocks.MEDIUM_MYTHRIL_BUD) && blockState.get(MythrilClusterBlock.FACING) == direction) {
				block = ModBlocks.LARGE_MYTHRIL_BUD;
			} else if (blockState.isOf(ModBlocks.LARGE_MYTHRIL_BUD) && blockState.get(MythrilClusterBlock.FACING) == direction) {
				block = ModBlocks.MYTHRIL_CLUSTER;
			}

			if (block != null) {
				BlockState blockState2 = block.getDefaultState()
					.with(MythrilClusterBlock.FACING, direction)
					.with(MythrilClusterBlock.WATERLOGGED, Boolean.valueOf(blockState.getFluidState().getFluid() == Fluids.WATER));
				world.setBlockState(blockPos, blockState2);
			}
		}
	}

	public static boolean canGrowIn(BlockState state) {
		return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
	}
}
