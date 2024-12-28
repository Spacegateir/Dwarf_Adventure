package net.spacegateir.dwarfadventuremod.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.block.entity.custom.CoverBlockEntity;
import org.jetbrains.annotations.Nullable;

public class CoverBlock extends BlockWithEntity implements BlockEntityProvider{
    public static final EnumProperty<Direction> FACING = Properties.FACING;

    // Define voxel shapes for each facing direction
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(0, 0, 15.999, 16, 16, 16); // North
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(0, 0, 0, 16, 16, 0.001); // South
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(0, 0, 0, 0.001, 16, 16); // East
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(15.999, 0, 0, 16, 16, 16); // West
    private static final VoxelShape SHAPE_UP = Block.createCuboidShape(0, 0, 0, 16, 0.001, 16); // Up
    private static final VoxelShape SHAPE_DOWN = Block.createCuboidShape(0, 15.999, 0, 16, 16, 16); // Down


    public CoverBlock(Settings settings) {
        super(settings);
        // Default to UP-facing orientation
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.UP));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // Return the appropriate voxel shape based on the facing direction
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_NORTH;
            case SOUTH:
                return SHAPE_SOUTH;
            case EAST:
                return SHAPE_EAST;
            case WEST:
                return SHAPE_WEST;
            case UP:
                return SHAPE_UP;
            case DOWN:
            default:
                return SHAPE_DOWN; // Default to DOWN facing shape
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        // Get the direction the block is placed from
        Direction side = ctx.getSide();
        return this.getDefaultState().with(FACING, side);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        // Rotate the block state based on the block's facing direction
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        // Mirror the block state based on the mirror's properties
        return state.with(FACING, mirror.apply(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        // Register the facing property
        builder.add(FACING);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                              net.minecraft.util.Hand hand, BlockHitResult hit) {
        // Check if the player is holding a stone item
        if (player.getStackInHand(hand).getItem() == Items.STONE) {
            if (!world.isClient) {
                // Get the BlockEntity to toggle the texture
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof CoverBlockEntity) {
                    CoverBlockEntity coverBlockEntity = (CoverBlockEntity) blockEntity;
                    coverBlockEntity.toggleTexture(); // Toggle the texture state
                }
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }


    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CoverBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}

