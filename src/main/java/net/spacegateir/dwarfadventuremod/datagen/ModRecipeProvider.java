package net.spacegateir.dwarfadventuremod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.ModItems;
import net.spacegateir.dwarfadventuremod.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

import static net.spacegateir.dwarfadventuremod.block.ModBlocks.RAW_ADAMANTITE_PRESSURE_PLATE;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static List<ItemConvertible> DWARF_STEEL_SMELTABLES = List.of(
            ModItems.DWARF_STEEL_INGOT, ModItems.CLUMP_OF_DWARF_STEEL);

    private static List<ItemConvertible> AER_SMELTABLES = List.of(
            ModItems.AER_SPIRIT_INGOT, ModItems.CLUMP_OF_AER_SPIRITSTONE);

    private static List<ItemConvertible> IGNIS_SMELTABLES = List.of(
            ModItems.IGNIS_SPIRIT_INGOT, ModItems.CLUMP_OF_IGNIS_SPIRITSTONE);

    private static List<ItemConvertible> AQUA_SMELTABLES = List.of(
            ModItems.AQUA_SPIRIT_INGOT, ModItems.CLUMP_OF_AQUA_SPIRITSTONE);

    private static List<ItemConvertible> TERA_SMELTABLES = List.of(
            ModItems.TERA_SPIRIT_INGOT, ModItems.CLUMP_OF_TERA_SPIRITSTONE);

    private static List<ItemConvertible> MAGIRITE_SMELTABLES = List.of(
            ModItems.MAGIRITE_INGOT, ModItems.CLUMP_OF_MAGIRITE);

    private static List<ItemConvertible> MYTHRIL_SMELTABLES = List.of(
            ModItems.MYTHRIL);

    private static List<ItemConvertible> ADAMANTITE_SMELTABLES = List.of(
            ModItems.ADAMANTITE_INGOT, ModItems.CLUMP_OF_ADAMANTITE);

    private static List<ItemConvertible> ORIKALKUM_SMELTABLES = List.of(
            ModItems.ORIKALKUM_INGOT, ModItems.CLUMP_OF_ORIKALKUM);

    private static List<ItemConvertible> DRAGON_BANE_SMELTABLES = List.of(
            ModItems.DRAGON_BANE_INGOT, ModItems.CLUMP_OF_DRAGON_BANE);

    private static List<ItemConvertible> DWARF_GOLD_SMELTABLES = List.of(
            ModItems.DWARF_GOLD_INGOT, ModItems.CLUMP_OF_DWARF_GOLD);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }




    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, DWARF_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.HOT_INGOT,
                0.25f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, DWARF_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.HOT_INGOT,
                0.25f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, AQUA_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_AER,
                0.5f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, AER_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_AER,
                0.5f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, IGNIS_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_IGNIS,
                0.5f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, IGNIS_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_IGNIS,
                0.5f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, AQUA_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_AQUA,
                0.5f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, AQUA_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_AQUA,
                0.5f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, TERA_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_TERA,
                0.5f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, TERA_SMELTABLES, RecipeCategory.MISC, ModItems.FORGING_HOT_TERA,
                0.5f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, MAGIRITE_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_MAGIRITE_INGOT,
                0.75f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, MAGIRITE_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_MAGIRITE_INGOT,
                0.75f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.PUREFICATED_MYTHRIL,
                1f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.PUREFICATED_MYTHRIL,
                1f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_ADAMANTITE_INGOT,
                1.25f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_ADAMANTITE_INGOT,
                1.25f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, ORIKALKUM_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_ORIKALKUM_INGOT,
                1.5f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, ORIKALKUM_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_ORIKALKUM_INGOT,
                1.5f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, DRAGON_BANE_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_DRAGON_BANE_INGOT,
                1.75f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, DRAGON_BANE_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_DRAGON_BANE_INGOT,
                1.75f, 100, "dwarf_adventure");

        // Smelting recipe for Hot Ingot
        offerSmelting(exporter, DWARF_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_DWARF_GOLD_INGOT,
                2f, 200, "dwarf_adventure");
        // Blasting recipe for Hot Ingot
        offerBlasting(exporter, DWARF_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.MOLTEN_DWARF_GOLD_INGOT,
                2f, 100, "dwarf_adventure");














        // Empty Brasier
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EMPTY_BRASIER, 1)
                .pattern("SCS")
                .pattern("SSS")
                .pattern("G G")
                .input('C', ModItems.ANCESTRAL_FORGE_COAL)
                .input('S', ModItems.DWARF_STEEL_INGOT)
                .input('G', ModItems.RAW_DWARF_GOLD)
                .criterion(hasItem(ModItems.ANCESTRAL_FORGE_COAL), conditionsFromItem(ModItems.ANCESTRAL_FORGE_COAL))
                .criterion(hasItem(ModItems.DWARF_STEEL_INGOT), conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .criterion(hasItem(ModItems.RAW_DWARF_GOLD), conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EMPTY_BRASIER )));

        // Power Precision Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POWER_PRECISION_BLOCK, 1)
                .pattern("CIC")
                .pattern("CRC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.REPEATER)
                .input('R', Items.REDSTONE_BLOCK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.REPEATER), conditionsFromItem(Items.REPEATER))
                .criterion(hasItem(Items.REDSTONE_BLOCK), conditionsFromItem(Items.REDSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POWER_PRECISION_BLOCK )));

        // Cash Register
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CASH_REGISTER, 1)
                .pattern("III")
                .pattern("IRI")
                .pattern("SCS")
                .input('C', ModItems.DWARF_COPPER_COIN_M)
                .input('S', ModBlocks.DWARF_STEEL_BLOCK)
                .input('I', ModItems.DWARF_STEEL_NUGGET)
                .input('R', Items.REDSTONE_BLOCK)
                .criterion(hasItem(ModItems.DWARF_COPPER_COIN_S), conditionsFromItem(ModItems.DWARF_COPPER_COIN_S))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASH_REGISTER )));

        // Small Copper to Medium Copper Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_COPPER_COIN_M, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_COPPER_COIN_S)
                .criterion(hasItem(ModItems.DWARF_COPPER_COIN_S), conditionsFromItem(ModItems.DWARF_COPPER_COIN_S))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_COPPER_COIN_M)));

        // Medium Copper to Small Copper Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_COPPER_COIN_S,
                ModItems.DWARF_COPPER_COIN_M,
                "dwarf_coins",
                9
        );
        // Medium Copper to Large Copper Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_COPPER_COIN_L, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_COPPER_COIN_M)
                .criterion(hasItem(ModItems.DWARF_COPPER_COIN_M), conditionsFromItem(ModItems.DWARF_COPPER_COIN_M))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_COPPER_COIN_L)));

        // Large Copper to Medium Copper Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_COPPER_COIN_M,
                ModItems.DWARF_COPPER_COIN_L,
                "dwarf_coins",
                9
        );

        // Large Copper to Small Steel Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_COIN_S, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_COPPER_COIN_L)
                .criterion(hasItem(ModItems.DWARF_COPPER_COIN_L), conditionsFromItem(ModItems.DWARF_COPPER_COIN_M))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_COIN_S)));

        // Small Steel to Large Copper Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_COPPER_COIN_L,
                ModItems.DWARF_STEEL_COIN_S,
                "dwarf_coins",
                9
        );

        // Small Steel Coins to Medium Steel Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_COIN_M, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_STEEL_COIN_S)
                .criterion(hasItem(ModItems.DWARF_STEEL_COIN_S), conditionsFromItem(ModItems.DWARF_STEEL_COIN_S))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_COIN_M)));

        // Medium Steel to Small Steel Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_STEEL_COIN_S,
                ModItems.DWARF_STEEL_COIN_M,
                "dwarf_coins",
                9
        );

        // Medium Steel Coins to Large Steel Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_COIN_L, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_STEEL_COIN_M)
                .criterion(hasItem(ModItems.DWARF_STEEL_COIN_M), conditionsFromItem(ModItems.DWARF_STEEL_COIN_M))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_COIN_L)));

        // Large Steel to Medium Steel Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_STEEL_COIN_M,
                ModItems.DWARF_STEEL_COIN_L,
                "dwarf_coins",
                9
        );

        // Large Steel Coins to Small Gold Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_COIN_S, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_STEEL_COIN_L)
                .criterion(hasItem(ModItems.DWARF_STEEL_COIN_L), conditionsFromItem(ModItems.DWARF_STEEL_COIN_L))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_COIN_S)));

        // Small Gold to Large Steel Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_STEEL_COIN_L,
                ModItems.DWARF_GOLD_COIN_S,
                "dwarf_coins",
                9
        );

        // Small Gold to Medium Gold Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_COIN_M, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_GOLD_COIN_S)
                .criterion(hasItem(ModItems.DWARF_GOLD_COIN_S), conditionsFromItem(ModItems.DWARF_GOLD_COIN_S))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_COIN_M)));

        // Medium Gold to Small Gold Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_GOLD_COIN_S,
                ModItems.DWARF_GOLD_COIN_M,
                "dwarf_coins",
                9
        );

        // Medium Gold to Large Gold Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_COIN_L, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_GOLD_COIN_M)
                .criterion(hasItem(ModItems.DWARF_GOLD_COIN_M), conditionsFromItem(ModItems.DWARF_GOLD_COIN_M))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_COIN_L)));

        // Large Gold to Medium Gold Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_GOLD_COIN_M,
                ModItems.DWARF_GOLD_COIN_L,
                "dwarf_coins",
                9
        );

        // Large Gold to Large Mythril Coins
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_MYTHRIL_COIN_L, 1)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.DWARF_GOLD_COIN_L)
                .criterion(hasItem(ModItems.DWARF_GOLD_COIN_L), conditionsFromItem(ModItems.DWARF_GOLD_COIN_L))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_MYTHRIL_COIN_L)));

        // Large Mythril to Large Gold Coins
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_GOLD_COIN_L,
                ModItems.DWARF_MYTHRIL_COIN_L,
                "dwarf_coins",
                9
        );

        // Normal Flowers
        offerShapelessRecipe(
                exporter,
                Items.LIGHT_BLUE_DYE,
                ModBlocks.BLUE_COSMOS_FLOWER_BLOCK,
                "dye_recipes",
                1
        );
        offerShapelessRecipe(
                exporter,
                Items.WHITE_DYE,
                ModBlocks.SNOW_DROP_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.MAGENTA_DYE,
                ModBlocks.CARNATION_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.PURPLE_DYE,
                ModBlocks.VIOLET_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.PINK_DYE,
                ModBlocks.IRIS_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.YELLOW_DYE,
                ModBlocks.PRIMROSE_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.ORANGE_DYE,
                ModBlocks.DAFFODIL_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.BLUE_DYE,
                ModBlocks.DELPHINIUM_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.BROWN_DYE,
                ModBlocks.DAHLIA_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.LIME_DYE,
                ModBlocks.HYDRANGEA_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.BLACK_DYE,
                ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.LIGHT_GRAY_DYE,
                ModBlocks.HAWTHORN_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.GREEN_DYE,
                ModBlocks.BONSAI_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.RED_DYE,
                ModBlocks.SPIDERLILY_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.CYAN_DYE,
                ModBlocks.LARKSPUR_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        offerShapelessRecipe(
                exporter,
                Items.GRAY_DYE,
                ModBlocks.AGAPANTHUS_FLOWER_BLOCK,
                "dye_recipes",
                1
        );

        //Mutated Flowers

        offerShapelessRecipe(
                exporter,
                Items.LIGHT_BLUE_DYE,
                ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK,
                "dye_recipes",
                2
        );
        offerShapelessRecipe(
                exporter,
                Items.WHITE_DYE,
                ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.MAGENTA_DYE,
                ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.PURPLE_DYE,
                ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.PINK_DYE,
                ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.YELLOW_DYE,
                ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.ORANGE_DYE,
                ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.BLUE_DYE,
                ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.BROWN_DYE,
                ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.LIME_DYE,
                ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.BLACK_DYE,
                ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.LIGHT_GRAY_DYE,
                ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.GREEN_DYE,
                ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.RED_DYE,
                ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.CYAN_DYE,
                ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        offerShapelessRecipe(
                exporter,
                Items.GRAY_DYE,
                ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK,
                "dye_recipes",
                2
        );

        //Ancient Flowers

        offerShapelessRecipe(
                exporter,
                Items.LIGHT_BLUE_DYE,
                ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER_BLOCK,
                "dye_recipes",
                4
        );
        offerShapelessRecipe(
                exporter,
                Items.WHITE_DYE,
                ModBlocks.ANCIENT_SNOW_DROP_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.MAGENTA_DYE,
                ModBlocks.ANCIENT_CARNATION_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.PURPLE_DYE,
                ModBlocks.ANCIENT_VIOLET_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.PINK_DYE,
                ModBlocks.ANCIENT_IRIS_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.YELLOW_DYE,
                ModBlocks.ANCIENT_PRIMROSE_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.ORANGE_DYE,
                ModBlocks.ANCIENT_DAFFODIL_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.BLUE_DYE,
                ModBlocks.ANCIENT_DELPHINIUM_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.BROWN_DYE,
                ModBlocks.ANCIENT_DAHLIA_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.LIME_DYE,
                ModBlocks.ANCIENT_HYDRANGEA_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.BLACK_DYE,
                ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.LIGHT_GRAY_DYE,
                ModBlocks.ANCIENT_HAWTHORN_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.GREEN_DYE,
                ModBlocks.ANCIENT_BONSAI_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.RED_DYE,
                ModBlocks.ANCIENT_SPIDERLILY_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.CYAN_DYE,
                ModBlocks.ANCIENT_LARKSPUR_FLOWER_BLOCK,
                "dye_recipes",
                4
        );

        offerShapelessRecipe(
                exporter,
                Items.GRAY_DYE,
                ModBlocks.ANCIENT_AGAPANTHUS_FLOWER_BLOCK,
                "dye_recipes",
                4
        );


// Mutated Snow Drop Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.SNOW_DROP_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.SNOW_DROP_FLOWER_BLOCK), conditionsFromItem(ModBlocks.SNOW_DROP_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK)));
// Ancient Snow Drop Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_SNOW_DROP_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_SNOW_DROP_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_SNOW_DROP_FLOWER_BLOCK)));

// Mutated Carnation Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.CARNATION_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.CARNATION_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CARNATION_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK)));
// Ancient Carnation Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_CARNATION_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_CARNATION_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_CARNATION_FLOWER_BLOCK)));

// Mutated Violet Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.VIOLET_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.VIOLET_FLOWER_BLOCK), conditionsFromItem(ModBlocks.VIOLET_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK)));
// Ancient Violet Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_VIOLET_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_VIOLET_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_VIOLET_FLOWER_BLOCK)));

// Iris Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.IRIS_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.IRIS_FLOWER_BLOCK), conditionsFromItem(ModBlocks.IRIS_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK)));
// Ancient Iris Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_IRIS_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_IRIS_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_IRIS_FLOWER_BLOCK)));


// Mutated Primrose Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.PRIMROSE_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.PRIMROSE_FLOWER_BLOCK), conditionsFromItem(ModBlocks.PRIMROSE_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK)));
// Ancient Primrose Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_PRIMROSE_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_PRIMROSE_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_PRIMROSE_FLOWER_BLOCK)));

// Daffodil Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.DAFFODIL_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.DAFFODIL_FLOWER_BLOCK), conditionsFromItem(ModBlocks.DAFFODIL_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK)));
// Ancient Daffodil Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_DAFFODIL_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_DAFFODIL_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_DAFFODIL_FLOWER_BLOCK)));

// Mutated Dahlia Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.DAHLIA_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.DAHLIA_FLOWER_BLOCK), conditionsFromItem(ModBlocks.DAHLIA_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK)));
// Ancient Dahlia Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_DAHLIA_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_DAHLIA_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_DAHLIA_FLOWER_BLOCK)));

// Mutated Delphinium Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.DELPHINIUM_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.DELPHINIUM_FLOWER_BLOCK), conditionsFromItem(ModBlocks.DELPHINIUM_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK)));
// Ancient Delphinium Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_DELPHINIUM_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_DELPHINIUM_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_DELPHINIUM_FLOWER_BLOCK)));

// Mutated Hydrangea Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.HYDRANGEA_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.HYDRANGEA_FLOWER_BLOCK), conditionsFromItem(ModBlocks.HYDRANGEA_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK)));
// Ancient Hydrangea Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_HYDRANGEA_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_HYDRANGEA_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_HYDRANGEA_FLOWER_BLOCK)));

// Mutated Midnight Mystic Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK), conditionsFromItem(ModBlocks.MIDNIGHT_MYSTIC_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK)));
// Ancient Midnight Mystic Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK)));

// Mutated Hawthorn Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.HAWTHORN_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.HAWTHORN_FLOWER_BLOCK), conditionsFromItem(ModBlocks.HAWTHORN_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK)));
// Ancient Hawthorn Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_HAWTHORN_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_HAWTHORN_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_HAWTHORN_FLOWER_BLOCK)));

// Mutated Bonsai Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.BONSAI_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.BONSAI_FLOWER_BLOCK), conditionsFromItem(ModBlocks.BONSAI_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK)));
// Ancient Bonsai Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_BONSAI_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_BONSAI_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_BONSAI_FLOWER_BLOCK)));

// Mutated Spiderlily Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.SPIDERLILY_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.SPIDERLILY_FLOWER_BLOCK), conditionsFromItem(ModBlocks.SPIDERLILY_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK)));
// Ancient Spiderlily Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_SPIDERLILY_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_SPIDERLILY_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_SPIDERLILY_FLOWER_BLOCK)));

// Mutated Larkspur Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.LARKSPUR_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.LARKSPUR_FLOWER_BLOCK), conditionsFromItem(ModBlocks.LARKSPUR_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK)));
// Ancient Larkspur Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_LARKSPUR_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_LARKSPUR_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_LARKSPUR_FLOWER_BLOCK)));

// Mutated Agapanthus Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.AGAPANTHUS_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.AGAPANTHUS_FLOWER_BLOCK), conditionsFromItem(ModBlocks.AGAPANTHUS_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK)));
// Ancient Agapanthus Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_AGAPANTHUS_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_AGAPANTHUS_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_AGAPANTHUS_FLOWER_BLOCK)));

// Mutated Blue Cosmos Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK, 4)
                .pattern("FFF")
                .pattern("FGF")
                .pattern("FFF")
                .input('F', ModBlocks.BLUE_COSMOS_FLOWER_BLOCK)
                .input('G', ModItems.CORRUPT_GEM)
                .criterion(hasItem(ModBlocks.BLUE_COSMOS_FLOWER_BLOCK), conditionsFromItem(ModBlocks.BLUE_COSMOS_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.CORRUPT_GEM), conditionsFromItem(ModItems.CORRUPT_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK)));
// Ancient Blue Cosmos Flower
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER_BLOCK, 2)
                .pattern(" F ")
                .pattern("FGF")
                .pattern(" F ")
                .input('F', ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK)
                .input('G', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK), conditionsFromItem(ModBlocks.CORRUPT_BLUE_COSMOS_FLOWER_BLOCK))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER_BLOCK)));

//Tuff
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TUFF, 4)
                .pattern("CG")
                .pattern("GC")

                .input('C', Blocks.COBBLED_DEEPSLATE)
                .input('G', Blocks.GRAVEL)
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .criterion(hasItem(Blocks.GRAVEL), conditionsFromItem(Blocks.GRAVEL))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.TUFF)));
// Rooted Dirt
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.ROOTED_DIRT, 4)
                .pattern("DR")
                .pattern("RD")

                .input('D', Blocks.DIRT)
                .input('R', ModItems.GLIMMER_ROOT)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .criterion(hasItem(ModItems.GLIMMER_ROOT), conditionsFromItem(ModItems.GLIMMER_ROOT))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.ROOTED_DIRT)));
// Mud
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.MUD, 8)
                .pattern("DDD")
                .pattern("DWD")
                .pattern("DDD")

                .input('W', Items.WATER_BUCKET)
                .input('D', Blocks.DIRT)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.MUD)));

// Tinted Glass
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TINTED_GLASS, 2)
                .pattern(" M ")
                .pattern("MGM")
                .pattern(" M ")
                .input('M', ModItems.MYTHRIL) // Use Mythril as input
                .input('G', Blocks.GLASS) // Use Glass as input
                .criterion("has_gem", conditionsFromItem(ModItems.MYTHRIL))
                .criterion("has_block", conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.TINTED_GLASS)));


// Garden Bench
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GARDEN_BENCH, 1)
                .pattern("PPP")
                .pattern("BBR")
                .pattern("S S")
                .input('S', ItemTags.WOODEN_SLABS)
                .input('P', Items.FLOWER_POT)
                .input('B', Items.BLUE_WOOL)
                .input('R', Items.RED_WOOL)
                .criterion("has_slab", conditionsFromTag(ItemTags.WOODEN_SLABS))
                .criterion("has_flower_pot", conditionsFromItem(Items.FLOWER_POT))
                .criterion("has_blue_wool", conditionsFromItem(Items.BLUE_WOOL))
                .criterion("has_red_wool", conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GARDEN_BENCH)));

// Garden Pot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GARDEN_POT, 1)
                .pattern("P P")
                .pattern("WWW")
                .pattern("S S")
                .input('P', Items.FLOWER_POT)
                .input('W', ItemTags.PLANKS)
                .input('S', ItemTags.WOODEN_SLABS)
                .criterion("has_flower_pot", conditionsFromItem(Items.FLOWER_POT))
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion("has_slabs", conditionsFromTag(ItemTags.WOODEN_SLABS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GARDEN_POT)));

// Garden Potted pot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GARDEN_POTTED_POT, 1)
                .pattern("   ")
                .pattern("PDP")
                .pattern(" G ")
                .input('G', ModBlocks.GARDEN_POT)
                .input('D', Items.DECORATED_POT)
                .input('P', Items.FLOWER_POT)
                .criterion("has_garden_pot", conditionsFromItem(ModBlocks.GARDEN_POT))
                .criterion("has_decorated_pot", conditionsFromItem(Items.DECORATED_POT))
                .criterion("has_flower_pot", conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GARDEN_POTTED_POT)));

// Dwarf Forge
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_FORGE, 1)
                .pattern("OOO")
                .pattern("OFO")
                .pattern("OOO")
                .input('O', Blocks.OBSIDIAN)
                .input('F', ModItems.ANCESTRAL_FORGE_COAL)
                .criterion("has_obsidian", conditionsFromItem(Blocks.OBSIDIAN))
                .criterion("has_ancestral_forge_coal", conditionsFromItem(ModItems.ANCESTRAL_FORGE_COAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_FORGE)));

// Dwarf Bellows
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_BELLOWS, 1)
                .pattern("OIO")
                .pattern("OSO")
                .pattern("OWO")
                .input('O', ItemTags.LOGS)
                .input('S', Items.STRING)
                .input('W', ItemTags.WOOL)
                .input('I', ModItems.DWARF_STEEL_INGOT)
                .criterion("has_log", conditionsFromTag(ItemTags.LOGS))
                .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                .criterion("has_string", conditionsFromItem(Items.STRING))
                .criterion("has_dwarf_steel_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_BELLOWS)));

// Weapons Rack
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WEAPON_RACK, 1)
                .pattern("SSS")
                .pattern("P P")
                .pattern("PPP")
                .input('P', ItemTags.PLANKS)
                .input('S', Items.IRON_SWORD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion("has_iron_sword", conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WEAPON_RACK)));

// Tool Rack
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TOOL_RACK, 1)
                .pattern("OPO")
                .pattern("OAO")
                .pattern("OSO")
                .input('O', ItemTags.PLANKS)
                .input('P', Items.IRON_PICKAXE)
                .input('A', Items.IRON_AXE)
                .input('S', Items.IRON_SHOVEL)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion("has_iron_pickaxe", conditionsFromItem(Items.IRON_PICKAXE))
                .criterion("has_iron_axe", conditionsFromItem(Items.IRON_AXE))
                .criterion("has_iron_shovel", conditionsFromItem(Items.IRON_SHOVEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TOOL_RACK)));

// Storage Create
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STORAGE_CREATE, 1)
                .pattern("OOO")
                .pattern("OSO")
                .pattern("OLO")
                .input('O', ItemTags.PLANKS)
                .input('S', ModBlocks.STORAGE_CREATE_SMALL)
                .input('L', ModBlocks.STORAGE_CREATE_LARGE)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion("has_storage_create_small", conditionsFromItem(ModBlocks.STORAGE_CREATE_SMALL))
                .criterion("has_storage_create_large", conditionsFromItem(ModBlocks.STORAGE_CREATE_LARGE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STORAGE_CREATE)));

// Storage Create Small
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STORAGE_CREATE_SMALL, 1)
                .pattern("OCO")
                .pattern("OOO")
                .input('O', ItemTags.PLANKS)
                .input('C', Items.CHEST)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion("has_chest", conditionsFromItem(Items.CHEST))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STORAGE_CREATE_SMALL)));

// Storage Create Large
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STORAGE_CREATE_LARGE, 1)
                .pattern("OOO")
                .pattern("OCO")
                .pattern("OOO")
                .input('O', ItemTags.PLANKS)
                .input('C', Items.CHEST)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion("has_chest", conditionsFromItem(Items.CHEST))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STORAGE_CREATE_LARGE)));

// Storage Create Double
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STORAGE_CREATE_DOUBLE, 1)
                .pattern("S")
                .pattern("S")
                .input('S', ModBlocks.STORAGE_CREATE_LARGE)
                .criterion("has_storage_create_large", conditionsFromItem(ModBlocks.STORAGE_CREATE_LARGE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STORAGE_CREATE_DOUBLE)));

// Dwarf Anvil
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_ANVIL, 1)
                .pattern(" A ")
                .pattern("RRR")
                .pattern("RLR")
                .input('A', ModBlocks.DWARF_ANVIL_GROUND)
                .input('R', ItemTags.WOOL)
                .input('L', ItemTags.LOGS)
                .criterion("has_dwarf_anvil_ground", conditionsFromItem(ModBlocks.DWARF_ANVIL_GROUND))
                .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                .criterion("has_logs", conditionsFromTag(ItemTags.LOGS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_ANVIL)));

// Dwarf Anvil Ground
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_ANVIL_GROUND, 1)
                .pattern("SSS")
                .pattern(" I ")
                .pattern("III")
                .input('S', ModBlocks.DWARF_STEEL_BLOCK)
                .input('I', ModItems.DWARF_STEEL_INGOT)
                .criterion("has_block", conditionsFromItem(ModBlocks.DWARF_STEEL_BLOCK))
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_ANVIL_GROUND)));

// Dwarf Anvil Over
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_ANVIL_OVER, 1)
                .pattern(" A ")
                .input('A', ModBlocks.DWARF_ANVIL_GROUND)
                .criterion("has_block", conditionsFromItem(ModBlocks.DWARF_ANVIL_GROUND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_ANVIL_OVER)));

// Dwarf Anvil Over Get Back
        offerShapelessRecipe(
                exporter,
                ModBlocks.DWARF_ANVIL_GROUND,
                ModBlocks.DWARF_ANVIL_OVER,
                "dwarf_recipe",
                1
        );

// Dwarf Anvil Stack
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_ANVIL_STACK, 1)
                .pattern(" I ")
                .pattern(" I ")
                .input('I', ModBlocks.DWARF_ANVIL_GROUND)
                .criterion("has_block", conditionsFromItem(ModBlocks.DWARF_ANVIL_GROUND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_ANVIL_STACK)));

// Dwarf Anvil Stack Get Back
        offerShapelessRecipe(
                exporter,
                ModBlocks.DWARF_ANVIL_GROUND,
                ModBlocks.DWARF_ANVIL_STACK,
                "dwarf_recipe",
                2
        );

// Dwarf Anvil Turn
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_ANVIL_TURN, 1)
                .pattern("A  ")
                .input('A', ModBlocks.DWARF_ANVIL_GROUND)
                .criterion("has_block", conditionsFromItem(ModBlocks.DWARF_ANVIL_GROUND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_ANVIL_TURN)));

// Dwarf Anvil Turn Get Back
        offerShapelessRecipe(
                exporter,
                ModBlocks.DWARF_ANVIL_GROUND,
                ModBlocks.DWARF_ANVIL_TURN,
                "dwarf_recipe",
                1
        );

// Mortar and Pestle
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MORTAR_AND_PESTLE, 1)
                .pattern("  D")
                .pattern("DDD")
                .pattern(" D ")
                .input('D', Items.DEEPSLATE)
                .criterion("has_deepslate", conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MORTAR_AND_PESTLE)));

// Ancestral Forged Coal
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANCESTRAL_FORGE_COAL, 1)
                .pattern("CCC")
                .pattern("CFC")
                .pattern("CCC")
                .input('C', Items.COAL)
                .input('F', ModItems.FIRE_GEM)
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_fire_gem", conditionsFromItem(ModItems.FIRE_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCESTRAL_FORGE_COAL)));

// Enhanced Golem Core
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENHNACED_GOLEM_CORE, 1)
                .pattern(" M ")
                .pattern("GCG")
                .pattern("OGO")
                .input('M', ModItems.PUREFICATED_MYTHRIL)
                .input('G', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('C', ModItems.GOLEM_CORE)
                .input('O', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .criterion("has_pureficated_mythril", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_molten_dwarf_gold_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_golem_core", conditionsFromItem(ModItems.GOLEM_CORE))
                .criterion("has_molten_orikalkum_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENHNACED_GOLEM_CORE)));

// Handel Part
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HANDLE_PART, 1)
                .pattern("  B")
                .pattern(" B ")
                .pattern("L  ")
                .input('B', ModItems.ANCIENT_BRANCH) // Use Ancient Branch as input
                .input('L', Items.LEATHER) // Use Leather as input
                .criterion("has_ancient_branch", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .criterion("has_leather", conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANDLE_PART)));

        // Hot Dwarf pickaxe head Part
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOT_DWARF_PICKAXE_HEAD, 1)
                .pattern("II ")
                .pattern("  I")
                .pattern("  I")
                .input('I', ModItems.HOT_INGOT) // Use Hot Ingot as input
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOT_DWARF_PICKAXE_HEAD)));

        // HearthStone 0f Borrum
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HEARTHSTONE_OF_BORRUM, 1)
                .pattern("AGW")
                .pattern("FJE")
                .pattern("GGG")
                .input('G', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('J', ModItems.ELEMENTAL_GEM)
                .input('A', ModItems.AER_SPIRIT_INGOT)
                .input('W', ModItems.AQUA_SPIRIT_INGOT)
                .input('F', ModItems.IGNIS_SPIRIT_INGOT)
                .input('E', ModItems.TERA_SPIRIT_INGOT)
                .criterion("has_molten_dwarf_gold_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_elemental_gem", conditionsFromItem(ModItems.ELEMENTAL_GEM))
                .criterion("has_aer_Spirit_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .criterion("has_aqua_Spirit_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .criterion("has_ignis_Spirit_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .criterion("has_tera_Spirit_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HEARTHSTONE_OF_BORRUM)));

// Arcane Powder
// Loop to create recipes for 1 to 8 Ancient Flowers
        for (int i = 1; i <= 8; i++) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARCANE_POWDER, i)  // Output: Arcane Powder, count i (same as number of flowers used)
                    .input(Ingredient.ofItems(ModItems.MORTAR_AND_PESTLE))  // Input: Mortar and Pestle (not consumed)
                    .input(Ingredient.fromTag(ModItemTagProvider.ModTags.Items.ANCIENT_FLOWER), i)  // Input: i Ancient Flowers
                    .criterion("has_mortar_and_pestle", RecipeProvider.conditionsFromItem(ModItems.MORTAR_AND_PESTLE))  // Recipe unlock condition for Mortar and Pestle
                    .criterion("has_ancient_flower", RecipeProvider.conditionsFromTag(ModItemTagProvider.ModTags.Items.ANCIENT_FLOWER))  // Unlock condition for Ancient Flower tag
                    .offerTo(exporter, new Identifier("dwarfadventuremod", "arcane_powder_from_ancient_flower_" + i));  // Unique recipe ID for each number of flowers
        }

        // LVL 1 Dwarf Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LVL1_DWARF_PICKAXE, 1)
                .pattern("DID")
                .pattern(" H ")
                .pattern(" H ")
                .input('D', ModItems.DWARF_STEEL_PICKAXE_HEAD) // Use Dwarf Steel Pickaxe Head as input
                .input('I', ModItems.HOT_INGOT) // Use Hot Ingot as input
                .input('H', ModItems.HANDLE_PART) // Use Handle Part as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_PICKAXE_HEAD))
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LVL1_DWARF_PICKAXE)));

        // LVL 2 Dwarf Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LVL2_DWARF_PICKAXE, 1)
                .pattern("AGW")
                .pattern("FPE")
                .pattern(" H ")
                .input('A', ModItems.AER_SPIRIT_INGOT)
                .input('W', ModItems.AQUA_SPIRIT_INGOT)
                .input('F', ModItems.IGNIS_SPIRIT_INGOT)
                .input('E', ModItems.TERA_SPIRIT_INGOT)
                .input('G', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('P', ModItems.LVL1_DWARF_PICKAXE)
                .input('H', ModItems.HEARTHSTONE_OF_BORRUM)
                .criterion("has_pickaxe", conditionsFromItem(ModItems.LVL1_DWARF_PICKAXE))
                .criterion("has_aer_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .criterion("has_ignis_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .criterion("has_aqua_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .criterion("has_tera_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .criterion("has_molten_dwarf_gold_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_hearthstone_of_burrum", conditionsFromItem(ModItems.HEARTHSTONE_OF_BORRUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LVL2_DWARF_PICKAXE)));

        // LVL 3 Dwarf Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LVL3_DWARF_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" P ")
                .pattern(" W ")
                .input('M', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('P', ModItems.LVL2_DWARF_PICKAXE)
                .input('W', ModItems.WITHER_BONE)
                .criterion("has_pickaxe", conditionsFromItem(ModItems.LVL2_DWARF_PICKAXE))
                .criterion("has_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_wither_bone", conditionsFromItem(ModItems.WITHER_BONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LVL3_DWARF_PICKAXE)));

        // LVL 4 Dwarf Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LVL4_DWARF_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" P ")
                .pattern(" W ")
                .input('M', ModItems.PUREFICATED_MYTHRIL)
                .input('P', ModItems.LVL3_DWARF_PICKAXE)
                .input('W', ModItems.WARDEN_HIDE)
                .criterion("has_pickaxe", conditionsFromItem(ModItems.LVL3_DWARF_PICKAXE))
                .criterion("has_gem", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_warden_hide", conditionsFromItem(ModItems.WARDEN_HIDE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LVL4_DWARF_PICKAXE)));

        // LVL 5 Dwarf Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LVL5_DWARF_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" P ")
                .pattern(" W ")
                .input('M', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('P', ModItems.LVL4_DWARF_PICKAXE)
                .input('W', ModItems.THALORUNS_SOULSTONE)
                .criterion("has_pickaxe", conditionsFromItem(ModItems.LVL4_DWARF_PICKAXE))
                .criterion("has_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_thaloruns_soulstone", conditionsFromItem(ModItems.THALORUNS_SOULSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LVL5_DWARF_PICKAXE)));

        // LVL 6 Dwarf Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LVL6_DWARF_PICKAXE, 1)
                .pattern("MGM")
                .pattern("MPM")
                .pattern(" E ")
                .input('M', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('G', ModItems.ELEMENTAL_GEM)
                .input('P', ModItems.LVL5_DWARF_PICKAXE)
                .input('E', ModItems.ENHNACED_GOLEM_CORE)
                .criterion("has_pickaxe", conditionsFromItem(ModItems.LVL5_DWARF_PICKAXE))
                .criterion("has_gem", conditionsFromItem(ModItems.ELEMENTAL_GEM))
                .criterion("has_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_enhanced_golem_core", conditionsFromItem(ModItems.ENHNACED_GOLEM_CORE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LVL6_DWARF_PICKAXE)));

        // God Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOD_SWORD, 1)
                .pattern("B  ")
                .pattern(" H ")
                .pattern(" NG")
                .input('B', ModItems.GOD_SWORD_BLADE)
                .input('H', ModItems.GOD_SWORD_HILT)
                .input('N', ModItems.GOD_SWORD_HANDLE)
                .input('G', ModItems.GOD_SWORD_GEM)
                .criterion("has_god_sword_blade", conditionsFromItem(ModItems.GOD_SWORD_BLADE))
                .criterion("has_god_sword_hilt", conditionsFromItem(ModItems.GOD_SWORD_HILT))
                .criterion("has_god_sword_handle", conditionsFromItem(ModItems.GOD_SWORD_HANDLE))
                .criterion("has_god_sword_gem", conditionsFromItem(ModItems.GOD_SWORD_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOD_SWORD)));


        // Clump of Raw Iron Steel recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_DWARF_STEEL, 1)
                .pattern("ACA")
                .pattern("CIC")
                .pattern("ACA")
                .input('C', Items.COAL) // Use Coal as input
                .input('I', Items.IRON_INGOT) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_DWARF_STEEL) + "_iron"));

        // Clump of Raw Dwarf Steel recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_DWARF_STEEL, 1)
                .pattern("ACA")
                .pattern("CRC")
                .pattern("ACA")
                .input('C', Items.COAL) // Use Coal as input
                .input('R', ModItems.RAW_DWARF_STEEL) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_DWARF_STEEL) + "_steel"));

        // Clump of Aer Spirit Stone
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_AER_SPIRITSTONE, 1)
                .pattern("AAA")
                .pattern("RGR")
                .pattern("AAA")
                .input('G', ModItems.RAW_DWARF_GOLD) // Use Coal as input
                .input('R', ModItems.WIND_GEM) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_aer_spiritstone", conditionsFromItem(ModItems.WIND_GEM))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_AER_SPIRITSTONE)));

        // Clump of Ignis Spirit Stone
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_IGNIS_SPIRITSTONE, 1)
                .pattern("AAA")
                .pattern("RGR")
                .pattern("AAA")
                .input('G', ModItems.RAW_DWARF_GOLD)
                .input('R', ModItems.FIRE_GEM) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_ignis_spiritstone", conditionsFromItem(ModItems.FIRE_GEM))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_IGNIS_SPIRITSTONE)));

        // Clump of Aqua Spirit Stone
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_AQUA_SPIRITSTONE, 1)
                .pattern("AAA")
                .pattern("RGR")
                .pattern("AAA")
                .input('G', ModItems.RAW_DWARF_GOLD)
                .input('R', ModItems.WATER_GEM) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_aqua_spiritstone", conditionsFromItem(ModItems.WATER_GEM))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_AQUA_SPIRITSTONE)));

        // Clump of Tera Spirit Stone
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_TERA_SPIRITSTONE, 1)
                .pattern("AAA")
                .pattern("RGR")
                .pattern("AAA")
                .input('G', ModItems.RAW_DWARF_GOLD)
                .input('R', ModItems.EARTH_GEM) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_tera_spiritstone", conditionsFromItem(ModItems.EARTH_GEM))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_TERA_SPIRITSTONE)));

        // Clump of Magirite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_MAGIRITE, 1)
                .pattern("ACA")
                .pattern("CRC")
                .pattern("ACA")
                .input('C', Items.COAL) // Use Coal as input
                .input('R', ModItems.RAW_MAGIRITE) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_raw_magirite", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_MAGIRITE)));

        // Clump of Adamantite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_ADAMANTITE, 1)
                .pattern("ACA")
                .pattern("CRC")
                .pattern("ACA")
                .input('C', ModItems.ANCESTRAL_FORGE_COAL)
                .input('R', ModItems.RAW_ADAMANTITE) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_ancestral_forge_coal", conditionsFromItem(ModItems.ANCESTRAL_FORGE_COAL))
                .criterion("has_raw_adamantite", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_ADAMANTITE)));

        // Clump of Orikalkum
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_ORIKALKUM, 1)
                .pattern("ACA")
                .pattern("CRC")
                .pattern("ACA")
                .input('C', ModItems.ANCESTRAL_FORGE_COAL)
                .input('R', ModItems.RAW_ORIKALKUM) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_ancestral_forge_coal", conditionsFromItem(ModItems.ANCESTRAL_FORGE_COAL))
                .criterion("has_raw_orikalkum", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_ORIKALKUM)));

        // Clump of Dragon Bane
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_DRAGON_BANE, 1)
                .pattern("ACA")
                .pattern("CRC")
                .pattern("ACA")
                .input('C', ModItems.ANCESTRAL_FORGE_COAL)
                .input('R', ModItems.RAW_DRAGON_BANE) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_ancestral_forge_coal", conditionsFromItem(ModItems.ANCESTRAL_FORGE_COAL))
                .criterion("has_raw_dragon_bane", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_DRAGON_BANE)));


        // Clump of Dwarf Gold
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_DWARF_GOLD, 1)
                .pattern("ACA")
                .pattern("CIC")
                .pattern("ACA")
                .input('C', Items.COAL) // Use Coal as input
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_coal", conditionsFromItem(Items.COAL))
                .criterion("has_dwarf_gold", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_DWARF_GOLD) + "_dwarf"));

        // Clump of Dwarf Gold
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLUMP_OF_DWARF_GOLD, 1)
                .pattern("ACA")
                .pattern("CRC")
                .pattern("ACA")
                .input('C', ModItems.ANCESTRAL_FORGE_COAL) // Use Coal as input
                .input('R', Items.RAW_GOLD) // Use Iron Ingot as input
                .input('A', ModItems.ARCANE_POWDER) // Use Arcane Powder as input
                .criterion("has_ancestral_forge_coal", conditionsFromItem(ModItems.ANCESTRAL_FORGE_COAL))
                .criterion("has_raw_gold", conditionsFromItem(Items.RAW_GOLD))
                .criterion("has_arcane_powder", conditionsFromItem(ModItems.ARCANE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLUMP_OF_DWARF_GOLD) + "_gold"));

        // Elemental Gem Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEMENTAL_GEM, 1)
                .pattern(" F ")
                .pattern("WDO")
                .pattern(" E ")
                .input('D', Items.DIAMOND) // Use Dwarf Steel Ingot as input
                .input('W', ModItems.WIND_GEM) // Use Dwarf Steel Ingot as input
                .input('F', ModItems.FIRE_GEM) // Use Dwarf Steel Ingot as input
                .input('O', ModItems.WATER_GEM) // Use Dwarf Steel Ingot as input
                .input('E', ModItems.EARTH_GEM) // Use Dwarf Steel Ingot as input
                .criterion("has_wind", conditionsFromItem(ModItems.WIND_GEM))
                .criterion("has_fire", conditionsFromItem(ModItems.FIRE_GEM))
                .criterion("has_water", conditionsFromItem(ModItems.WATER_GEM))
                .criterion("has_earth", conditionsFromItem(ModItems.EARTH_GEM))
                .criterion("has_gem", conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ELEMENTAL_GEM)));

        // Elemental Gem Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_BLOCK, 1)
                .pattern(" F ")
                .pattern("WDO")
                .pattern(" E ")
                .input('D', Blocks.DIAMOND_BLOCK)
                .input('W', ModBlocks.WIND_GEM_BLOCK)
                .input('F', ModBlocks.FIRE_GEM_BLOCK)
                .input('O', ModBlocks.WATER_GEM_BLOCK)
                .input('E', ModBlocks.EARTH_GEM_BLOCK)
                .criterion("has_wind_gem_block", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .criterion("has_fire_gem_block", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .criterion("has_water_gem_block", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .criterion("has_earth_gem_block", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .criterion("has_diamond_block", conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_BLOCK) + "_block"));

        // Raw Dwarf Steel to Raw Dwarf Steel Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_BLOCK, 1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Nugget as input
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_BLOCK)));

        // Dwarf Steel Ingot to Dwarf Steel Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_BLOCK, 1)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_BLOCK)));

        // Wind Gem to Wind Gem Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_BLOCK, 1)
                .pattern("WW")
                .pattern("WW")
                .input('W', ModItems.WIND_GEM) // Use Dwarf Steel Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.WIND_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_BLOCK)));

        // Aer Ingot to Aer Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_BLOCK, 1)
                .pattern("WW")
                .pattern("WW")
                .input('W', ModItems.AER_SPIRIT_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_BLOCK)));

        // Fire Gem to Fire Gem Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_BLOCK, 1)
                .pattern("FF")
                .pattern("FF")
                .input('F', ModItems.FIRE_GEM) // Use Dwarf Steel Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.FIRE_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_BLOCK)));


        // Ignis Ingot to Ignis Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_BLOCK, 1)
                .pattern("WW")
                .pattern("WW")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_BLOCK)));

        // Water Gem to Water Gem Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_BLOCK, 1)
                .pattern("WW")
                .pattern("WW")
                .input('W', ModItems.WATER_GEM) // Use Dwarf Steel Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.WATER_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_BLOCK)));

        // Aqua Ingot to Aqua Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_BLOCK, 1)
                .pattern("WW")
                .pattern("WW")
                .input('W', ModItems.AQUA_SPIRIT_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_BLOCK)));

        // Earth Gem to Earth Gem Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_BLOCK, 1)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModItems.EARTH_GEM) // Use Dwarf Steel Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.EARTH_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_BLOCK)));

        // Tera Ingot to Tera Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_BLOCK, 1)
                .pattern("WW")
                .pattern("WW")
                .input('W', ModItems.TERA_SPIRIT_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_BLOCK)));

        // Elemental Gem to Elemental Gem Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_BLOCK, 1)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModItems.ELEMENTAL_GEM)
                .criterion("has_gem", conditionsFromItem(ModItems.ELEMENTAL_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_BLOCK) + "_gem"));

        // Raw Magirite to Raw Magirite Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.RAW_MAGIRITE)
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_BLOCK)));

        // Magirite to Magirite Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.MAGIRITE_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_BLOCK)));

        // Mythril to Mythril Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_BLOCK, 1)
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModItems.MYTHRIL) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_BLOCK)));

        // Pureficated Mythril to Pureficated Mythril Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_BLOCK, 1)
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_BLOCK)));

        // Raw Adamantite to Raw Adamantite Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.RAW_ADAMANTITE)
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_BLOCK)));

        // Adamantite to Adamantite Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.ADAMANTITE_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_BLOCK)));

        // Raw Orikalkum to Raw Orikalkum Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.RAW_ORIKALKUM)
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_BLOCK)));

        // Orikalkum to Orikalkum Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.ORIKALKUM_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_BLOCK)));

        // Raw Dragon Bane to Raw Dragon Bane Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.RAW_DRAGON_BANE)
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_BLOCK)));

        // Dragon Bane to Dragon Bane Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.DRAGON_BANE_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_BLOCK)));

        // Raw Dwarf Gold to Raw Dwarf Gold Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.RAW_DWARF_GOLD)
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_BLOCK)));

        // Dwarf Gold to Dwarf Gold Block Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_BLOCK, 1)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.DWARF_GOLD_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_BLOCK)));



        // Raw Dwarf Steel Block to Raw Dwarf Steel Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.RAW_DWARF_STEEL,
                ModBlocks.RAW_DWARF_STEEL_BLOCK,
                "dwarf_adventure",
                9);

        // Dwarf Steel Block to Dwarf Steel Ingot Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_STEEL_INGOT,
                ModBlocks.DWARF_STEEL_BLOCK,
                "dwarf_adventure",
                9
        );

        // Wind Gem Block to Wind Gem
        offerShapelessRecipe(
                exporter,
                ModItems.WIND_GEM,
                ModBlocks.WIND_GEM_BLOCK,
                "Dwarf_Adventure",
                4);

        // Aer Gem Block to Aer Gem
        offerShapelessRecipe(
                exporter,
                ModItems.AER_SPIRIT_INGOT,
                ModBlocks.AER_BLOCK,
                "Dwarf_Adventure",
                4);

        // Fire Gem Block to Fire Gem
        offerShapelessRecipe(
                exporter,
                ModItems.FIRE_GEM,
                ModBlocks.FIRE_GEM_BLOCK,
                "Dwarf_Adventure",
                4);

        // Ignis Gem Block to Ignis Gem
        offerShapelessRecipe(
                exporter,
                ModItems.IGNIS_SPIRIT_INGOT,
                ModBlocks.IGNIS_BLOCK,
                "Dwarf_Adventure",
                4);

        // Water Gem Block to Water Gem
        offerShapelessRecipe(
                exporter,
                ModItems.WATER_GEM,
                ModBlocks.WATER_GEM_BLOCK,
                "Dwarf_Adventure",
                4);

        // Aqua Gem Block to Aqua Gem
        offerShapelessRecipe(
                exporter,
                ModItems.AQUA_SPIRIT_INGOT,
                ModBlocks.AQUA_BLOCK,
                "Dwarf_Adventure",
                4);

        // Earth Gem Block to Earth Gem
        offerShapelessRecipe(
                exporter,
                ModItems.EARTH_GEM,
                ModBlocks.EARTH_GEM_BLOCK,
                "Dwarf_Adventure",
                4);

        // Tera Gem Block to Tera Gem
        offerShapelessRecipe(
                exporter,
                ModItems.TERA_SPIRIT_INGOT,
                ModBlocks.TERA_BLOCK,
                "Dwarf_Adventure",
                4);

        // Elemental Gem Block to Elemental Gem
        offerShapelessRecipe(
                exporter,
                ModItems.ELEMENTAL_GEM,
                ModBlocks.ELEMENTAL_GEM_BLOCK,
                "Dwarf_Adventure",
                4);

        // Raw Magirite Block to Raw Magirite
        offerShapelessRecipe(
                exporter,
                ModItems.RAW_MAGIRITE,
                ModBlocks.RAW_MAGIRITE_BLOCK,
                "dwarf_adventure",
                9);

        // Magirite Block to Magirite
        offerShapelessRecipe(
                exporter,
                ModItems.MAGIRITE_INGOT,
                ModBlocks.MAGIRITE_BLOCK,
                "dwarf_adventure",
                9);

        // Mythril Block to Mythril
        offerShapelessRecipe(
                exporter,
                ModItems.MYTHRIL,
                ModBlocks.MYTHRIL_BLOCK,
                "Dwarf_Adventure",
                9);

        // Purificated Mythril Block to Purificated Mythril
        offerShapelessRecipe(
                exporter,
                ModItems.PUREFICATED_MYTHRIL,
                ModBlocks.PUREFICATED_MYTHRIL_BLOCK,
                "Dwarf_Adventure",
                9);

        // Raw Adamanitie Block to Raw Adamantite
        offerShapelessRecipe(
                exporter,
                ModItems.RAW_ADAMANTITE,
                ModBlocks.RAW_ADAMANTITE_BLOCK,
                "dwarf_adventure",
                9);

        // Adamanitie Block to Adamanitie
        offerShapelessRecipe(
                exporter,
                ModItems.ADAMANTITE_INGOT,
                ModBlocks.ADAMANTITE_BLOCK,
                "dwarf_adventure",
                9);

        // Raw Orikalkum Block to Raw Orikalkum
        offerShapelessRecipe(
                exporter,
                ModItems.RAW_ORIKALKUM,
                ModBlocks.RAW_ORIKALKUM_BLOCK,
                "dwarf_adventure",
                9);

        // Orikalkum Block to Orikalkum
        offerShapelessRecipe(
                exporter,
                ModItems.ORIKALKUM_INGOT,
                ModBlocks.ORIKALKUM_BLOCK,
                "dwarf_adventure",
                9);

        // Raw Dragon Bane Block to Raw Dragon Bane
        offerShapelessRecipe(
                exporter,
                ModItems.RAW_DRAGON_BANE,
                ModBlocks.RAW_DRAGON_BANE_BLOCK,
                "dwarf_adventure",
                9);

        // Dragon Bane Block to Dragon Bane
        offerShapelessRecipe(
                exporter,
                ModItems.DRAGON_BANE_INGOT,
                ModBlocks.DRAGON_BANE_BLOCK,
                "dwarf_adventure",
                9);

        // Raw Dwarf Gold Block to Raw Dwarf Gold
        offerShapelessRecipe(
                exporter,
                ModItems.RAW_DWARF_GOLD,
                ModBlocks.RAW_DWARF_GOLD_BLOCK,
                "dwarf_adventure",
                9);

        // Dwarf Gold Block to Dwarf Gold
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_GOLD_INGOT,
                ModBlocks.DWARF_GOLD_BLOCK,
                "dwarf_adventure",
                9);

        // Dwarf Steel Nugget to Dwarf Steel Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.DWARF_STEEL_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.DWARF_STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_INGOT)));

        // Aer Nugget to Aer Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_SPIRIT_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.AER_SPIRIT_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.AER_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_SPIRIT_INGOT)));

        // Ignis Nugget to Ignis Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_SPIRIT_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.IGNIS_SPIRIT_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.IGNIS_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_SPIRIT_INGOT)));

        // Aqua Nugget to Aqua Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_SPIRIT_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.AQUA_SPIRIT_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.AQUA_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_SPIRIT_INGOT)));

        // Tera Nugget to Tera Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_SPIRIT_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.TERA_SPIRIT_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.TERA_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_SPIRIT_INGOT)));

        // Magirite Nugget to Magirite Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.MAGIRITE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.MAGIRITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_INGOT)));

        // Adamantite Nugget to Adamantite Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.ADAMANTITE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.ADAMANTITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_INGOT)));

        // Orikalkum Nugget to Orikalkum Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.ORIKALKUM_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.ORIKALKUM_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_INGOT)));

        // Dragon Bane Nugget to Dragon Bane Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.DRAGON_BANE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.DRAGON_BANE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_INGOT)));

        // Dwarf Gold Nugget to Dwarf Gold Ingot Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_INGOT, 1)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.DWARF_GOLD_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_nugget", conditionsFromItem(ModItems.DWARF_GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_INGOT)));

        // Dwarf Steel Ingot to Dwarf Steel Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_STEEL_NUGGET,
                ModItems.DWARF_STEEL_INGOT,
                "dwarf_adventure",
                9
        );

        // Aer Ingot to Aer Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.AER_SPIRIT_NUGGET,
                ModItems.AER_SPIRIT_INGOT,
                "dwarf_adventure",
                9
        );

        // Ignis Ingot to Ignis Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.IGNIS_SPIRIT_NUGGET,
                ModItems.IGNIS_SPIRIT_INGOT,
                "dwarf_adventure",
                9
        );

        // Aqua Ingot to Aqua Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.AQUA_SPIRIT_NUGGET,
                ModItems.AQUA_SPIRIT_INGOT,
                "dwarf_adventure",
                9
        );

        // Tera Ingot to Tear Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.TERA_SPIRIT_NUGGET,
                ModItems.TERA_SPIRIT_INGOT,
                "dwarf_adventure",
                9
        );

        // Magirite Ingot to Magirite Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.MAGIRITE_NUGGET,
                ModItems.MAGIRITE_INGOT,
                "dwarf_adventure",
                9
        );

        // Adamantite Ingot to Adamantite Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.ADAMANTITE_NUGGET,
                ModItems.ADAMANTITE_INGOT,
                "dwarf_adventure",
                9
        );

        // Orikalkum Ingot to Orikalkum Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.ORIKALKUM_NUGGET,
                ModItems.ORIKALKUM_INGOT,
                "dwarf_adventure",
                9
        );

        // Dragon Bane Ingot to Dragon Bane Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.DRAGON_BANE_NUGGET,
                ModItems.DRAGON_BANE_INGOT,
                "dwarf_adventure",
                9
        );

        // Dwarf Gold Ingot to Dwarf Gold Nugget Recipe
        offerShapelessRecipe(
                exporter,
                ModItems.DWARF_GOLD_NUGGET,
                ModItems.DWARF_GOLD_INGOT,
                "dwarf_adventure",
                9
        );

        // Raw Dwarf Steel Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_STAIRS)));

        // Dwarf Steel Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_STAIRS)));

        // Wind Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_STAIRS, 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModBlocks.WIND_GEM_BLOCK)
                .criterion("has_gem", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_STAIRS)));

        // Aer Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_STAIRS, 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModItems.AER_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_STAIRS)));

        // Fire Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_STAIRS, 4)
                .pattern("F  ")
                .pattern("FF ")
                .pattern("FFF")
                .input('F', ModBlocks.FIRE_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_STAIRS)));

        // Ignis Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_STAIRS, 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_STAIRS)));

        // Water Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_STAIRS, 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModBlocks.WATER_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_STAIRS)));

        // Aqua Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_STAIRS, 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModItems.AQUA_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_STAIRS)));

        // Earth Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_STAIRS, 4)
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .input('E', ModBlocks.EARTH_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_STAIRS)));

        // Tera Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_STAIRS, 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .input('W', ModItems.TERA_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_STAIRS)));

        // Elemental Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_STAIRS, 4)
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .input('E', ModBlocks.ELEMENTAL_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.ELEMENTAL_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_STAIRS)));

        // Raw Magirite Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.RAW_MAGIRITE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_STAIRS)));

        // Magirite Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.MAGIRITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_STAIRS)));

        // Mythril Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_STAIRS, 4)
                .pattern("M  ")
                .pattern("MM ")
                .pattern("MMM")
                .input('M', ModBlocks.MYTHRIL_BLOCK) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.MYTHRIL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_STAIRS)));

        // Pureficated Mythril Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_STAIRS, 4)
                .pattern("M  ")
                .pattern("MM ")
                .pattern("MMM")
                .input('M', ModBlocks.PUREFICATED_MYTHRIL_BLOCK) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.PUREFICATED_MYTHRIL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_STAIRS)));

        // Raw Adamanitie Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.RAW_ADAMANTITE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_STAIRS)));

        // Adamantite Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.ADAMANTITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_STAIRS)));

        // Raw Orikalkum Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.RAW_ORIKALKUM) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_STAIRS)));

        // Orikalkum Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.ORIKALKUM_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_STAIRS)));

        // Raw Dragon Bane Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.RAW_DRAGON_BANE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_STAIRS)));

        // Dragon Bane Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.DRAGON_BANE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_STAIRS)));

        // Raw Dwarf Gold Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_STAIRS)));

        // Dwarf Gold Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_STAIRS, 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModItems.DWARF_GOLD_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_STAIRS)));



        // Raw Dwarf Steel Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_SLAB)));

        // Dwarf Steel Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_SLAB)));

        // Wind Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_SLAB, 6)
                .pattern("WWW")
                .input('W', ModBlocks.WIND_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_SLAB)));

        // Aer Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_SLAB, 6)
                .pattern("WWW")
                .input('W', ModItems.AER_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_SLAB)));

        // Fire Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_SLAB, 6)
                .pattern("FFF")
                .input('F', ModBlocks.FIRE_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_SLAB)));

        // Ignis Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_SLAB, 6)
                .pattern("WWW")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_SLAB)));

        // Water Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_SLAB, 6)
                .pattern("WWW")
                .input('W', ModBlocks.WATER_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_SLAB)));

        // Aqua Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_SLAB, 6)
                .pattern("WWW")
                .input('W', ModItems.AQUA_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_SLAB)));

        // Earth Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_SLAB, 6)
                .pattern("EEE")
                .input('E', ModBlocks.EARTH_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_SLAB)));

        // Tera Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_SLAB, 6)
                .pattern("WWW")
                .input('W', ModItems.TERA_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_SLAB)));

        // Elemental Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_SLAB, 6)
                .pattern("EEE")
                .input('E', ModBlocks.ELEMENTAL_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.ELEMENTAL_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_SLAB)));

        // Raw Magirite Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.RAW_MAGIRITE) // Use Dwarf Steel Ingot as input
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_SLAB)));

        // Magirite Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.MAGIRITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_SLAB)));

        // Mythril Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_SLAB, 6)
                .pattern("MMM")
                .input('M', ModBlocks.MYTHRIL_BLOCK) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.MYTHRIL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_SLAB)));

        // Purificated Mythril Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_SLAB, 6)
                .pattern("MMM")
                .input('M', ModBlocks.PUREFICATED_MYTHRIL_BLOCK) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.PUREFICATED_MYTHRIL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_SLAB)));

        // Raw Adamantite Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.RAW_ADAMANTITE) // Use Dwarf Steel Ingot as input
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_SLAB)));

        // Adamantite Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.ADAMANTITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_SLAB)));

        // Raw Orikalkum Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.RAW_ORIKALKUM) // Use Dwarf Steel Ingot as input
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_SLAB)));

        // Orikalkum Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.ORIKALKUM_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_SLAB)));

        // Raw Dragon Bane Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.RAW_DRAGON_BANE) // Use Dwarf Steel Ingot as input
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_SLAB)));

        // Dragon Bane Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.DRAGON_BANE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_SLAB)));

        // Raw Dwarf Gold Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Dwarf Steel Ingot as input
                .criterion("has_raw", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_SLAB)));

        // Dwarf Gold Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_SLAB, 6)
                .pattern("III")
                .input('I', ModItems.DWARF_GOLD_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_SLAB)));

        // Raw Dwarf Steel Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_FENCE)));

        // Dwarf Steel Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.DWARF_STEEL_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.DWARF_STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_FENCE)));

        // Wind Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_FENCE, 4)
                .pattern("WBW")
                .pattern("WBW")
                .input('W', ModBlocks.WIND_GEM_BLOCK) // Use Mythril Block as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_FENCE)));

        // Aer Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_FENCE, 4)
                .pattern("WBW")
                .pattern("WBW")
                .input('W', ModItems.AER_SPIRIT_INGOT) // Use Mythril Block as input
                .input('B', ModItems.AER_SPIRIT_NUGGET) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.AER_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_FENCE)));

        // Fire Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_FENCE, 4)
                .pattern("FBF")
                .pattern("FBF")
                .input('F', ModBlocks.FIRE_GEM_BLOCK)
                .input('B', ModItems.ANCIENT_BRANCH)
                .criterion("has_gem", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_FENCE)));

        // Ignis Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_FENCE, 4)
                .pattern("WBW")
                .pattern("WBW")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT)
                .input('B', ModItems.IGNIS_SPIRIT_NUGGET)
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.IGNIS_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_FENCE)));

        // Water Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_FENCE, 4)
                .pattern("WBW")
                .pattern("WBW")
                .input('W', ModBlocks.WATER_GEM_BLOCK) // Use Mythril Block as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_FENCE)));

        // Aqua Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_FENCE, 4)
                .pattern("WBW")
                .pattern("WBW")
                .input('W', ModItems.AQUA_SPIRIT_INGOT)
                .input('B', ModItems.AQUA_SPIRIT_NUGGET)
                .criterion("has_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.AQUA_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_FENCE)));

        // Earth Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_FENCE, 4)
                .pattern("EBE")
                .pattern("EBE")
                .input('E', ModBlocks.EARTH_GEM_BLOCK) // Use Mythril Block as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_FENCE)));

        // Tera Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_FENCE, 4)
                .pattern("WBW")
                .pattern("WBW")
                .input('W', ModItems.TERA_SPIRIT_INGOT)
                .input('B', ModItems.TERA_SPIRIT_NUGGET)
                .criterion("has_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.TERA_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_FENCE)));

        // Elemental Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_FENCE, 4)
                .pattern("EBE")
                .pattern("EBE")
                .input('E', ModBlocks.ELEMENTAL_GEM_BLOCK) // Use Mythril Block as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.ELEMENTAL_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_FENCE)));

        // Raw Magirite Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.RAW_MAGIRITE) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_FENCE)));

        // Magirite Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.MAGIRITE_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.MAGIRITE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.MAGIRITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_FENCE)));

        // Mythril Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_FENCE, 4)
                .pattern("MGM")
                .pattern("MGM")
                .input('M', ModBlocks.MYTHRIL_BLOCK) // Use Mythril Block as input
                .input('G', ModItems.MYTHRIL) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.MYTHRIL_BLOCK))
                .criterion("has_nugget", conditionsFromItem(ModItems.MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_FENCE)));

        // Purificated Mythril Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_FENCE, 4)
                .pattern("MGM")
                .pattern("MGM")
                .input('M', ModBlocks.PUREFICATED_MYTHRIL_BLOCK) // Use Mythril Block as input
                .input('G', ModItems.PUREFICATED_MYTHRIL) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.PUREFICATED_MYTHRIL_BLOCK))
                .criterion("has_nugget", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_FENCE)));

        // Raw Adamantite Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.RAW_ADAMANTITE) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_FENCE)));

        // Adamantite Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.ADAMANTITE_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ADAMANTITE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.ADAMANTITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_FENCE)));

        // Raw Orikalkum Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.RAW_ORIKALKUM) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_FENCE)));

        // Orikalkum Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.ORIKALKUM_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ORIKALKUM_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.ORIKALKUM_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_FENCE)));

        // Raw Dragon Bane Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.RAW_DRAGON_BANE) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_FENCE)));

        // Dragon Bane Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.DRAGON_BANE_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.DRAGON_BANE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.DRAGON_BANE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_FENCE)));

        // Raw Dwarf Gold Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_FENCE)));

        // Dwarf Gold Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_FENCE, 4)
                .pattern("INI")
                .pattern("INI")
                .input('I', ModItems.DWARF_GOLD_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.DWARF_GOLD_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.DWARF_GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_FENCE)));

        // Raw Dwarf Steel Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_FENCE_GATE)));

        // Dwarf Steel Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.DWARF_STEEL_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.DWARF_STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_FENCE_GATE)));

        // Wind Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_FENCE_GATE, 1)
                .pattern("BWB")
                .pattern("BWB")
                .input('W', ModBlocks.WIND_GEM_BLOCK) // Use Mythril Block Ingot as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_FENCE_GATE)));

        // Aer Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_FENCE_GATE, 1)
                .pattern("BWB")
                .pattern("BWB")
                .input('W', ModItems.AER_SPIRIT_INGOT) // Use Mythril Block Ingot as input
                .input('B', ModItems.AER_SPIRIT_NUGGET) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.AER_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_FENCE_GATE)));

        // Fire Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_FENCE_GATE, 1)
                .pattern("BFB")
                .pattern("BFB")
                .input('F', ModBlocks.FIRE_GEM_BLOCK) // Use Mythril Block Ingot as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_FENCE_GATE)));

        // Ignis Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_FENCE_GATE, 1)
                .pattern("BWB")
                .pattern("BWB")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT) // Use Mythril Block Ingot as input
                .input('B', ModItems.IGNIS_SPIRIT_NUGGET) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.IGNIS_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_FENCE_GATE)));

        // Water Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_FENCE_GATE, 1)
                .pattern("BWB")
                .pattern("BWB")
                .input('W', ModBlocks.WATER_GEM_BLOCK) // Use Mythril Block Ingot as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_FENCE_GATE)));

        // Aqua Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_FENCE_GATE, 1)
                .pattern("BWB")
                .pattern("BWB")
                .input('W', ModItems.AQUA_SPIRIT_INGOT) // Use Mythril Block Ingot as input
                .input('B', ModItems.AQUA_SPIRIT_NUGGET) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.AQUA_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_FENCE_GATE)));

        // Earth Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_FENCE_GATE, 1)
                .pattern("BEB")
                .pattern("BEB")
                .input('E', ModBlocks.EARTH_GEM_BLOCK) // Use Mythril Block Ingot as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_FENCE_GATE)));

        // Tera Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_FENCE_GATE, 1)
                .pattern("BWB")
                .pattern("BWB")
                .input('W', ModItems.TERA_SPIRIT_INGOT) // Use Mythril Block Ingot as input
                .input('B', ModItems.TERA_SPIRIT_NUGGET) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.TERA_SPIRIT_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_FENCE_GATE)));

        // Elemental Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_FENCE_GATE, 1)
                .pattern("BEB")
                .pattern("BEB")
                .input('E', ModBlocks.ELEMENTAL_GEM_BLOCK) // Use Mythril Block Ingot as input
                .input('B', ModItems.ANCIENT_BRANCH) // Use Mythril as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.ELEMENTAL_GEM_BLOCK))
                .criterion("has_stick", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_FENCE_GATE)));

        // Raw Magirite Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.RAW_MAGIRITE) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_FENCE_GATE)));

        // Magirite Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.MAGIRITE_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.MAGIRITE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.MAGIRITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_FENCE_GATE)));

        // Mythril Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_FENCE_GATE, 1)
                .pattern("GMG")
                .pattern("GMG")
                .input('M', ModBlocks.MYTHRIL_BLOCK) // Use Mythril Block Ingot as input
                .input('G', ModItems.MYTHRIL) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.MYTHRIL_BLOCK))
                .criterion("has_nugget", conditionsFromItem(ModItems.MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_FENCE_GATE)));

       // Pureficated Mythril Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE, 1)
                .pattern("GMG")
                .pattern("GMG")
                .input('M', ModBlocks.PUREFICATED_MYTHRIL_BLOCK) // Use Mythril Block Ingot as input
                .input('G', ModItems.PUREFICATED_MYTHRIL) // Use Mythril as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.PUREFICATED_MYTHRIL_BLOCK))
                .criterion("has_nugget", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_FENCE_GATE)));

        // Raw Adamantite Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.RAW_ADAMANTITE) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_FENCE_GATE)));

        // Adamantite Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.ADAMANTITE_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ADAMANTITE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.ADAMANTITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_FENCE_GATE)));

        // Raw Orikalkum Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.RAW_ORIKALKUM) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_FENCE_GATE)));

        // Orikalkume Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.ORIKALKUM_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ORIKALKUM_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.ORIKALKUM_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_FENCE_GATE)));

        // Raw Dragon Bane Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.RAW_DRAGON_BANE) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_FENCE_GATE)));

        // Dragon Bane Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.DRAGON_BANE_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.DRAGON_BANE_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.DRAGON_BANE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_FENCE_GATE)));

        // Raw Dwarf Gold Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.ANCIENT_BRANCH) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .criterion("has_nugget", conditionsFromItem(ModItems.ANCIENT_BRANCH))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_FENCE_GATE)));

        // Dwarf Gold Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_FENCE_GATE, 1)
                .pattern("NIN")
                .pattern("NIN")
                .input('I', ModItems.DWARF_GOLD_INGOT) // Use Dwarf Steel Ingot as input
                .input('N', ModItems.DWARF_GOLD_NUGGET) // Use Dwarf Steel Nugget as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .criterion("has_nugget", conditionsFromItem(ModItems.DWARF_GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_FENCE_GATE)));

        // Raw Dwarf Steel Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.RAW_DWARF_STEEL_BUTTON,
                ModItems.RAW_DWARF_STEEL,
                "Dwarf_Adventure",
                9
        );

        // Dwarf Steel Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.DWARF_STEEL_BUTTON,
                ModItems.DWARF_STEEL_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Wind Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.WIND_GEM_BUTTON,
                ModItems.WIND_GEM,
                "Dwarf_Adventure",
                1
        );

        // Aer Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.AER_BUTTON,
                ModItems.AER_SPIRIT_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Fire Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.FIRE_GEM_BUTTON,
                ModItems.FIRE_GEM,
                "Dwarf_Adventure",
                1
        );

        // Ignis Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.IGNIS_BUTTON,
                ModItems.IGNIS_SPIRIT_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Water Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.WATER_GEM_BUTTON,
                ModItems.WATER_GEM,
                "Dwarf_Adventure",
                1
        );

        // Aqua Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.AQUA_BUTTON,
                ModItems.AQUA_SPIRIT_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Earth Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.EARTH_GEM_BUTTON,
                ModItems.EARTH_GEM,
                "Dwarf_Adventure",
                1
        );

        // Tera Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.TERA_BUTTON,
                ModItems.TERA_SPIRIT_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Elemental Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.ELEMENTAL_GEM_BUTTON,
                ModItems.ELEMENTAL_GEM,
                "Dwarf_Adventure",
                1
        );

        // Magirite Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.RAW_MAGIRITE_BUTTON,
                ModItems.RAW_MAGIRITE,
                "Dwarf_Adventure",
                9
        );

        // Magirite Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.MAGIRITE_BUTTON,
                ModItems.MAGIRITE_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Mythril Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.MYTHRIL_BUTTON,
                ModItems.MYTHRIL,
                "Dwarf_Adventure",
                1
        );

        // Purificated Mythril Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.PUREFICATED_MYTHRIL_BUTTON,
                ModItems.PUREFICATED_MYTHRIL,
                "Dwarf_Adventure",
                1
        );

        // Adamantite Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.RAW_ADAMANTITE_BUTTON,
                ModItems.RAW_ADAMANTITE,
                "Dwarf_Adventure",
                9
        );

        // Adamantite Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.ADAMANTITE_BUTTON,
                ModItems.ADAMANTITE_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Orikalkum Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.RAW_ORIKALKUM_BUTTON,
                ModItems.RAW_ORIKALKUM,
                "Dwarf_Adventure",
                9
        );

        // Orikalkum Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.ORIKALKUM_BUTTON,
                ModItems.ORIKALKUM_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Dragon Bane Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.RAW_DRAGON_BANE_BUTTON,
                ModItems.RAW_DRAGON_BANE,
                "Dwarf_Adventure",
                9
        );

        // Dragon Bane Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.DRAGON_BANE_BUTTON,
                ModItems.DRAGON_BANE_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Dwarf Gold Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.RAW_DWARF_GOLD_BUTTON,
                ModItems.RAW_DWARF_GOLD,
                "Dwarf_Adventure",
                9
        );

        // Dwarf Gold Button
        offerShapelessRecipe(
                exporter,
                ModBlocks.DWARF_GOLD_BUTTON,
                ModItems.DWARF_GOLD_NUGGET,
                "Dwarf_Adventure",
                1
        );

        // Raw Dwarf Steel Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_PRESSURE_PLATE)));

        // Dwarf Steel Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_PRESSURE_PLATE)));

        // Wind Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_PRESSURE_PLATE, 1)
                .pattern("WW")
                .input('W', ModItems.WIND_GEM) // Use Mythril Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.WIND_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_PRESSURE_PLATE)));

        // Aer Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_PRESSURE_PLATE, 1)
                .pattern("WW")
                .input('W', ModItems.AER_SPIRIT_INGOT) // Use Mythril Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_PRESSURE_PLATE)));

        // Fire Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_PRESSURE_PLATE, 1)
                .pattern("FF")
                .input('F', ModItems.FIRE_GEM) // Use Mythril Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.FIRE_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_PRESSURE_PLATE)));

        // Ignis Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_PRESSURE_PLATE, 1)
                .pattern("WW")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT) // Use Mythril Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_PRESSURE_PLATE)));

        // Water Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_PRESSURE_PLATE, 1)
                .pattern("WW")
                .input('W', ModItems.WATER_GEM) // Use Mythril Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.WATER_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_PRESSURE_PLATE)));

        // Aqua Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_PRESSURE_PLATE, 1)
                .pattern("WW")
                .input('W', ModItems.AQUA_SPIRIT_INGOT) // Use Mythril Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_PRESSURE_PLATE)));

        // Earth Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_PRESSURE_PLATE, 1)
                .pattern("EE")
                .input('E', ModItems.EARTH_GEM) // Use Mythril Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.EARTH_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_PRESSURE_PLATE)));

        // Tera Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_PRESSURE_PLATE, 1)
                .pattern("WW")
                .input('W', ModItems.TERA_SPIRIT_INGOT) // Use Mythril Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_PRESSURE_PLATE)));

        // Elemental Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE, 1)
                .pattern("EE")
                .input('E', ModItems.ELEMENTAL_GEM) // Use Mythril Ingot as input
                .criterion("has_gem", conditionsFromItem(ModItems.ELEMENTAL_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_PRESSURE_PLATE)));

        // Raw Magirite Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.RAW_MAGIRITE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_PRESSURE_PLATE)));

        // Magirite Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.MAGIRITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_PRESSURE_PLATE)));

        // Mythril Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_PRESSURE_PLATE, 1)
                .pattern("GG")
                .input('G', ModItems.MYTHRIL) // Use Mythril Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_PRESSURE_PLATE)));

        // Pureficated Mythril Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_PRESSURE_PLATE, 1)
                .pattern("GG")
                .input('G', ModItems.PUREFICATED_MYTHRIL) // Use Mythril Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_PRESSURE_PLATE)));

        // Raw Adamantite Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_ADAMANTITE_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.RAW_ADAMANTITE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(RAW_ADAMANTITE_PRESSURE_PLATE)));

        // Adamantite Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.ADAMANTITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_PRESSURE_PLATE)));

        // Raw Orikalkum Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.RAW_ORIKALKUM) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_PRESSURE_PLATE)));

        // Orikalkum Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.ORIKALKUM_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_PRESSURE_PLATE)));

        // Raw Dragon Bane Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.RAW_DRAGON_BANE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_PRESSURE_PLATE)));

        // Dragon Bane Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.DRAGON_BANE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_PRESSURE_PLATE)));

        // Raw Dwarf Gold Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_PRESSURE_PLATE)));

        // Dwarf Gold Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_PRESSURE_PLATE, 1)
                .pattern("II")
                .input('I', ModItems.DWARF_GOLD_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_PRESSURE_PLATE)));

        // Raw Dwarf Steel Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.RAW_DWARF_STEEL) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_WALL)));

        // Dwarf Steel Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.DWARF_STEEL_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_WALL)));

        // Wind Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WIND_GEM_WALL, 6)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModBlocks.WIND_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WIND_GEM_WALL)));

        // Aer Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_WALL, 6)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModItems.AER_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_WALL)));

        // Fire Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIRE_GEM_WALL, 6)
                .pattern("FFF")
                .pattern("FFF")
                .input('F', ModBlocks.FIRE_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIRE_GEM_WALL)));

        // Ignis Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_WALL, 6)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModItems.IGNIS_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_WALL)));

        // Water Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WATER_GEM_WALL, 6)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModBlocks.WATER_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WATER_GEM_WALL)));

        // Aqua Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_WALL, 6)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModItems.AQUA_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_WALL)));

        // Earth Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EARTH_GEM_WALL, 6)
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModBlocks.EARTH_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EARTH_GEM_WALL)));

        // Tera Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_WALL, 6)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', ModItems.TERA_SPIRIT_INGOT) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_WALL)));

        // Elemental Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ELEMENTAL_GEM_WALL, 6)
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModBlocks.ELEMENTAL_GEM_BLOCK) // Use Mythril Block as input
                .criterion("has_gem", conditionsFromItem(ModBlocks.ELEMENTAL_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ELEMENTAL_GEM_WALL)));

        // Raw Magirite Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.RAW_MAGIRITE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_WALL)));

        // Magirite Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.MAGIRITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_WALL)));

        // Mythril Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_WALL, 6)
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModBlocks.MYTHRIL_BLOCK) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.MYTHRIL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_WALL)));

        // Purificated Mythril Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_WALL, 6)
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModBlocks.PUREFICATED_MYTHRIL_BLOCK) // Use Mythril Block as input
                .criterion("has_ingot", conditionsFromItem(ModBlocks.PUREFICATED_MYTHRIL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_WALL)));

        // Raw Adamantite Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.RAW_ADAMANTITE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_WALL)));

        // Adamantite Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.ADAMANTITE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_WALL)));

        // Raw Orikalkum Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.RAW_ORIKALKUM) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_WALL)));

        // Orikalkum Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.ORIKALKUM_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_WALL)));

        // Raw Dragon Bane Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.RAW_DRAGON_BANE) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_WALL)));

        // Dragon Bane Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.DRAGON_BANE_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_WALL)));

        // Raw Dwarf Gold Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.RAW_DWARF_GOLD) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_WALL)));

        // Dwarf Gold Wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_WALL, 6)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.DWARF_GOLD_INGOT) // Use Dwarf Steel Ingot as input
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_WALL)));

        // Dwarf Steel Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.DWARF_STEEL_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_DOOR)));

        // Raw Dwarf Steel Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_DWARF_STEEL)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_DOOR)));

        // Aer Spititstone Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_SPIRITSTONE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.WIND_GEM_BLOCK)
                .criterion("has_block", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_SPIRITSTONE_DOOR)));

        // Aer Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.AER_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_DOOR)));

        // Ignis Spititstone Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_SPIRITSTONE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.FIRE_GEM_BLOCK)
                .criterion("has_block", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_SPIRITSTONE_DOOR)));

        // Ignis Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.IGNIS_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_DOOR)));

        // Aqua Spititstone Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_SPITIRSTONE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.WATER_GEM_BLOCK)
                .criterion("has_ingot", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_SPITIRSTONE_DOOR)));

        // Aqua Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.AQUA_SPIRIT_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_DOOR)));

        // Tera Spititstone Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_SPIRITSTONE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.EARTH_GEM_BLOCK)
                .criterion("has_ingot", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_SPIRITSTONE_DOOR)));

        // Tera Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.TERA_SPIRIT_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_DOOR)));

        // Quintessence Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.QUINTESSENCE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.ELEMENTAL_GEM)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.ELEMENTAL_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.QUINTESSENCE_DOOR)));

        // Raw Magirite Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_MAGIRITE)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_DOOR)));

        // Magirite Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.MAGIRITE_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_DOOR)));

        // Mythril Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_DOOR, 3)
                .pattern("MM")
                .pattern("MM")
                .pattern("MM")
                .input('M', ModItems.MYTHRIL)
                .criterion("has_ingot", conditionsFromItem(ModItems.MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_DOOR)));

        // Purificated Mythril Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_DOOR, 3)
                .pattern("MM")
                .pattern("MM")
                .pattern("MM")
                .input('M', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_DOOR)));

        // Raw Adamantite Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_ADAMANTITE)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_DOOR)));

        // Adamantite Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.ADAMANTITE_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_DOOR)));

        // Raw Orikalkum Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_ORIKALKUM)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_DOOR)));

        // Orikalkum Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.ORIKALKUM_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_DOOR)));

        // Raw Dragon Bane Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_DRAGON_BANE)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_DOOR)));

        // Dragon Bane Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.DRAGON_BANE_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_DOOR)));

        // Raw Dwarf Gold Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_DWARF_GOLD)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_DOOR)));

        // Dwarf Gold Door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_DOOR, 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.DWARF_GOLD_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_DOOR)));

        // Dwarf Steel TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_STEEL_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.DWARF_STEEL_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.DWARF_STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_STEEL_TRAPDOOR)));

        // Raw Dwarf Steel TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_STEEL_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_DWARF_STEEL)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.RAW_DWARF_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_STEEL_TRAPDOOR)));

        // Aer Spititstone TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_SPIRITSTONE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.WIND_GEM_BLOCK)
                .criterion("has_block", conditionsFromItem(ModBlocks.WIND_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_SPIRITSTONE_TRAPDOOR)));

        // Aer TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AER_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.AER_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.AER_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AER_TRAPDOOR)));

        // Ignis Spititstone TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_SPIRITSTONE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.FIRE_GEM_BLOCK)
                .criterion("has_block", conditionsFromItem(ModBlocks.FIRE_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_SPIRITSTONE_TRAPDOOR)));

        // Ignis TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IGNIS_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.IGNIS_SPIRIT_INGOT)
                .criterion("has_ingot", conditionsFromItem(ModItems.IGNIS_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IGNIS_TRAPDOOR)));

        // Aqua Spititstone TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_SPIRITSTONE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.WATER_GEM_BLOCK)
                .criterion("has_ingot", conditionsFromItem(ModBlocks.WATER_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_SPIRITSTONE_TRAPDOOR)));

        // Aqua TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AQUA_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.AQUA_SPIRIT_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.AQUA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AQUA_TRAPDOOR)));

        // Tera Spititstone TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_SPIRITSTONE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModBlocks.EARTH_GEM_BLOCK)
                .criterion("has_ingot", conditionsFromItem(ModBlocks.EARTH_GEM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_SPIRITSTONE_TRAPDOOR)));

        // Tera TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TERA_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.TERA_SPIRIT_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.TERA_SPIRIT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERA_TRAPDOOR)));

        // Quintessence TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.QUINTESSENCE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.ELEMENTAL_GEM)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.ELEMENTAL_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.QUINTESSENCE_TRAPDOOR)));

        // Raw Magirite TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_MAGIRITE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_MAGIRITE)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_MAGIRITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_MAGIRITE_TRAPDOOR)));

        // Magirite TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIRITE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.MAGIRITE_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGIRITE_TRAPDOOR)));

        // Mythril TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYTHRIL_TRAPDOOR, 1)
                .pattern("MM")
                .pattern("MM")
                .input('M', ModItems.MYTHRIL)
                .criterion("has_ingot", conditionsFromItem(ModItems.MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MYTHRIL_TRAPDOOR)));

        // Purificated Mythril TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUREFICATED_MYTHRIL_TRAPDOOR, 1)
                .pattern("MM")
                .pattern("MM")
                .input('M', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PUREFICATED_MYTHRIL_TRAPDOOR)));

        // Raw Adamantite TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_ADAMANTITE)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ADAMANTITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ADAMANTITE_TRAPDOOR)));

        // Adamantite TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADAMANTITE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.ADAMANTITE_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADAMANTITE_TRAPDOOR)));

        // Raw Orikalkum TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ORIKALKUM_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_ORIKALKUM)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_ORIKALKUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_ORIKALKUM_TRAPDOOR)));

        // Orikalkum TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORIKALKUM_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.ORIKALKUM_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORIKALKUM_TRAPDOOR)));

        // Raw Dragon Bane TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DRAGON_BANE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_DRAGON_BANE)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DRAGON_BANE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DRAGON_BANE_TRAPDOOR)));

        // Dragon Bane TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRAGON_BANE_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.DRAGON_BANE_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRAGON_BANE_TRAPDOOR)));

        // Raw Dwarf Gold TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_DWARF_GOLD_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.RAW_DWARF_GOLD)
                .criterion("has_ingot", conditionsFromItem(ModItems.RAW_DWARF_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_DWARF_GOLD_TRAPDOOR)));

        // Dwarf Gold TDoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DWARF_GOLD_TRAPDOOR, 1)
                .pattern("II")
                .pattern("II")
                .input('I', ModItems.DWARF_GOLD_INGOT)
                .criterion("has_raw_dwarf_steel", conditionsFromItem(ModItems.DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DWARF_GOLD_TRAPDOOR)));










        // Dwarf Steel Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_PICKAXE)));

        // Dwarf Gold Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_PICKAXE)));

        // Aer Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_PICKAXE)));

        // Ignis Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_PICKAXE)));

        // Aqua Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_PICKAXE)));

        // Tera Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_PICKAXE)));

        // Magirite Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_PICKAXE)));

        // Mythril Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_PICKAXE)));

        // Adamantite Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_PICKAXE)));

        // Orikalkum Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_PICKAXE)));

        // Dragon Bane Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_PICKAXE, 1)
                .pattern("III")
                .pattern(" H ")
                .pattern(" H ")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_PICKAXE)));


        // Dwarf Steel axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_AXE)));

        // Dwarf Gold axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_AXE)));

        // Aer axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_AXE)));

        // Ignis axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_AXE)));

        // Aqua axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_AXE)));

        // Tera axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_AXE)));

        // Magirite axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_AXE)));

        // Mythril axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_AXE)));

        // Adamantite axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_AXE)));

        // Orikalkum axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_AXE)));

        // Dragon Bane axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_AXE, 1)
                .pattern("II")
                .pattern("IH")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_AXE)));


        // Dwarf Steel Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_SHOVEL)));

        // Dwarf Gold Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_SHOVEL)));

        // Aer Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_SHOVEL)));

        // Ignis Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_SHOVEL)));

        // Aqua Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_SHOVEL)));

        // Tera Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_SHOVEL)));

        // Magirite Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_SHOVEL)));

        // Mythril Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SHOVEL)));

        // Adamantite Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_SHOVEL)));

        // Orikalkum Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_SHOVEL)));

        // Dragon Bane Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_SHOVEL, 1)
                .pattern("I")
                .pattern("H")
                .pattern("H")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_SHOVEL)));


        // Dwarf Steel Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_HOE)));

        // Dwarf Gold Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_HOE)));

        // Aer Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_HOE)));

        // Ignis Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_HOE)));

        // Aqua Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_HOE)));

        // Tera Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_HOE)));

        // Magirite Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_HOE)));

        // Mythril Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_HOE)));

        // Adamantite Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_HOE)));

        // Orikalkum Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_HOE)));

        // Dragon Bane Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_HOE, 1)
                .pattern("II")
                .pattern(" H")
                .pattern(" H")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_HOE)));


        // Dwarf Steel Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_SWORD)));

        // Dwarf Gold Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_SWORD)));

        // Aer Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_SWORD)));

        // Ignis Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_SWORD)));

        // Aqua Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_SWORD)));

        // Tera Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_SWORD)));

        // Magirite Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_SWORD)));

        // Mythril Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SWORD)));

        // Adamantite Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_SWORD)));

        // Orikalkum Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_SWORD)));

        // Dragon Bane Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_SWORD, 1)
                .pattern("I")
                .pattern("I")
                .pattern("H")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_SWORD)));


        // Dwarf Steel Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.DWARF_STEEL_PICKAXE)
                .input('A', ModItems.DWARF_STEEL_AXE)
                .input('S', ModItems.DWARF_STEEL_SHOVEL)
                .input('O', ModItems.DWARF_STEEL_HOE)
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_PAXEL)));

        // Dwarf Gold Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.DWARF_GOLD_PICKAXE)
                .input('A', ModItems.DWARF_GOLD_AXE)
                .input('S', ModItems.DWARF_GOLD_SHOVEL)
                .input('O', ModItems.DWARF_GOLD_HOE)
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_PAXEL)));

        // Aer Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.AER_PICKAXE)
                .input('A', ModItems.AER_AXE)
                .input('S', ModItems.AER_SHOVEL)
                .input('O', ModItems.AER_HOE)
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_PAXEL)));

        // Ignis Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.IGNIS_PICKAXE)
                .input('A', ModItems.IGNIS_AXE)
                .input('S', ModItems.IGNIS_SHOVEL)
                .input('O', ModItems.IGNIS_HOE)
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_PAXEL)));

        // Aqua Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.AQUA_PICKAXE)
                .input('A', ModItems.AQUA_AXE)
                .input('S', ModItems.AQUA_SHOVEL)
                .input('O', ModItems.AQUA_HOE)
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_PAXEL)));

        // Tera Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.TERA_PICKAXE)
                .input('A', ModItems.TERA_AXE)
                .input('S', ModItems.TERA_SHOVEL)
                .input('O', ModItems.TERA_HOE)
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_PAXEL)));

        // Magirite Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.MAGIRITE_PICKAXE)
                .input('A', ModItems.MAGIRITE_AXE)
                .input('S', ModItems.MAGIRITE_SHOVEL)
                .input('O', ModItems.MAGIRITE_HOE)
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_PAXEL)));

        // Mythril Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.MYTHRIL_PICKAXE)
                .input('A', ModItems.MYTHRIL_AXE)
                .input('S', ModItems.MYTHRIL_SHOVEL)
                .input('O', ModItems.MYTHRIL_HOE)
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_PAXEL)));

        // Adamantite Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.ADAMANTITE_PICKAXE)
                .input('A', ModItems.ADAMANTITE_AXE)
                .input('S', ModItems.ADAMANTITE_SHOVEL)
                .input('O', ModItems.ADAMANTITE_HOE)
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_PAXEL)));

        // Orikalkum Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.ORIKALKUM_PICKAXE)
                .input('A', ModItems.ORIKALKUM_AXE)
                .input('S', ModItems.ORIKALKUM_SHOVEL)
                .input('O', ModItems.ORIKALKUM_HOE)
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_PAXEL)));

        // Dragon Bane Paxel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_PAXEL, 1)
                .pattern("PIA")
                .pattern("OHS")
                .pattern(" H ")
                .input('P', ModItems.DRAGON_BANE_PICKAXE)
                .input('A', ModItems.DRAGON_BANE_AXE)
                .input('S', ModItems.DRAGON_BANE_SHOVEL)
                .input('O', ModItems.DRAGON_BANE_HOE)
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_PAXEL)));

        //Dwarf Steel Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.HOT_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_SHEARS)));

        //Dwarf Gold Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_SHEARS)));

        //Aer Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.FORGING_HOT_AER)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_SHEARS)));

        //Ignis Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_SHEARS)));

        //Aqua Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_SHEARS)));

        //Tera Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.FORGING_HOT_TERA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_SHEARS)));

        //Magirite Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_SHEARS)));

        //Mythril Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SHEARS)));

        //Adamantite Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_SHEARS)));

        //Orikalkum Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_SHEARS)));

        //Dragon Bane Shears
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_SHEARS, 1)
                .pattern("I ")
                .pattern(" I")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_SHEARS)));

        //Dwarf Steel Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.HOT_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_KNIFE)));

        //Dwarf Gold Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_KNIFE)));

        //Aer Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_KNIFE)));

        //Ignis Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_KNIFE)));

        //Aqua Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_KNIFE)));

        //Tera Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_KNIFE)));

        //Magirite Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_KNIFE)));

        //Mythril Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_KNIFE)));

        //Adamantite Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_KNIFE)));

        //Orikalkum Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_KNIFE)));

        //Dragon Bane Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_KNIFE, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("HI ")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('H', ModItems.HANDLE_PART)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_handle_part", conditionsFromItem(ModItems.HANDLE_PART))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_KNIFE)));

        // Dwarf Steel Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_SHIELD, 1)
                .pattern("IWI")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.HOT_INGOT)
                .input('S', Items.SHIELD)
                .input('W', ItemTags.LOGS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .criterion("has_log", conditionsFromTag(ItemTags.LOGS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_SHIELD)));

        // Dwarf Gold Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_SHIELD, 1)
                .pattern("IWI")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .input('S', Items.SHIELD)
                .input('W', ItemTags.LOGS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .criterion("has_log", conditionsFromTag(ItemTags.LOGS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_SHIELD)));

        // Aer Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.FORGING_HOT_AER)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_SHIELD)));

        // Ignis Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_SHIELD)));

        // Aqua Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_SHIELD)));

        // Tera Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.FORGING_HOT_TERA)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_SHIELD)));

        // Magirite Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_SHIELD, 1)
                .pattern("III")
                .pattern("NSN")
                .pattern(" I ")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .input('S', Items.SHIELD)
                .input('N', Items.NETHERITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .criterion("has_ingot", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_SHIELD)));

        // Mythril Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_SHIELD)));

        // Adamantite Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_SHIELD)));

        // Orikalkum Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_SHIELD, 1)
                .pattern("III")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .input('S', Items.SHIELD)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_SHIELD)));

        // Dragon Bane Shield
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_SHIELD, 1)
                .pattern("IWI")
                .pattern("ISI")
                .pattern(" I ")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .input('S', Items.SHIELD)
                .input('W', ItemTags.LOGS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .criterion("has_shield", conditionsFromItem(Items.SHIELD))
                .criterion("has_log", conditionsFromTag(ItemTags.LOGS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_SHIELD)));


        // Dwarf Steel Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.HOT_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_HELMET)));

        // Dwarf Steel Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.HOT_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_CHESTPLATE)));

        // Dwarf Steel Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.HOT_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_LEGGINGS)));

        // Dwarf Steel Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_STEEL_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.HOT_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.HOT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_STEEL_BOOTS)));

        // Dwarf Gold Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_HELMET)));

        // Dwarf Gold Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_CHESTPLATE)));

        // Dwarf Gold Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_LEGGINGS)));

        // Dwarf Gold Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DWARF_GOLD_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_DWARF_GOLD_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DWARF_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DWARF_GOLD_BOOTS)));

        // Aer Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_AER)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_HELMET)));

        // Aer Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.FORGING_HOT_AER)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_CHESTPLATE)));

        // Aer Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_AER)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_LEGGINGS)));

        // Aer Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AER_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_AER)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AER_BOOTS)));

        // Ignis Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_HELMET)));

        // Ignis Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_CHESTPLATE)));

        // Ignis Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_LEGGINGS)));

        // Ignis Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNIS_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_IGNIS)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_IGNIS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IGNIS_BOOTS)));


        // Aqua Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_HELMET)));

        // Aqua Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_CHESTPLATE)));

        // Aqua Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_LEGGINGS)));

        // Aqua Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AQUA_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_AQUA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_AQUA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AQUA_BOOTS)));


        // Tera Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_TERA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_HELMET)));

        // Tera Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.FORGING_HOT_TERA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_CHESTPLATE)));

        // Tera Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_TERA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_LEGGINGS)));

        // Tera Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TERA_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.FORGING_HOT_TERA)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.FORGING_HOT_TERA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TERA_BOOTS)));


        // Magirite Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_HELMET)));

        // Magirite Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_CHESTPLATE)));

        // Magirite Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_MAGIRITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_MAGIRITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_LEGGINGS)));

        // Magirite Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIRITE_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIRITE_BOOTS)));


        // Mythril Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_HELMET)));

        // Mythril Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_CHESTPLATE)));

        // Mythril Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_LEGGINGS)));

        // Mythril Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MYTHRIL_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.PUREFICATED_MYTHRIL)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.PUREFICATED_MYTHRIL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MYTHRIL_BOOTS)));


        // Adamantite Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_HELMET)));

        // Adamantite Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_CHESTPLATE)));

        // Adamantite Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_LEGGINGS)));

        // Adamantite Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_ADAMANTITE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ADAMANTITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADAMANTITE_BOOTS)));


        // Orikalkum Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_HELMET)));

        // Orikalkum Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_CHESTPLATE)));

        // Orikalkum Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_LEGGINGS)));

        // Orikalkum Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORIKALKUM_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_ORIKALKUM_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_ORIKALKUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORIKALKUM_BOOTS)));


        // Dragon Bane Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_HELMET)));

        // Dragon Bane Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_CHESTPLATE)));

        // Dragon Bane Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_LEGGINGS)));

        // Dragon Bane Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGON_BANE_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', ModItems.MOLTEN_DRAGON_BANE_INGOT)
                .criterion("has_hot_ingot", conditionsFromItem(ModItems.MOLTEN_DRAGON_BANE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DRAGON_BANE_BOOTS)));

        // Skeleton BoneMeal Recipes
        offerShapelessRecipe(
                exporter,
                Items.BONE_MEAL,
                ModBlocks.SKELETON_HEAD,
                "misc",
                3
        );

        offerShapelessRecipe(
                exporter,
                Items.BONE_MEAL,
                ModBlocks.SKELETON_ARM,
                "misc",
                3
        );

        offerShapelessRecipe(
                exporter,
                Items.BONE_MEAL,
                ModBlocks.SKELETON_LEG,
                "misc",
                3
        );

        offerShapelessRecipe(
                exporter,
                Items.BONE_MEAL,
                ModBlocks.SKELETON_CHEST,
                "misc",
                3
        );

        offerShapelessRecipe(
                exporter,
                Items.BONE_MEAL,
                ModBlocks.SKELETON_PELVIS,
                "misc",
                3
        );

        offerShapelessRecipe(
                exporter,
                Items.BONE_MEAL,
                ModBlocks.SKELETON_SPINE,
                "misc",
                3
        );

        // Skeleton Sitting
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_SITTING, 1)
                .pattern(" H ")
                .pattern("ATA")
                .pattern("L L")
                .input('H', ModBlocks.SKELETON_HEAD)
                .input('T', ModBlocks.SKELETON_TORSO)
                .input('A', ModBlocks.SKELETON_ARM)
                .input('L', ModBlocks.SKELETON_LEG)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_SITTING)));

        // Skeleton Laying
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_LAYING, 1)
                .pattern(" A ")
                .pattern("HTL")
                .input('H', ModBlocks.SKELETON_HEAD)
                .input('T', ModBlocks.SKELETON_TORSO)
                .input('A', ModBlocks.SKELETON_ARMS_CROSS)
                .input('L', ModBlocks.SKELETON_LEGS_CROSS)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_LAYING)));

        // Skeleton Torso
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_TORSO, 1)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" P ")
                .input('C', ModBlocks.SKELETON_CHEST)
                .input('S', ModBlocks.SKELETON_SPINE)
                .input('P', ModBlocks.SKELETON_PELVIS)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_TORSO)));

        // Skeleton Arms Cross
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_ARMS_CROSS, 1)
                .pattern("AA")
                .input('A', ModBlocks.SKELETON_ARM)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_ARMS_CROSS)));

        // Skeleton Legs Cross
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_LEGS_CROSS, 1)
                .pattern("AA")
                .input('A', ModBlocks.SKELETON_LEG)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_LEGS_CROSS)));

        // Skeleton Arms Cross
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_HEAD_STACK, 1)
                .pattern("HHH")
                .input('H', ModBlocks.SKELETON_HEAD)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_HEAD_STACK)));

        // Skeleton Half Body
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SKELETON_HALF_BODY, 1)
                .pattern("HAL")
                .input('H', ModBlocks.SKELETON_HEAD)
                .input('A', ModBlocks.SKELETON_ARM)
                .input('L', ModBlocks.SKELETON_LEG)
                .criterion("has_skeleton_head", conditionsFromItem(ModBlocks.SKELETON_HEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SKELETON_HALF_BODY)));
























    }

}


