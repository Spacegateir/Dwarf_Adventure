package net.spacegateir.dwarfadventuremod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.ModItems;

public class ModRegistries {
    public static void registerModStuff() {

        registerFuels();
        registerModCompostables();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.ANCESTRAL_FORGE_COAL, 16000);
    }

    private static void registerModCompostables() {

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.SNOW_DROP_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CARNATION_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.VIOLET_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.IRIS_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.PRIMROSE_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.DAFFODIL_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.DELPHINIUM_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.DAHLIA_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.HYDRANGEA_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.MIDNIGHT_MYSTIC_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.HAWTHORN_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.BONSAI_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.SPIDERLILY_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.LARKSPUR_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.AGAPANTHUS_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.BLUE_COSMOS_FLOWER, 0.4F);

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_SNOW_DROP_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_CARNATION_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_VIOLET_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_IRIS_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_PRIMROSE_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_DAFFODIL_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_DELPHINIUM_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_DAHLIA_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_HYDRANGEA_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_HAWTHORN_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_BONSAI_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_SPIDERLILY_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_LARKSPUR_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_AGAPANTHUS_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER, 0.6F);

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_SNOW_DROP_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_CARNATION_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_VIOLET_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_IRIS_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_PRIMROSE_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_DAFFODIL_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_DELPHINIUM_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_DAHLIA_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_HYDRANGEA_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_HAWTHORN_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_BONSAI_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_SPIDERLILY_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_LARKSPUR_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_AGAPANTHUS_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER, 0.8F);

    }
}
