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

public class PoisonFogTrapBlock extends Block {
    public PoisonFogTrapBlock(Settings settings) {
        super(settings);
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
}
