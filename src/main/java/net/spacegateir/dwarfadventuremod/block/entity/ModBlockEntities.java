package net.spacegateir.dwarfadventuremod.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.block.entity.custom.CoverBlockEntity;

public class ModBlockEntities {
    public static final BlockEntityType<CoverBlockEntity> COVER_BLOCK_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    new Identifier(DwarfAdventureMod.MOD_ID, "cover_block_be"),
                    BlockEntityType.Builder.create(CoverBlockEntity::new, ModBlocks.COVER_BLOCK).build(null)
            );

    public static void registerBlockEntities() {
        DwarfAdventureMod.LOGGER.info("Registering Block Entities for " + DwarfAdventureMod.MOD_ID);
    }
}
