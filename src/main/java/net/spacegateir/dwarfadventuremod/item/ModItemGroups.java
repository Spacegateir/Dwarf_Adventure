package net.spacegateir.dwarfadventuremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;


public class ModItemGroups {
    public static final ItemGroup DWARF_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DwarfAdventureMod.MOD_ID,"snow_drop_flower"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dwarf adventure"))
                    .icon(() -> new ItemStack(ModBlocks.GARDEN_BENCH)).entries((displayContext, entries) -> {


                        entries.add(ModItems.DWARF_STEEL_KNIFE);
                        entries.add(ModItems.DWARF_STEEL_TRIDENT);

                        entries.add(ModItems.DWARF_COPPER_COIN_S);
                        entries.add(ModItems.DWARF_COPPER_COIN_M);
                        entries.add(ModItems.DWARF_COPPER_COIN_L);
                        entries.add(ModItems.DWARF_STEEL_COIN_S);
                        entries.add(ModItems.DWARF_STEEL_COIN_M);
                        entries.add(ModItems.DWARF_STEEL_COIN_L);
                        entries.add(ModItems.DWARF_GOLD_COIN_S);
                        entries.add(ModItems.DWARF_GOLD_COIN_M);
                        entries.add(ModItems.DWARF_GOLD_COIN_L);
                        entries.add(ModItems.DWARF_MYTHRIL_COIN_L);

                        entries.add(ModItems.SNOW_DROP_FLOWER);
                        entries.add(ModItems.CARNATION_FLOWER);
                        entries.add(ModItems.VIOLET_FLOWER);
                        entries.add(ModItems.IRIS_FLOWER);
                        entries.add(ModItems.PRIMROSE_FLOWER);
                        entries.add(ModItems.DAFFODIL_FLOWER);
                        entries.add(ModItems.DELPHINIUM_FLOWER);
                        entries.add(ModItems.DAHLIA_FLOWER);
                        entries.add(ModItems.HYDRANGEA_FLOWER);
                        entries.add(ModItems.MIDNIGHT_MYSTIC_FLOWER);
                        entries.add(ModItems.HAWTHORN_FLOWER);
                        entries.add(ModItems.BONSAI_FLOWER);
                        entries.add(ModItems.SPIDERLILY_FLOWER);
                        entries.add(ModItems.LARKSPUR_FLOWER);
                        entries.add(ModItems.AGAPANTHUS_FLOWER);
                        entries.add(ModItems.BLUE_COSMOS_FLOWER);

                        entries.add(ModItems.CORRUPT_SNOW_DROP_FLOWER);
                        entries.add(ModItems.CORRUPT_CARNATION_FLOWER);
                        entries.add(ModItems.CORRUPT_VIOLET_FLOWER);
                        entries.add(ModItems.CORRUPT_IRIS_FLOWER);
                        entries.add(ModItems.CORRUPT_PRIMROSE_FLOWER);
                        entries.add(ModItems.CORRUPT_DAFFODIL_FLOWER);
                        entries.add(ModItems.CORRUPT_DELPHINIUM_FLOWER);
                        entries.add(ModItems.CORRUPT_DAHLIA_FLOWER);
                        entries.add(ModItems.CORRUPT_HYDRANGEA_FLOWER);
                        entries.add(ModItems.CORRUPT_MIDNIGHT_MYSTIC_FLOWER);
                        entries.add(ModItems.CORRUPT_HAWTHORN_FLOWER);
                        entries.add(ModItems.CORRUPT_BONSAI_FLOWER);
                        entries.add(ModItems.CORRUPT_SPIDERLILY_FLOWER);
                        entries.add(ModItems.CORRUPT_LARKSPUR_FLOWER);
                        entries.add(ModItems.CORRUPT_AGAPANTHUS_FLOWER);
                        entries.add(ModItems.CORRUPT_BLUE_COSMOS_FLOWER);

                        entries.add(ModItems.ANCIENT_SNOW_DROP_FLOWER);
                        entries.add(ModItems.ANCIENT_CARNATION_FLOWER);
                        entries.add(ModItems.ANCIENT_VIOLET_FLOWER);
                        entries.add(ModItems.ANCIENT_IRIS_FLOWER);
                        entries.add(ModItems.ANCIENT_PRIMROSE_FLOWER);
                        entries.add(ModItems.ANCIENT_DAFFODIL_FLOWER);
                        entries.add(ModItems.ANCIENT_DELPHINIUM_FLOWER);
                        entries.add(ModItems.ANCIENT_DAHLIA_FLOWER);
                        entries.add(ModItems.ANCIENT_HYDRANGEA_FLOWER);
                        entries.add(ModItems.ANCIENT_MIDNIGHT_MYSTIC_FLOWER);
                        entries.add(ModItems.ANCIENT_HAWTHORN_FLOWER);
                        entries.add(ModItems.ANCIENT_BONSAI_FLOWER);
                        entries.add(ModItems.ANCIENT_SPIDERLILY_FLOWER);
                        entries.add(ModItems.ANCIENT_LARKSPUR_FLOWER);
                        entries.add(ModItems.ANCIENT_AGAPANTHUS_FLOWER);
                        entries.add(ModItems.ANCIENT_BLUE_COSMOS_FLOWER);


                        entries.add(ModBlocks.CASH_REGISTER);
                        entries.add(ModBlocks.WEAPON_RACK);
                        entries.add(ModBlocks.TOOL_RACK);
                        entries.add(ModBlocks.GARDEN_BENCH);
                        entries.add(ModBlocks.GARDEN_POT);
                        entries.add(ModBlocks.GARDEN_POTTED_POT);
                        entries.add(ModBlocks.DWARF_ANVIL);
                        entries.add(ModBlocks.DWARF_ANVIL_GROUND);
                        entries.add(ModBlocks.DWARF_ANVIL_STACK);
                        entries.add(ModBlocks.DWARF_ANVIL_TURN);
                        entries.add(ModBlocks.DWARF_ANVIL_OVER);
                        entries.add(ModBlocks.DWARF_FORGE);
                        entries.add(ModBlocks.DWARF_BELLOWS);
                        entries.add(ModBlocks.STORAGE_CREATE);
                        entries.add(ModBlocks.STORAGE_CREATE_SMALL);
                        entries.add(ModBlocks.STORAGE_CREATE_LARGE);
                        entries.add(ModBlocks.STORAGE_CREATE_DOUBLE);

                        entries.add(ModItems.WAR_HAMMER);
                        entries.add(ModItems.DWARF_HAMMER);
                        entries.add(ModItems.PRESSURE_HAMMER);

                        entries.add(ModItems.GOD_SWORD);

                        entries.add(ModItems.LVL1_DWARF_PICKAXE);
                        entries.add(ModItems.LVL2_DWARF_PICKAXE);
                        entries.add(ModItems.LVL3_DWARF_PICKAXE);
                        entries.add(ModItems.LVL4_DWARF_PICKAXE);
                        entries.add(ModItems.LVL5_DWARF_PICKAXE);
                        entries.add(ModItems.LVL6_DWARF_PICKAXE);

                        entries.add(ModItems.DWARF_STEEL_PICKAXE);
                        entries.add(ModItems.DWARF_STEEL_AXE);
                        entries.add(ModItems.DWARF_STEEL_SHOVEL);
                        entries.add(ModItems.DWARF_STEEL_HOE);
                        entries.add(ModItems.DWARF_STEEL_SWORD);
                        entries.add(ModItems.DWARF_STEEL_PAXEL);

                        entries.add(ModItems.DWARF_STEEL_HELMET);
                        entries.add(ModItems.DWARF_STEEL_CHESTPLATE);
                        entries.add(ModItems.DWARF_STEEL_LEGGINGS);
                        entries.add(ModItems.DWARF_STEEL_BOOTS);

                        entries.add(ModItems.DWARF_GOLD_PICKAXE);
                        entries.add(ModItems.DWARF_GOLD_AXE);
                        entries.add(ModItems.DWARF_GOLD_SHOVEL);
                        entries.add(ModItems.DWARF_GOLD_HOE);
                        entries.add(ModItems.DWARF_GOLD_SWORD);
                        entries.add(ModItems.DWARF_GOLD_PAXEL);

                        entries.add(ModItems.DWARF_GOLD_HELMET);
                        entries.add(ModItems.DWARF_GOLD_CHESTPLATE);
                        entries.add(ModItems.DWARF_GOLD_LEGGINGS);
                        entries.add(ModItems.DWARF_GOLD_BOOTS);

                        entries.add(ModItems.AER_PICKAXE);
                        entries.add(ModItems.AER_AXE);
                        entries.add(ModItems.AER_SHOVEL);
                        entries.add(ModItems.AER_HOE);
                        entries.add(ModItems.AER_SWORD);
                        entries.add(ModItems.AER_PAXEL);

                        entries.add(ModItems.AER_HELMET);
                        entries.add(ModItems.AER_CHESTPLATE);
                        entries.add(ModItems.AER_LEGGINGS);
                        entries.add(ModItems.AER_BOOTS);

                        entries.add(ModItems.IGNIS_PICKAXE);
                        entries.add(ModItems.IGNIS_AXE);
                        entries.add(ModItems.IGNIS_SHOVEL);
                        entries.add(ModItems.IGNIS_HOE);
                        entries.add(ModItems.IGNIS_SWORD);
                        entries.add(ModItems.IGNIS_PAXEL);

                        entries.add(ModItems.IGNIS_HELMET);
                        entries.add(ModItems.IGNIS_CHESTPLATE);
                        entries.add(ModItems.IGNIS_LEGGINGS);
                        entries.add(ModItems.IGNIS_BOOTS);

                        entries.add(ModItems.AQUA_PICKAXE);
                        entries.add(ModItems.AQUA_AXE);
                        entries.add(ModItems.AQUA_SHOVEL);
                        entries.add(ModItems.AQUA_HOE);
                        entries.add(ModItems.AQUA_SWORD);
                        entries.add(ModItems.AQUA_PAXEL);

                        entries.add(ModItems.AQUA_HELMET);
                        entries.add(ModItems.AQUA_CHESTPLATE);
                        entries.add(ModItems.AQUA_LEGGINGS);
                        entries.add(ModItems.AQUA_BOOTS);

                        entries.add(ModItems.TERA_PICKAXE);
                        entries.add(ModItems.TERA_AXE);
                        entries.add(ModItems.TERA_SHOVEL);
                        entries.add(ModItems.TERA_HOE);
                        entries.add(ModItems.TERA_SWORD);
                        entries.add(ModItems.TERA_PAXEL);

                        entries.add(ModItems.TERA_HELMET);
                        entries.add(ModItems.TERA_CHESTPLATE);
                        entries.add(ModItems.TERA_LEGGINGS);
                        entries.add(ModItems.TERA_BOOTS);

                        entries.add(ModItems.MAGIRITE_PICKAXE);
                        entries.add(ModItems.MAGIRITE_AXE);
                        entries.add(ModItems.MAGIRITE_SHOVEL);
                        entries.add(ModItems.MAGIRITE_HOE);
                        entries.add(ModItems.MAGIRITE_SWORD);
                        entries.add(ModItems.MAGIRITE_PAXEL);

                        entries.add(ModItems.MAGIRITE_HELMET);
                        entries.add(ModItems.MAGIRITE_CHESTPLATE);
                        entries.add(ModItems.MAGIRITE_LEGGINGS);
                        entries.add(ModItems.MAGIRITE_BOOTS);

                        entries.add(ModItems.MYTHRIL_PICKAXE);
                        entries.add(ModItems.MYTHRIL_AXE);
                        entries.add(ModItems.MYTHRIL_SHOVEL);
                        entries.add(ModItems.MYTHRIL_HOE);
                        entries.add(ModItems.MYTHRIL_SWORD);
                        entries.add(ModItems.MYTHRIL_PAXEL);

                        entries.add(ModItems.MYTHRIL_HELMET);
                        entries.add(ModItems.MYTHRIL_CHESTPLATE);
                        entries.add(ModItems.MYTHRIL_LEGGINGS);
                        entries.add(ModItems.MYTHRIL_BOOTS);

                        entries.add(ModItems.ADAMANTITE_PICKAXE);
                        entries.add(ModItems.ADAMANTITE_AXE);
                        entries.add(ModItems.ADAMANTITE_SHOVEL);
                        entries.add(ModItems.ADAMANTITE_HOE);
                        entries.add(ModItems.ADAMANTITE_SWORD);
                        entries.add(ModItems.ADAMANTITE_PAXEL);

                        entries.add(ModItems.ADAMANTITE_HELMET);
                        entries.add(ModItems.ADAMANTITE_CHESTPLATE);
                        entries.add(ModItems.ADAMANTITE_LEGGINGS);
                        entries.add(ModItems.ADAMANTITE_BOOTS);

                        entries.add(ModItems.ORIKALKUM_PICKAXE);
                        entries.add(ModItems.ORIKALKUM_AXE);
                        entries.add(ModItems.ORIKALKUM_SHOVEL);
                        entries.add(ModItems.ORIKALKUM_HOE);
                        entries.add(ModItems.ORIKALKUM_SWORD);
                        entries.add(ModItems.ORIKALKUM_PAXEL);

                        entries.add(ModItems.ORIKALKUM_HELMET);
                        entries.add(ModItems.ORIKALKUM_CHESTPLATE);
                        entries.add(ModItems.ORIKALKUM_LEGGINGS);
                        entries.add(ModItems.ORIKALKUM_BOOTS);

                        entries.add(ModItems.DRAGON_BANE_PICKAXE);
                        entries.add(ModItems.DRAGON_BANE_AXE);
                        entries.add(ModItems.DRAGON_BANE_SHOVEL);
                        entries.add(ModItems.DRAGON_BANE_HOE);
                        entries.add(ModItems.DRAGON_BANE_SWORD);
                        entries.add(ModItems.DRAGON_BANE_PAXEL);

                        entries.add(ModItems.DRAGON_BANE_HELMET);
                        entries.add(ModItems.DRAGON_BANE_CHESTPLATE);
                        entries.add(ModItems.DRAGON_BANE_LEGGINGS);
                        entries.add(ModItems.DRAGON_BANE_BOOTS);

                        entries.add(ModItems.HANDLE_PART);
                        entries.add(ModItems.HOT_DWARF_PICKAXE_HEAD);
                        entries.add(ModItems.DWARF_STEEL_PICKAXE_HEAD);
                        entries.add(ModItems.GOD_SWORD_BLADE);
                        entries.add(ModItems.GOD_SWORD_HILT);
                        entries.add(ModItems.GOD_SWORD_HANDLE);
                        entries.add(ModItems.GOD_SWORD_GEM);

                        entries.add(ModItems.ANCIENT_SEED);
                        entries.add(ModItems.CORRUPT_GEM);
                        entries.add(ModItems.GLIMMER_ROOT);
                        entries.add(ModItems.ANCIENT_BRANCH);
                        entries.add(ModItems.ANCESTRAL_FORGE_COAL);
                        entries.add(ModItems.ARCANE_POWDER);
                        entries.add(ModItems.GOLEM_CORE);
                        entries.add(ModItems.ENHNACED_GOLEM_CORE);
                        entries.add(ModItems.MORTAR_AND_PESTLE);
                        entries.add(ModItems.WARDEN_HIDE);
                        entries.add(ModItems.WITHER_BONE);
                        entries.add(ModItems.HEARTHSTONE_OF_BORRUM);
                        entries.add(ModItems.THALORUNS_SOULSTONE);

                        entries.add(ModItems.CLUMP_OF_DWARF_STEEL);
                        entries.add(ModItems.CLUMP_OF_AER_SPIRITSTONE);
                        entries.add(ModItems.CLUMP_OF_IGNIS_SPIRITSTONE);
                        entries.add(ModItems.CLUMP_OF_AQUA_SPIRITSTONE);
                        entries.add(ModItems.CLUMP_OF_TERA_SPIRITSTONE);
                        entries.add(ModItems.CLUMP_OF_MAGIRITE);
                        entries.add(ModItems.CLUMP_OF_ADAMANTITE);
                        entries.add(ModItems.CLUMP_OF_ORIKALKUM);
                        entries.add(ModItems.CLUMP_OF_DRAGON_BANE);
                        entries.add(ModItems.CLUMP_OF_DWARF_GOLD);

                        entries.add(ModItems.RAW_DWARF_STEEL);
                        entries.add(ModItems.RAW_MAGIRITE);
                        entries.add(ModItems.RAW_ADAMANTITE);
                        entries.add(ModItems.RAW_ORIKALKUM);
                        entries.add(ModItems.RAW_DRAGON_BANE);
                        entries.add(ModItems.RAW_DWARF_GOLD);

                        entries.add(ModItems.DWARF_STEEL_NUGGET);
                        entries.add(ModItems.AER_SPIRIT_NUGGET);
                        entries.add(ModItems.IGNIS_SPIRIT_NUGGET);
                        entries.add(ModItems.AQUA_SPIRIT_NUGGET);
                        entries.add(ModItems.TERA_SPIRIT_NUGGET);
                        entries.add(ModItems.MAGIRITE_NUGGET);
                        entries.add(ModItems.ADAMANTITE_NUGGET);
                        entries.add(ModItems.ORIKALKUM_NUGGET);
                        entries.add(ModItems.DRAGON_BANE_NUGGET);
                        entries.add(ModItems.DWARF_GOLD_NUGGET);

                        entries.add(ModItems.DWARF_STEEL_INGOT);
                        entries.add(ModItems.AER_SPIRIT_INGOT);
                        entries.add(ModItems.IGNIS_SPIRIT_INGOT);
                        entries.add(ModItems.AQUA_SPIRIT_INGOT);
                        entries.add(ModItems.TERA_SPIRIT_INGOT);
                        entries.add(ModItems.MAGIRITE_INGOT);
                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModItems.ORIKALKUM_INGOT);
                        entries.add(ModItems.DRAGON_BANE_INGOT);
                        entries.add(ModItems.DWARF_GOLD_INGOT);

                        entries.add(ModItems.HOT_INGOT);
                        entries.add(ModItems.FORGING_HOT_AER);
                        entries.add(ModItems.FORGING_HOT_IGNIS);
                        entries.add(ModItems.FORGING_HOT_AQUA);
                        entries.add(ModItems.FORGING_HOT_TERA);
                        entries.add(ModItems.MOLTEN_MAGIRITE_INGOT);
                        entries.add(ModItems.MOLTEN_ADAMANTITE_INGOT);
                        entries.add(ModItems.MOLTEN_ORIKALKUM_INGOT);
                        entries.add(ModItems.MOLTEN_DRAGON_BANE_INGOT);
                        entries.add(ModItems.MOLTEN_DWARF_GOLD_INGOT);

                        entries.add(ModBlocks.SMALL_MYTHRIL_BUD);
                        entries.add(ModBlocks.MEDIUM_MYTHRIL_BUD);
                        entries.add(ModBlocks.LARGE_MYTHRIL_BUD);
                        entries.add(ModBlocks.MYTHRIL_CLUSTER);
                        entries.add(ModItems.MYTHRIL);
                        entries.add(ModItems.PUREFICATED_MYTHRIL);

                        entries.add(ModBlocks.STONE_DWARF_STEEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_DWARF_STEEL_ORE);
                        entries.add(ModBlocks.NETHERRACK_DWARF_STEEL_ORE);
                        entries.add(ModBlocks.END_STONE_DWARF_STEEL_ORE);
                        entries.add(ModBlocks.ANDESITE_DWARF_STEEL_ORE);
                        entries.add(ModBlocks.DIORITE_DWARF_STEEL_ORE);
                        entries.add(ModBlocks.GRANITE_DWARF_STEEL_ORE);

                        entries.add(ModBlocks.MAGIRITE_STONE_ORE);
                        entries.add(ModBlocks.MAGIRITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MAGIRITE_NETHERRACK_ORE);
                        entries.add(ModBlocks.MAGIRITE_END_STONE_ORE);
                        entries.add(ModBlocks.MAGIRITE_ANDESITE_ORE);
                        entries.add(ModBlocks.MAGIRITE_DIORITE_ORE);
                        entries.add(ModBlocks.MAGIRITE_GRANITE_ORE);

                        entries.add(ModBlocks.BUDDING_MYTHRIL);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_STONE);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_DEELSLATE);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_NETHERRACK);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_END_STONE);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_ANDESITE);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_DIORITE);
                        entries.add(ModBlocks.BUDDING_MYTHRIL_GRANDITE);

                        entries.add(ModBlocks.ADAMANTITE_STONE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_NETHERRACK_ORE);
                        entries.add(ModBlocks.ADAMANTITE_END_STONE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_ANDESITE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_DIORITE_ORE);
                        entries.add(ModBlocks.ADAMANTITE_GRANITE_ORE);

                        entries.add(ModBlocks.ORIKALKUM_STONE_ORE);
                        entries.add(ModBlocks.ORIKALKUM_DEEPSLATE_ORE);
                        entries.add(ModBlocks.ORIKALKUM_NETHERRACK_ORE);
                        entries.add(ModBlocks.ORIKALKUM_END_STONE_ORE);
                        entries.add(ModBlocks.ORIKALKUM_ANDESITE_ORE);
                        entries.add(ModBlocks.ORIKALKUM_DIORITE_ORE);
                        entries.add(ModBlocks.ORIKALKUM_GRANITE_ORE);

                        entries.add(ModBlocks.DRAGON_BANE_STONE_ORE);
                        entries.add(ModBlocks.DRAGON_BANE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.DRAGON_BANE_NETHERRACK_ORE);
                        entries.add(ModBlocks.DRAGON_BANE_END_STONE_ORE);
                        entries.add(ModBlocks.DRAGON_BANE_ANDESITE_ORE);
                        entries.add(ModBlocks.DRAGON_BANE_DIORITE_ORE);
                        entries.add(ModBlocks.DRAGON_BANE_GRANITE_ORE);

                        entries.add(ModBlocks.DWARF_GOLD_STONE_ORE);
                        entries.add(ModBlocks.DWARF_GOLD_DEEPSLATE_ORE);
                        entries.add(ModBlocks.DWARF_GOLD_NETHERRACK_ORE);
                        entries.add(ModBlocks.DWARF_GOLD_END_STONE_ORE);
                        entries.add(ModBlocks.DWARF_GOLD_ANDESITE_ORE);
                        entries.add(ModBlocks.DWARF_GOLD_DIORITE_ORE);
                        entries.add(ModBlocks.DWARF_GOLD_GRANITE_ORE);

                        entries.add(ModBlocks.RAW_DWARF_STEEL_BLOCK);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_SLAB);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_STAIRS);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_FENCE);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_WALL);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_BUTTON);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_DOOR);
                        entries.add(ModBlocks.RAW_DWARF_STEEL_TRAPDOOR);

                        entries.add(ModBlocks.DWARF_STEEL_BLOCK);
                        entries.add(ModBlocks.DWARF_STEEL_SLAB);
                        entries.add(ModBlocks.DWARF_STEEL_STAIRS);
                        entries.add(ModBlocks.DWARF_STEEL_FENCE_GATE);
                        entries.add(ModBlocks.DWARF_STEEL_FENCE);
                        entries.add(ModBlocks.DWARF_STEEL_WALL);
                        entries.add(ModBlocks.DWARF_STEEL_BUTTON);
                        entries.add(ModBlocks.DWARF_STEEL_PRESSURE_PLATE);
                        entries.add(ModBlocks.DWARF_STEEL_DOOR);
                        entries.add(ModBlocks.DWARF_STEEL_TRAPDOOR);

                        entries.add(ModItems.WIND_GEM);
                        entries.add(ModItems.FIRE_GEM);
                        entries.add(ModItems.WATER_GEM);
                        entries.add(ModItems.EARTH_GEM);
                        entries.add(ModItems.ELEMENTAL_GEM);

                        entries.add(ModBlocks.WIND_GEM_BLOCK);
                        entries.add(ModBlocks.WIND_GEM_SLAB);
                        entries.add(ModBlocks.WIND_GEM_STAIRS);
                        entries.add(ModBlocks.WIND_GEM_FENCE_GATE);
                        entries.add(ModBlocks.WIND_GEM_FENCE);
                        entries.add(ModBlocks.WIND_GEM_WALL);
                        entries.add(ModBlocks.WIND_GEM_BUTTON);
                        entries.add(ModBlocks.WIND_GEM_PRESSURE_PLATE);
                        entries.add(ModBlocks.AER_SPIRITSTONE_DOOR);
                        entries.add(ModBlocks.AER_SPIRITSTONE_TRAPDOOR);

                        entries.add(ModBlocks.AER_BLOCK);
                        entries.add(ModBlocks.AER_SLAB);
                        entries.add(ModBlocks.AER_STAIRS);
                        entries.add(ModBlocks.AER_FENCE_GATE);
                        entries.add(ModBlocks.AER_FENCE);
                        entries.add(ModBlocks.AER_WALL);
                        entries.add(ModBlocks.AER_BUTTON);
                        entries.add(ModBlocks.AER_PRESSURE_PLATE);
                        entries.add(ModBlocks.AER_DOOR);
                        entries.add(ModBlocks.AER_TRAPDOOR);

                        entries.add(ModBlocks.FIRE_GEM_BLOCK);
                        entries.add(ModBlocks.FIRE_GEM_SLAB);
                        entries.add(ModBlocks.FIRE_GEM_STAIRS);
                        entries.add(ModBlocks.FIRE_GEM_FENCE_GATE);
                        entries.add(ModBlocks.FIRE_GEM_FENCE);
                        entries.add(ModBlocks.FIRE_GEM_WALL);
                        entries.add(ModBlocks.FIRE_GEM_BUTTON);
                        entries.add(ModBlocks.FIRE_GEM_PRESSURE_PLATE);
                        entries.add(ModBlocks.IGNIS_SPIRITSTONE_DOOR);
                        entries.add(ModBlocks.IGNIS_SPIRITSTONE_TRAPDOOR);

                        entries.add(ModBlocks.IGNIS_BLOCK);
                        entries.add(ModBlocks.IGNIS_SLAB);
                        entries.add(ModBlocks.IGNIS_STAIRS);
                        entries.add(ModBlocks.IGNIS_FENCE_GATE);
                        entries.add(ModBlocks.IGNIS_FENCE);
                        entries.add(ModBlocks.IGNIS_WALL);
                        entries.add(ModBlocks.IGNIS_BUTTON);
                        entries.add(ModBlocks.IGNIS_PRESSURE_PLATE);
                        entries.add(ModBlocks.IGNIS_DOOR);
                        entries.add(ModBlocks.IGNIS_TRAPDOOR);

                        entries.add(ModBlocks.WATER_GEM_BLOCK);
                        entries.add(ModBlocks.WATER_GEM_SLAB);
                        entries.add(ModBlocks.WATER_GEM_STAIRS);
                        entries.add(ModBlocks.WATER_GEM_FENCE_GATE);
                        entries.add(ModBlocks.WATER_GEM_FENCE);
                        entries.add(ModBlocks.WATER_GEM_WALL);
                        entries.add(ModBlocks.WATER_GEM_BUTTON);
                        entries.add(ModBlocks.WATER_GEM_PRESSURE_PLATE);
                        entries.add(ModBlocks.AQUA_SPITIRSTONE_DOOR);
                        entries.add(ModBlocks.AQUA_SPIRITSTONE_TRAPDOOR);

                        entries.add(ModBlocks.AQUA_BLOCK);
                        entries.add(ModBlocks.AQUA_SLAB);
                        entries.add(ModBlocks.AQUA_STAIRS);
                        entries.add(ModBlocks.AQUA_FENCE_GATE);
                        entries.add(ModBlocks.AQUA_FENCE);
                        entries.add(ModBlocks.AQUA_WALL);
                        entries.add(ModBlocks.AQUA_BUTTON);
                        entries.add(ModBlocks.AQUA_PRESSURE_PLATE);
                        entries.add(ModBlocks.AQUA_DOOR);
                        entries.add(ModBlocks.AQUA_TRAPDOOR);

                        entries.add(ModBlocks.EARTH_GEM_BLOCK);
                        entries.add(ModBlocks.EARTH_GEM_SLAB);
                        entries.add(ModBlocks.EARTH_GEM_STAIRS);
                        entries.add(ModBlocks.EARTH_GEM_FENCE_GATE);
                        entries.add(ModBlocks.EARTH_GEM_FENCE);
                        entries.add(ModBlocks.EARTH_GEM_WALL);
                        entries.add(ModBlocks.EARTH_GEM_BUTTON);
                        entries.add(ModBlocks.EARTH_GEM_PRESSURE_PLATE);
                        entries.add(ModBlocks.TERA_SPIRITSTONE_DOOR);
                        entries.add(ModBlocks.TERA_SPIRITSTONE_TRAPDOOR);

                        entries.add(ModBlocks.TERA_BLOCK);
                        entries.add(ModBlocks.TERA_SLAB);
                        entries.add(ModBlocks.TERA_STAIRS);
                        entries.add(ModBlocks.TERA_FENCE_GATE);
                        entries.add(ModBlocks.TERA_FENCE);
                        entries.add(ModBlocks.TERA_WALL);
                        entries.add(ModBlocks.TERA_BUTTON);
                        entries.add(ModBlocks.TERA_PRESSURE_PLATE);
                        entries.add(ModBlocks.TERA_DOOR);
                        entries.add(ModBlocks.TERA_TRAPDOOR);

                        entries.add(ModBlocks.ELEMENTAL_GEM_BLOCK);
                        entries.add(ModBlocks.ELEMENTAL_GEM_SLAB);
                        entries.add(ModBlocks.ELEMENTAL_GEM_STAIRS);
                        entries.add(ModBlocks.ELEMENTAL_GEM_FENCE_GATE);
                        entries.add(ModBlocks.ELEMENTAL_GEM_FENCE);
                        entries.add(ModBlocks.ELEMENTAL_GEM_WALL);
                        entries.add(ModBlocks.ELEMENTAL_GEM_BUTTON);
                        entries.add(ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE);
                        entries.add(ModBlocks.QUINTESSENCE_DOOR);
                        entries.add(ModBlocks.QUINTESSENCE_TRAPDOOR);

                        entries.add(ModBlocks.RAW_MAGIRITE_BLOCK);
                        entries.add(ModBlocks.RAW_MAGIRITE_SLAB);
                        entries.add(ModBlocks.RAW_MAGIRITE_STAIRS);
                        entries.add(ModBlocks.RAW_MAGIRITE_FENCE_GATE);
                        entries.add(ModBlocks.RAW_MAGIRITE_FENCE);
                        entries.add(ModBlocks.RAW_MAGIRITE_WALL);
                        entries.add(ModBlocks.RAW_MAGIRITE_BUTTON);
                        entries.add(ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RAW_MAGIRITE_DOOR);
                        entries.add(ModBlocks.RAW_MAGIRITE_TRAPDOOR);

                        entries.add(ModBlocks.MAGIRITE_BLOCK);
                        entries.add(ModBlocks.MAGIRITE_SLAB);
                        entries.add(ModBlocks.MAGIRITE_STAIRS);
                        entries.add(ModBlocks.MAGIRITE_FENCE_GATE);
                        entries.add(ModBlocks.MAGIRITE_FENCE);
                        entries.add(ModBlocks.MAGIRITE_WALL);
                        entries.add(ModBlocks.MAGIRITE_BUTTON);
                        entries.add(ModBlocks.MAGIRITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGIRITE_DOOR);
                        entries.add(ModBlocks.MAGIRITE_TRAPDOOR);

                        entries.add(ModBlocks.MYTHRIL_BLOCK);
                        entries.add(ModBlocks.MYTHRIL_SLAB);
                        entries.add(ModBlocks.MYTHRIL_STAIRS);
                        entries.add(ModBlocks.MYTHRIL_FENCE_GATE);
                        entries.add(ModBlocks.MYTHRIL_FENCE);
                        entries.add(ModBlocks.MYTHRIL_WALL);
                        entries.add(ModBlocks.MYTHRIL_BUTTON);
                        entries.add(ModBlocks.MYTHRIL_PRESSURE_PLATE);
                        entries.add(ModBlocks.MYTHRIL_DOOR);
                        entries.add(ModBlocks.MYTHRIL_TRAPDOOR);

                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_BLOCK);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_SLAB);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_STAIRS);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_FENCE);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_WALL);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_BUTTON);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_DOOR);
                        entries.add(ModBlocks.PUREFICATED_MYTHRIL_TRAPDOOR);

                        entries.add(ModBlocks.RAW_ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RAW_ADAMANTITE_SLAB);
                        entries.add(ModBlocks.RAW_ADAMANTITE_STAIRS);
                        entries.add(ModBlocks.RAW_ADAMANTITE_FENCE_GATE);
                        entries.add(ModBlocks.RAW_ADAMANTITE_FENCE);
                        entries.add(ModBlocks.RAW_ADAMANTITE_WALL);
                        entries.add(ModBlocks.RAW_ADAMANTITE_BUTTON);
                        entries.add(ModBlocks.RAW_ADAMANTITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RAW_ADAMANTITE_DOOR);
                        entries.add(ModBlocks.RAW_ADAMANTITE_TRAPDOOR);

                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.ADAMANTITE_SLAB);
                        entries.add(ModBlocks.ADAMANTITE_STAIRS);
                        entries.add(ModBlocks.ADAMANTITE_FENCE_GATE);
                        entries.add(ModBlocks.ADAMANTITE_FENCE);
                        entries.add(ModBlocks.ADAMANTITE_WALL);
                        entries.add(ModBlocks.ADAMANTITE_BUTTON);
                        entries.add(ModBlocks.ADAMANTITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ADAMANTITE_DOOR);
                        entries.add(ModBlocks.ADAMANTITE_TRAPDOOR);

                        entries.add(ModBlocks.RAW_ORIKALKUM_BLOCK);
                        entries.add(ModBlocks.RAW_ORIKALKUM_SLAB);
                        entries.add(ModBlocks.RAW_ORIKALKUM_STAIRS);
                        entries.add(ModBlocks.RAW_ORIKALKUM_FENCE_GATE);
                        entries.add(ModBlocks.RAW_ORIKALKUM_FENCE);
                        entries.add(ModBlocks.RAW_ORIKALKUM_WALL);
                        entries.add(ModBlocks.RAW_ORIKALKUM_BUTTON);
                        entries.add(ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.RAW_ORIKALKUM_DOOR);
                        entries.add(ModBlocks.RAW_ORIKALKUM_TRAPDOOR);

                        entries.add(ModBlocks.ORIKALKUM_BLOCK);
                        entries.add(ModBlocks.ORIKALKUM_SLAB);
                        entries.add(ModBlocks.ORIKALKUM_STAIRS);
                        entries.add(ModBlocks.ORIKALKUM_FENCE_GATE);
                        entries.add(ModBlocks.ORIKALKUM_FENCE);
                        entries.add(ModBlocks.ORIKALKUM_WALL);
                        entries.add(ModBlocks.ORIKALKUM_BUTTON);
                        entries.add(ModBlocks.ORIKALKUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORIKALKUM_DOOR);
                        entries.add(ModBlocks.ORIKALKUM_TRAPDOOR);

                        entries.add(ModBlocks.RAW_DRAGON_BANE_BLOCK);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_SLAB);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_STAIRS);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_FENCE);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_WALL);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_BUTTON);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_DOOR);
                        entries.add(ModBlocks.RAW_DRAGON_BANE_TRAPDOOR);

                        entries.add(ModBlocks.DRAGON_BANE_BLOCK);
                        entries.add(ModBlocks.DRAGON_BANE_SLAB);
                        entries.add(ModBlocks.DRAGON_BANE_STAIRS);
                        entries.add(ModBlocks.DRAGON_BANE_FENCE_GATE);
                        entries.add(ModBlocks.DRAGON_BANE_FENCE);
                        entries.add(ModBlocks.DRAGON_BANE_WALL);
                        entries.add(ModBlocks.DRAGON_BANE_BUTTON);
                        entries.add(ModBlocks.DRAGON_BANE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DRAGON_BANE_DOOR);
                        entries.add(ModBlocks.DRAGON_BANE_TRAPDOOR);

                        entries.add(ModBlocks.RAW_DWARF_GOLD_BLOCK);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_SLAB);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_STAIRS);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_FENCE);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_WALL);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_BUTTON);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_DOOR);
                        entries.add(ModBlocks.RAW_DWARF_GOLD_TRAPDOOR);

                        entries.add(ModBlocks.DWARF_GOLD_BLOCK);
                        entries.add(ModBlocks.DWARF_GOLD_SLAB);
                        entries.add(ModBlocks.DWARF_GOLD_STAIRS);
                        entries.add(ModBlocks.DWARF_GOLD_FENCE_GATE);
                        entries.add(ModBlocks.DWARF_GOLD_FENCE);
                        entries.add(ModBlocks.DWARF_GOLD_WALL);
                        entries.add(ModBlocks.DWARF_GOLD_BUTTON);
                        entries.add(ModBlocks.DWARF_GOLD_PRESSURE_PLATE);
                        entries.add(ModBlocks.DWARF_GOLD_DOOR);
                        entries.add(ModBlocks.DWARF_GOLD_TRAPDOOR);



                    }).build());

    public static void registerItemGroups() {
        DwarfAdventureMod.LOGGER.info("registering Item Groups for "+DwarfAdventureMod.MOD_ID);
    }
}
