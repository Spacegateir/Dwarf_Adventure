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

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.SNOW_DROP_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CARNATION_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.VIOLET_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.IRIS_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.PRIMROSE_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.DAFFODIL_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.DELPHINIUM_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.DAHLIA_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.HYDRANGEA_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.MIDNIGHT_MYSTIC_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.HAWTHORN_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BONSAI_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.SPIDERLILY_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.LARKSPUR_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.AGAPANTHUS_FLOWER, 0.4F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BLUE_COSMOS_FLOWER, 0.4F);

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_SNOW_DROP_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_CARNATION_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_VIOLET_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_IRIS_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_PRIMROSE_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_DAFFODIL_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_DELPHINIUM_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_DAHLIA_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_HYDRANGEA_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_MIDNIGHT_MYSTIC_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_HAWTHORN_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_BONSAI_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_SPIDERLILY_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_LARKSPUR_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_AGAPANTHUS_FLOWER, 0.6F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORRUPT_BLUE_COSMOS_FLOWER, 0.6F);

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_SNOW_DROP_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_CARNATION_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_VIOLET_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_IRIS_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_PRIMROSE_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_DAFFODIL_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_DELPHINIUM_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_DAHLIA_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_HYDRANGEA_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_MIDNIGHT_MYSTIC_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_HAWTHORN_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_BONSAI_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_SPIDERLILY_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_LARKSPUR_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_AGAPANTHUS_FLOWER, 0.8F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ANCIENT_BLUE_COSMOS_FLOWER, 0.8F);

    }
}
