package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StarvingBlock extends Block {
    public StarvingBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, net.minecraft.entity.Entity entity) {
        super.onSteppedOn(world, pos, state, entity);

        if (!world.isClient && entity instanceof PlayerEntity player) {
            // Set hunger to 0 (drain hunger completely)
            player.getHungerManager().setFoodLevel(0);
            player.getHungerManager().setSaturationLevel(0);

            // Get the redstone signal strength at the block position
            int signalStrength = world.getReceivedRedstonePower(pos);

            // Set base values if no signal is present (signalStrength == 0)
            int baseDuration = (signalStrength == 0) ? 1000 : 200;
            int baseAmplifier = (signalStrength == 0) ? 4 : 0;

            // Adjust duration and amplifier based on the redstone signal
            int adjustedDuration = baseDuration + (signalStrength * 200);
            int adjustedAmplifier = baseAmplifier + signalStrength;

            // Add Hunger effect with adjusted duration and amplifier
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, adjustedDuration, adjustedAmplifier, false, false));
        }
    }
}