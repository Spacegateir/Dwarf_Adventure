package net.spacegateir.dwarfadventuremod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.DwarfPickaxeAbillities.*;
import net.spacegateir.dwarfadventuremod.item.custom.AncestralForgeCoalItem;
import net.spacegateir.dwarfadventuremod.item.custom.GlimmerRootEffect;
import net.spacegateir.dwarfadventuremod.item.custom.MortarAndPestleItem;

import static net.minecraft.item.Items.register;

public class ModItems {
    public static final Item ANCIENT_SEED = registerItem("ancient_seed",
            new AliasedBlockItem(ModBlocks.ANCIENT_FLOWER_CROP,new FabricItemSettings().rarity(Rarity.RARE)));


    public static final Item LVL1_DWARF_PICKAXE = registerItem("lvl1_dwarf_pickaxe",
            new Hammer_1x2(ModToolMaterial.DWARF_STEEL, new FabricItemSettings().fireproof()));

    public static final Item LVL2_DWARF_PICKAXE = registerItem("lvl2_dwarf_pickaxe",
            new Hammer_1x2(ModToolMaterial.QUINTESSENCE, new FabricItemSettings().fireproof()));

    public static final Item LVL3_DWARF_PICKAXE = registerItem("lvl3_dwarf_pickaxe",
            new Hammer_1x3(ModToolMaterial.MAGIRITE, new FabricItemSettings().fireproof()));

    public static final Item LVL4_DWARF_PICKAXE = registerItem("lvl4_dwarf_pickaxe",
            new Hammer_1x3(ModToolMaterial.MYTHRIL, new FabricItemSettings().fireproof()));

    public static final Item LVL5_DWARF_PICKAXE = registerItem("lvl5_dwarf_pickaxe",
            new Hammer_3x3(ModToolMaterial.ADAMANTITE, new FabricItemSettings().fireproof()));

    public static final Item LVL6_DWARF_PICKAXE = registerItem("lvl6_dwarf_pickaxe",
            new Hammer_3x3(ModToolMaterial.ORIKALKUM, new FabricItemSettings().fireproof()));

    public static final Item WAR_HAMMER = registerItem("war_hammer",
            new Hammer_5x5(ModToolMaterial.WAR_HAMMER, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item DWARF_HAMMER = registerItem("dwarf_hammer",
            new Hammer_7x7(ModToolMaterial.DWARF_HAMMER, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item PRESSURE_HAMMER = registerItem("pressure_hammer",
            new Hammer_9x9(ModToolMaterial.PRESSURE_HAMMER, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));


    public static final Item CORRUPT_GEM = registerItem("corrupt_gem", new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item GLIMMER_ROOT = registerItem("glimmer_root", new GlimmerRootEffect(new FabricItemSettings().maxCount(64)));
    public static final Item ANCIENT_BRANCH = registerItem("ancient_branch", new Item(new FabricItemSettings()));
    public static final Item HANDLE_PART = registerItem("handle_part", new Item(new FabricItemSettings()));
    public static final Item HOT_DWARF_PICKAXE_HEAD = registerItem("hot_dwarf_pickaxe_head", new Item(new FabricItemSettings()));
    public static final Item DWARF_STEEL_PICKAXE_HEAD = registerItem("dwarf_steel_pickaxe_head", new Item(new FabricItemSettings()));
    public static final Item WITHER_BONE = registerItem("wither_bone", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item WARDEN_HIDE = registerItem("warden_hide", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle", new MortarAndPestleItem(new FabricItemSettings().maxDamage(MortarAndPestleItem.MAX_DURABILITY)));
    public static final Item ARCANE_POWDER = registerItem("arcane_powder", new Item(new FabricItemSettings()));
    public static final Item ANCESTRAL_FORGE_COAL = registerItem("ancestral_forge_coal", new AncestralForgeCoalItem(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item GOLEM_CORE = registerItem("golem_core", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ENHNACED_GOLEM_CORE = registerItem("enhanced_golem_core", new Item(new FabricItemSettings()));
    public static final Item HEARTHSTONE_OF_BORRUM = registerItem("hearthstone_of_borrum", new Item(new FabricItemSettings()));
    public static final Item THALORUNS_SOULSTONE = registerItem("thaloruns_soulstone", new Item(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item RAW_DWARF_STEEL = registerItem("raw_dwarf_steel", new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item DWARF_STEEL_NUGGET = registerItem("dwarf_steel_nugget", new Item(new FabricItemSettings()));
    public static final Item DWARF_STEEL_INGOT = registerItem("dwarf_steel_ingot", new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item CLUMP_OF_DWARF_STEEL = registerItem("clump_of_dwarf_steel", new Item(new FabricItemSettings()));
    public static final Item HOT_INGOT = registerItem("hot_ingot", new Item(new FabricItemSettings()));

    public static final Item WIND_GEM = registerItem("wind_gem", new Item(new FabricItemSettings()));
    public static final Item FIRE_GEM = registerItem("fire_gem", new Item(new FabricItemSettings()));
    public static final Item WATER_GEM = registerItem("water_gem", new Item(new FabricItemSettings()));
    public static final Item EARTH_GEM = registerItem("earth_gem", new Item(new FabricItemSettings()));
    public static final Item ELEMENTAL_GEM = registerItem("elemental_gem", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_AER_SPIRITSTONE = registerItem("clump_of_aer_spiritstone", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_IGNIS_SPIRITSTONE = registerItem("clump_of_ignis_spiritstone", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_AQUA_SPIRITSTONE = registerItem("clump_of_aqua_spiritstone", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_TERA_SPIRITSTONE = registerItem("clump_of_tera_spiritstone", new Item(new FabricItemSettings()));
    public static final Item FORGING_HOT_AER = registerItem("forging_hot_aer", new Item(new FabricItemSettings()));
    public static final Item FORGING_HOT_IGNIS = registerItem("forging_hot_ignis", new Item(new FabricItemSettings()));
    public static final Item FORGING_HOT_AQUA = registerItem("forging_hot_aqua", new Item(new FabricItemSettings()));
    public static final Item FORGING_HOT_TERA = registerItem("forging_hot_tera", new Item(new FabricItemSettings()));
    public static final Item AER_SPIRIT_NUGGET = registerItem("aer_spirit_nugget", new Item(new FabricItemSettings()));
    public static final Item IGNIS_SPIRIT_NUGGET = registerItem("ignis_spirit_nugget", new Item(new FabricItemSettings()));
    public static final Item AQUA_SPIRIT_NUGGET = registerItem("aqua_spirit_nugget", new Item(new FabricItemSettings()));
    public static final Item TERA_SPIRIT_NUGGET = registerItem("tera_spirit_nugget", new Item(new FabricItemSettings()));
    public static final Item AER_SPIRIT_INGOT = registerItem("aer_spirit_ingot", new Item(new FabricItemSettings()));
    public static final Item IGNIS_SPIRIT_INGOT = registerItem("ignis_spirit_ingot", new Item(new FabricItemSettings()));
    public static final Item AQUA_SPIRIT_INGOT = registerItem("aqua_spirit_ingot", new Item(new FabricItemSettings()));
    public static final Item TERA_SPIRIT_INGOT = registerItem("tera_spirit_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_MAGIRITE = registerItem("raw_magirite", new Item(new FabricItemSettings()));
    public static final Item MAGIRITE_NUGGET = registerItem("magirite_nugget", new Item(new FabricItemSettings()));
    public static final Item MAGIRITE_INGOT = registerItem("magirite_ingot", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_MAGIRITE = registerItem("clump_of_magirite", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_MAGIRITE_INGOT = registerItem("molten_magirite_ingot", new Item(new FabricItemSettings()));

    public static final Item MYTHRIL = registerItem("mythril", new Item(new FabricItemSettings()));
    public static final Item PUREFICATED_MYTHRIL = registerItem("pureficated_mythril", new Item(new FabricItemSettings()));

    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite", new Item(new FabricItemSettings()));
    public static final Item ADAMANTITE_NUGGET = registerItem("adamantite_nugget", new Item(new FabricItemSettings()));
    public static final Item ADAMANTITE_INGOT = registerItem("adamantite_ingot", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_ADAMANTITE = registerItem("clump_of_adamantite", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_ADAMANTITE_INGOT = registerItem("molten_adamantite_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_ORIKALKUM = registerItem("raw_orikalkum", new Item(new FabricItemSettings()));
    public static final Item ORIKALKUM_NUGGET = registerItem("orikalkum_nugget", new Item(new FabricItemSettings()));
    public static final Item ORIKALKUM_INGOT = registerItem("orikalkum_ingot", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_ORIKALKUM = registerItem("clump_of_orikalkum", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_ORIKALKUM_INGOT = registerItem("molten_orikalkum_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_DRAGON_BANE = registerItem("raw_dragon_bane", new Item(new FabricItemSettings()));
    public static final Item DRAGON_BANE_NUGGET = registerItem("dragon_bane_nugget", new Item(new FabricItemSettings()));
    public static final Item DRAGON_BANE_INGOT = registerItem("dragon_bane_ingot", new Item(new FabricItemSettings()));
    public static final Item CLUMP_OF_DRAGON_BANE = registerItem("clump_of_dragon_bane", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_DRAGON_BANE_INGOT = registerItem("molten_dragon_bane_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_DWARF_GOLD = registerItem("raw_dwarf_gold", new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item DWARF_GOLD_NUGGET = registerItem("dwarf_gold_nugget", new Item(new FabricItemSettings()));
    public static final Item DWARF_GOLD_INGOT = registerItem("dwarf_gold_ingot", new Item(new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item CLUMP_OF_DWARF_GOLD = registerItem("clump_of_dwarf_gold", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_DWARF_GOLD_INGOT = registerItem("molten_dwarf_gold_ingot", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    };

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DwarfAdventureMod.MOD_ID, name), item);
    }

    public static void registerModItems () {
        DwarfAdventureMod.LOGGER.info("Registering Mod Items for " + DwarfAdventureMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }


}
