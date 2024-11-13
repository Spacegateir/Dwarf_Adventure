package net.spacegateir.dwarfadventuremod.datagen;

import com.google.gson.JsonElement;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.block.custom.AncientCropBlock;
import net.spacegateir.dwarfadventuremod.item.ModItems;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAHLIA_FLOWER_BLOCK, ModBlocks.POTTED_DAHLIA_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_DAHLIA_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_DAHLIA_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_DAHLIA_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SNOW_DROP_FLOWER_BLOCK, ModBlocks.POTTED_SNOW_DROP_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_SNOW_DROP_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_SNOW_DROP_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_SNOW_DROP_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CARNATION_FLOWER_BLOCK, ModBlocks.POTTED_CARNATION_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_CARNATION_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_CARNATION_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_CARNATION_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VIOLET_FLOWER_BLOCK, ModBlocks.POTTED_VIOLET_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_VIOLET_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_VIOLET_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_VIOLET_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.IRIS_FLOWER_BLOCK, ModBlocks.POTTED_IRIS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_IRIS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_IRIS_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_IRIS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PRIMROSE_FLOWER_BLOCK, ModBlocks.POTTED_PRIMROSE_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_PRIMROSE_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_PRIMROSE_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_PRIMROSE_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAFFODIL_FLOWER_BLOCK, ModBlocks.POTTED_DAFFODIL_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_DAFFODIL_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_DAFFODIL_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_DAFFODIL_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DELPHINIUM_FLOWER_BLOCK, ModBlocks.POTTED_DELPHINIUM_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_DELPHINIUM_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_DELPHINIUM_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_DELPHINIUM_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.HYDRANGEA_FLOWER_BLOCK, ModBlocks.POTTED_HYDRANGEA_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_HYDRANGEA_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_HYDRANGEA_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_HYDRANGEA_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK, ModBlocks.POTTED_MIDNIGHT_MYSTIC_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_MIDNIGHT_MYSTIC_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_MIDNIGHT_MYSTIC_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.HAWTHORN_FLOWER_BLOCK, ModBlocks.POTTED_HAWTHORN_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_HAWTHORN_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_HAWTHORN_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_HAWTHORN_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BONSAI_FLOWER_BLOCK, ModBlocks.POTTED_BONSAI_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_BONSAI_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_BONSAI_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_BONSAI_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SPIDERLILY_FLOWER_BLOCK, ModBlocks.POTTED_SPIDERLILY_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_SPIDERLILY_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_SPIDERLILY_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_SPIDERLILY_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LARKSPUR_FLOWER_BLOCK, ModBlocks.POTTED_LARKSPUR_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_LARKSPUR_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_LARKSPUR_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_LARKSPUR_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AGAPANTHUS_FLOWER_BLOCK, ModBlocks.POTTED_AGAPANTHUS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_AGAPANTHUS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_AGAPANTHUS_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_AGAPANTHUS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_COSMOS_FLOWER_BLOCK, ModBlocks.POTTED_BLUE_COSMOS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK, ModBlocks.POTTED_CORRUPT_BLUE_COSMOS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER_BLOCK, ModBlocks.POTTED_ANCIENT_BLUE_COSMOS_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerCrop(ModBlocks.ANCIENT_FLOWER_CROP, AncientCropBlock.AGE,0, 1, 2, 3, 4, 5, 6, 7);

        BlockStateModelGenerator.BlockTexturePool raw_dwarf_steelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_DWARF_STEEL_BLOCK);
        raw_dwarf_steelPool.stairs(ModBlocks.RAW_DWARF_STEEL_STAIRS);
        raw_dwarf_steelPool.slab(ModBlocks.RAW_DWARF_STEEL_SLAB);
        raw_dwarf_steelPool.button(ModBlocks.RAW_DWARF_STEEL_BUTTON);
        raw_dwarf_steelPool.pressurePlate(ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE);
        raw_dwarf_steelPool.fence(ModBlocks.RAW_DWARF_STEEL_FENCE);
        raw_dwarf_steelPool.fenceGate(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE);
        raw_dwarf_steelPool.wall(ModBlocks.RAW_DWARF_STEEL_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RAW_DWARF_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAW_DWARF_STEEL_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool dwarf_steelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_STEEL_BLOCK);
        dwarf_steelPool.stairs(ModBlocks.DWARF_STEEL_STAIRS);
        dwarf_steelPool.slab(ModBlocks.DWARF_STEEL_SLAB);
        dwarf_steelPool.button(ModBlocks.DWARF_STEEL_BUTTON);
        dwarf_steelPool.pressurePlate(ModBlocks.DWARF_STEEL_PRESSURE_PLATE);
        dwarf_steelPool.fence(ModBlocks.DWARF_STEEL_FENCE);
        dwarf_steelPool.fenceGate(ModBlocks.DWARF_STEEL_FENCE_GATE);
        dwarf_steelPool.wall(ModBlocks.DWARF_STEEL_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.DWARF_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DWARF_STEEL_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_DWARF_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_DWARF_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHERRACK_DWARF_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE_DWARF_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_DWARF_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_DWARF_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_DWARF_STEEL_ORE);

        BlockStateModelGenerator.BlockTexturePool windgemPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WIND_GEM_BLOCK);
        windgemPool.stairs(ModBlocks.WIND_GEM_STAIRS);
        windgemPool.slab(ModBlocks.WIND_GEM_SLAB);
        windgemPool.button(ModBlocks.WIND_GEM_BUTTON);
        windgemPool.pressurePlate(ModBlocks.WIND_GEM_PRESSURE_PLATE);
        windgemPool.fence(ModBlocks.WIND_GEM_FENCE);
        windgemPool.fenceGate(ModBlocks.WIND_GEM_FENCE_GATE);
        windgemPool.wall(ModBlocks.WIND_GEM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.AER_SPIRITSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AER_SPIRITSTONE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool AerPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AER_BLOCK);
        AerPool.stairs(ModBlocks.AER_STAIRS);
        AerPool.slab(ModBlocks.AER_SLAB);
        AerPool.button(ModBlocks.AER_BUTTON);
        AerPool.pressurePlate(ModBlocks.AER_PRESSURE_PLATE);
        AerPool.fence(ModBlocks.AER_FENCE);
        AerPool.fenceGate(ModBlocks.AER_FENCE_GATE);
        AerPool.wall(ModBlocks.AER_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.AER_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AER_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool firegemPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_GEM_BLOCK);
        firegemPool.stairs(ModBlocks.FIRE_GEM_STAIRS);
        firegemPool.slab(ModBlocks.FIRE_GEM_SLAB);
        firegemPool.button(ModBlocks.FIRE_GEM_BUTTON);
        firegemPool.pressurePlate(ModBlocks.FIRE_GEM_PRESSURE_PLATE);
        firegemPool.fence(ModBlocks.FIRE_GEM_FENCE);
        firegemPool.fenceGate(ModBlocks.FIRE_GEM_FENCE_GATE);
        firegemPool.wall(ModBlocks.FIRE_GEM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.IGNIS_SPIRITSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.IGNIS_SPIRITSTONE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool IgnisPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.IGNIS_BLOCK);
        IgnisPool.stairs(ModBlocks.IGNIS_STAIRS);
        IgnisPool.slab(ModBlocks.IGNIS_SLAB);
        IgnisPool.button(ModBlocks.IGNIS_BUTTON);
        IgnisPool.pressurePlate(ModBlocks.IGNIS_PRESSURE_PLATE);
        IgnisPool.fence(ModBlocks.IGNIS_FENCE);
        IgnisPool.fenceGate(ModBlocks.IGNIS_FENCE_GATE);
        IgnisPool.wall(ModBlocks.IGNIS_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.IGNIS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.IGNIS_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool watergemPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WATER_GEM_BLOCK);
        watergemPool.stairs(ModBlocks.WATER_GEM_STAIRS);
        watergemPool.slab(ModBlocks.WATER_GEM_SLAB);
        watergemPool.button(ModBlocks.WATER_GEM_BUTTON);
        watergemPool.pressurePlate(ModBlocks.WATER_GEM_PRESSURE_PLATE);
        watergemPool.fence(ModBlocks.WATER_GEM_FENCE);
        watergemPool.fenceGate(ModBlocks.WATER_GEM_FENCE_GATE);
        watergemPool.wall(ModBlocks.WATER_GEM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.AQUA_SPITIRSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AQUA_SPIRITSTONE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool AquaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AQUA_BLOCK);
        AquaPool.stairs(ModBlocks.AQUA_STAIRS);
        AquaPool.slab(ModBlocks.AQUA_SLAB);
        AquaPool.button(ModBlocks.AQUA_BUTTON);
        AquaPool.pressurePlate(ModBlocks.AQUA_PRESSURE_PLATE);
        AquaPool.fence(ModBlocks.AQUA_FENCE);
        AquaPool.fenceGate(ModBlocks.AQUA_FENCE_GATE);
        AquaPool.wall(ModBlocks.AQUA_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.AQUA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AQUA_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool earthgemPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EARTH_GEM_BLOCK);
        earthgemPool.stairs(ModBlocks.EARTH_GEM_STAIRS);
        earthgemPool.slab(ModBlocks.EARTH_GEM_SLAB);
        earthgemPool.button(ModBlocks.EARTH_GEM_BUTTON);
        earthgemPool.pressurePlate(ModBlocks.EARTH_GEM_PRESSURE_PLATE);
        earthgemPool.fence(ModBlocks.EARTH_GEM_FENCE);
        earthgemPool.fenceGate(ModBlocks.EARTH_GEM_FENCE_GATE);
        earthgemPool.wall(ModBlocks.EARTH_GEM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.TERA_SPIRITSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.TERA_SPIRITSTONE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool TeraPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERA_BLOCK);
        TeraPool.stairs(ModBlocks.TERA_STAIRS);
        TeraPool.slab(ModBlocks.TERA_SLAB);
        TeraPool.button(ModBlocks.TERA_BUTTON);
        TeraPool.pressurePlate(ModBlocks.TERA_PRESSURE_PLATE);
        TeraPool.fence(ModBlocks.TERA_FENCE);
        TeraPool.fenceGate(ModBlocks.TERA_FENCE_GATE);
        TeraPool.wall(ModBlocks.TERA_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.TERA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.TERA_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool elementalgemPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ELEMENTAL_GEM_BLOCK);
        elementalgemPool.stairs(ModBlocks.ELEMENTAL_GEM_STAIRS);
        elementalgemPool.slab(ModBlocks.ELEMENTAL_GEM_SLAB);
        elementalgemPool.button(ModBlocks.ELEMENTAL_GEM_BUTTON);
        elementalgemPool.pressurePlate(ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE);
        elementalgemPool.fence(ModBlocks.ELEMENTAL_GEM_FENCE);
        elementalgemPool.fenceGate(ModBlocks.ELEMENTAL_GEM_FENCE_GATE);
        elementalgemPool.wall(ModBlocks.ELEMENTAL_GEM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.QUINTESSENCE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.QUINTESSENCE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool magiritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_BLOCK);
        magiritePool.stairs(ModBlocks.MAGIRITE_STAIRS);
        magiritePool.slab(ModBlocks.MAGIRITE_SLAB);
        magiritePool.button(ModBlocks.MAGIRITE_BUTTON);
        magiritePool.pressurePlate(ModBlocks.MAGIRITE_PRESSURE_PLATE);
        magiritePool.fence(ModBlocks.MAGIRITE_FENCE);
        magiritePool.fenceGate(ModBlocks.MAGIRITE_FENCE_GATE);
        magiritePool.wall(ModBlocks.MAGIRITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.MAGIRITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAGIRITE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool raw_magiritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_MAGIRITE_BLOCK);
        raw_magiritePool.stairs(ModBlocks.RAW_MAGIRITE_STAIRS);
        raw_magiritePool.slab(ModBlocks.RAW_MAGIRITE_SLAB);
        raw_magiritePool.button(ModBlocks.RAW_MAGIRITE_BUTTON);
        raw_magiritePool.pressurePlate(ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE);
        raw_magiritePool.fence(ModBlocks.RAW_MAGIRITE_FENCE);
        raw_magiritePool.fenceGate(ModBlocks.RAW_MAGIRITE_FENCE_GATE);
        raw_magiritePool.wall(ModBlocks.RAW_MAGIRITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RAW_MAGIRITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAW_MAGIRITE_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_NETHERRACK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_END_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_ANDESITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_DIORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGIRITE_GRANITE_ORE);

        BlockStateModelGenerator.BlockTexturePool mythrilPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MYTHRIL_BLOCK);
        mythrilPool.stairs(ModBlocks.MYTHRIL_STAIRS);
        mythrilPool.slab(ModBlocks.MYTHRIL_SLAB);
        mythrilPool.button(ModBlocks.MYTHRIL_BUTTON);
        mythrilPool.pressurePlate(ModBlocks.MYTHRIL_PRESSURE_PLATE);
        mythrilPool.fence(ModBlocks.MYTHRIL_FENCE);
        mythrilPool.fenceGate(ModBlocks.MYTHRIL_FENCE_GATE);
        mythrilPool.wall(ModBlocks.MYTHRIL_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.MYTHRIL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MYTHRIL_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool pureficatedmythrilPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PUREFICATED_MYTHRIL_BLOCK);
        pureficatedmythrilPool.stairs(ModBlocks.PUREFICATED_MYTHRIL_STAIRS);
        pureficatedmythrilPool.slab(ModBlocks.PUREFICATED_MYTHRIL_SLAB);
        pureficatedmythrilPool.button(ModBlocks.PUREFICATED_MYTHRIL_BUTTON);
        pureficatedmythrilPool.pressurePlate(ModBlocks.PUREFICATED_MYTHRIL_PRESSURE_PLATE);
        pureficatedmythrilPool.fence(ModBlocks.PUREFICATED_MYTHRIL_FENCE);
        pureficatedmythrilPool.fenceGate(ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE);
        pureficatedmythrilPool.wall(ModBlocks.PUREFICATED_MYTHRIL_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.PUREFICATED_MYTHRIL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PUREFICATED_MYTHRIL_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_DEELSLATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_NETHERRACK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_END_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_ANDESITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_DIORITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUDDING_MYTHRIL_GRANDITE);
        blockStateModelGenerator.registerAmethyst(ModBlocks.SMALL_MYTHRIL_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.MEDIUM_MYTHRIL_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.LARGE_MYTHRIL_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.MYTHRIL_CLUSTER);

        BlockStateModelGenerator.BlockTexturePool rawadamantitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_ADAMANTITE_BLOCK);
        rawadamantitePool.stairs(ModBlocks.RAW_ADAMANTITE_STAIRS);
        rawadamantitePool.slab(ModBlocks.RAW_ADAMANTITE_SLAB);
        rawadamantitePool.button(ModBlocks.RAW_ADAMANTITE_BUTTON);
        rawadamantitePool.pressurePlate(ModBlocks.RAW_ADAMANTITE_PRESSURE_PLATE);
        rawadamantitePool.fence(ModBlocks.RAW_ADAMANTITE_FENCE);
        rawadamantitePool.fenceGate(ModBlocks.RAW_ADAMANTITE_FENCE_GATE);
        rawadamantitePool.wall(ModBlocks.RAW_ADAMANTITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RAW_ADAMANTITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAW_ADAMANTITE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool adamantitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_BLOCK);
        adamantitePool.stairs(ModBlocks.ADAMANTITE_STAIRS);
        adamantitePool.slab(ModBlocks.ADAMANTITE_SLAB);
        adamantitePool.button(ModBlocks.ADAMANTITE_BUTTON);
        adamantitePool.pressurePlate(ModBlocks.ADAMANTITE_PRESSURE_PLATE);
        adamantitePool.fence(ModBlocks.ADAMANTITE_FENCE);
        adamantitePool.fenceGate(ModBlocks.ADAMANTITE_FENCE_GATE);
        adamantitePool.wall(ModBlocks.ADAMANTITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.ADAMANTITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ADAMANTITE_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_NETHERRACK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_END_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_ANDESITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_DIORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_GRANITE_ORE);

        BlockStateModelGenerator.BlockTexturePool raworikalkumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_ORIKALKUM_BLOCK);
        raworikalkumPool.stairs(ModBlocks.RAW_ORIKALKUM_STAIRS);
        raworikalkumPool.slab(ModBlocks.RAW_ORIKALKUM_SLAB);
        raworikalkumPool.button(ModBlocks.RAW_ORIKALKUM_BUTTON);
        raworikalkumPool.pressurePlate(ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE);
        raworikalkumPool.fence(ModBlocks.RAW_ORIKALKUM_FENCE);
        raworikalkumPool.fenceGate(ModBlocks.RAW_ORIKALKUM_FENCE_GATE);
        raworikalkumPool.wall(ModBlocks.RAW_ORIKALKUM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RAW_ORIKALKUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAW_ORIKALKUM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool orikalkumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_BLOCK);
        orikalkumPool.stairs(ModBlocks.ORIKALKUM_STAIRS);
        orikalkumPool.slab(ModBlocks.ORIKALKUM_SLAB);
        orikalkumPool.button(ModBlocks.ORIKALKUM_BUTTON);
        orikalkumPool.pressurePlate(ModBlocks.ORIKALKUM_PRESSURE_PLATE);
        orikalkumPool.fence(ModBlocks.ORIKALKUM_FENCE);
        orikalkumPool.fenceGate(ModBlocks.ORIKALKUM_FENCE_GATE);
        orikalkumPool.wall(ModBlocks.ORIKALKUM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.ORIKALKUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ORIKALKUM_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_NETHERRACK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_END_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_ANDESITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_DIORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_GRANITE_ORE);

        BlockStateModelGenerator.BlockTexturePool rawDragonBanePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_DRAGON_BANE_BLOCK);
        rawDragonBanePool.stairs(ModBlocks.RAW_DRAGON_BANE_STAIRS);
        rawDragonBanePool.slab(ModBlocks.RAW_DRAGON_BANE_SLAB);
        rawDragonBanePool.button(ModBlocks.RAW_DRAGON_BANE_BUTTON);
        rawDragonBanePool.pressurePlate(ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE);
        rawDragonBanePool.fence(ModBlocks.RAW_DRAGON_BANE_FENCE);
        rawDragonBanePool.fenceGate(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE);
        rawDragonBanePool.wall(ModBlocks.RAW_DRAGON_BANE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RAW_DRAGON_BANE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAW_DRAGON_BANE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool DragonBanePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_BLOCK);
        DragonBanePool.stairs(ModBlocks.DRAGON_BANE_STAIRS);
        DragonBanePool.slab(ModBlocks.DRAGON_BANE_SLAB);
        DragonBanePool.button(ModBlocks.DRAGON_BANE_BUTTON);
        DragonBanePool.pressurePlate(ModBlocks.DRAGON_BANE_PRESSURE_PLATE);
        DragonBanePool.fence(ModBlocks.DRAGON_BANE_FENCE);
        DragonBanePool.fenceGate(ModBlocks.DRAGON_BANE_FENCE_GATE);
        DragonBanePool.wall(ModBlocks.DRAGON_BANE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.DRAGON_BANE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DRAGON_BANE_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_NETHERRACK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_END_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_ANDESITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_DIORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BANE_GRANITE_ORE);

        BlockStateModelGenerator.BlockTexturePool rawDwarfGoldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_DWARF_GOLD_BLOCK);
        rawDwarfGoldPool.stairs(ModBlocks.RAW_DWARF_GOLD_STAIRS);
        rawDwarfGoldPool.slab(ModBlocks.RAW_DWARF_GOLD_SLAB);
        rawDwarfGoldPool.button(ModBlocks.RAW_DWARF_GOLD_BUTTON);
        rawDwarfGoldPool.pressurePlate(ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE);
        rawDwarfGoldPool.fence(ModBlocks.RAW_DWARF_GOLD_FENCE);
        rawDwarfGoldPool.fenceGate(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE);
        rawDwarfGoldPool.wall(ModBlocks.RAW_DWARF_GOLD_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RAW_DWARF_GOLD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RAW_DWARF_GOLD_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool DwarfGoldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_BLOCK);
        DwarfGoldPool.stairs(ModBlocks.DWARF_GOLD_STAIRS);
        DwarfGoldPool.slab(ModBlocks.DWARF_GOLD_SLAB);
        DwarfGoldPool.button(ModBlocks.DWARF_GOLD_BUTTON);
        DwarfGoldPool.pressurePlate(ModBlocks.DWARF_GOLD_PRESSURE_PLATE);
        DwarfGoldPool.fence(ModBlocks.DWARF_GOLD_FENCE);
        DwarfGoldPool.fenceGate(ModBlocks.DWARF_GOLD_FENCE_GATE);
        DwarfGoldPool.wall(ModBlocks.DWARF_GOLD_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.DWARF_GOLD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DWARF_GOLD_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_DEEPSLATE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_NETHERRACK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_END_STONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_ANDESITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_DIORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARF_GOLD_GRANITE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURSED_BLOCK);


    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.DWARF_COPPER_COIN_S, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_COPPER_COIN_M, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_COPPER_COIN_L, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_STEEL_COIN_S, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_STEEL_COIN_M, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_STEEL_COIN_L, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_GOLD_COIN_S, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_GOLD_COIN_M, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_GOLD_COIN_L, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_MYTHRIL_COIN_L, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLIMMER_ROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPT_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_BRANCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUREFICATED_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.WIND_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.EARTH_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELEMENTAL_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCESTRAL_FORGE_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARCANE_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLEM_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENHNACED_GOLEM_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORTAR_AND_PESTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDEN_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHER_BONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THALORUNS_SOULSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTHSTONE_OF_BORRUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANDLE_PART, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_DWARF_PICKAXE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_STEEL_PICKAXE_HEAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.CLUMP_OF_DWARF_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_AER_SPIRITSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_IGNIS_SPIRITSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_AQUA_SPIRITSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_TERA_SPIRITSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_MAGIRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_ORIKALKUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_DRAGON_BANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLUMP_OF_DWARF_GOLD, Models.GENERATED);

        itemModelGenerator.register(ModItems.DWARF_STEEL_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_GOLD_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AER_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IGNIS_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUA_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TERA_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGIRITE_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIKALKUM_FIRE_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_BANE_FIRE_CHARGE, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_DWARF_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MAGIRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ORIKALKUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DRAGON_BANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DWARF_GOLD, Models.GENERATED);

        itemModelGenerator.register(ModItems.DWARF_STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.AER_SPIRIT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.IGNIS_SPIRIT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUA_SPIRIT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TERA_SPIRIT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGIRITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIKALKUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_BANE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_GOLD_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.DWARF_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AER_SPIRIT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IGNIS_SPIRIT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUA_SPIRIT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TERA_SPIRIT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGIRITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIKALKUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_BANE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DWARF_GOLD_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.FORGING_HOT_AER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORGING_HOT_IGNIS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORGING_HOT_AQUA, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORGING_HOT_TERA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_MAGIRITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_ORIKALKUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_DRAGON_BANE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_DWARF_GOLD_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.DWARF_STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_STEEL_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_STEEL_BOOTS));

        itemModelGenerator.register(ModItems.DWARF_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DWARF_GOLD_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_GOLD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_GOLD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_GOLD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DWARF_GOLD_BOOTS));

        itemModelGenerator.register(ModItems.AER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AER_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AER_BOOTS));

        itemModelGenerator.register(ModItems.IGNIS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNIS_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IGNIS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IGNIS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IGNIS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IGNIS_BOOTS));

        itemModelGenerator.register(ModItems.AQUA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AQUA_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AQUA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AQUA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AQUA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AQUA_BOOTS));

        itemModelGenerator.register(ModItems.TERA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TERA_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TERA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TERA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TERA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TERA_BOOTS));

        itemModelGenerator.register(ModItems.MAGIRITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MAGIRITE_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIRITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIRITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIRITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIRITE_BOOTS));

        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_BOOTS));

        itemModelGenerator.register(ModItems.ADAMANTITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_BOOTS));

        itemModelGenerator.register(ModItems.ORIKALKUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORIKALKUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORIKALKUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORIKALKUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORIKALKUM_BOOTS));

        itemModelGenerator.register(ModItems.DRAGON_BANE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_BANE_SHEARS, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_BANE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_BANE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_BANE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_BANE_BOOTS));










    }

}
