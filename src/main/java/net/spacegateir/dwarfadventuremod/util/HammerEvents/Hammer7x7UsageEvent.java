package net.spacegateir.dwarfadventuremod.util.HammerEvents;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.item.DwarfPickaxeAbillities.Hammer_7x7;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class Hammer7x7UsageEvent implements PlayerBlockBreakEvents.Before {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {
        ItemStack mainHandItem = player.getMainHandStack();

        // Check if the player's tool is a Hammer with 7x7 ability and the player is on the server
        if (mainHandItem.getItem() instanceof Hammer_7x7 && player instanceof ServerPlayerEntity serverPlayer) {
            // Prevent breaking the same block multiple times
            if (HARVESTED_BLOCKS.contains(pos)) {
                return true;  // Block already handled, skip it
            }

            // Get all blocks in the 7x7 area around the initial block
            for (BlockPos position : Hammer_7x7.getBlocksToBeDestroyed(pos, serverPlayer)) {
                // Use .equals() for correct BlockPos comparison
                if (pos.equals(position) || !mainHandItem.isSuitableFor(world.getBlockState(position))) {
                    continue;  // Skip the block if it's the original or unsuitable for the tool
                }

                HARVESTED_BLOCKS.add(position);  // Add to set to track the block
                serverPlayer.interactionManager.tryBreakBlock(position);  // Break the block
                HARVESTED_BLOCKS.remove(position);  // Remove after processing
            }
        }

        return true;  // Allow the normal block break behavior to continue
    }
}
