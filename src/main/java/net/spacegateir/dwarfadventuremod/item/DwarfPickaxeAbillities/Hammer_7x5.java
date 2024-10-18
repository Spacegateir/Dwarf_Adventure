package net.spacegateir.dwarfadventuremod.item.DwarfPickaxeAbillities;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class Hammer_7x5 extends MiningToolItem {

    // Constructor
    public Hammer_7x5(ToolMaterial material, Settings settings) {
        super(0f, -3.0f, material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    // Method to get a list of blocks in a 7x5 area around the initial block
    public static List<BlockPos> getBlocksToBeDestroyed(BlockPos initialBlockPos, ServerPlayerEntity player) {
        // Define the range; this represents how far the mining area extends from the hit block
        int rangeX = 3;  // 7 blocks wide in X direction (3 blocks on each side)
        int rangeY = 2;  // 5 blocks tall in Y direction (2 blocks above and 2 below the hit block)
        int rangeZ = 3;  // 7 blocks wide in Z direction (3 blocks on each side)

        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);

        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;

            // If the player hits the top or bottom, break in X-Z plane (horizontal plane)
            if (blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP) {
                for (int x = -2; x <= 2; x++) { // 5 blocks wide in X direction
                    for (int z = -2; z <= 2; z++) { // 5 blocks wide in Z direction
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY(), initialBlockPos.getZ() + z));
                    }
                }
            }
            // If the player hits the north or south side, break in X-Y plane (vertical plane, X-Y)
            else if (blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH) {
                for (int x = -rangeX; x <= rangeX; x++) { // 7 blocks wide in X direction
                    for (int y = -1; y <= 3; y++) { // 5 blocks tall in Y direction
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY() + y, initialBlockPos.getZ()));
                    }
                }
            }
            // If the player hits the east or west side, break in Y-Z plane (vertical plane, Y-Z)
            else if (blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST) {
                for (int z = -rangeZ; z <= rangeZ; z++) { // 7 blocks wide in Z direction
                    for (int y = -1; y <= 3; y++) { // 5 blocks tall in Y direction
                        positions.add(new BlockPos(initialBlockPos.getX(), initialBlockPos.getY() + y, initialBlockPos.getZ() + z));
                    }
                }
            }
        }

        return positions;
    }
}
