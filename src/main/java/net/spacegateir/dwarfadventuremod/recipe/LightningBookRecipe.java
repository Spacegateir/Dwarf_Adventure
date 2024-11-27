package net.spacegateir.dwarfadventuremod.recipe;

import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class LightningBookRecipe implements CraftingRecipe {

    private final Identifier id;

    public LightningBookRecipe(Identifier id) {
        this.id = id;
    }

    @Override
    public boolean matches(RecipeInputInventory inventory, World world) {
        // Update to match a 2x2 grid pattern ("DB")
        return inventory.getStack(0).getItem() == Items.DIAMOND &&
                inventory.getStack(1).getItem() == Items.BOOK;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager) {
        // Create the enchanted book
        ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK);
        enchantedBook.getOrCreateNbt().put("StoredEnchantments", new net.minecraft.nbt.NbtList());
        net.minecraft.nbt.NbtCompound enchantment = new net.minecraft.nbt.NbtCompound();
        enchantment.putString("id", "dwarfadventuremod:lightning_striker");
        enchantment.putInt("lvl", 1);
        enchantedBook.getOrCreateNbt().getList("StoredEnchantments", 10).add(enchantment);
        return enchantedBook;
    }

    @Override
    public boolean fits(int width, int height) {
        return width == 2 && height == 2; // Fit to the pattern defined in JSON (2x1)
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return craft(null, registryManager); // Reuse craft method for output
    }

    @Override
    public CraftingRecipeCategory getCategory() {
        return CraftingRecipeCategory.MISC;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.LIGHTNING_BOOK_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.LIGHTNING_BOOK_TYPE;
    }
}
