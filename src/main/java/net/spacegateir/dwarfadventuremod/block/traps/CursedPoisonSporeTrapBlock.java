package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class CursedPoisonSporeTrapBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final VoxelShape NORTH_SHAPE = Stream.of(
            Block.createCuboidShape(3, 0, 3, 13, 15, 13) // Adjusted to center
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape EAST_SHAPE = Stream.of(
            Block.createCuboidShape(3, 0, 3, 13, 15, 13) // Adjusted to center
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SOUTH_SHAPE = Stream.of(
            Block.createCuboidShape(3, 0, 3, 13, 15, 13) // Adjusted to center
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape WEST_SHAPE = Stream.of(
            Block.createCuboidShape(3, 0, 3, 13, 15, 13) // Adjusted to center
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();



    public CursedPoisonSporeTrapBlock(Settings settings) {
        super(settings);
    this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
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
                return NORTH_SHAPE;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        // Ensure that only horizontal directions are used
        Direction facing = ctx.getPlayerLookDirection().getOpposite();
        if (facing.getAxis().isHorizontal()) {
            return this.getDefaultState().with(FACING, facing);
        }
        return this.getDefaultState().with(FACING, Direction.NORTH); // Default to NORTH if vertical
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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }




    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);

        if (!world.isClient) {
            int radius = 25;
            Box effectArea = new Box(pos.add(-radius, -radius, -radius), pos.add(radius, radius, radius));

            // Apply effects for players within the radius
            world.getEntitiesByClass(PlayerEntity.class, effectArea, player -> player.isAlive())
                    .forEach(player -> {

                        // Apply Nausea effect (duration: 1000 ticks, level: 0)
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 1000, 0, false, false));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20000, 2, false, false));
                    });
        }
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;  // Allow this block to have random ticks
    }

    // Schedule the next random tick for this block
    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);
        world.scheduleBlockTick(pos, this, 20); // Schedule the next random tick in 20 game ticks (~1 second)
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();
        double d = (double) i + random.nextDouble();
        double e = (double) j + 1.7;
        double f = (double) k + random.nextDouble();
        world.addParticle(ParticleTypes.CHERRY_LEAVES, d, e, f, 0.0, 0.0, 0.0);
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int l = 0; l < 140; l++) {
            // Adjusting Y-axis for both upward and downward movement
            mutable.set(
                    i + MathHelper.nextInt(random, -15, 15), // X-axis range
                    j + MathHelper.nextInt(random, -5, 15), // Y-axis range (upward and downward)
                    k + MathHelper.nextInt(random, -15, 15)  // Z-axis range
            );
            BlockState blockState = world.getBlockState(mutable);
            if (!blockState.isFullCube(world, mutable)) {
                world.addParticle(
                        ParticleTypes.SPORE_BLOSSOM_AIR,
                        (double) mutable.getX() + random.nextDouble(),
                        (double) mutable.getY() + random.nextDouble(),
                        (double) mutable.getZ() + random.nextDouble(),
                        0.5,
                        0.5,
                        0.5
                );
            }
        }
    }
}