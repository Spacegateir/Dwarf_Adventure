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

    public static final RegistryKey<PointOfInterestType> DWARF_FORGE_POI_KEY = poiKey("forgepoi");
    public static final RegistryKey<PointOfInterestType> DWARF_ANVIL_POI_KEY = poiKey("anvilpoi");
    public static final RegistryKey<PointOfInterestType> DWARF_ANVIL_GROUND_POI_KEY = poiKey("groundpoi");
    public static final RegistryKey<PointOfInterestType> DWARF_ANVIL_STACK_POI_KEY = poiKey("stackpoi");
    public static final RegistryKey<PointOfInterestType> DWARF_ANVIL_OVER_POI_KEY = poiKey("overpoi");
    public static final RegistryKey<PointOfInterestType> DWARF_ANVIL_TURN_POI_KEY = poiKey("turnpoi");
    public static final RegistryKey<PointOfInterestType> TOOL_RACK_POI_KEY = poiKey("toolpoi");
    public static final RegistryKey<PointOfInterestType> DWARF_BELLOWS_POI_KEY = poiKey("bellowspoi");
    public static final RegistryKey<PointOfInterestType> WEAPON_RACK_POI_KEY = poiKey("weaponpoi");
    public static final RegistryKey<PointOfInterestType> STORAGE_CREATE_POI_KEY = poiKey("createpoi");
    public static final RegistryKey<PointOfInterestType> STORAGE_CREATE_DOUBLE_POI_KEY = poiKey("doublepoi");


    //registering villager work station
    public static final PointOfInterestType BENCH_POI = registerPoi("benchpoi", ModBlocks.GARDEN_BENCH);
    public static final PointOfInterestType POT_POI = registerPoi("potpoi", ModBlocks.GARDEN_POT);

    public static final PointOfInterestType DWARF_FORGE_POI = registerPoi("forgepoi", ModBlocks.DWARF_FORGE);
    public static final PointOfInterestType DWARF_ANVIL_POI = registerPoi("anvilpoi", ModBlocks.DWARF_ANVIL);
    public static final PointOfInterestType DWARF_ANVIL_GROUND_POI = registerPoi("groundpoi", ModBlocks.DWARF_ANVIL_GROUND);
    public static final PointOfInterestType DWARF_ANVIL_STACK_POI = registerPoi("stackpoi", ModBlocks.DWARF_ANVIL_STACK);
    public static final PointOfInterestType DWARF_ANVIL_OVER_POI = registerPoi("overpoi", ModBlocks.DWARF_ANVIL_OVER);
    public static final PointOfInterestType DWARF_ANVIL_TURN_POI = registerPoi("turnpoi", ModBlocks.DWARF_ANVIL_TURN);
    public static final PointOfInterestType TOOL_RACK_POI = registerPoi("toolpoi", ModBlocks.TOOL_RACK);
    public static final PointOfInterestType DWARF_BELLOWS_POI = registerPoi("bellowspoi", ModBlocks.DWARF_BELLOWS);
    public static final PointOfInterestType WEAPON_RACK_POI = registerPoi("weaponpoi", ModBlocks.WEAPON_RACK);
    public static final PointOfInterestType STORAGE_CREATE_POI = registerPoi("createpoi", ModBlocks.STORAGE_CREATE);
    public static final PointOfInterestType STORAGE_CREATE_DOUBLE = registerPoi("doublepoi", ModBlocks.STORAGE_CREATE_DOUBLE);


    //registering villager profession
    public static final VillagerProfession HORTICULTURALIST = registerProfession("horticulturist", BENCH_POI_KEY);
    public static final VillagerProfession FLORACULTURIST = registerProfession("floraculturist", POT_POI_KEY);

    public static final VillagerProfession IRON_MASTER_BLACKSMITH = registerProfession("iron_master_blacksmith", DWARF_FORGE_POI_KEY);
    public static final VillagerProfession STEELWEAVER_BLACKSMITH = registerProfession("steelweaver_blacksmith", DWARF_ANVIL_POI_KEY);
    public static final VillagerProfession GEM_FORGER_BLACKSMITH = registerProfession("gem_forger_blacksmith", DWARF_ANVIL_GROUND_POI_KEY);
    public static final VillagerProfession FROST_STEEL_BLACKSMITH = registerProfession("frost_steel_blacksmith", DWARF_ANVIL_STACK_POI_KEY);
    public static final VillagerProfession MOUNTAIN_FORGER_ARTISAN = registerProfession("mountain_forger_artisan", DWARF_ANVIL_OVER_POI_KEY);
    public static final VillagerProfession FIRESTONE_ARTISAN = registerProfession("firestone_artisan", DWARF_ANVIL_TURN_POI_KEY);
    public static final VillagerProfession HEARTHFORGER_ARTISAN = registerProfession("hearthforger_artisan", TOOL_RACK_POI_KEY);
    public static final VillagerProfession MITHRIL_BLACKSMITH = registerProfession("mithril_blacksmith", DWARF_BELLOWS_POI_KEY);
    public static final VillagerProfession BLOODFORGER_BLACKSMITH = registerProfession("bloodforger_blacksmith", WEAPON_RACK_POI_KEY);
    public static final VillagerProfession ANCIENT_FORGER_ARTISAN = registerProfession("ancient_forger_artisan", STORAGE_CREATE_POI_KEY);
    public static final VillagerProfession ELDER_DWARF_GODSMITH = registerProfession("elder_dwarf_godsmith", STORAGE_CREATE_DOUBLE_POI_KEY);

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
