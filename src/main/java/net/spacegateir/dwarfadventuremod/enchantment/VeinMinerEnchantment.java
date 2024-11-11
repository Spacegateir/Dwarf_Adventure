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

    private final ModEnchantmentTarget modTarget;

    public VeinMinerEnchantment(Rarity weight, ModEnchantmentTarget modTarget, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.BREAKABLE, slotTypes); // Use a generic target like BREAKABLE
        this.modTarget = modTarget;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return modTarget.isAcceptableItem(stack.getItem()); // Check if item matches the custom target
    }

    @Override
    public int getMaxLevel() {
        return 3; // Set max level to 3
    }

    public void mineVein(BlockState blockState, BlockPos pos, World world, PlayerEntity player, int level) {
        // Check if the cooldown is active. If it is, stop the enchantment from working
        ItemStack item = player.getMainHandStack();
        if (player.getItemCooldownManager().isCoolingDown(item.getItem())) {
            return; // Exit early if the cooldown is active
        }

        // Calculate max blocks and radius based on the enchantment level
        int maxBlocks = BASE_MAX_BLOCKS + (BLOCKS_PER_LEVEL * (level - 1));
        int areaRadius = BASE_AREA_RADIUS + (RADIUS_PER_LEVEL * (level - 1));

        Set<BlockPos> minedBlocks = new HashSet<>();
        int totalBlocksMined = veinMine(world, pos, blockState.getBlock(), minedBlocks, player, maxBlocks, areaRadius);

        // Dynamically calculate the cooldown duration based on the number of blocks mined
        int cooldownDuration = totalBlocksMined * 1; // 5 ticks per block (adjust as needed)

        // Set cooldown on the item after performing the vein mining action
        player.getItemCooldownManager().set(item.getItem(), cooldownDuration);
    }

    private int veinMine(World world, BlockPos origin, Block block, Set<BlockPos> minedBlocks, PlayerEntity player, int maxBlocks, int areaRadius) {
        // Get the player's current tool
        ItemStack tool = player.getMainHandStack();
        int totalBlocksMined = 0;

        // Iterate over all positions within the spherical area of effect
        for (BlockPos pos : BlockPos.iterateOutwards(origin, areaRadius, areaRadius, areaRadius)) {
            // Check if the block is within the spherical radius and matches the block type
            if (minedBlocks.size() < maxBlocks
                    && !minedBlocks.contains(pos)
                    && pos.getSquaredDistance(origin) <= areaRadius * areaRadius
                    && world.getBlockState(pos).isOf(block)) {

                // Add block to mined set and break it
                minedBlocks.add(pos);
                totalBlocksMined++; // Increment the count of mined blocks
                if (world instanceof ServerWorld) {
                    world.breakBlock(pos, true, player);
                    // Decrease the durability of the tool
                    tool.damage(1, player, (p) -> p.sendToolBreakStatus(player.getActiveHand()));
                }
            }
        }

        return totalBlocksMined; // Return the number of blocks mined
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof MendingEnchantment || other instanceof LumberJackEnchantment || other instanceof PlantShrederEnchantment)
                && super.canAccept(other);}

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }
}
