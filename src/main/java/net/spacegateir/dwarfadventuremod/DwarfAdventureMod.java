package net.spacegateir.dwarfadventuremod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.AncientFlowerConversions.*;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.enchantment.ModEnchantments;
import net.spacegateir.dwarfadventuremod.enchantment.VeinMinerEnchantment;
import net.spacegateir.dwarfadventuremod.entity.TridentEntityTypes;
import net.spacegateir.dwarfadventuremod.event.ModEventHandlers;
import net.spacegateir.dwarfadventuremod.event.player.EventHandlers;
import net.spacegateir.dwarfadventuremod.item.ModItemGroups;
import net.spacegateir.dwarfadventuremod.item.ModItems;
import net.spacegateir.dwarfadventuremod.item.custom.KnifeItem;
import net.spacegateir.dwarfadventuremod.util.*;
import net.spacegateir.dwarfadventuremod.util.HammerEvents.*;
import net.spacegateir.dwarfadventuremod.villager.ModLibarianTradeModifications;
import net.spacegateir.dwarfadventuremod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DwarfAdventureMod implements ModInitializer {
	public static final String MOD_ID = "dwarfadventuremod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModRegistries.registerModStuff();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();
		ModLibarianTradeModifications.registerLibarianModifications();
		ModVillagers.registerVillagers();

		ModLootTableModifiers.modifyLootTables();
		ModEnchantments.registerModEnchantments();

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

		PlayerBlockBreakEvents.BEFORE.register(new Hammer1x2UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer1x3UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer3x3UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer5x3UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer5x5UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer7x5UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer7x7UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer9x7UsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new Hammer9x9UsageEvent());

		PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
			ItemStack stack = player.getMainHandStack();
			int enchantmentLevel = EnchantmentHelper.getLevel(ModEnchantments.VEIN_MINER, stack); // Get the enchantment level

			if (enchantmentLevel > 0) {
				VeinMinerEnchantment veinMiner = (VeinMinerEnchantment) ModEnchantments.VEIN_MINER;
				veinMiner.mineVein(state, pos, world, player, enchantmentLevel); // Pass the enchantment level
			}
		});












	}
}


