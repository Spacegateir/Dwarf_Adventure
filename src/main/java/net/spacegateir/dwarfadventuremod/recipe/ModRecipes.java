package net.spacegateir.dwarfadventuremod.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModRecipes {
    public static final RecipeType<LightningBookRecipe> LIGHTNING_BOOK_TYPE =
            Registry.register(Registries.RECIPE_TYPE, new Identifier("dwarfadventuremod", "lightning_book"), new RecipeType<>() {});

    public static final RecipeSerializer<LightningBookRecipe> LIGHTNING_BOOK_SERIALIZER =
            Registry.register(Registries.RECIPE_SERIALIZER, new Identifier("dwarfadventuremod", "lightning_book"), new LightningBookRecipeSerializer());

    public static void register() {
        // Ensure recipes are registered correctly
    }
}
