package net.spacegateir.dwarfadventuremod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

public class LightningStrikerEnchantment extends Enchantment {

    private static final long BASE_COOLDOWN_TICKS = 200; // Base cooldown in ticks (10 seconds)

    public LightningStrikerEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient() && user instanceof ServerPlayerEntity player) {
            ItemStack itemStack = user.getMainHandStack(); // Get the item being used

            // Check if the item is on cooldown
            if (player.getItemCooldownManager().isCoolingDown(itemStack.getItem())) {
                return; // Exit early if the item is on cooldown
            }

            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos position = target.getBlockPos();
            int lightningBoltsStruck = 0;

            // Spawn lightning bolts based on enchantment level
            if (level == 1) {
                // Level 1: Single Lightning Bolt
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                lightningBoltsStruck = 1;
            } else if (level == 2) {
                // Level 2: Multiple lightning bolts in a small radius
                lightningBoltsStruck = spawnLightningInArea(world, position, 3); // 3 bolts in area
            } else if (level == 3) {
                // Level 3: Even more lightning bolts in a larger radius
                lightningBoltsStruck = spawnLightningInArea(world, position, 5); // 5 bolts in area
            }

            // Apply cooldown to the item based on the number of lightning bolts struck
            int cooldownTicks = (int) (BASE_COOLDOWN_TICKS * lightningBoltsStruck);
            player.getItemCooldownManager().set(itemStack.getItem(), cooldownTicks);
        }

        super.onTargetDamaged(user, target, level);
    }

    // Helper method to spawn lightning in a radius around the target and return the count of bolts spawned
    private int spawnLightningInArea(ServerWorld world, BlockPos center, int numBolts) {
        int boltsStruck = 0;
        for (int i = 0; i < numBolts; i++) {
            int xOffset = MathHelper.nextInt(world.random, -3, 3); // Random X offset
            int zOffset = MathHelper.nextInt(world.random, -3, 3); // Random Z offset
            BlockPos lightningPos = center.add(xOffset, 0, zOffset); // Adjust position in X and Z

            // Spawn a lightning bolt at the computed position
            if (EntityType.LIGHTNING_BOLT.spawn(world, lightningPos, SpawnReason.TRIGGERED) != null) {
                boltsStruck++;
            }
        }
        return boltsStruck;
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
