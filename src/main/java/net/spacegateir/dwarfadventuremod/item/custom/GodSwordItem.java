package net.spacegateir.dwarfadventuremod.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;

public class GodSwordItem extends SwordItem {
    public GodSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Apply various status effects to the target
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 2000, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 2000, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2000, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 2000, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 2000, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2000, 2), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 2000, 2), attacker);

        // Check if the attacker is in a server world before spawning lightning
        if (attacker.getWorld() instanceof ServerWorld serverWorld) {
            // Create a lightning bolt entity at the target's position
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(serverWorld);
            if (lightning != null) {
                lightning.setPos(target.getX(), target.getY(), target.getZ());
                serverWorld.spawnEntity(lightning);  // Spawn the lightning in the server world
            }
        }

        return super.postHit(stack, target, attacker);
    }
}
