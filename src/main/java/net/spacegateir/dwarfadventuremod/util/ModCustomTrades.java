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


    }

}
