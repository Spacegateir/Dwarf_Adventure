package net.spacegateir.dwarfadventuremod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.ModItems;
import net.spacegateir.dwarfadventuremod.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CHARCOAL,16),
                            new ItemStack(Items.EMERALD,2),
                            32, 2, 0.5f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,16),
                            new ItemStack(ModItems.ANCIENT_SEED,1),
                            1, 25, 0.05f));
                });


        //HORTICULTURALIST Villager Trades
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.SNOW_DROP_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.CARNATION_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.VIOLET_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.IRIS_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.PRIMROSE_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.DAFFODIL_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.DELPHINIUM_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.HYDRANGEA_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORRUPT_GEM,1),
                            new ItemStack(Items.EMERALD,3),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.ROOTED_DIRT,8),
                            16, 30, 0.05f));
                });

        //FLORACULTURIST Villager Trades
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.MIDNIGHT_MYSTIC_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.HAWTHORN_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.BONSAI_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.SPIDERLILY_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.LARKSPUR_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.AGAPANTHUS_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.BLUE_COSMOS_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,2),
                            new ItemStack(ModBlocks.DAHLIA_FLOWER,1),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POPPY,4),
                            new ItemStack(Items.EMERALD,1),
                            16, 30, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Iron Master Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Steelweaver Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Gem Forger Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Firestone Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Frost Steel Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Mountain Forger Artisan
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Ancient Forger Artisan
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Mythril Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Hearthforge Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// BloodForger Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });

// Elder Dwarf Godsmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));
                });


    }

}
