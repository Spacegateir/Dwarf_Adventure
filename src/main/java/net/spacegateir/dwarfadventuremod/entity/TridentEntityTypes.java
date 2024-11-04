package net.spacegateir.dwarfadventuremod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.entity.projectile.DwarfSteelTridentEntity;

public class TridentEntityTypes {
    public static final EntityType<DwarfSteelTridentEntity> DWARF_STEEL_TRIDENT = register("dwarf_steel_trident",
            EntityType.Builder.create(DwarfSteelTridentEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.5F, 0.5F)
                    .setTrackingRange(4)
                    .setUpdateInterval(10)
                    .setShouldReceiveVelocityUpdates(true)
                    .build());

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        return Registry.register(Registry.ENTITY_TYPE, new Identifier(DwarfAdventureMod.MOD_ID, name), builder.build());
    }
}
