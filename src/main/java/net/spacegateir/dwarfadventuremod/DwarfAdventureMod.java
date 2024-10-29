package net.spacegateir.dwarfadventuremod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.spacegateir.dwarfadventuremod.AncientFlowerConversions.*;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.event.ModEventHandlers;
import net.spacegateir.dwarfadventuremod.event.player.EventHandlers;
import net.spacegateir.dwarfadventuremod.item.ModItemGroups;
import net.spacegateir.dwarfadventuremod.item.ModItems;
import net.spacegateir.dwarfadventuremod.util.*;
import net.spacegateir.dwarfadventuremod.util.HammerEvents.*;
import net.spacegateir.dwarfadventuremod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DwarfAdventureMod implements ModInitializer {
	public static final String MOD_ID = "dwarfadventuremod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();

		ModLootTableModifiers.modifyLootTables();

		AncientSnowDropConversions.registerEvents();
		AncientCarnationConversions.registerEvents();
		AncientVioletConversions.registerEvents();
		AncientIrisConversions.registerEvents();
		AncientPrimroseConversions.registerEvents();
		AncientDaffodilConversions.registerEvents();
		AncientDelphiniumConversions.registerEvents();
		AncientDahliaConversions.registerEvents();
		AncientHydrangeaConversions.registerEvents();
		AncientMidnightMysticConversions.registerEvents();
		AncientHawthornConversions.registerEvents();
		AncientBonsaiConversions.registerEvents();
		AncientSpiderLilyConversions.registerEvents();
		AncientLarkspurConversions.registerEvents();
		AncientAgapanthusConversions.registerEvents();
		AncientBlueCosmosConversions.registerEvents();

		ModEventHandlers.registerBlockInteractionEvent();
		EventHandlers.registerEventHandlers();





		FuelRegistry.INSTANCE.add(ModItems.ANCESTRAL_FORGE_COAL,16000);

		PlayerBlockBreakEvents.BEFORE.register(new Hammer1x2UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer1x3UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer3x3UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer5x3UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer5x5UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer7x5UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer7x7UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer9x7UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer9x9UsageEvent());









	}
}


