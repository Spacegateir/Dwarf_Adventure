package net.spacegateir.dwarfadventuremod.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> BENCH_POI_KEY = poiKey("benchpoi");
    public static final RegistryKey<PointOfInterestType> POT_POI_KEY = poiKey("potpoi");


    //registering villager work station
    public static final PointOfInterestType BENCH_POI = registerPoi("benchpoi", ModBlocks.GARDEN_BENCH);
    public static final PointOfInterestType POT_POI = registerPoi("potpoi", ModBlocks.GARDEN_POT);


    //registering villager profession
    public static final VillagerProfession HORTICULTURALIST = registerProfession("horticulturist", BENCH_POI_KEY);
    public static final VillagerProfession FLORACULTURIST = registerProfession("floraculturist", POT_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(DwarfAdventureMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(DwarfAdventureMod.MOD_ID,name),1,1,block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE,new Identifier(DwarfAdventureMod.MOD_ID, name));
    }

    public static void registerVillagers() {
        DwarfAdventureMod.LOGGER.info("Registering Villagers " + DwarfAdventureMod.MOD_ID);
    }
}
