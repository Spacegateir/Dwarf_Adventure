package net.spacegateir.dwarfadventuremod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;

import java.util.HashMap;
import java.util.Map;

public class LightningStrikerEnchantment extends Enchantment {

    // Track cooldown for each enchanted item (using ticks)
    private static final Map<ItemStack, Long> cooldowns = new HashMap<>();
    private static final long COOLDOWN_TICKS = 200; // 200 ticks cooldown (10 seconds)

    public LightningStrikerEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    // Method to check if the cooldown is active (based on ticks) for the enchanted item
    private boolean isCooldownActive(ItemStack itemStack) {
        Long lastUsed = cooldowns.get(itemStack);
        if (lastUsed == null) {
            return false; // No cooldown yet
        }
        long currentTime = System.currentTimeMillis() / 50; // Get current tick count in a similar way
        return currentTime - lastUsed < COOLDOWN_TICKS;
    }

    // Method to apply the enchantment when the target is damaged
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            ItemStack itemStack = user.getMainHandStack(); // Get the item being used

            // Check if the item is under cooldown
            if (isCooldownActive(itemStack)) {
                return; // Skip activation if the cooldown is active
            }

            // Set the cooldown for the item (store current tick time)
            cooldowns.put(itemStack.copy(), System.currentTimeMillis() / 50); // Use item copy to store cooldown

            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos position = target.getBlockPos();

            // Spawn lightning bolts based on enchantment level
            if (level == 1) {
                // Level 1: Single Lightning Bolt
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 2) {
                // Level 2: Multiple lightning bolts in a small radius
                spawnLightningInArea(world, position, 3); // 3 bolts in area
            }

            if (level == 3) {
                // Level 3: Even more lightning bolts in a larger radius
                spawnLightningInArea(world, position, 5); // 5 bolts in area
            }
        }

        super.onTargetDamaged(user, target, level);
    }

    // Helper method to spawn lightning in a radius around the target
    private void spawnLightningInArea(ServerWorld world, BlockPos center, int numBolts) {
        for (int i = 0; i < numBolts; i++) {
            int xOffset = MathHelper.nextInt(world.random, -3, 3); // Random X offset
            int zOffset = MathHelper.nextInt(world.random, -3, 3); // Random Z offset
            BlockPos lightningPos = center.add(xOffset, 0, zOffset); // Adjust position in X and Z

            // Spawn a lightning bolt at the computed position
            EntityType.LIGHTNING_BOLT.spawn(world, lightningPos, SpawnReason.TRIGGERED);
        }
    }

    @Override
    public int getMaxLevel() {
        return 3; // Max level is 3
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof MendingEnchantment) && super.canAccept(other);
    }

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
