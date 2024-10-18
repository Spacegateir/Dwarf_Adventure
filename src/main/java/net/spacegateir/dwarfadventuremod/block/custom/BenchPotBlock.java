package net.spacegateir.dwarfadventuremod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BenchPotBlock extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public static final VoxelShape NORTH_SHAPE = Stream.of(
            Block.createCuboidShape(0, 2, 0, 16, 6, 15),
            Block.createCuboidShape(13, 0, 12, 15, 2, 14),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(1, 0, 0, 3, 2, 2),
            Block.createCuboidShape(13, 0, 0, 15, 2, 2),
            Block.createCuboidShape(4, 5, 11, 7, 8, 14),
            Block.createCuboidShape(4, 7, 11, 7, 8, 14),
            Block.createCuboidShape(4, 8, 11, 5, 8, 14),
            Block.createCuboidShape(7, 8, 11, 7, 8, 14),
            Block.createCuboidShape(4, 8, 11, 7, 8, 12),
            Block.createCuboidShape(4, 8, 14, 7, 8, 14),
            Block.createCuboidShape(6, 5, 7, 9, 8, 10),
            Block.createCuboidShape(6, 7, 7, 9, 8, 10),
            Block.createCuboidShape(6, 8, 7, 7, 8, 10),
            Block.createCuboidShape(9, 8, 7, 9, 8, 10),
            Block.createCuboidShape(6, 8, 7, 9, 8, 8),
            Block.createCuboidShape(6, 8, 10, 9, 8, 10),
            Block.createCuboidShape(8, 5, 11, 11, 8, 14),
            Block.createCuboidShape(8, 7, 11, 11, 8, 14),
            Block.createCuboidShape(8, 8, 11, 9, 8, 14),
            Block.createCuboidShape(11, 8, 11, 11, 8, 14),
            Block.createCuboidShape(8, 8, 11, 11, 8, 12),
            Block.createCuboidShape(8, 8, 14, 11, 8, 14),
            Block.createCuboidShape(0, 2, 0, 16, 6, 8)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SOUTH_SHAPE = Stream.of(
            Block.createCuboidShape(0, 2, 0, 16, 6, 16),
            Block.createCuboidShape(1, 0, 1, 3, 2, 3),
            Block.createCuboidShape(13, 0, 1, 15, 2, 3),
            Block.createCuboidShape(13, 0, 13, 15, 2, 15),
            Block.createCuboidShape(1, 0, 13, 3, 2, 15),
            Block.createCuboidShape(12, 6, 8, 15, 8, 11),
            Block.createCuboidShape(12, 8, 8, 15, 8, 11),
            Block.createCuboidShape(12, 8, 11, 15, 9, 11),
            Block.createCuboidShape(12, 8, 8, 15, 9, 9),
            Block.createCuboidShape(12, 8, 8, 12, 9, 11),
            Block.createCuboidShape(14, 8, 8, 15, 9, 11),
            Block.createCuboidShape(8, 6, 6, 11, 8, 9),
            Block.createCuboidShape(8, 8, 6, 11, 8, 9),
            Block.createCuboidShape(8, 8, 9, 11, 9, 9),
            Block.createCuboidShape(8, 8, 6, 11, 9, 7),
            Block.createCuboidShape(8, 8, 6, 8, 9, 9),
            Block.createCuboidShape(10, 8, 6, 11, 9, 9),
            Block.createCuboidShape(12, 6, 4, 15, 8, 7),
            Block.createCuboidShape(12, 8, 4, 15, 8, 7),
            Block.createCuboidShape(12, 8, 7, 15, 9, 7),
            Block.createCuboidShape(12, 8, 4, 15, 9, 5),
            Block.createCuboidShape(12, 8, 4, 12, 9, 7),
            Block.createCuboidShape(14, 8, 4, 15, 9, 7),
            Block.createCuboidShape(0, 2, 7, 16, 6, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape EAST_SHAPE = Stream.of(
            Block.createCuboidShape(0, 2, 0, 16, 6, 15),
            Block.createCuboidShape(13, 0, 0, 15, 2, 2),
            Block.createCuboidShape(13, 0, 12, 15, 2, 14),
            Block.createCuboidShape(1, 0, 12, 3, 2, 14),
            Block.createCuboidShape(1, 0, 0, 3, 2, 2),
            Block.createCuboidShape(4, 5, 11, 7, 8, 14),
            Block.createCuboidShape(4, 7, 11, 7, 8, 14),
            Block.createCuboidShape(4, 8, 11, 5, 8, 14),
            Block.createCuboidShape(7, 8, 11, 7, 8, 14),
            Block.createCuboidShape(4, 8, 11, 7, 8, 12),
            Block.createCuboidShape(4, 8, 14, 7, 8, 14),
            Block.createCuboidShape(6, 5, 7, 9, 8, 10),
            Block.createCuboidShape(6, 7, 7, 9, 8, 10),
            Block.createCuboidShape(6, 8, 7, 7, 8, 10),
            Block.createCuboidShape(9, 8, 7, 9, 8, 10),
            Block.createCuboidShape(6, 8, 7, 9, 8, 8),
            Block.createCuboidShape(6, 8, 10, 9, 8, 10),
            Block.createCuboidShape(8, 5, 11, 11, 8, 14),
            Block.createCuboidShape(8, 7, 11, 11, 8, 14),
            Block.createCuboidShape(8, 8, 11, 9, 8, 14),
            Block.createCuboidShape(11, 8, 11, 11, 8, 14),
            Block.createCuboidShape(8, 8, 11, 11, 8, 12),
            Block.createCuboidShape(8, 8, 14, 11, 8, 14),
            Block.createCuboidShape(1, 2, 0, 9, 6, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape WEST_SHAPE = Stream.of(
            Block.createCuboidShape(0, 2, 0, 16, 6, 16),
            Block.createCuboidShape(1, 0, 13, 3, 2, 15),
            Block.createCuboidShape(1, 0, 1, 3, 2, 3),
            Block.createCuboidShape(13, 0, 1, 15, 2, 3),
            Block.createCuboidShape(13, 0, 13, 15, 2, 15),
            Block.createCuboidShape(8, 5, 1, 11, 8, 4),
            Block.createCuboidShape(8, 7, 1, 11, 8, 4),
            Block.createCuboidShape(11, 8, 1, 11, 8, 4),
            Block.createCuboidShape(8, 8, 1, 9, 8, 4),
            Block.createCuboidShape(8, 8, 3, 11, 8, 4),
            Block.createCuboidShape(8, 8, 1, 11, 8, 1),
            Block.createCuboidShape(6, 5, 5, 9, 8, 8),
            Block.createCuboidShape(6, 7, 5, 9, 8, 8),
            Block.createCuboidShape(9, 8, 5, 9, 8, 8),
            Block.createCuboidShape(6, 8, 5, 7, 8, 8),
            Block.createCuboidShape(6, 8, 7, 9, 8, 8),
            Block.createCuboidShape(6, 8, 5, 9, 8, 5),
            Block.createCuboidShape(4, 5, 1, 7, 8, 4),
            Block.createCuboidShape(4, 7, 1, 7, 8, 4),
            Block.createCuboidShape(7, 8, 1, 7, 8, 4),
            Block.createCuboidShape(4, 8, 1, 5, 8, 4),
            Block.createCuboidShape(4, 8, 3, 7, 8, 4),
            Block.createCuboidShape(4, 8, 1, 7, 8, 1),
            Block.createCuboidShape(7, 2, 0, 15, 6, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public BenchPotBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case EAST:
                return EAST_SHAPE;
            case WEST:
                return WEST_SHAPE;
            default:
                return VoxelShapes.fullCube();
        }
    }
}
