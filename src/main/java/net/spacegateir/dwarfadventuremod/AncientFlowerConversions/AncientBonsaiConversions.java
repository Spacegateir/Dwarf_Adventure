package net.spacegateir.dwarfadventuremod.AncientFlowerConversions;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;

public class AncientBonsaiConversions {

    // Define conversion maps
    private static final Map<ItemStack, ItemStack> CONVERSION_MAP = new HashMap<>();

    static {
        // Add conversion for any wool block to purple wool
        addAllWool();
        addAllCarpet();
        addAllConcreate();
        addAllConcreatePowder();
        addAllTerracotta();
        addAllGlazedTerracotta();
        addAllStainedGlass();
        addAllStainedGlassPane();
        addAllBed();
        addAllCandle();

        // Other conversions can go here
      //  CONVERSION_MAP.put(new ItemStack(Items.DIRT), new ItemStack(Items.ROOTED_DIRT));
      //  CONVERSION_MAP.put(new ItemStack(Items.COBBLESTONE), new ItemStack(Items.OBSIDIAN));
    }

    private static void addAllWool() {
        Item[] woolItems = {
                Items.WHITE_WOOL, Items.ORANGE_WOOL, Items.MAGENTA_WOOL, Items.LIGHT_BLUE_WOOL, Items.YELLOW_WOOL,
                Items.LIME_WOOL, Items.PINK_WOOL, Items.GRAY_WOOL, Items.LIGHT_GRAY_WOOL, Items.CYAN_WOOL,
                Items.PURPLE_WOOL, Items.BLUE_WOOL, Items.BROWN_WOOL, Items.GREEN_WOOL, Items.RED_WOOL, Items.BLACK_WOOL
        };

        for (Item woolItem : woolItems) {
            CONVERSION_MAP.put(new ItemStack(woolItem), new ItemStack(Items.GREEN_WOOL));
        }
    }
    private static void addAllCarpet() {
        Item[] CarpetItems = {
                Items.WHITE_CARPET, Items.ORANGE_CARPET, Items.MAGENTA_CARPET, Items.LIGHT_BLUE_CARPET, Items.YELLOW_CARPET,
                Items.LIME_CARPET, Items.PINK_CARPET, Items.GRAY_CARPET, Items.LIGHT_GRAY_CARPET, Items.CYAN_CARPET,
                Items.PURPLE_CARPET, Items.BLUE_CARPET, Items.BROWN_CARPET, Items.GREEN_CARPET, Items.RED_CARPET, Items.BLACK_CARPET
        };

        for (Item CarpetItem : CarpetItems) {
            CONVERSION_MAP.put(new ItemStack(CarpetItem), new ItemStack(Items.GREEN_CARPET));
        }
    }
    private static void addAllConcreate() {
        Item[] concreateItems = {
                Items.WHITE_CONCRETE, Items.ORANGE_CONCRETE, Items.MAGENTA_CONCRETE, Items.LIGHT_BLUE_CONCRETE, Items.YELLOW_CONCRETE,
                Items.LIME_CONCRETE, Items.PINK_CONCRETE, Items.GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE, Items.CYAN_CONCRETE,
                Items.PURPLE_CONCRETE, Items.BLUE_CONCRETE, Items.BROWN_CONCRETE, Items.GREEN_CONCRETE, Items.RED_CONCRETE, Items.BLACK_CONCRETE
        };

        for (Item concreateItem : concreateItems) {
            CONVERSION_MAP.put(new ItemStack(concreateItem), new ItemStack(Items.GREEN_CONCRETE));
        }
    }
    private static void addAllConcreatePowder() {
        Item[] concreatepowderItems = {
                Items.WHITE_CONCRETE_POWDER, Items.ORANGE_CONCRETE_POWDER, Items.MAGENTA_CONCRETE_POWDER, Items.LIGHT_BLUE_CONCRETE_POWDER, Items.YELLOW_CONCRETE_POWDER,
                Items.LIME_CONCRETE_POWDER, Items.PINK_CONCRETE_POWDER, Items.GRAY_CONCRETE_POWDER, Items.LIGHT_GRAY_CONCRETE_POWDER, Items.CYAN_CONCRETE_POWDER,
                Items.PURPLE_CONCRETE_POWDER, Items.BLUE_CONCRETE_POWDER, Items.BROWN_CONCRETE_POWDER, Items.GREEN_CONCRETE_POWDER, Items.RED_CONCRETE_POWDER, Items.BLACK_CONCRETE_POWDER
        };

        for (Item concreatepowderItem : concreatepowderItems) {
            CONVERSION_MAP.put(new ItemStack(concreatepowderItem), new ItemStack(Items.GREEN_CONCRETE_POWDER));
        }
    }
    private static void addAllTerracotta() {
        Item[] TerracottaItems = {
                Items.WHITE_TERRACOTTA, Items.ORANGE_TERRACOTTA, Items.MAGENTA_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA, Items.YELLOW_TERRACOTTA,
                Items.LIME_TERRACOTTA, Items.PINK_TERRACOTTA, Items.GRAY_TERRACOTTA, Items.LIGHT_GRAY_TERRACOTTA, Items.CYAN_TERRACOTTA,
                Items.PURPLE_TERRACOTTA, Items.BLUE_TERRACOTTA, Items.BROWN_TERRACOTTA, Items.GREEN_TERRACOTTA, Items.RED_TERRACOTTA, Items.BLACK_TERRACOTTA
        };

        for (Item TerracottaItem : TerracottaItems) {
            CONVERSION_MAP.put(new ItemStack(TerracottaItem), new ItemStack(Items.GREEN_TERRACOTTA));
        }
    }
    private static void addAllGlazedTerracotta() {
        Item[] GlazedTerracottaItems = {
                Items.WHITE_GLAZED_TERRACOTTA, Items.ORANGE_GLAZED_TERRACOTTA, Items.MAGENTA_GLAZED_TERRACOTTA, Items.LIGHT_BLUE_GLAZED_TERRACOTTA, Items.YELLOW_GLAZED_TERRACOTTA,
                Items.LIME_GLAZED_TERRACOTTA, Items.PINK_GLAZED_TERRACOTTA, Items.GRAY_GLAZED_TERRACOTTA, Items.LIGHT_GRAY_GLAZED_TERRACOTTA, Items.CYAN_GLAZED_TERRACOTTA,
                Items.PURPLE_GLAZED_TERRACOTTA, Items.BLUE_GLAZED_TERRACOTTA, Items.BROWN_GLAZED_TERRACOTTA, Items.GREEN_GLAZED_TERRACOTTA, Items.RED_GLAZED_TERRACOTTA, Items.BLACK_GLAZED_TERRACOTTA
        };

        for (Item GlazedTerracottaItem : GlazedTerracottaItems) {
            CONVERSION_MAP.put(new ItemStack(GlazedTerracottaItem), new ItemStack(Items.GREEN_GLAZED_TERRACOTTA));
        }
    }
    private static void addAllStainedGlass() {
        Item[] StainedGlassItems = {
                Items.WHITE_STAINED_GLASS, Items.ORANGE_STAINED_GLASS, Items.MAGENTA_STAINED_GLASS, Items.LIGHT_BLUE_STAINED_GLASS, Items.YELLOW_STAINED_GLASS,
                Items.LIME_STAINED_GLASS, Items.PINK_STAINED_GLASS, Items.GRAY_STAINED_GLASS, Items.LIGHT_GRAY_STAINED_GLASS, Items.CYAN_STAINED_GLASS,
                Items.PURPLE_STAINED_GLASS, Items.BLUE_STAINED_GLASS, Items.BROWN_STAINED_GLASS, Items.GREEN_STAINED_GLASS, Items.RED_STAINED_GLASS, Items.BLACK_STAINED_GLASS
        };

        for (Item StainedGlassItem : StainedGlassItems) {
            CONVERSION_MAP.put(new ItemStack(StainedGlassItem), new ItemStack(Items.GREEN_STAINED_GLASS));
        }
    }
    private static void addAllStainedGlassPane() {
        Item[] StainedGlassPaneItems = {
                Items.WHITE_STAINED_GLASS_PANE, Items.ORANGE_STAINED_GLASS_PANE, Items.MAGENTA_STAINED_GLASS_PANE, Items.LIGHT_BLUE_STAINED_GLASS_PANE, Items.YELLOW_STAINED_GLASS_PANE,
                Items.LIME_STAINED_GLASS_PANE, Items.PINK_STAINED_GLASS_PANE, Items.GRAY_STAINED_GLASS_PANE, Items.LIGHT_GRAY_STAINED_GLASS_PANE, Items.CYAN_STAINED_GLASS_PANE,
                Items.PURPLE_STAINED_GLASS_PANE, Items.BLUE_STAINED_GLASS_PANE, Items.BROWN_STAINED_GLASS_PANE, Items.GREEN_STAINED_GLASS_PANE, Items.RED_STAINED_GLASS_PANE, Items.BLACK_STAINED_GLASS_PANE
        };

        for (Item StainedGlassPaneItem : StainedGlassPaneItems) {
            CONVERSION_MAP.put(new ItemStack(StainedGlassPaneItem), new ItemStack(Items.GREEN_STAINED_GLASS_PANE));
        }
    }
    private static void addAllBed() {
        Item[] BedItems = {
                Items.WHITE_BED, Items.ORANGE_BED, Items.MAGENTA_BED, Items.LIGHT_BLUE_BED, Items.YELLOW_BED,
                Items.LIME_BED, Items.PINK_BED, Items.GRAY_BED, Items.LIGHT_GRAY_BED, Items.CYAN_BED,
                Items.PURPLE_BED, Items.BLUE_BED, Items.BROWN_BED, Items.GREEN_BED, Items.RED_BED, Items.BLACK_BED
        };

        for (Item BedItem : BedItems) {
            CONVERSION_MAP.put(new ItemStack(BedItem), new ItemStack(Items.GREEN_BED));
        }
    }
    private static void addAllCandle() {
        Item[] CandleItems = {
                Items.WHITE_CANDLE, Items.ORANGE_CANDLE, Items.MAGENTA_CANDLE, Items.LIGHT_BLUE_CANDLE, Items.YELLOW_CANDLE,
                Items.LIME_CANDLE, Items.PINK_CANDLE, Items.GRAY_CANDLE, Items.LIGHT_GRAY_CANDLE, Items.CYAN_CANDLE,
                Items.PURPLE_CANDLE, Items.BLUE_CANDLE, Items.BROWN_CANDLE, Items.GREEN_CANDLE, Items.RED_CANDLE, Items.BLACK_CANDLE
        };

        for (Item CandleItem : CandleItems) {
            CONVERSION_MAP.put(new ItemStack(CandleItem), new ItemStack(Items.GREEN_CANDLE));
        }
    }

    public static void registerEvents() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (world.isClient()) {
                return ActionResult.PASS;
            }

            BlockHitResult blockHit = (BlockHitResult) hitResult;
            BlockPos blockPos = blockHit.getBlockPos();
            World serverWorld = player.getWorld();

            // Check if the clicked block is a poppy
            if (serverWorld.getBlockState(blockPos).getBlock() == ModBlocks.ANCIENT_BONSAI_FLOWER_BLOCK) {
                // Get the item the player is holding
                ItemStack stackInHand = player.getStackInHand(hand);

                // Iterate through available conversions
                ItemStack convertedStack = CONVERSION_MAP.entrySet().stream()
                        .filter(entry -> ItemStack.areItemsEqual(stackInHand, entry.getKey()))
                        .map(Map.Entry::getValue)
                        .findFirst()
                        .orElse(null);

                if (convertedStack != null) {
                    int availableAmount = stackInHand.getCount();
                    // Create a new stack with the same amount (up to 64)
                    int newAmount = Math.min(availableAmount, convertedStack.getMaxCount());
                    ItemStack resultStack = new ItemStack(convertedStack.getItem(), newAmount);

                    // Replace the item in hand with the converted item
                    player.setStackInHand(hand, resultStack);

                    return ActionResult.SUCCESS;
                }
            }

            return ActionResult.PASS;
        });
    }
}