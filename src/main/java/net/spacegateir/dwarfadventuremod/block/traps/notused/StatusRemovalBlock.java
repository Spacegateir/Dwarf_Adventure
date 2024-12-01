package net.spacegateir.dwarfadventuremod.block.traps.notused;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.effect.ModEffects;

public class StatusRemovalBlock extends Block {
    public StatusRemovalBlock(Settings settings) {
        super(settings);
    }



    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity livingEntity) {

            // Get the redstone signal strength at the block position
            int signalStrength = world.getReceivedRedstonePower(pos);

            // Set base values if no signal is present (signalStrength == 0)
            int baseDuration = (signalStrength == 0) ? 200 : 200;
            int baseAmplifier = (signalStrength == 0) ? 0 : 0;

            // Adjust duration and amplifier based on the redstone signal
            int adjustedDuration = baseDuration + (signalStrength * 200);
            int adjustedAmplifier = baseAmplifier + signalStrength;

            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.CLEAR_POSITIVE_EFFECT, 1, 200, false, false));

            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.CLEAR_NEGATIVE_EFFECT, 1, 200, false, false));

            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.CLEAR_NEUTRAL_EFFECT, 1, 200, false, false));
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}