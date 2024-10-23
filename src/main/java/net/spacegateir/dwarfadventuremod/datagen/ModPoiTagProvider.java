package net.spacegateir.dwarfadventuremod.datagen;

import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;


import java.util.concurrent.CompletableFuture;

public class ModPoiTagProvider extends TagProvider<PointOfInterestType> {
    public ModPoiTagProvider(DataOutput output,
                             CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, RegistryKeys.POINT_OF_INTEREST_TYPE, registryLookupFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        this.getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE)
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "benchpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "potpoi"))

                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "forgepoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "anvilpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "groundpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "stackpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "overpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "turnpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "toolpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "bellowspoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "weaponpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "createpoi"))
                .addOptional(new Identifier(DwarfAdventureMod.MOD_ID, "doublepoi"));

    }
}