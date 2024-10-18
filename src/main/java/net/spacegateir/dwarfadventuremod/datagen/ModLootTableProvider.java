package net.spacegateir.dwarfadventuremod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.tag.ItemTags;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.block.custom.AncientCropBlock;
import net.spacegateir.dwarfadventuremod.item.ModItems;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.DAHLIA_FLOWER);
        addDrop(ModBlocks.CORRUPT_DAHLIA_FLOWER);
        addDrop(ModBlocks.ANCIENT_DAHLIA_FLOWER);

        addDrop(ModBlocks.SNOW_DROP_FLOWER);
        addDrop(ModBlocks.CORRUPT_SNOW_DROP_FLOWER);
        addDrop(ModBlocks.ANCIENT_SNOW_DROP_FLOWER);

        addDrop(ModBlocks.CARNATION_FLOWER);
        addDrop(ModBlocks.CORRUPT_CARNATION_FLOWER);
        addDrop(ModBlocks.ANCIENT_CARNATION_FLOWER);

        addDrop(ModBlocks.VIOLET_FLOWER);
        addDrop(ModBlocks.CORRUPT_VIOLET_FLOWER);
        addDrop(ModBlocks.ANCIENT_VIOLET_FLOWER);

        addDrop(ModBlocks.IRIS_FLOWER);
        addDrop(ModBlocks.CORRUPT_IRIS_FLOWER);
        addDrop(ModBlocks.ANCIENT_IRIS_FLOWER);

        addDrop(ModBlocks.PRIMROSE_FLOWER);
        addDrop(ModBlocks.CORRUPT_PRIMROSE_FLOWER);
        addDrop(ModBlocks.ANCIENT_PRIMROSE_FLOWER);

        addDrop(ModBlocks.DAFFODIL_FLOWER);
        addDrop(ModBlocks.CORRUPT_DAFFODIL_FLOWER);
        addDrop(ModBlocks.ANCIENT_DAFFODIL_FLOWER);

        addDrop(ModBlocks.DELPHINIUM_FLOWER);
        addDrop(ModBlocks.CORRUPT_DELPHINIUM_FLOWER);
        addDrop(ModBlocks.ANCIENT_DELPHINIUM_FLOWER);

        addDrop(ModBlocks.HYDRANGEA_FLOWER);
        addDrop(ModBlocks.CORRUPT_HYDRANGEA_FLOWER);
        addDrop(ModBlocks.ANCIENT_HYDRANGEA_FLOWER);

        addDrop(ModBlocks.MIDNIGHT_MYSTIC_FLOWER);
        addDrop(ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER);
        addDrop(ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER);

        addDrop(ModBlocks.HAWTHORN_FLOWER);
        addDrop(ModBlocks.CORRUPT_HAWTHORN_FLOWER);
        addDrop(ModBlocks.ANCIENT_HAWTHORN_FLOWER);

        addDrop(ModBlocks.BONSAI_FLOWER);
        addDrop(ModBlocks.CORRUPT_BONSAI_FLOWER);
        addDrop(ModBlocks.ANCIENT_BONSAI_FLOWER);

        addDrop(ModBlocks.SPIDERLILY_FLOWER);
        addDrop(ModBlocks.CORRUPT_SPIDERLILY_FLOWER);
        addDrop(ModBlocks.ANCIENT_SPIDERLILY_FLOWER);

        addDrop(ModBlocks.LARKSPUR_FLOWER);
        addDrop(ModBlocks.CORRUPT_LARKSPUR_FLOWER);
        addDrop(ModBlocks.ANCIENT_LARKSPUR_FLOWER);

        addDrop(ModBlocks.AGAPANTHUS_FLOWER);
        addDrop(ModBlocks.CORRUPT_AGAPANTHUS_FLOWER);
        addDrop(ModBlocks.ANCIENT_AGAPANTHUS_FLOWER);

        addDrop(ModBlocks.BLUE_COSMOS_FLOWER);
        addDrop(ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER);
        addDrop(ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_DAHLIA_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_DAHLIA_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_DAHLIA_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_SNOW_DROP_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_SNOW_DROP_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_SNOW_DROP_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_CARNATION_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_CARNATION_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_CARNATION_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_VIOLET_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_VIOLET_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_VIOLET_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_IRIS_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_IRIS_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_IRIS_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_PRIMROSE_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_PRIMROSE_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_PRIMROSE_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_DAFFODIL_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_DAFFODIL_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_DAFFODIL_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_DELPHINIUM_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_DELPHINIUM_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_DELPHINIUM_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_HYDRANGEA_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_HYDRANGEA_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_HYDRANGEA_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_MIDNIGHT_MYSTIC_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_MIDNIGHT_MYSTIC_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_MIDNIGHT_MYSTIC_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_HAWTHORN_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_HAWTHORN_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_HAWTHORN_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_BONSAI_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_BONSAI_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_BONSAI_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_SPIDERLILY_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_SPIDERLILY_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_SPIDERLILY_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_LARKSPUR_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_LARKSPUR_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_LARKSPUR_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_AGAPANTHUS_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_AGAPANTHUS_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_AGAPANTHUS_FLOWER);

        addPottedPlantDrops(ModBlocks.POTTED_BLUE_COSMOS_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_CORRUPT_BLUE_COSMOS_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ANCIENT_BLUE_COSMOS_FLOWER);

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.ANCIENT_FLOWER_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(AncientCropBlock.AGE, 7));
        addDrop(ModBlocks.ANCIENT_FLOWER_CROP, cropDrops(ModBlocks.ANCIENT_FLOWER_CROP, ModItems.ANCIENT_SEED, ModItems.GLIMMER_ROOT, builder));

        addDrop(ModBlocks.GARDEN_BENCH);
        addDrop(ModBlocks.GARDEN_POT);
        addDrop(ModBlocks.GARDEN_POTTED_POT);
        addDrop(ModBlocks.DWARF_ANVIL);
        addDrop(ModBlocks.DWARF_ANVIL_GROUND);


        addDrop(ModBlocks.RAW_DWARF_STEEL_BLOCK);
        addDrop(ModBlocks.RAW_DWARF_STEEL_STAIRS);
        addDrop(ModBlocks.RAW_DWARF_STEEL_WALL);
        addDrop(ModBlocks.RAW_DWARF_STEEL_FENCE);
        addDrop(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE);
        addDrop(ModBlocks.RAW_DWARF_STEEL_BUTTON);
        addDrop(ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_DWARF_STEEL_SLAB, slabDrops(ModBlocks.RAW_DWARF_STEEL_SLAB));

        addDrop(ModBlocks.DWARF_STEEL_BLOCK);
        addDrop(ModBlocks.DWARF_STEEL_STAIRS);
        addDrop(ModBlocks.DWARF_STEEL_TRAPDOOR);
        addDrop(ModBlocks.DWARF_STEEL_WALL);
        addDrop(ModBlocks.DWARF_STEEL_FENCE);
        addDrop(ModBlocks.DWARF_STEEL_FENCE_GATE);
        addDrop(ModBlocks.DWARF_STEEL_BUTTON);
        addDrop(ModBlocks.DWARF_STEEL_PRESSURE_PLATE);
        addDrop(ModBlocks.DWARF_STEEL_DOOR, doorDrops(ModBlocks.DWARF_STEEL_DOOR));
        addDrop(ModBlocks.DWARF_STEEL_SLAB, slabDrops(ModBlocks.DWARF_STEEL_SLAB));

        addDrop(ModBlocks.STONE_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.STONE_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.DEEPSLATE_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.DEEPSLATE_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.NETHERRACK_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.NETHERRACK_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.END_STONE_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.END_STONE_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.ANDESITE_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.ANDESITE_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.DIORITE_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.DIORITE_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.GRANITE_DWARF_STEEL_ORE, DwarfSteelOreDrops(
                ModBlocks.GRANITE_DWARF_STEEL_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_STEEL));

        addDrop(ModBlocks.WIND_GEM_BLOCK);
        addDrop(ModBlocks.WIND_GEM_STAIRS);
        addDrop(ModBlocks.WIND_GEM_WALL);
        addDrop(ModBlocks.WIND_GEM_FENCE);
        addDrop(ModBlocks.WIND_GEM_FENCE_GATE);
        addDrop(ModBlocks.WIND_GEM_BUTTON);
        addDrop(ModBlocks.WIND_GEM_PRESSURE_PLATE);
        addDrop(ModBlocks.WIND_GEM_SLAB, slabDrops(ModBlocks.WIND_GEM_SLAB));

        addDrop(ModBlocks.AER_BLOCK);
        addDrop(ModBlocks.AER_STAIRS);
        addDrop(ModBlocks.AER_WALL);
        addDrop(ModBlocks.AER_FENCE);
        addDrop(ModBlocks.AER_FENCE_GATE);
        addDrop(ModBlocks.AER_BUTTON);
        addDrop(ModBlocks.AER_PRESSURE_PLATE);
        addDrop(ModBlocks.AER_SLAB, slabDrops(ModBlocks.WIND_GEM_SLAB));

        addDrop(ModBlocks.FIRE_GEM_BLOCK);
        addDrop(ModBlocks.FIRE_GEM_STAIRS);
        addDrop(ModBlocks.FIRE_GEM_WALL);
        addDrop(ModBlocks.FIRE_GEM_FENCE);
        addDrop(ModBlocks.FIRE_GEM_FENCE_GATE);
        addDrop(ModBlocks.FIRE_GEM_BUTTON);
        addDrop(ModBlocks.FIRE_GEM_PRESSURE_PLATE);
        addDrop(ModBlocks.FIRE_GEM_SLAB, slabDrops(ModBlocks.FIRE_GEM_SLAB));

        addDrop(ModBlocks.IGNIS_BLOCK);
        addDrop(ModBlocks.IGNIS_STAIRS);
        addDrop(ModBlocks.IGNIS_WALL);
        addDrop(ModBlocks.IGNIS_FENCE);
        addDrop(ModBlocks.IGNIS_FENCE_GATE);
        addDrop(ModBlocks.IGNIS_BUTTON);
        addDrop(ModBlocks.IGNIS_PRESSURE_PLATE);
        addDrop(ModBlocks.IGNIS_SLAB, slabDrops(ModBlocks.WIND_GEM_SLAB));

        addDrop(ModBlocks.WATER_GEM_BLOCK);
        addDrop(ModBlocks.WATER_GEM_STAIRS);
        addDrop(ModBlocks.WATER_GEM_WALL);
        addDrop(ModBlocks.WATER_GEM_FENCE);
        addDrop(ModBlocks.WATER_GEM_FENCE_GATE);
        addDrop(ModBlocks.WATER_GEM_BUTTON);
        addDrop(ModBlocks.WATER_GEM_PRESSURE_PLATE);
        addDrop(ModBlocks.WATER_GEM_SLAB, slabDrops(ModBlocks.WATER_GEM_SLAB));

        addDrop(ModBlocks.AQUA_BLOCK);
        addDrop(ModBlocks.AQUA_STAIRS);
        addDrop(ModBlocks.AQUA_WALL);
        addDrop(ModBlocks.AQUA_FENCE);
        addDrop(ModBlocks.AQUA_FENCE_GATE);
        addDrop(ModBlocks.AQUA_BUTTON);
        addDrop(ModBlocks.AQUA_PRESSURE_PLATE);
        addDrop(ModBlocks.AQUA_SLAB, slabDrops(ModBlocks.WIND_GEM_SLAB));

        addDrop(ModBlocks.EARTH_GEM_BLOCK);
        addDrop(ModBlocks.EARTH_GEM_STAIRS);
        addDrop(ModBlocks.EARTH_GEM_WALL);
        addDrop(ModBlocks.EARTH_GEM_FENCE);
        addDrop(ModBlocks.EARTH_GEM_FENCE_GATE);
        addDrop(ModBlocks.EARTH_GEM_BUTTON);
        addDrop(ModBlocks.EARTH_GEM_PRESSURE_PLATE);
        addDrop(ModBlocks.EARTH_GEM_SLAB, slabDrops(ModBlocks.EARTH_GEM_SLAB));

        addDrop(ModBlocks.TERA_BLOCK);
        addDrop(ModBlocks.TERA_STAIRS);
        addDrop(ModBlocks.TERA_WALL);
        addDrop(ModBlocks.TERA_FENCE);
        addDrop(ModBlocks.TERA_FENCE_GATE);
        addDrop(ModBlocks.TERA_BUTTON);
        addDrop(ModBlocks.TERA_PRESSURE_PLATE);
        addDrop(ModBlocks.TERA_SLAB, slabDrops(ModBlocks.WIND_GEM_SLAB));

        addDrop(ModBlocks.ELEMENTAL_GEM_BLOCK);
        addDrop(ModBlocks.ELEMENTAL_GEM_STAIRS);
        addDrop(ModBlocks.ELEMENTAL_GEM_WALL);
        addDrop(ModBlocks.ELEMENTAL_GEM_FENCE);
        addDrop(ModBlocks.ELEMENTAL_GEM_FENCE_GATE);
        addDrop(ModBlocks.ELEMENTAL_GEM_BUTTON);
        addDrop(ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE);
        addDrop(ModBlocks.ELEMENTAL_GEM_SLAB, slabDrops(ModBlocks.ELEMENTAL_GEM_SLAB));

        addDrop(ModBlocks.RAW_MAGIRITE_BLOCK);
        addDrop(ModBlocks.RAW_MAGIRITE_STAIRS);
        addDrop(ModBlocks.RAW_MAGIRITE_WALL);
        addDrop(ModBlocks.RAW_MAGIRITE_FENCE);
        addDrop(ModBlocks.RAW_MAGIRITE_FENCE_GATE);
        addDrop(ModBlocks.RAW_MAGIRITE_BUTTON);
        addDrop(ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_MAGIRITE_SLAB, slabDrops(ModBlocks.RAW_MAGIRITE_SLAB));

        addDrop(ModBlocks.MAGIRITE_BLOCK);
        addDrop(ModBlocks.MAGIRITE_STAIRS);
        addDrop(ModBlocks.MAGIRITE_WALL);
        addDrop(ModBlocks.MAGIRITE_FENCE);
        addDrop(ModBlocks.MAGIRITE_FENCE_GATE);
        addDrop(ModBlocks.MAGIRITE_BUTTON);
        addDrop(ModBlocks.MAGIRITE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGIRITE_SLAB, slabDrops(ModBlocks.MAGIRITE_SLAB));

        addDrop(ModBlocks.MAGIRITE_STONE_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MAGIRITE_DEEPSLATE_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_DEEPSLATE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MAGIRITE_NETHERRACK_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_NETHERRACK_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MAGIRITE_END_STONE_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_END_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MAGIRITE_ANDESITE_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_ANDESITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MAGIRITE_DIORITE_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_DIORITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MAGIRITE_GRANITE_ORE, MagiriteOreDrops(
                ModBlocks.MAGIRITE_GRANITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_MAGIRITE));

        addDrop(ModBlocks.MYTHRIL_BLOCK);
        addDrop(ModBlocks.MYTHRIL_STAIRS);
        addDrop(ModBlocks.MYTHRIL_TRAPDOOR);
        addDrop(ModBlocks.MYTHRIL_WALL);
        addDrop(ModBlocks.MYTHRIL_FENCE);
        addDrop(ModBlocks.MYTHRIL_FENCE_GATE);
        addDrop(ModBlocks.MYTHRIL_BUTTON);
        addDrop(ModBlocks.MYTHRIL_PRESSURE_PLATE);
        addDrop(ModBlocks.MYTHRIL_DOOR, doorDrops(ModBlocks.MYTHRIL_DOOR));
        addDrop(ModBlocks.MYTHRIL_SLAB, slabDrops(ModBlocks.MYTHRIL_SLAB));

//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_BLOCK);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_STAIRS);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_TRAPDOOR);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_WALL);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_FENCE);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_FENCE_GATE);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_BUTTON);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_PRESSURE_PLATE);
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_DOOR, doorDrops(ModBlocks.PURIFICATED_MYTHRIL_DOOR));
//        addDrop(ModBlocks.PURIFICATED_MYTHRIL_SLAB, slabDrops(ModBlocks.PURIFICATED_MYTHRIL_SLAB));

        addDrop(ModBlocks.BUDDING_MYTHRIL_STONE, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_STONE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL_DEELSLATE, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_DEELSLATE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL_NETHERRACK, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_NETHERRACK,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL_END_STONE, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_END_STONE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL_ANDESITE, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_ANDESITE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL_DIORITE, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_DIORITE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL_GRANDITE, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL_GRANDITE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.BUDDING_MYTHRIL, MythrilOreDrops(
                ModBlocks.BUDDING_MYTHRIL,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(Blocks.BUDDING_AMETHYST, MythrilOreDrops(
                Blocks.BUDDING_AMETHYST,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                Items.AMETHYST_SHARD));

        addDrop(ModBlocks.MYTHRIL_CLUSTER, MythrilOreDrops(
                ModBlocks.MYTHRIL_CLUSTER,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.MYTHRIL));

        addDrop(ModBlocks.RAW_ADAMANTITE_BLOCK);
        addDrop(ModBlocks.RAW_ADAMANTITE_STAIRS);
        addDrop(ModBlocks.RAW_ADAMANTITE_WALL);
        addDrop(ModBlocks.RAW_ADAMANTITE_FENCE);
        addDrop(ModBlocks.RAW_ADAMANTITE_FENCE_GATE);
        addDrop(ModBlocks.RAW_ADAMANTITE_BUTTON);
        addDrop(ModBlocks.RAW_ADAMANTITE_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_ADAMANTITE_SLAB, slabDrops(ModBlocks.RAW_ADAMANTITE_SLAB));

        addDrop(ModBlocks.ADAMANTITE_BLOCK);
        addDrop(ModBlocks.ADAMANTITE_STAIRS);
        addDrop(ModBlocks.ADAMANTITE_WALL);
        addDrop(ModBlocks.ADAMANTITE_FENCE);
        addDrop(ModBlocks.ADAMANTITE_FENCE_GATE);
        addDrop(ModBlocks.ADAMANTITE_BUTTON);
        addDrop(ModBlocks.ADAMANTITE_PRESSURE_PLATE);
        addDrop(ModBlocks.ADAMANTITE_SLAB, slabDrops(ModBlocks.ADAMANTITE_SLAB));

        addDrop(ModBlocks.ADAMANTITE_STONE_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.ADAMANTITE_DEEPSLATE_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_DEEPSLATE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.ADAMANTITE_NETHERRACK_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_NETHERRACK_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.ADAMANTITE_END_STONE_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_END_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.ADAMANTITE_ANDESITE_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_ANDESITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.ADAMANTITE_DIORITE_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_DIORITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.ADAMANTITE_GRANITE_ORE, AdamantiteOreDrops(
                ModBlocks.ADAMANTITE_GRANITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ADAMANTITE));

        addDrop(ModBlocks.RAW_ORIKALKUM_BLOCK);
        addDrop(ModBlocks.RAW_ORIKALKUM_STAIRS);
        addDrop(ModBlocks.RAW_ORIKALKUM_WALL);
        addDrop(ModBlocks.RAW_ORIKALKUM_FENCE);
        addDrop(ModBlocks.RAW_ORIKALKUM_FENCE_GATE);
        addDrop(ModBlocks.RAW_ORIKALKUM_BUTTON);
        addDrop(ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_ORIKALKUM_SLAB, slabDrops(ModBlocks.RAW_ORIKALKUM_SLAB));

        addDrop(ModBlocks.ORIKALKUM_BLOCK);
        addDrop(ModBlocks.ORIKALKUM_STAIRS);
        addDrop(ModBlocks.ORIKALKUM_WALL);
        addDrop(ModBlocks.ORIKALKUM_FENCE);
        addDrop(ModBlocks.ORIKALKUM_FENCE_GATE);
        addDrop(ModBlocks.ORIKALKUM_BUTTON);
        addDrop(ModBlocks.ORIKALKUM_PRESSURE_PLATE);
        addDrop(ModBlocks.ORIKALKUM_SLAB, slabDrops(ModBlocks.ORIKALKUM_SLAB));

        addDrop(ModBlocks.ORIKALKUM_STONE_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.ORIKALKUM_DEEPSLATE_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_DEEPSLATE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.ORIKALKUM_NETHERRACK_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_NETHERRACK_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.ORIKALKUM_END_STONE_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_END_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.ORIKALKUM_ANDESITE_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_ANDESITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.ORIKALKUM_DIORITE_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_DIORITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.ORIKALKUM_GRANITE_ORE, OrikalkumOreDrops(
                ModBlocks.ORIKALKUM_GRANITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_ORIKALKUM));

        addDrop(ModBlocks.RAW_DRAGON_BANE_BLOCK);
        addDrop(ModBlocks.RAW_DRAGON_BANE_STAIRS);
        addDrop(ModBlocks.RAW_DRAGON_BANE_WALL);
        addDrop(ModBlocks.RAW_DRAGON_BANE_FENCE);
        addDrop(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE);
        addDrop(ModBlocks.RAW_DRAGON_BANE_BUTTON);
        addDrop(ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_DRAGON_BANE_SLAB, slabDrops(ModBlocks.RAW_DRAGON_BANE_SLAB));

        addDrop(ModBlocks.DRAGON_BANE_BLOCK);
        addDrop(ModBlocks.DRAGON_BANE_STAIRS);
        addDrop(ModBlocks.DRAGON_BANE_WALL);
        addDrop(ModBlocks.DRAGON_BANE_FENCE);
        addDrop(ModBlocks.DRAGON_BANE_FENCE_GATE);
        addDrop(ModBlocks.DRAGON_BANE_BUTTON);
        addDrop(ModBlocks.DRAGON_BANE_PRESSURE_PLATE);
        addDrop(ModBlocks.DRAGON_BANE_SLAB, slabDrops(ModBlocks.DRAGON_BANE_SLAB));

        addDrop(ModBlocks.DRAGON_BANE_STONE_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.DRAGON_BANE_DEEPSLATE_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_DEEPSLATE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.DRAGON_BANE_NETHERRACK_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_NETHERRACK_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.DRAGON_BANE_END_STONE_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_END_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.DRAGON_BANE_ANDESITE_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_ANDESITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.DRAGON_BANE_DIORITE_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_DIORITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.DRAGON_BANE_GRANITE_ORE, DragonBaneOreDrops(
                ModBlocks.DRAGON_BANE_GRANITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DRAGON_BANE));

        addDrop(ModBlocks.RAW_DWARF_GOLD_BLOCK);
        addDrop(ModBlocks.RAW_DWARF_GOLD_STAIRS);
        addDrop(ModBlocks.RAW_DWARF_GOLD_WALL);
        addDrop(ModBlocks.RAW_DWARF_GOLD_FENCE);
        addDrop(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE);
        addDrop(ModBlocks.RAW_DWARF_GOLD_BUTTON);
        addDrop(ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_DWARF_GOLD_SLAB, slabDrops(ModBlocks.RAW_DWARF_GOLD_SLAB));

        addDrop(ModBlocks.DWARF_GOLD_BLOCK);
        addDrop(ModBlocks.DWARF_GOLD_STAIRS);
        addDrop(ModBlocks.DWARF_GOLD_WALL);
        addDrop(ModBlocks.DWARF_GOLD_FENCE);
        addDrop(ModBlocks.DWARF_GOLD_FENCE_GATE);
        addDrop(ModBlocks.DWARF_GOLD_BUTTON);
        addDrop(ModBlocks.DWARF_GOLD_PRESSURE_PLATE);
        addDrop(ModBlocks.DWARF_GOLD_SLAB, slabDrops(ModBlocks.DWARF_GOLD_SLAB));

        addDrop(ModBlocks.DWARF_GOLD_STONE_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

        addDrop(ModBlocks.DWARF_GOLD_DEEPSLATE_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_DEEPSLATE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

        addDrop(ModBlocks.DWARF_GOLD_NETHERRACK_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_NETHERRACK_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

        addDrop(ModBlocks.DWARF_GOLD_END_STONE_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_END_STONE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

        addDrop(ModBlocks.DWARF_GOLD_ANDESITE_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_ANDESITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

        addDrop(ModBlocks.DWARF_GOLD_DIORITE_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_DIORITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

        addDrop(ModBlocks.DWARF_GOLD_GRANITE_ORE, DwarfGoldOreDrops(
                ModBlocks.DWARF_GOLD_GRANITE_ORE,
                ModItems.LVL1_DWARF_PICKAXE, ModItems.LVL2_DWARF_PICKAXE,
                ModItems.LVL3_DWARF_PICKAXE, ModItems.LVL4_DWARF_PICKAXE,
                ModItems.LVL5_DWARF_PICKAXE, ModItems.LVL6_DWARF_PICKAXE,
                ModItems.RAW_DWARF_GOLD));

    }

    public LootTable.Builder DwarfSteelOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    public LootTable.Builder MagiriteOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    public LootTable.Builder MythrilOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    public LootTable.Builder AdamantiteOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    public LootTable.Builder OrikalkumOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    public LootTable.Builder DragonBaneOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    public LootTable.Builder DwarfGoldOreDrops(Block drop,
                                                Item lvl1_dwarf_pickaxe, Item lvl2_dwarf_pickaxe,
                                                Item lvl3_dwarf_pickaxe, Item lvl4_dwarf_pickaxe,
                                                Item lvl5_dwarf_pickaxe, Item lvl6_dwarf_pickaxe,
                                                Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                                // Pass all pickaxes in one .items() call
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .items(lvl1_dwarf_pickaxe, lvl2_dwarf_pickaxe, lvl3_dwarf_pickaxe,
                                                        lvl4_dwarf_pickaxe, lvl5_dwarf_pickaxe, lvl6_dwarf_pickaxe)
                                ))
                )
        );
    }

    }
