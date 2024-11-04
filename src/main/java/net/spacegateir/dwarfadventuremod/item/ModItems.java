package net.spacegateir.dwarfadventuremod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.DwarfPickaxeAbillities.*;
import net.spacegateir.dwarfadventuremod.item.custom.*;

public class ModItems {
    public static final Item ANCIENT_SEED = registerItem("ancient_seed",
            new AliasedBlockItem(ModBlocks.ANCIENT_FLOWER_CROP,new FabricItemSettings().rarity(Rarity.RARE)));


    public static final Item LVL1_DWARF_PICKAXE = registerItem("lvl1_dwarf_pickaxe",
            new Hammer_1x2(ModToolMaterial.DWARF_STEEL, new FabricItemSettings().fireproof()));

    public static final Item DWARF_STEEL_PICKAXE = registerItem("dwarf_steel_pickaxe",
            new PickaxeItem(ModToolMaterial.DWARF_STEEL,1,-2.8F, new FabricItemSettings()));
    public static final Item DWARF_STEEL_AXE = registerItem("dwarf_steel_axe",
            new AxeItem(ModToolMaterial.DWARF_STEEL,6,-3.1F, new FabricItemSettings()));
    public static final Item DWARF_STEEL_SHOVEL = registerItem("dwarf_steel_shovel",
            new ShovelItem(ModToolMaterial.DWARF_STEEL,1.5F,-3F, new FabricItemSettings()));
    public static final Item DWARF_STEEL_HOE = registerItem("dwarf_steel_hoe",
            new HoeItem(ModToolMaterial.DWARF_STEEL,-2,-1.0F, new FabricItemSettings()));
    public static final Item DWARF_STEEL_SWORD = registerItem("dwarf_steel_sword",
            new SwordItem(ModToolMaterial.DWARF_STEEL,3,-2.4f, new FabricItemSettings()));
    public static final Item DWARF_STEEL_PAXEL = registerItem("dwarf_steel_paxel",
            new PaxelItem(ModToolMaterial.DWARF_STEEL,1,-1.5f, new FabricItemSettings()));
    public static final Item DWARF_STEEL_KNIFE = registerItem("dwarf_steel_knife",
            new KnifeItem(ModToolMaterial.DWARF_STEEL,-3,-1.0F, new FabricItemSettings()));
    public static final Item DWARF_STEEL_TRIDENT = registerItem("dwarf_steel_trident",
            new TridentItem(new FabricItemSettings().maxDamage(250)));

    public static final Item DWARF_GOLD_PICKAXE = registerItem("dwarf_gold_pickaxe",
            new PickaxeItem(ModToolMaterial.DWARF_GOLD,1,-2.8F, new FabricItemSettings()));
    public static final Item DWARF_GOLD_AXE = registerItem("dwarf_gold_axe",
            new AxeItem(ModToolMaterial.DWARF_GOLD,6,-3F, new FabricItemSettings()));
    public static final Item DWARF_GOLD_SHOVEL = registerItem("dwarf_gold_shovel",
            new ShovelItem(ModToolMaterial.DWARF_GOLD,1.5F,-3F, new FabricItemSettings()));
    public static final Item DWARF_GOLD_HOE = registerItem("dwarf_gold_hoe",
            new HoeItem(ModToolMaterial.DWARF_GOLD,0,-3F, new FabricItemSettings()));
    public static final Item DWARF_GOLD_SWORD = registerItem("dwarf_gold_sword",
            new SwordItem(ModToolMaterial.DWARF_GOLD,3,-3.0F, new FabricItemSettings()));
    public static final Item DWARF_GOLD_PAXEL = registerItem("dwarf_gold_paxel",
            new PaxelItem(ModToolMaterial.DWARF_GOLD,1,-1.5F, new FabricItemSettings()));


    public static final Item LVL2_DWARF_PICKAXE = registerItem("lvl2_dwarf_pickaxe",
            new Hammer_1x2(ModToolMaterial.QUINTESSENCE, new FabricItemSettings().fireproof()));

    public static final Item AER_PICKAXE = registerItem("aer_pickaxe",
            new PickaxeItem(ModToolMaterial.AER,1,-2.8F, new FabricItemSettings()));
    public static final Item AER_AXE = registerItem("aer_axe",
            new AxeItem(ModToolMaterial.AER,5,-3F, new FabricItemSettings()));
    public static final Item AER_SHOVEL = registerItem("aer_shovel",
            new ShovelItem(ModToolMaterial.AER,1.5F,-3.0F, new FabricItemSettings()));
    public static final Item AER_HOE = registerItem("aer_hoe",
            new HoeItem(ModToolMaterial.AER,-3,0.0F, new FabricItemSettings()));
    public static final Item AER_SWORD = registerItem("aer_sword",
            new SwordItem(ModToolMaterial.AER,3,-2.0F, new FabricItemSettings()));
    public static final Item AER_PAXEL = registerItem("aer_paxel",
            new PaxelItem(ModToolMaterial.AER,1,-1.5F, new FabricItemSettings()));

    public static final Item IGNIS_PICKAXE = registerItem("ignis_pickaxe",
            new PickaxeItem(ModToolMaterial.IGNIS,1,-2.8F, new FabricItemSettings()));
    public static final Item IGNIS_AXE = registerItem("ignis_axe",
            new AxeItem(ModToolMaterial.IGNIS,5,-3.3F, new FabricItemSettings()));
    public static final Item IGNIS_SHOVEL = registerItem("ignis_shovel",
            new ShovelItem(ModToolMaterial.IGNIS,1.5F,-3.0F, new FabricItemSettings()));
    public static final Item IGNIS_HOE = registerItem("ignis_hoe",
            new HoeItem(ModToolMaterial.IGNIS,-3,0.0F, new FabricItemSettings()));
    public static final Item IGNIS_SWORD = registerItem("ignis_sword",
            new SwordItem(ModToolMaterial.IGNIS,3,-2.6F, new FabricItemSettings()));
    public static final Item IGNIS_PAXEL = registerItem("ignis_paxel",
            new PaxelItem(ModToolMaterial.IGNIS,1,-1.8F, new FabricItemSettings()));

    public static final Item AQUA_PICKAXE = registerItem("aqua_pickaxe",
            new PickaxeItem(ModToolMaterial.AQUA,1,-2.8F, new FabricItemSettings()));
    public static final Item AQUA_AXE = registerItem("aqua_axe",
            new AxeItem(ModToolMaterial.AQUA,5,-3F, new FabricItemSettings()));
    public static final Item AQUA_SHOVEL = registerItem("aqua_shovel",
            new ShovelItem(ModToolMaterial.AQUA,1.5F,-3.0F, new FabricItemSettings()));
    public static final Item AQUA_HOE = registerItem("aqua_hoe",
            new HoeItem(ModToolMaterial.AQUA,-3,0.0F, new FabricItemSettings()));
    public static final Item AQUA_SWORD = registerItem("aqua_sword",
            new SwordItem(ModToolMaterial.AQUA,3,-2.3F, new FabricItemSettings()));
    public static final Item AQUA_PAXEL = registerItem("aqua_paxel",
            new PaxelItem(ModToolMaterial.AQUA,1,-1.5F, new FabricItemSettings()));

    public static final Item TERA_PICKAXE = registerItem("tera_pickaxe",
            new PickaxeItem(ModToolMaterial.TERA,1,-2.8F, new FabricItemSettings()));
    public static final Item TERA_AXE = registerItem("tera_axe",
            new AxeItem(ModToolMaterial.TERA,5,-3F, new FabricItemSettings()));
    public static final Item TERA_SHOVEL = registerItem("tera_shovel",
            new ShovelItem(ModToolMaterial.TERA,1.5F,-3.0F, new FabricItemSettings()));
    public static final Item TERA_HOE = registerItem("tera_hoe",
            new HoeItem(ModToolMaterial.TERA,-3,0.0F, new FabricItemSettings()));
    public static final Item TERA_SWORD = registerItem("tera_sword",
            new SwordItem(ModToolMaterial.TERA,3,-2.3F, new FabricItemSettings()));
    public static final Item TERA_PAXEL = registerItem("tera_paxel",
            new PaxelItem(ModToolMaterial.TERA,1,-1.5F, new FabricItemSettings()));

    public static final Item LVL3_DWARF_PICKAXE = registerItem("lvl3_dwarf_pickaxe",
            new Hammer_1x3(ModToolMaterial.MAGIRITE, new FabricItemSettings().fireproof()));

    public static final Item MAGIRITE_PICKAXE = registerItem("magirite_pickaxe",
            new PickaxeItem(ModToolMaterial.MAGIRITE,1,-2.8F, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_AXE = registerItem("magirite_axe",
            new AxeItem(ModToolMaterial.MAGIRITE,5,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_SHOVEL = registerItem("magirite_shovel",
            new ShovelItem(ModToolMaterial.MAGIRITE,1.5F,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_HOE = registerItem("magirite_hoe",
            new HoeItem(ModToolMaterial.MAGIRITE,-4,0.0F, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_SWORD = registerItem("magirite_sword",
            new SwordItem(ModToolMaterial.MAGIRITE,3,-2.2F, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_PAXEL = registerItem("magirite_paxel",
            new PaxelItem(ModToolMaterial.MAGIRITE,1,-1.5F, new FabricItemSettings().fireproof()));

    public static final Item LVL4_DWARF_PICKAXE = registerItem("lvl4_dwarf_pickaxe",
            new Hammer_1x3(ModToolMaterial.MYTHRIL, new FabricItemSettings().fireproof()));

    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new PickaxeItem(ModToolMaterial.MYTHRIL,1,-2.8F, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new AxeItem(ModToolMaterial.MYTHRIL,5,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterial.MYTHRIL,1.5F,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new HoeItem(ModToolMaterial.MYTHRIL,-4,0.0F, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new SwordItem(ModToolMaterial.MYTHRIL,3,-2.1F, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_PAXEL = registerItem("mythril_paxel",
            new PaxelItem(ModToolMaterial.MYTHRIL,1,-1.5F, new FabricItemSettings().fireproof()));

    public static final Item LVL5_DWARF_PICKAXE = registerItem("lvl5_dwarf_pickaxe",
            new Hammer_3x3(ModToolMaterial.ADAMANTITE, new FabricItemSettings().fireproof()));

    public static final Item ADAMANTITE_PICKAXE = registerItem("adamantite_pickaxe",
            new PickaxeItem(ModToolMaterial.ADAMANTITE,1,-2.8F, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_AXE = registerItem("adamantite_axe",
            new AxeItem(ModToolMaterial.ADAMANTITE,5,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_SHOVEL = registerItem("adamantite_shovel",
            new ShovelItem(ModToolMaterial.ADAMANTITE,1.5F,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_HOE = registerItem("adamantite_hoe",
            new HoeItem(ModToolMaterial.ADAMANTITE,-4,0.0F, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_SWORD = registerItem("adamantite_sword",
            new SwordItem(ModToolMaterial.ADAMANTITE,3,-2.0F, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_PAXEL = registerItem("adamantite_paxel",
            new PaxelItem(ModToolMaterial.ADAMANTITE,1,-1.5F, new FabricItemSettings().fireproof()));

    public static final Item LVL6_DWARF_PICKAXE = registerItem("lvl6_dwarf_pickaxe",
            new Hammer_3x3(ModToolMaterial.ORIKALKUM, new FabricItemSettings().fireproof()));

    public static final Item ORIKALKUM_PICKAXE = registerItem("orikalkum_pickaxe",
            new PickaxeItem(ModToolMaterial.ORIKALKUM,1,-2.8F, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_AXE = registerItem("orikalkum_axe",
            new AxeItem(ModToolMaterial.ORIKALKUM,5,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_SHOVEL = registerItem("orikalkum_shovel",
            new ShovelItem(ModToolMaterial.ORIKALKUM,1.5F,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_HOE = registerItem("orikalkum_hoe",
            new HoeItem(ModToolMaterial.ORIKALKUM,-4,0.0F, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_SWORD = registerItem("orikalkum_sword",
            new SwordItem(ModToolMaterial.ORIKALKUM,3,-1.9F, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_PAXEL = registerItem("orikalkum_paxel",
            new PaxelItem(ModToolMaterial.ORIKALKUM,1,-1.5F, new FabricItemSettings().fireproof()));

    public static final Item DRAGON_BANE_PICKAXE = registerItem("dragon_bane_pickaxe",
            new PickaxeItem(ModToolMaterial.DRAGON_BANE,1,-2.8F, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_AXE = registerItem("dragon_bane_axe",
            new AxeItem(ModToolMaterial.DRAGON_BANE,5,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_SHOVEL = registerItem("dragon_bane_shovel",
            new ShovelItem(ModToolMaterial.DRAGON_BANE,1.5F,-3.0F, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_HOE = registerItem("dragon_bane_hoe",
            new HoeItem(ModToolMaterial.DRAGON_BANE,-4,0.0F, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_SWORD = registerItem("dragon_bane_sword",
            new SwordItem(ModToolMaterial.DRAGON_BANE,3,-1.8F, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_PAXEL = registerItem("dragon_bane_paxel",
            new PaxelItem(ModToolMaterial.DRAGON_BANE,1,-1.5F, new FabricItemSettings().fireproof()));

    public static final Item WAR_HAMMER = registerItem("war_hammer",
            new Hammer_5x5(ModToolMaterial.WAR_HAMMER, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item DWARF_HAMMER = registerItem("dwarf_hammer",
            new Hammer_7x7(ModToolMaterial.DWARF_HAMMER, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item PRESSURE_HAMMER = registerItem("pressure_hammer",
            new Hammer_9x9(ModToolMaterial.PRESSURE_HAMMER, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item GOD_SWORD = registerItem("god_sword",
            new GodSwordItem(ModToolMaterial.DRAGON_BANE,92,-0F, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));




    public static final Item DWARF_STEEL_HELMET = registerItem("dwarf_steel_helmet",
            new ArmorItem(ModArmorMaterials.DWARF_STEEL, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DWARF_STEEL_CHESTPLATE = registerItem("dwarf_steel_chestplate",
            new ArmorItem(ModArmorMaterials.DWARF_STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item DWARF_STEEL_LEGGINGS = registerItem("dwarf_steel_leggings",
            new ArmorItem(ModArmorMaterials.DWARF_STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item DWARF_STEEL_BOOTS = registerItem("dwarf_steel_boots",
            new ArmorItem(ModArmorMaterials.DWARF_STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item DWARF_GOLD_HELMET = registerItem("dwarf_gold_helmet",
            new ModArmorItem(ModArmorMaterials.DWARF_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DWARF_GOLD_CHESTPLATE = registerItem("dwarf_gold_chestplate",
            new ModArmorItem(ModArmorMaterials.DWARF_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item DWARF_GOLD_LEGGINGS = registerItem("dwarf_gold_leggings",
            new ModArmorItem(ModArmorMaterials.DWARF_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item DWARF_GOLD_BOOTS = registerItem("dwarf_gold_boots",
            new ModArmorItem(ModArmorMaterials.DWARF_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item AER_HELMET = registerItem("aer_helmet",
            new ModArmorItem(ModArmorMaterials.AER, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AER_CHESTPLATE = registerItem("aer_chestplate",
            new ModArmorItem(ModArmorMaterials.AER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AER_LEGGINGS = registerItem("aer_leggings",
            new ModArmorItem(ModArmorMaterials.AER, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AER_BOOTS = registerItem("aer_boots",
            new ModArmorItem(ModArmorMaterials.AER, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item IGNIS_HELMET = registerItem("ignis_helmet",
            new ModArmorItem(ModArmorMaterials.IGNIS, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item IGNIS_CHESTPLATE = registerItem("ignis_chestplate",
            new ModArmorItem(ModArmorMaterials.IGNIS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item IGNIS_LEGGINGS = registerItem("ignis_leggings",
            new ModArmorItem(ModArmorMaterials.IGNIS, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item IGNIS_BOOTS = registerItem("ignis_boots",
            new ModArmorItem(ModArmorMaterials.IGNIS, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item AQUA_HELMET = registerItem("aqua_helmet",
            new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AQUA_CHESTPLATE = registerItem("aqua_chestplate",
            new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AQUA_LEGGINGS = registerItem("aqua_leggings",
            new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AQUA_BOOTS = registerItem("aqua_boots",
            new ModArmorItem(ModArmorMaterials.AQUA, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item TERA_HELMET = registerItem("tera_helmet",
            new ModArmorItem(ModArmorMaterials.TERA, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TERA_CHESTPLATE = registerItem("tera_chestplate",
            new ModArmorItem(ModArmorMaterials.TERA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TERA_LEGGINGS = registerItem("tera_leggings",
            new ModArmorItem(ModArmorMaterials.TERA, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TERA_BOOTS = registerItem("tera_boots",
            new ModArmorItem(ModArmorMaterials.TERA, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item MAGIRITE_HELMET = registerItem("magirite_helmet",
            new ArmorItem(ModArmorMaterials.MAGIRITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_CHESTPLATE = registerItem("magirite_chestplate",
            new ArmorItem(ModArmorMaterials.MAGIRITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_LEGGINGS = registerItem("magirite_leggings",
            new ArmorItem(ModArmorMaterials.MAGIRITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item MAGIRITE_BOOTS = registerItem("magirite_boots",
            new ArmorItem(ModArmorMaterials.MAGIRITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item ADAMANTITE_HELMET = registerItem("adamantite_helmet",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_CHESTPLATE = registerItem("adamantite_chestplate",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_LEGGINGS = registerItem("adamantite_leggings",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item ADAMANTITE_BOOTS = registerItem("adamantite_boots",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item ORIKALKUM_HELMET = registerItem("orikalkum_helmet",
            new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_CHESTPLATE = registerItem("orikalkum_chestplate",
            new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_LEGGINGS = registerItem("orikalkum_leggings",
            new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item ORIKALKUM_BOOTS = registerItem("orikalkum_boots",
            new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item DRAGON_BANE_HELMET = registerItem("dragon_bane_helmet",
            new ArmorItem(ModArmorMaterials.DRAGON_BANE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_CHESTPLATE = registerItem("dragon_bane_chestplate",
            new ArmorItem(ModArmorMaterials.DRAGON_BANE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_LEGGINGS = registerItem("dragon_bane_leggings",
            new ArmorItem(ModArmorMaterials.DRAGON_BANE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item DRAGON_BANE_BOOTS = registerItem("dragon_bane_boots",
            new ArmorItem(ModArmorMaterials.DRAGON_BANE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));


    public static final Item DWARF_COPPER_COIN_S = registerItem("dwarf_copper_coin_s", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item DWARF_COPPER_COIN_M = registerItem("dwarf_copper_coin_m", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item DWARF_COPPER_COIN_L = registerItem("dwarf_copper_coin_l", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    public static final Item DWARF_STEEL_COIN_S = registerItem("dwarf_steel_coin_s", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DWARF_STEEL_COIN_M = registerItem("dwarf_steel_coin_m", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DWARF_STEEL_COIN_L = registerItem("dwarf_steel_coin_l", new Item(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item DWARF_GOLD_COIN_S = registerItem("dwarf_gold_coin_s", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DWARF_GOLD_COIN_M = registerItem("dwarf_gold_coin_m", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DWARF_GOLD_COIN_L = registerItem("dwarf_gold_coin_l", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item DWARF_MYTHRIL_COIN_L = registerItem("dwarf_mythril_coin_l", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item GOD_SWORD_BLADE = registerItem("god_sword_blade", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GOD_SWORD_HILT = registerItem("god_sword_hilt", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GOD_SWORD_HANDLE = registerItem("god_sword_handle", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GOD_SWORD_GEM = registerItem("god_sword_gem", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

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




    //normal flowers
    public static final Item SNOW_DROP_FLOWER = registerBlockItem("snow_drop_flower", ModBlocks.SNOW_DROP_FLOWER_BLOCK);
    public static final Item CARNATION_FLOWER = registerBlockItem("carnation_flower", ModBlocks.CARNATION_FLOWER_BLOCK);
    public static final Item VIOLET_FLOWER = registerBlockItem("violet_flower", ModBlocks.VIOLET_FLOWER_BLOCK);
    public static final Item IRIS_FLOWER = registerBlockItem("iris_flower", ModBlocks.IRIS_FLOWER_BLOCK);
    public static final Item PRIMROSE_FLOWER = registerBlockItem("primrose_flower", ModBlocks.PRIMROSE_FLOWER_BLOCK);
    public static final Item DAFFODIL_FLOWER = registerBlockItem("daffodil_flower", ModBlocks.DAFFODIL_FLOWER_BLOCK);
    public static final Item DELPHINIUM_FLOWER = registerBlockItem("delphinium_flower", ModBlocks.DELPHINIUM_FLOWER_BLOCK);
    public static final Item DAHLIA_FLOWER = registerBlockItem("dahlia_flower", ModBlocks.DAHLIA_FLOWER_BLOCK);
    public static final Item HYDRANGEA_FLOWER = registerBlockItem("hydrangea_flower", ModBlocks.HYDRANGEA_FLOWER_BLOCK);
    public static final Item MIDNIGHT_MYSTIC_FLOWER = registerBlockItem("midnight_mystic_flower", ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK);
    public static final Item HAWTHORN_FLOWER = registerBlockItem("hawthorn_flower", ModBlocks.HAWTHORN_FLOWER_BLOCK);
    public static final Item BONSAI_FLOWER = registerBlockItem("bonsai_flower", ModBlocks.BONSAI_FLOWER_BLOCK);
    public static final Item SPIDERLILY_FLOWER = registerBlockItem("spiderlily_flower", ModBlocks.SPIDERLILY_FLOWER_BLOCK);
    public static final Item LARKSPUR_FLOWER = registerBlockItem("larkspur_flower", ModBlocks.LARKSPUR_FLOWER_BLOCK);
    public static final Item AGAPANTHUS_FLOWER = registerBlockItem("agapanthus_flower", ModBlocks.AGAPANTHUS_FLOWER_BLOCK);
    public static final Item BLUE_COSMOS_FLOWER = registerBlockItem("blue_cosmos_flower", ModBlocks.BLUE_COSMOS_FLOWER_BLOCK);

    // Corrupt flower items
    public static final Item CORRUPT_SNOW_DROP_FLOWER = registerBlockItem("corrupt_snow_drop_flower", ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK);
    public static final Item CORRUPT_CARNATION_FLOWER = registerBlockItem("corrupt_carnation_flower", ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK);
    public static final Item CORRUPT_VIOLET_FLOWER = registerBlockItem("corrupt_violet_flower", ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK);
    public static final Item CORRUPT_IRIS_FLOWER = registerBlockItem("corrupt_iris_flower", ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK);
    public static final Item CORRUPT_PRIMROSE_FLOWER = registerBlockItem("corrupt_primrose_flower", ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK);
    public static final Item CORRUPT_DAFFODIL_FLOWER = registerBlockItem("corrupt_daffodil_flower", ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK);
    public static final Item CORRUPT_DELPHINIUM_FLOWER = registerBlockItem("corrupt_delphinium_flower", ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK);
    public static final Item CORRUPT_DAHLIA_FLOWER = registerBlockItem("corrupt_dahlia_flower", ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK);
    public static final Item CORRUPT_HYDRANGEA_FLOWER = registerBlockItem("corrupt_hydrangea_flower", ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK);
    public static final Item CORRUPT_MIDNIGHT_MYSTIC_FLOWER = registerBlockItem("corrupt_midnight_mystic_flower", ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK);
    public static final Item CORRUPT_HAWTHORN_FLOWER = registerBlockItem("corrupt_hawthorn_flower", ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK);
    public static final Item CORRUPT_BONSAI_FLOWER = registerBlockItem("corrupt_bonsai_flower", ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK);
    public static final Item CORRUPT_SPIDERLILY_FLOWER = registerBlockItem("corrupt_spiderlily_flower", ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK);
    public static final Item CORRUPT_LARKSPUR_FLOWER = registerBlockItem("corrupt_larkspur_flower", ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK);
    public static final Item CORRUPT_AGAPANTHUS_FLOWER = registerBlockItem("corrupt_agapanthus_flower", ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK);
    public static final Item CORRUPT_BLUE_COSMOS_FLOWER = registerBlockItem("corrupt_blue_cosmos_flower", ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK);

    // Ancient flower items
    public static final Item ANCIENT_SNOW_DROP_FLOWER = registerBlockItem("ancient_snow_drop_flower", ModBlocks.ANCIENT_SNOW_DROP_FLOWER_BLOCK);
    public static final Item ANCIENT_CARNATION_FLOWER = registerBlockItem("ancient_carnation_flower", ModBlocks.ANCIENT_CARNATION_FLOWER_BLOCK);
    public static final Item ANCIENT_VIOLET_FLOWER = registerBlockItem("ancient_violet_flower", ModBlocks.ANCIENT_VIOLET_FLOWER_BLOCK);
    public static final Item ANCIENT_IRIS_FLOWER = registerBlockItem("ancient_iris_flower", ModBlocks.ANCIENT_IRIS_FLOWER_BLOCK);
    public static final Item ANCIENT_PRIMROSE_FLOWER = registerBlockItem("ancient_primrose_flower", ModBlocks.ANCIENT_PRIMROSE_FLOWER_BLOCK);
    public static final Item ANCIENT_DAFFODIL_FLOWER = registerBlockItem("ancient_daffodil_flower", ModBlocks.ANCIENT_DAFFODIL_FLOWER_BLOCK);
    public static final Item ANCIENT_DELPHINIUM_FLOWER = registerBlockItem("ancient_delphinium_flower", ModBlocks.ANCIENT_DELPHINIUM_FLOWER_BLOCK);
    public static final Item ANCIENT_DAHLIA_FLOWER = registerBlockItem("ancient_dahlia_flower", ModBlocks.ANCIENT_DAHLIA_FLOWER_BLOCK);
    public static final Item ANCIENT_HYDRANGEA_FLOWER = registerBlockItem("ancient_hydrangea_flower", ModBlocks.ANCIENT_HYDRANGEA_FLOWER_BLOCK);
    public static final Item ANCIENT_MIDNIGHT_MYSTIC_FLOWER = registerBlockItem("ancient_midnight_mystic_flower", ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK);
    public static final Item ANCIENT_HAWTHORN_FLOWER = registerBlockItem("ancient_hawthorn_flower", ModBlocks.ANCIENT_HAWTHORN_FLOWER_BLOCK);
    public static final Item ANCIENT_BONSAI_FLOWER = registerBlockItem("ancient_bonsai_flower", ModBlocks.ANCIENT_BONSAI_FLOWER_BLOCK);
    public static final Item ANCIENT_SPIDERLILY_FLOWER = registerBlockItem("ancient_spiderlily_flower", ModBlocks.ANCIENT_SPIDERLILY_FLOWER_BLOCK);
    public static final Item ANCIENT_LARKSPUR_FLOWER = registerBlockItem("ancient_larkspur_flower", ModBlocks.ANCIENT_LARKSPUR_FLOWER_BLOCK);
    public static final Item ANCIENT_AGAPANTHUS_FLOWER = registerBlockItem("ancient_agapanthus_flower", ModBlocks.ANCIENT_AGAPANTHUS_FLOWER_BLOCK);
    public static final Item ANCIENT_BLUE_COSMOS_FLOWER = registerBlockItem("ancient_blue_cosmos_flower", ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER_BLOCK);




    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    };

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DwarfAdventureMod.MOD_ID, name), item);
    }

    public static void registerModItems () {
        DwarfAdventureMod.LOGGER.info("Registering Mod Items for " + DwarfAdventureMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DwarfAdventureMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


}
