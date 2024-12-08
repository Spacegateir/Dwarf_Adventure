package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.random.Random;

public class FrostBitTrapBlock extends Block {
    public FrostBitTrapBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);

        if (!world.isClient) {
            int radius = 25; // Define the radius of effect
            Box effectArea = new Box(pos.add(-radius, -radius, -radius), pos.add(radius, radius, radius));

            // Apply freezing effect (slowness + mining fatigue) only to PlayerEntities within radius
            world.getEntitiesByClass(PlayerEntity.class, effectArea, entity -> entity.isAlive())
                    .forEach(entity -> {
                        PlayerEntity playerEntity = (PlayerEntity) entity;

                        // Apply slowness and mining fatigue effects to players only
                        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200, 4, false, false)); // Slowness Level 2
                        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1200, 2, false, false)); // Mining Fatigue Level 1

                    });
        }
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;  // Allow this block to have random ticks
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);
        world.scheduleBlockTick(pos, this, 20); // Schedule next random tick in 20 game ticks (~1 second)
    }
}
