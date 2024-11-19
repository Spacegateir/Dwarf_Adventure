package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;

public class StoneTrapBlock extends Block {
    public StoneTrapBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);

        if (!world.isClient) {
            if (state.isOf(ModBlocks.STONE_TRAP_BLOCK)) {
                // Change block to the spiked version
                world.setBlockState(pos, ModBlocks.STONE_TRAP_BLOCK_SPIKES.getDefaultState());

                // Schedule the block to revert back to normal after 20 ticks
                world.scheduleBlockTick(pos, ModBlocks.STONE_TRAP_BLOCK_SPIKES, 20);

            } else if (state.isOf(ModBlocks.STONE_TRAP_BLOCK_SPIKES)) {
                // Apply Slowness effect to the entity
                if (entity instanceof net.minecraft.entity.LivingEntity livingEntity) {
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 0));
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 5, 0));
                }
            }
        }
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        // Check if the current block is the spiked version
        if (state.isOf(ModBlocks.STONE_TRAP_BLOCK_SPIKES)) {
            // Revert the block back to the normal trap block
            world.setBlockState(pos, ModBlocks.STONE_TRAP_BLOCK.getDefaultState());
        }
    }
}
