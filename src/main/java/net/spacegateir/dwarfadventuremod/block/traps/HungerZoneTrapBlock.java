package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.random.Random;

public class HungerZoneTrapBlock extends Block {
    public HungerZoneTrapBlock(Settings settings) {
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
                        // Set hunger to 10 (drain hunger partially)
                        player.getHungerManager().setFoodLevel(10);
                        player.getHungerManager().setSaturationLevel(0);

                        // Apply Hunger effect (duration: 1000 ticks, level: 0)
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1200, 0, false, false));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20000, 2, false, false));

                        // Play a "stomach growl" or similar sound to indicate hunger
                        world.playSound(null, player.getBlockPos(), SoundEvents.ENTITY_PLAYER_BURP, player.getSoundCategory(), 1.0F, 1.0F);
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
