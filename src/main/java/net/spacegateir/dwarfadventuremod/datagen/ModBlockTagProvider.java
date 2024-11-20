package net.spacegateir.dwarfadventuremod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(Blocks.NETHERITE_BLOCK, Blocks.EMERALD_BLOCK, Blocks.DIAMOND_BLOCK, Blocks.GOLD_BLOCK, Blocks.IRON_BLOCK,
                        ModBlocks.DWARF_STEEL_BLOCK, ModBlocks.DWARF_GOLD_BLOCK, ModBlocks.AER_BLOCK, ModBlocks.IGNIS_BLOCK,
                        ModBlocks.AQUA_BLOCK, ModBlocks.TERA_BLOCK, ModBlocks.ELEMENTAL_GEM_BLOCK, ModBlocks.MAGIRITE_BLOCK,
                        ModBlocks.PUREFICATED_MYTHRIL_BLOCK, ModBlocks.ADAMANTITE_BLOCK, ModBlocks.ORIKALKUM_BLOCK, ModBlocks.DRAGON_BANE_BLOCK);


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CASH_REGISTER)
                .add(ModBlocks.DWARF_ANVIL)
                .add(ModBlocks.DWARF_ANVIL_GROUND)
                .add(ModBlocks.DWARF_ANVIL_STACK)
                .add(ModBlocks.DWARF_ANVIL_TURN)
                .add(ModBlocks.DWARF_ANVIL_OVER)
                .add(ModBlocks.DWARF_FORGE)
                .add(ModBlocks.DWARF_BELLOWS)

                .add(ModBlocks.RAW_DWARF_STEEL_BLOCK)
                .add(ModBlocks.RAW_DWARF_STEEL_STAIRS)
                .add(ModBlocks.RAW_DWARF_STEEL_SLAB)
                .add(ModBlocks.RAW_DWARF_STEEL_BUTTON)
                .add(ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE)
                .add(ModBlocks.RAW_DWARF_STEEL_FENCE)
                .add(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE)
                .add(ModBlocks.RAW_DWARF_STEEL_WALL)
                .add(ModBlocks.RAW_DWARF_STEEL_DOOR)
                .add(ModBlocks.RAW_DWARF_STEEL_TRAPDOOR)

                .add(ModBlocks.DWARF_STEEL_BLOCK)
                .add(ModBlocks.DWARF_STEEL_STAIRS)
                .add(ModBlocks.DWARF_STEEL_SLAB)
                .add(ModBlocks.DWARF_STEEL_BUTTON)
                .add(ModBlocks.DWARF_STEEL_PRESSURE_PLATE)
                .add(ModBlocks.DWARF_STEEL_FENCE)
                .add(ModBlocks.DWARF_STEEL_FENCE_GATE)
                .add(ModBlocks.DWARF_STEEL_WALL)
                .add(ModBlocks.DWARF_STEEL_DOOR)
                .add(ModBlocks.DWARF_STEEL_TRAPDOOR)

                .add(ModBlocks.RAW_DWARF_STEEL_BLOCK)
                .add(ModBlocks.STONE_DWARF_STEEL_ORE)
                .add(ModBlocks.DEEPSLATE_DWARF_STEEL_ORE)
                .add(ModBlocks.NETHERRACK_DWARF_STEEL_ORE)
                .add(ModBlocks.END_STONE_DWARF_STEEL_ORE)
                .add(ModBlocks.ANDESITE_DWARF_STEEL_ORE)
                .add(ModBlocks.DIORITE_DWARF_STEEL_ORE)
                .add(ModBlocks.GRANITE_DWARF_STEEL_ORE)

                .add(ModBlocks.WIND_GEM_BLOCK)
                .add(ModBlocks.WIND_GEM_STAIRS)
                .add(ModBlocks.WIND_GEM_SLAB)
                .add(ModBlocks.WIND_GEM_BUTTON)
                .add(ModBlocks.WIND_GEM_PRESSURE_PLATE)
                .add(ModBlocks.WIND_GEM_FENCE)
                .add(ModBlocks.WIND_GEM_FENCE_GATE)
                .add(ModBlocks.WIND_GEM_WALL)
                .add(ModBlocks.AER_SPIRITSTONE_DOOR)
                .add(ModBlocks.AER_SPIRITSTONE_TRAPDOOR)

                .add(ModBlocks.AER_BLOCK)
                .add(ModBlocks.AER_STAIRS)
                .add(ModBlocks.AER_SLAB)
                .add(ModBlocks.AER_BUTTON)
                .add(ModBlocks.AER_PRESSURE_PLATE)
                .add(ModBlocks.AER_FENCE)
                .add(ModBlocks.AER_FENCE_GATE)
                .add(ModBlocks.AER_WALL)
                .add(ModBlocks.AER_DOOR)
                .add(ModBlocks.AER_TRAPDOOR)

                .add(ModBlocks.FIRE_GEM_BLOCK)
                .add(ModBlocks.FIRE_GEM_STAIRS)
                .add(ModBlocks.FIRE_GEM_SLAB)
                .add(ModBlocks.FIRE_GEM_BUTTON)
                .add(ModBlocks.FIRE_GEM_PRESSURE_PLATE)
                .add(ModBlocks.FIRE_GEM_FENCE)
                .add(ModBlocks.FIRE_GEM_FENCE_GATE)
                .add(ModBlocks.FIRE_GEM_WALL)
                .add(ModBlocks.IGNIS_SPIRITSTONE_DOOR)
                .add(ModBlocks.IGNIS_SPIRITSTONE_TRAPDOOR)

                .add(ModBlocks.IGNIS_BLOCK)
                .add(ModBlocks.IGNIS_STAIRS)
                .add(ModBlocks.IGNIS_SLAB)
                .add(ModBlocks.IGNIS_BUTTON)
                .add(ModBlocks.IGNIS_PRESSURE_PLATE)
                .add(ModBlocks.IGNIS_FENCE)
                .add(ModBlocks.IGNIS_FENCE_GATE)
                .add(ModBlocks.IGNIS_WALL)
                .add(ModBlocks.IGNIS_DOOR)
                .add(ModBlocks.IGNIS_TRAPDOOR)

                .add(ModBlocks.WATER_GEM_BLOCK)
                .add(ModBlocks.WATER_GEM_STAIRS)
                .add(ModBlocks.WATER_GEM_SLAB)
                .add(ModBlocks.WATER_GEM_BUTTON)
                .add(ModBlocks.WATER_GEM_PRESSURE_PLATE)
                .add(ModBlocks.WATER_GEM_FENCE)
                .add(ModBlocks.WATER_GEM_FENCE_GATE)
                .add(ModBlocks.WATER_GEM_WALL)
                .add(ModBlocks.AQUA_SPITIRSTONE_DOOR)
                .add(ModBlocks.AQUA_SPIRITSTONE_TRAPDOOR)

                .add(ModBlocks.AQUA_BLOCK)
                .add(ModBlocks.AQUA_STAIRS)
                .add(ModBlocks.AQUA_SLAB)
                .add(ModBlocks.AQUA_BUTTON)
                .add(ModBlocks.AQUA_PRESSURE_PLATE)
                .add(ModBlocks.AQUA_FENCE)
                .add(ModBlocks.AQUA_FENCE_GATE)
                .add(ModBlocks.AQUA_WALL)
                .add(ModBlocks.AQUA_DOOR)
                .add(ModBlocks.AQUA_TRAPDOOR)

                .add(ModBlocks.EARTH_GEM_BLOCK)
                .add(ModBlocks.EARTH_GEM_STAIRS)
                .add(ModBlocks.EARTH_GEM_SLAB)
                .add(ModBlocks.EARTH_GEM_BUTTON)
                .add(ModBlocks.EARTH_GEM_PRESSURE_PLATE)
                .add(ModBlocks.EARTH_GEM_FENCE)
                .add(ModBlocks.EARTH_GEM_FENCE_GATE)
                .add(ModBlocks.EARTH_GEM_WALL)
                .add(ModBlocks.TERA_SPIRITSTONE_DOOR)
                .add(ModBlocks.TERA_SPIRITSTONE_TRAPDOOR)

                .add(ModBlocks.TERA_BLOCK)
                .add(ModBlocks.TERA_STAIRS)
                .add(ModBlocks.TERA_SLAB)
                .add(ModBlocks.TERA_BUTTON)
                .add(ModBlocks.TERA_PRESSURE_PLATE)
                .add(ModBlocks.TERA_FENCE)
                .add(ModBlocks.TERA_FENCE_GATE)
                .add(ModBlocks.TERA_WALL)
                .add(ModBlocks.TERA_DOOR)
                .add(ModBlocks.TERA_TRAPDOOR)

                .add(ModBlocks.ELEMENTAL_GEM_BLOCK)
                .add(ModBlocks.ELEMENTAL_GEM_STAIRS)
                .add(ModBlocks.ELEMENTAL_GEM_SLAB)
                .add(ModBlocks.ELEMENTAL_GEM_BUTTON)
                .add(ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE)
                .add(ModBlocks.ELEMENTAL_GEM_FENCE)
                .add(ModBlocks.ELEMENTAL_GEM_FENCE_GATE)
                .add(ModBlocks.ELEMENTAL_GEM_WALL)
                .add(ModBlocks.QUINTESSENCE_DOOR)
                .add(ModBlocks.QUINTESSENCE_TRAPDOOR)

                .add(ModBlocks.RAW_MAGIRITE_BLOCK)
                .add(ModBlocks.RAW_MAGIRITE_STAIRS)
                .add(ModBlocks.RAW_MAGIRITE_SLAB)
                .add(ModBlocks.RAW_MAGIRITE_BUTTON)
                .add(ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_MAGIRITE_FENCE)
                .add(ModBlocks.RAW_MAGIRITE_FENCE_GATE)
                .add(ModBlocks.RAW_MAGIRITE_WALL)
                .add(ModBlocks.RAW_MAGIRITE_DOOR)
                .add(ModBlocks.RAW_MAGIRITE_TRAPDOOR)

                .add(ModBlocks.MAGIRITE_BLOCK)
                .add(ModBlocks.MAGIRITE_STAIRS)
                .add(ModBlocks.MAGIRITE_SLAB)
                .add(ModBlocks.MAGIRITE_BUTTON)
                .add(ModBlocks.MAGIRITE_PRESSURE_PLATE)
                .add(ModBlocks.MAGIRITE_FENCE)
                .add(ModBlocks.MAGIRITE_FENCE_GATE)
                .add(ModBlocks.MAGIRITE_WALL)
                .add(ModBlocks.MAGIRITE_DOOR)
                .add(ModBlocks.MAGIRITE_TRAPDOOR)

                .add(ModBlocks.MAGIRITE_STONE_ORE)
                .add(ModBlocks.MAGIRITE_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIRITE_NETHERRACK_ORE)
                .add(ModBlocks.MAGIRITE_END_STONE_ORE)
                .add(ModBlocks.MAGIRITE_ANDESITE_ORE)
                .add(ModBlocks.MAGIRITE_DIORITE_ORE)
                .add(ModBlocks.MAGIRITE_GRANITE_ORE)

                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.MYTHRIL_STAIRS)
                .add(ModBlocks.MYTHRIL_SLAB)
                .add(ModBlocks.MYTHRIL_BUTTON)
                .add(ModBlocks.MYTHRIL_PRESSURE_PLATE)
                .add(ModBlocks.MYTHRIL_FENCE)
                .add(ModBlocks.MYTHRIL_FENCE_GATE)
                .add(ModBlocks.MYTHRIL_WALL)
                .add(ModBlocks.MYTHRIL_DOOR)
                .add(ModBlocks.MYTHRIL_TRAPDOOR)

                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.BUDDING_MYTHRIL)
                .add(ModBlocks.BUDDING_MYTHRIL_STONE)
                .add(ModBlocks.BUDDING_MYTHRIL_DEELSLATE)
                .add(ModBlocks.BUDDING_MYTHRIL_NETHERRACK)
                .add(ModBlocks.BUDDING_MYTHRIL_END_STONE)
                .add(ModBlocks.BUDDING_MYTHRIL_ANDESITE)
                .add(ModBlocks.BUDDING_MYTHRIL_DIORITE)
                .add(ModBlocks.BUDDING_MYTHRIL_GRANDITE)
                .add(ModBlocks.SMALL_MYTHRIL_BUD)
                .add(ModBlocks.MEDIUM_MYTHRIL_BUD)
                .add(ModBlocks.LARGE_MYTHRIL_BUD)
                .add(ModBlocks.MYTHRIL_CLUSTER)

                .add(ModBlocks.PUREFICATED_MYTHRIL_BLOCK)
                .add(ModBlocks.PUREFICATED_MYTHRIL_STAIRS)
                .add(ModBlocks.PUREFICATED_MYTHRIL_SLAB)
                .add(ModBlocks.PUREFICATED_MYTHRIL_BUTTON)
                .add(ModBlocks.PUREFICATED_MYTHRIL_PRESSURE_PLATE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_FENCE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_WALL)
                .add(ModBlocks.PUREFICATED_MYTHRIL_DOOR)
                .add(ModBlocks.PUREFICATED_MYTHRIL_TRAPDOOR)

                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_STAIRS)
                .add(ModBlocks.RAW_ADAMANTITE_SLAB)
                .add(ModBlocks.RAW_ADAMANTITE_BUTTON)
                .add(ModBlocks.RAW_ADAMANTITE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_ADAMANTITE_FENCE)
                .add(ModBlocks.RAW_ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.RAW_ADAMANTITE_WALL)
                .add(ModBlocks.RAW_ADAMANTITE_DOOR)
                .add(ModBlocks.RAW_ADAMANTITE_TRAPDOOR)

                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_STAIRS)
                .add(ModBlocks.ADAMANTITE_SLAB)
                .add(ModBlocks.ADAMANTITE_BUTTON)
                .add(ModBlocks.ADAMANTITE_PRESSURE_PLATE)
                .add(ModBlocks.ADAMANTITE_FENCE)
                .add(ModBlocks.ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.ADAMANTITE_WALL)
                .add(ModBlocks.ADAMANTITE_DOOR)
                .add(ModBlocks.ADAMANTITE_TRAPDOOR)

                .add(ModBlocks.ADAMANTITE_STONE_ORE)
                .add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE)
                .add(ModBlocks.ADAMANTITE_NETHERRACK_ORE)
                .add(ModBlocks.ADAMANTITE_END_STONE_ORE)
                .add(ModBlocks.ADAMANTITE_ANDESITE_ORE)
                .add(ModBlocks.ADAMANTITE_DIORITE_ORE)
                .add(ModBlocks.ADAMANTITE_GRANITE_ORE)

                .add(ModBlocks.RAW_ORIKALKUM_BLOCK)
                .add(ModBlocks.RAW_ORIKALKUM_STAIRS)
                .add(ModBlocks.RAW_ORIKALKUM_SLAB)
                .add(ModBlocks.RAW_ORIKALKUM_BUTTON)
                .add(ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE)
                .add(ModBlocks.RAW_ORIKALKUM_FENCE)
                .add(ModBlocks.RAW_ORIKALKUM_FENCE_GATE)
                .add(ModBlocks.RAW_ORIKALKUM_WALL)
                .add(ModBlocks.RAW_ORIKALKUM_DOOR)
                .add(ModBlocks.RAW_ORIKALKUM_TRAPDOOR)

                .add(ModBlocks.ORIKALKUM_BLOCK)
                .add(ModBlocks.ORIKALKUM_STAIRS)
                .add(ModBlocks.ORIKALKUM_SLAB)
                .add(ModBlocks.ORIKALKUM_BUTTON)
                .add(ModBlocks.ORIKALKUM_PRESSURE_PLATE)
                .add(ModBlocks.ORIKALKUM_FENCE)
                .add(ModBlocks.ORIKALKUM_FENCE_GATE)
                .add(ModBlocks.ORIKALKUM_WALL)
                .add(ModBlocks.ORIKALKUM_DOOR)
                .add(ModBlocks.ORIKALKUM_TRAPDOOR)

                .add(ModBlocks.ORIKALKUM_STONE_ORE)
                .add(ModBlocks.ORIKALKUM_DEEPSLATE_ORE)
                .add(ModBlocks.ORIKALKUM_NETHERRACK_ORE)
                .add(ModBlocks.ORIKALKUM_END_STONE_ORE)
                .add(ModBlocks.ORIKALKUM_ANDESITE_ORE)
                .add(ModBlocks.ORIKALKUM_DIORITE_ORE)
                .add(ModBlocks.ORIKALKUM_GRANITE_ORE)

                .add(ModBlocks.RAW_DRAGON_BANE_BLOCK)
                .add(ModBlocks.RAW_DRAGON_BANE_STAIRS)
                .add(ModBlocks.RAW_DRAGON_BANE_SLAB)
                .add(ModBlocks.RAW_DRAGON_BANE_BUTTON)
                .add(ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_DRAGON_BANE_FENCE)
                .add(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE)
                .add(ModBlocks.RAW_DRAGON_BANE_WALL)
                .add(ModBlocks.RAW_DRAGON_BANE_DOOR)
                .add(ModBlocks.RAW_DRAGON_BANE_TRAPDOOR)

                .add(ModBlocks.DRAGON_BANE_BLOCK)
                .add(ModBlocks.DRAGON_BANE_STAIRS)
                .add(ModBlocks.DRAGON_BANE_SLAB)
                .add(ModBlocks.DRAGON_BANE_BUTTON)
                .add(ModBlocks.DRAGON_BANE_PRESSURE_PLATE)
                .add(ModBlocks.DRAGON_BANE_FENCE)
                .add(ModBlocks.DRAGON_BANE_FENCE_GATE)
                .add(ModBlocks.DRAGON_BANE_WALL)
                .add(ModBlocks.DRAGON_BANE_DOOR)
                .add(ModBlocks.DRAGON_BANE_TRAPDOOR)

                .add(ModBlocks.DRAGON_BANE_STONE_ORE)
                .add(ModBlocks.DRAGON_BANE_DEEPSLATE_ORE)
                .add(ModBlocks.DRAGON_BANE_NETHERRACK_ORE)
                .add(ModBlocks.DRAGON_BANE_END_STONE_ORE)
                .add(ModBlocks.DRAGON_BANE_ANDESITE_ORE)
                .add(ModBlocks.DRAGON_BANE_DIORITE_ORE)
                .add(ModBlocks.DRAGON_BANE_GRANITE_ORE)

                .add(ModBlocks.RAW_DWARF_GOLD_BLOCK)
                .add(ModBlocks.RAW_DWARF_GOLD_STAIRS)
                .add(ModBlocks.RAW_DWARF_GOLD_SLAB)
                .add(ModBlocks.RAW_DWARF_GOLD_BUTTON)
                .add(ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE)
                .add(ModBlocks.RAW_DWARF_GOLD_FENCE)
                .add(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE)
                .add(ModBlocks.RAW_DWARF_GOLD_WALL)
                .add(ModBlocks.RAW_DWARF_GOLD_DOOR)
                .add(ModBlocks.RAW_DWARF_GOLD_TRAPDOOR)

                .add(ModBlocks.DWARF_GOLD_BLOCK)
                .add(ModBlocks.DWARF_GOLD_STAIRS)
                .add(ModBlocks.DWARF_GOLD_SLAB)
                .add(ModBlocks.DWARF_GOLD_BUTTON)
                .add(ModBlocks.DWARF_GOLD_PRESSURE_PLATE)
                .add(ModBlocks.DWARF_GOLD_FENCE)
                .add(ModBlocks.DWARF_GOLD_FENCE_GATE)
                .add(ModBlocks.DWARF_GOLD_WALL)
                .add(ModBlocks.DWARF_GOLD_DOOR)
                .add(ModBlocks.DWARF_GOLD_TRAPDOOR)

                .add(ModBlocks.DWARF_GOLD_STONE_ORE)
                .add(ModBlocks.DWARF_GOLD_DEEPSLATE_ORE)
                .add(ModBlocks.DWARF_GOLD_NETHERRACK_ORE)
                .add(ModBlocks.DWARF_GOLD_END_STONE_ORE)
                .add(ModBlocks.DWARF_GOLD_ANDESITE_ORE)
                .add(ModBlocks.DWARF_GOLD_DIORITE_ORE)
                .add(ModBlocks.DWARF_GOLD_GRANITE_ORE)

                .add(ModBlocks.CURSED_BLOCK)
                .add(ModBlocks.SPEED_BOOSTER_BLOCK)
                .add(ModBlocks.SPEED_DECELERANT_BLOCK);


        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.GARDEN_BENCH)
                .add(ModBlocks.GARDEN_POT)
                .add(ModBlocks.GARDEN_POTTED_POT)
                .add(ModBlocks.WEAPON_RACK)
                .add(ModBlocks.TOOL_RACK)
                .add(ModBlocks.STORAGE_CREATE)
                .add(ModBlocks.STORAGE_CREATE_SMALL)
                .add(ModBlocks.STORAGE_CREATE_LARGE)
                .add(ModBlocks.STORAGE_CREATE_DOUBLE)

                .add(ModBlocks.COURSE_DIRT_TRAP_BLOCK)
                .add(ModBlocks.STONE_TRAP_BLOCK)
                .add(ModBlocks.DEEPSLATE_TRAP_BLOCK);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)

                .add(ModBlocks.SAND_QUICKSAND)
                .add(ModBlocks.RED_SAND_QUICKSAND)
                .add(ModBlocks.GRAVEL_SINKSTONE)
                .add(ModBlocks.MUD_SINKING_SLUDGE)
                .add(ModBlocks.SOUL_SAND_PHANTOM_QUICKSAND);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.CURSED_BLOCK);



        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_2")))
                .add(ModBlocks.RAW_DWARF_STEEL_BLOCK)
                .add(ModBlocks.RAW_DWARF_STEEL_STAIRS)
                .add(ModBlocks.RAW_DWARF_STEEL_SLAB)
                .add(ModBlocks.RAW_DWARF_STEEL_BUTTON)
                .add(ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE)
                .add(ModBlocks.RAW_DWARF_STEEL_FENCE)
                .add(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE)
                .add(ModBlocks.RAW_DWARF_STEEL_WALL)

                .add(ModBlocks.DWARF_STEEL_BLOCK)
                .add(ModBlocks.DWARF_STEEL_STAIRS)
                .add(ModBlocks.DWARF_STEEL_SLAB)
                .add(ModBlocks.DWARF_STEEL_BUTTON)
                .add(ModBlocks.DWARF_STEEL_PRESSURE_PLATE)
                .add(ModBlocks.DWARF_STEEL_FENCE)
                .add(ModBlocks.DWARF_STEEL_FENCE_GATE)
                .add(ModBlocks.DWARF_STEEL_WALL)
                .add(ModBlocks.DWARF_STEEL_DOOR)
                .add(ModBlocks.DWARF_STEEL_TRAPDOOR)

                .add(ModBlocks.STONE_DWARF_STEEL_ORE)
                .add(ModBlocks.DEEPSLATE_DWARF_STEEL_ORE)
                .add(ModBlocks.NETHERRACK_DWARF_STEEL_ORE)
                .add(ModBlocks.END_STONE_DWARF_STEEL_ORE)
                .add(ModBlocks.ANDESITE_DWARF_STEEL_ORE)
                .add(ModBlocks.DIORITE_DWARF_STEEL_ORE)
                .add(ModBlocks.GRANITE_DWARF_STEEL_ORE)

                .add(ModBlocks.DWARF_GOLD_BLOCK)
                .add(ModBlocks.DWARF_GOLD_STAIRS)
                .add(ModBlocks.DWARF_GOLD_SLAB)
                .add(ModBlocks.DWARF_GOLD_BUTTON)
                .add(ModBlocks.DWARF_GOLD_PRESSURE_PLATE)
                .add(ModBlocks.DWARF_GOLD_FENCE)
                .add(ModBlocks.DWARF_GOLD_FENCE_GATE)
                .add(ModBlocks.DWARF_GOLD_WALL)

                .add(ModBlocks.RAW_DWARF_GOLD_BLOCK)
                .add(ModBlocks.RAW_DWARF_GOLD_STAIRS)
                .add(ModBlocks.RAW_DWARF_GOLD_SLAB)
                .add(ModBlocks.RAW_DWARF_GOLD_BUTTON)
                .add(ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE)
                .add(ModBlocks.RAW_DWARF_GOLD_FENCE)
                .add(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE)
                .add(ModBlocks.RAW_DWARF_GOLD_WALL)

                .add(ModBlocks.DWARF_GOLD_STONE_ORE)
                .add(ModBlocks.DWARF_GOLD_DEEPSLATE_ORE)
                .add(ModBlocks.DWARF_GOLD_NETHERRACK_ORE)
                .add(ModBlocks.DWARF_GOLD_END_STONE_ORE)
                .add(ModBlocks.DWARF_GOLD_ANDESITE_ORE)
                .add(ModBlocks.DWARF_GOLD_DIORITE_ORE)
                .add(ModBlocks.DWARF_GOLD_GRANITE_ORE);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_3")))
                .add(ModBlocks.WIND_GEM_BLOCK)
                .add(ModBlocks.WIND_GEM_STAIRS)
                .add(ModBlocks.WIND_GEM_SLAB)
                .add(ModBlocks.WIND_GEM_BUTTON)
                .add(ModBlocks.WIND_GEM_PRESSURE_PLATE)
                .add(ModBlocks.WIND_GEM_FENCE)
                .add(ModBlocks.WIND_GEM_FENCE_GATE)
                .add(ModBlocks.WIND_GEM_WALL)

                .add(ModBlocks.AER_BLOCK)
                .add(ModBlocks.AER_STAIRS)
                .add(ModBlocks.AER_SLAB)
                .add(ModBlocks.AER_BUTTON)
                .add(ModBlocks.AER_PRESSURE_PLATE)
                .add(ModBlocks.AER_FENCE)
                .add(ModBlocks.AER_FENCE_GATE)
                .add(ModBlocks.AER_WALL)

                .add(ModBlocks.FIRE_GEM_BLOCK)
                .add(ModBlocks.FIRE_GEM_STAIRS)
                .add(ModBlocks.FIRE_GEM_SLAB)
                .add(ModBlocks.FIRE_GEM_BUTTON)
                .add(ModBlocks.FIRE_GEM_PRESSURE_PLATE)
                .add(ModBlocks.FIRE_GEM_FENCE)
                .add(ModBlocks.FIRE_GEM_FENCE_GATE)
                .add(ModBlocks.FIRE_GEM_WALL)

                .add(ModBlocks.IGNIS_BLOCK)
                .add(ModBlocks.IGNIS_STAIRS)
                .add(ModBlocks.IGNIS_SLAB)
                .add(ModBlocks.IGNIS_BUTTON)
                .add(ModBlocks.IGNIS_PRESSURE_PLATE)
                .add(ModBlocks.IGNIS_FENCE)
                .add(ModBlocks.IGNIS_FENCE_GATE)
                .add(ModBlocks.IGNIS_WALL)

                .add(ModBlocks.WATER_GEM_BLOCK)
                .add(ModBlocks.WATER_GEM_STAIRS)
                .add(ModBlocks.WATER_GEM_SLAB)
                .add(ModBlocks.WATER_GEM_BUTTON)
                .add(ModBlocks.WATER_GEM_PRESSURE_PLATE)
                .add(ModBlocks.WATER_GEM_FENCE)
                .add(ModBlocks.WATER_GEM_FENCE_GATE)
                .add(ModBlocks.WATER_GEM_WALL)

                .add(ModBlocks.AQUA_BLOCK)
                .add(ModBlocks.AQUA_STAIRS)
                .add(ModBlocks.AQUA_SLAB)
                .add(ModBlocks.AQUA_BUTTON)
                .add(ModBlocks.AQUA_PRESSURE_PLATE)
                .add(ModBlocks.AQUA_FENCE)
                .add(ModBlocks.AQUA_FENCE_GATE)
                .add(ModBlocks.AQUA_WALL)

                .add(ModBlocks.EARTH_GEM_BLOCK)
                .add(ModBlocks.EARTH_GEM_STAIRS)
                .add(ModBlocks.EARTH_GEM_SLAB)
                .add(ModBlocks.EARTH_GEM_BUTTON)
                .add(ModBlocks.EARTH_GEM_PRESSURE_PLATE)
                .add(ModBlocks.EARTH_GEM_FENCE)
                .add(ModBlocks.EARTH_GEM_FENCE_GATE)
                .add(ModBlocks.EARTH_GEM_WALL)

                .add(ModBlocks.TERA_BLOCK)
                .add(ModBlocks.TERA_STAIRS)
                .add(ModBlocks.TERA_SLAB)
                .add(ModBlocks.TERA_BUTTON)
                .add(ModBlocks.TERA_PRESSURE_PLATE)
                .add(ModBlocks.TERA_FENCE)
                .add(ModBlocks.TERA_FENCE_GATE)
                .add(ModBlocks.TERA_WALL)

                .add(ModBlocks.ELEMENTAL_GEM_BLOCK)
                .add(ModBlocks.ELEMENTAL_GEM_STAIRS)
                .add(ModBlocks.ELEMENTAL_GEM_SLAB)
                .add(ModBlocks.ELEMENTAL_GEM_BUTTON)
                .add(ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE)
                .add(ModBlocks.ELEMENTAL_GEM_FENCE)
                .add(ModBlocks.ELEMENTAL_GEM_FENCE_GATE)
                .add(ModBlocks.ELEMENTAL_GEM_WALL)

                .add(ModBlocks.MAGIRITE_STONE_ORE)
                .add(ModBlocks.MAGIRITE_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIRITE_NETHERRACK_ORE)
                .add(ModBlocks.MAGIRITE_END_STONE_ORE)
                .add(ModBlocks.MAGIRITE_ANDESITE_ORE)
                .add(ModBlocks.MAGIRITE_DIORITE_ORE)
                .add(ModBlocks.MAGIRITE_GRANITE_ORE);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.RAW_MAGIRITE_BLOCK)
                .add(ModBlocks.RAW_MAGIRITE_STAIRS)
                .add(ModBlocks.RAW_MAGIRITE_SLAB)
                .add(ModBlocks.RAW_MAGIRITE_BUTTON)
                .add(ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_MAGIRITE_FENCE)
                .add(ModBlocks.RAW_MAGIRITE_FENCE_GATE)
                .add(ModBlocks.RAW_MAGIRITE_WALL)

                .add(ModBlocks.MAGIRITE_BLOCK)
                .add(ModBlocks.MAGIRITE_STAIRS)
                .add(ModBlocks.MAGIRITE_SLAB)
                .add(ModBlocks.MAGIRITE_BUTTON)
                .add(ModBlocks.MAGIRITE_PRESSURE_PLATE)
                .add(ModBlocks.MAGIRITE_FENCE)
                .add(ModBlocks.MAGIRITE_FENCE_GATE)
                .add(ModBlocks.MAGIRITE_WALL)

                .add(ModBlocks.SMALL_MYTHRIL_BUD)
                .add(ModBlocks.MEDIUM_MYTHRIL_BUD)
                .add(ModBlocks.LARGE_MYTHRIL_BUD)
                .add(ModBlocks.MYTHRIL_CLUSTER);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_5")))
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.MYTHRIL_STAIRS)
                .add(ModBlocks.MYTHRIL_SLAB)
                .add(ModBlocks.MYTHRIL_BUTTON)
                .add(ModBlocks.MYTHRIL_PRESSURE_PLATE)
                .add(ModBlocks.MYTHRIL_FENCE)
                .add(ModBlocks.MYTHRIL_FENCE_GATE)
                .add(ModBlocks.MYTHRIL_WALL)
                .add(ModBlocks.MYTHRIL_DOOR)
                .add(ModBlocks.MYTHRIL_TRAPDOOR)

                .add(ModBlocks.PUREFICATED_MYTHRIL_BLOCK)
                .add(ModBlocks.PUREFICATED_MYTHRIL_STAIRS)
                .add(ModBlocks.PUREFICATED_MYTHRIL_SLAB)
                .add(ModBlocks.PUREFICATED_MYTHRIL_BUTTON)
                .add(ModBlocks.PUREFICATED_MYTHRIL_PRESSURE_PLATE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_FENCE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_WALL)
                .add(ModBlocks.PUREFICATED_MYTHRIL_DOOR)
                .add(ModBlocks.PUREFICATED_MYTHRIL_TRAPDOOR)

                .add(ModBlocks.ADAMANTITE_STONE_ORE)
                .add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE)
                .add(ModBlocks.ADAMANTITE_NETHERRACK_ORE)
                .add(ModBlocks.ADAMANTITE_END_STONE_ORE)
                .add(ModBlocks.ADAMANTITE_ANDESITE_ORE)
                .add(ModBlocks.ADAMANTITE_DIORITE_ORE)
                .add(ModBlocks.ADAMANTITE_GRANITE_ORE);



        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_6")))
                .add(Blocks.BUDDING_AMETHYST)
                .add(ModBlocks.BUDDING_MYTHRIL)
                .add(ModBlocks.BUDDING_MYTHRIL_STONE)
                .add(ModBlocks.BUDDING_MYTHRIL_DEELSLATE)
                .add(ModBlocks.BUDDING_MYTHRIL_NETHERRACK)
                .add(ModBlocks.BUDDING_MYTHRIL_END_STONE)
                .add(ModBlocks.BUDDING_MYTHRIL_ANDESITE)
                .add(ModBlocks.BUDDING_MYTHRIL_DIORITE)
                .add(ModBlocks.BUDDING_MYTHRIL_GRANDITE)

                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_STAIRS)
                .add(ModBlocks.RAW_ADAMANTITE_SLAB)
                .add(ModBlocks.RAW_ADAMANTITE_BUTTON)
                .add(ModBlocks.RAW_ADAMANTITE_PRESSURE_PLATE)
                .add(ModBlocks.RAW_ADAMANTITE_FENCE)
                .add(ModBlocks.RAW_ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.RAW_ADAMANTITE_WALL)

                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_STAIRS)
                .add(ModBlocks.ADAMANTITE_SLAB)
                .add(ModBlocks.ADAMANTITE_BUTTON)
                .add(ModBlocks.ADAMANTITE_PRESSURE_PLATE)
                .add(ModBlocks.ADAMANTITE_FENCE)
                .add(ModBlocks.ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.ADAMANTITE_WALL)

                .add(ModBlocks.ORIKALKUM_STONE_ORE)
                .add(ModBlocks.ORIKALKUM_DEEPSLATE_ORE)
                .add(ModBlocks.ORIKALKUM_NETHERRACK_ORE)
                .add(ModBlocks.ORIKALKUM_END_STONE_ORE)
                .add(ModBlocks.ORIKALKUM_ANDESITE_ORE)
                .add(ModBlocks.ORIKALKUM_DIORITE_ORE)
                .add(ModBlocks.ORIKALKUM_GRANITE_ORE);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_7")))
                .add(ModBlocks.RAW_ORIKALKUM_BLOCK)
                .add(ModBlocks.RAW_ORIKALKUM_STAIRS)
                .add(ModBlocks.RAW_ORIKALKUM_SLAB)
                .add(ModBlocks.RAW_ORIKALKUM_BUTTON)
                .add(ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE)
                .add(ModBlocks.RAW_ORIKALKUM_FENCE)
                .add(ModBlocks.RAW_ORIKALKUM_FENCE_GATE)
                .add(ModBlocks.RAW_ORIKALKUM_WALL)

                .add(ModBlocks.ORIKALKUM_BLOCK)
                .add(ModBlocks.ORIKALKUM_STAIRS)
                .add(ModBlocks.ORIKALKUM_SLAB)
                .add(ModBlocks.ORIKALKUM_BUTTON)
                .add(ModBlocks.ORIKALKUM_PRESSURE_PLATE)
                .add(ModBlocks.ORIKALKUM_FENCE)
                .add(ModBlocks.ORIKALKUM_FENCE_GATE)
                .add(ModBlocks.ORIKALKUM_WALL)

                .add(ModBlocks.CURSED_BLOCK)
                .add(ModBlocks.COURSE_DIRT_TRAP_BLOCK)
                .add(ModBlocks.STONE_TRAP_BLOCK)
                .add(ModBlocks.DEEPSLATE_TRAP_BLOCK)
                .add(ModBlocks.SPEED_BOOSTER_BLOCK)
                .add(ModBlocks.SPEED_DECELERANT_BLOCK)
                .add(ModBlocks.SAND_QUICKSAND)
                .add(ModBlocks.RED_SAND_QUICKSAND)
                .add(ModBlocks.GRAVEL_SINKSTONE)
                .add(ModBlocks.MUD_SINKING_SLUDGE)
                .add(ModBlocks.SOUL_SAND_PHANTOM_QUICKSAND)

                .add(ModBlocks.DRAGON_BANE_STONE_ORE)
                .add(ModBlocks.DRAGON_BANE_DEEPSLATE_ORE)
                .add(ModBlocks.DRAGON_BANE_NETHERRACK_ORE)
                .add(ModBlocks.DRAGON_BANE_END_STONE_ORE)
                .add(ModBlocks.DRAGON_BANE_ANDESITE_ORE)
                .add(ModBlocks.DRAGON_BANE_DIORITE_ORE)
                .add(ModBlocks.DRAGON_BANE_GRANITE_ORE);


      getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_8")))
              .add(ModBlocks.RAW_DRAGON_BANE_BLOCK)
              .add(ModBlocks.RAW_DRAGON_BANE_STAIRS)
              .add(ModBlocks.RAW_DRAGON_BANE_SLAB)
              .add(ModBlocks.RAW_DRAGON_BANE_BUTTON)
              .add(ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE)
              .add(ModBlocks.RAW_DRAGON_BANE_FENCE)
              .add(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE)
              .add(ModBlocks.RAW_DRAGON_BANE_WALL)

              .add(ModBlocks.DRAGON_BANE_BLOCK)
              .add(ModBlocks.DRAGON_BANE_STAIRS)
              .add(ModBlocks.DRAGON_BANE_SLAB)
              .add(ModBlocks.DRAGON_BANE_BUTTON)
              .add(ModBlocks.DRAGON_BANE_PRESSURE_PLATE)
              .add(ModBlocks.DRAGON_BANE_FENCE)
              .add(ModBlocks.DRAGON_BANE_FENCE_GATE)
              .add(ModBlocks.DRAGON_BANE_WALL);






        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.DWARF_STEEL_FENCE)
                .add(ModBlocks.RAW_DWARF_STEEL_FENCE)
                .add(ModBlocks.WIND_GEM_FENCE)
                .add(ModBlocks.AER_FENCE)
                .add(ModBlocks.FIRE_GEM_FENCE)
                .add(ModBlocks.IGNIS_FENCE)
                .add(ModBlocks.WATER_GEM_FENCE)
                .add(ModBlocks.AQUA_FENCE)
                .add(ModBlocks.EARTH_GEM_FENCE)
                .add(ModBlocks.TERA_FENCE)
                .add(ModBlocks.ELEMENTAL_GEM_FENCE)
                .add(ModBlocks.MAGIRITE_FENCE)
                .add(ModBlocks.RAW_MAGIRITE_FENCE)
                .add(ModBlocks.MYTHRIL_FENCE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_FENCE)
                .add(ModBlocks.ADAMANTITE_FENCE)
                .add(ModBlocks.RAW_ADAMANTITE_FENCE)
                .add(ModBlocks.ORIKALKUM_FENCE)
                .add(ModBlocks.RAW_ORIKALKUM_FENCE)
                .add(ModBlocks.DRAGON_BANE_FENCE)
                .add(ModBlocks.RAW_DRAGON_BANE_FENCE)
                .add(ModBlocks.DWARF_GOLD_FENCE)
                .add(ModBlocks.RAW_DWARF_GOLD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DWARF_STEEL_FENCE_GATE)
                .add(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE)
                .add(ModBlocks.WIND_GEM_FENCE_GATE)
                .add(ModBlocks.AER_FENCE_GATE)
                .add(ModBlocks.FIRE_GEM_FENCE_GATE)
                .add(ModBlocks.IGNIS_FENCE_GATE)
                .add(ModBlocks.WATER_GEM_FENCE_GATE)
                .add(ModBlocks.AQUA_FENCE_GATE)
                .add(ModBlocks.EARTH_GEM_FENCE_GATE)
                .add(ModBlocks.TERA_FENCE_GATE)
                .add(ModBlocks.ELEMENTAL_GEM_FENCE_GATE)
                .add(ModBlocks.MAGIRITE_FENCE_GATE)
                .add(ModBlocks.RAW_MAGIRITE_FENCE_GATE)
                .add(ModBlocks.MYTHRIL_FENCE_GATE)
                .add(ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE)
                .add(ModBlocks.ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.RAW_ADAMANTITE_FENCE_GATE)
                .add(ModBlocks.ORIKALKUM_FENCE_GATE)
                .add(ModBlocks.RAW_ORIKALKUM_FENCE_GATE)
                .add(ModBlocks.DRAGON_BANE_FENCE_GATE)
                .add(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE)
                .add(ModBlocks.DWARF_GOLD_FENCE_GATE)
                .add(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DWARF_STEEL_WALL)
                .add(ModBlocks.RAW_DWARF_STEEL_WALL)
                .add(ModBlocks.WIND_GEM_WALL)
                .add(ModBlocks.AER_WALL)
                .add(ModBlocks.FIRE_GEM_WALL)
                .add(ModBlocks.IGNIS_WALL)
                .add(ModBlocks.WATER_GEM_WALL)
                .add(ModBlocks.AQUA_WALL)
                .add(ModBlocks.EARTH_GEM_WALL)
                .add(ModBlocks.TERA_WALL)
                .add(ModBlocks.ELEMENTAL_GEM_WALL)
                .add(ModBlocks.MAGIRITE_WALL)
                .add(ModBlocks.RAW_MAGIRITE_WALL)
                .add(ModBlocks.MYTHRIL_WALL)
                .add(ModBlocks.PUREFICATED_MYTHRIL_WALL)
                .add(ModBlocks.ADAMANTITE_WALL)
                .add(ModBlocks.RAW_ADAMANTITE_WALL)
                .add(ModBlocks.ORIKALKUM_WALL)
                .add(ModBlocks.RAW_ORIKALKUM_WALL)
                .add(ModBlocks.DRAGON_BANE_WALL)
                .add(ModBlocks.RAW_DRAGON_BANE_WALL)
                .add(ModBlocks.DWARF_GOLD_WALL)
                .add(ModBlocks.RAW_DWARF_GOLD_WALL);

        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);
    }

    @Override
    public String getName() {
        return "Mod Block Tags";
    }


}
