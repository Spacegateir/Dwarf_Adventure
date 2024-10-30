package net.spacegateir.dwarfadventuremod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import java.util.HashSet;
import java.util.Set;

public class VeinMinerEnchantment extends Enchantment {

    private static final int BASE_MAX_BLOCKS = 15; // Base number of blocks for level 1
    private static final int BASE_AREA_RADIUS = 10; // Base radius for level 1
    private static final int BLOCKS_PER_LEVEL = 15; // Additional blocks per level
    private static final int RADIUS_PER_LEVEL = 10; // Additional radius per level

    protected VeinMinerEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof MendingEnchantment) && super.canAccept(other);
    }

    @Override
    public int getMaxLevel() {
        return 3; // Set max level to 3
    }

    public void mineVein(BlockState blockState, BlockPos pos, World world, PlayerEntity player, int level) {
        // Calculate max blocks and radius based on the enchantment level
        int maxBlocks = BASE_MAX_BLOCKS + (BLOCKS_PER_LEVEL * (level - 1));
        int areaRadius = BASE_AREA_RADIUS + (RADIUS_PER_LEVEL * (level - 1));

        Set<BlockPos> minedBlocks = new HashSet<>();
        veinMine(world, pos, blockState.getBlock(), minedBlocks, player, maxBlocks, areaRadius);
    }

    private void veinMine(World world, BlockPos origin, Block block, Set<BlockPos> minedBlocks, PlayerEntity player, int maxBlocks, int areaRadius) {
        // Get the player's current tool
        ItemStack tool = player.getMainHandStack();

        // Iterate over all positions within the spherical area of effect
        for (BlockPos pos : BlockPos.iterateOutwards(origin, areaRadius, areaRadius, areaRadius)) {
            // Check if the block is within the spherical radius and matches the block type
            if (minedBlocks.size() < maxBlocks
                    && !minedBlocks.contains(pos)
                    && pos.getSquaredDistance(origin) <= areaRadius * areaRadius
                    && world.getBlockState(pos).isOf(block)) {

                // Add block to mined set and break it
                minedBlocks.add(pos);
                if (world instanceof ServerWorld) {
                    world.breakBlock(pos, true, player);
                    // Decrease the durability of the tool
                    tool.damage(1, player, (p) -> p.sendToolBreakStatus(player.getActiveHand()));
                }
            }
        }
    }
}
