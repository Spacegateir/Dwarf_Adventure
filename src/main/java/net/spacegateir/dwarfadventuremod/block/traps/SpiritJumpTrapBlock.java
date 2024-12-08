package net.spacegateir.dwarfadventuremod.block.traps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpiritJumpTrapBlock extends Block {
    public SpiritJumpTrapBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);

        if (entity instanceof LivingEntity) {
            // Apply upward force to simulate a jump of 10 blocks high
            double jumpHeight = 20.0; // Height of the jump (in blocks)
            double jumpVelocity = Math.sqrt(2 * jumpHeight * 0.08); // Calculate the required velocity

            // Apply velocity in the Y-axis to simulate the jump
            entity.setVelocity(entity.getVelocity().x, jumpVelocity, entity.getVelocity().z);
        }
    }
}
