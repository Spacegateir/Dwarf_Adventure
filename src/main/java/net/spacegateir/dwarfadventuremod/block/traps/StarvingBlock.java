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

        // Check if the entity is a player and if the world is not client-side
        if (!world.isClient && entity instanceof PlayerEntity player) {
            // Add Hunger effect for 5 seconds (100 ticks) at level 0
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1500, 4, false, true));
        }
    }
}
