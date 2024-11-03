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
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.SNOW_DROP_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.CARNATION_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.VIOLET_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.IRIS_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.PRIMROSE_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.DAFFODIL_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.DELPHINIUM_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.HYDRANGEA_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HORTICULTURALIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORRUPT_GEM,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            16, 30, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            new ItemStack(Items.ROOTED_DIRT,8),
                            16, 30, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ANCIENT_SEED,1),
                            new ItemStack(ModItems.DWARF_STEEL_COIN_S,1),
                            2, 30, 0.05f));
                });

        //FLORACULTURIST Villager Trades
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.HAWTHORN_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.BONSAI_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.SPIDERLILY_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.LARKSPUR_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.AGAPANTHUS_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.BLUE_COSMOS_FLOWER_BLOCK,4),
                            64, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(ModBlocks.DAHLIA_FLOWER_BLOCK,4),
                            64, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORACULTURIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POPPY,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            16, 30, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            new ItemStack(Items.COARSE_DIRT,8),
                            16, 30, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ANCIENT_SEED,1),
                            new ItemStack(ModItems.DWARF_STEEL_COIN_S,1),
                            2, 30, 0.05f));
                });

// Iron Master Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.IRON_MASTER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_GOLD_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Steelweaver Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_BOOTS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.STEELWEAVER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_STEEL_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Gem Forger Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_FORGER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AER_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Firestone Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FIRESTONE_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IGNIS_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Frost Steel Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FROST_STEEL_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.AQUA_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Mountain Forger Artisan
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MOUNTAIN_FORGER_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TERA_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Ancient Forger Artisan
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ANCIENT_FORGER_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Mythril Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MAGIRITE_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MITHRIL_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYTHRIL_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Hearthforge Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.HEARTHFORGER_ARTISAN,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// BloodForger Blacksmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLOODFORGER_BLACKSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ORIKALKUM_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });

// Elder Dwarf Godsmith
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_HOE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_SHOVEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_AXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_PICKAXE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_SWORD,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_PAXEL,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_M,2),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_HELMET,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,5),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_BOOTS,4),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            8, 1, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ELDER_DWARF_GODSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_CHESTPLATE,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            8, 1, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DRAGON_BANE_LEGGINGS,1),
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,7),
                            8, 1, 0.05f));
                });


    }

}
