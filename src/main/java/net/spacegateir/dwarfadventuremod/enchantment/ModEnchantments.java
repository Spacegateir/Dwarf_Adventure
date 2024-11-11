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
                    ModEnchantmentTarget.PICAXE_OR_PAXEL, EquipmentSlot.MAINHAND));

    public static final Enchantment LUMBER_JACK = register("lumber_jack",
            new LumberJackEnchantment(Enchantment.Rarity.VERY_RARE,
                    ModEnchantmentTarget.AXE_OR_PAXEL, EquipmentSlot.MAINHAND));

    public static final Enchantment PLANT_SHREDER = register("plant_shreder",
            new PlantShrederEnchantment(Enchantment.Rarity.VERY_RARE,
                    ModEnchantmentTarget.HOE_SHEARS_PAXEL, EquipmentSlot.MAINHAND));

    public static final Enchantment EARTH_SPLITTER = register("earth_splitter",
            new EarthSplitterEnchantment(Enchantment.Rarity.VERY_RARE,
                    ModEnchantmentTarget.HOE_SHOVEL_PAXEL, EquipmentSlot.MAINHAND));

    public static final Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(DwarfAdventureMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        DwarfAdventureMod.LOGGER.info("Registering ModEnchantments for " + DwarfAdventureMod.MOD_ID);
    }


}