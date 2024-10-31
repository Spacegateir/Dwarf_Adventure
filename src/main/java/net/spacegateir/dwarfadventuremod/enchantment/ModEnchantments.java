package net.spacegateir.dwarfadventuremod.enchantment;

import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final Enchantment VEIN_MINER = register("vein_miner",
            new VeinMinerEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.DIGGER, EquipmentSlot.MAINHAND));

    public static final Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static final Enchantment CUSTOM_MENDING = register("custom_mending",
            new CustomMendingEnchantment(Enchantment.Rarity.VERY_RARE, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(DwarfAdventureMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        DwarfAdventureMod.LOGGER.info("Registering ModEnchantments for " + DwarfAdventureMod.MOD_ID);
    }


}