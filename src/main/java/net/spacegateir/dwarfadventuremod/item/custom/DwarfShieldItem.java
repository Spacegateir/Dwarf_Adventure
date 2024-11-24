package net.spacegateir.dwarfadventuremod.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class DwarfShieldItem extends ShieldItem {

    private static final Random RANDOM = new Random();

    // Flag to check if knockback has been applied for the current attack
    private boolean hasKnockbackApplied = false;

    // Counter to track the time since knockback was applied
    private int tickCounter = 0;

    public DwarfShieldItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            // If the player is using the shield to block
            if (player.isUsingItem() && player.getActiveItem() == stack) {
                // Detecting when the player is attacked and the shield is being used
                // The actual knockback will be applied when the player is attacked
                applyKnockbackOnAttack(player, world);
            }

            // Increment the tick counter if knockback was applied
            if (hasKnockbackApplied) {
                tickCounter++;
                // Reset the knockback flag after 50 ticks
                if (tickCounter >= 100) {
                    hasKnockbackApplied = false;
                    tickCounter = 0;
                }
            }
        }
    }

    private void applyKnockbackOnAttack(PlayerEntity player, World world) {
        // Check if the player is blocking and being attacked, and if knockback has not been applied already
        if (player.getAttackCooldownProgress(0.5F) > 0.9F && !hasKnockbackApplied) {  // Attack cooldown check (block or hit state)
            // 1 in 5 chance to apply knockback when the player is hit
            if (RANDOM.nextInt(2) == 0) {  // Random number between 0 and 4, 0 means 1 in 5 chance
                // Check for the last entity that attacked the player
                Entity target = player.getAttacker();  // Get the entity that last attacked the player

                // Apply knockback if the attacker is a hostile entity
                if (target != null && target instanceof HostileEntity hostileEntity) {
                    // Apply knockback based on the relative position of the player and target
                    Vec3d knockbackDirection = target.getPos().subtract(player.getPos()).normalize();
                    double knockbackStrength = 3; // Adjust knockback strength

                    // Apply velocity for knockback
                    hostileEntity.addVelocity(knockbackDirection.x * knockbackStrength, 0.1, knockbackDirection.z * knockbackStrength);

                    // Play a sound when knockback is applied
                    world.playSound(null, hostileEntity.getX(), hostileEntity.getY(), hostileEntity.getZ(),
                            SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, player.getSoundCategory(), 1.0F, 1.0F); // Replace the sound event as needed

                    // Set the flag to true to prevent knockback from being applied multiple times for this attack
                    hasKnockbackApplied = true;
                }
            }
        }
    }

    // Reset the knockback flag when the player is no longer blocking or the attack ends
    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (user instanceof PlayerEntity player) {
            // Reset the flag when the player stops blocking
            hasKnockbackApplied = false;
            tickCounter = 0; // Reset tick counter as well
        }
    }
}
