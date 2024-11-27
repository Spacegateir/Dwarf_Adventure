package net.spacegateir.dwarfadventuremod.recipe;

import com.google.gson.JsonObject;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;

public class LightningBookRecipeSerializer implements RecipeSerializer<LightningBookRecipe> {
    @Override
    public LightningBookRecipe read(Identifier id, JsonObject json) {
        return new LightningBookRecipe(id); // Deserialize from JSON
    }

    @Override
    public LightningBookRecipe read(Identifier id, PacketByteBuf buf) {
        return new LightningBookRecipe(id); // Deserialize from packet buffer
    }

    @Override
    public void write(PacketByteBuf buf, LightningBookRecipe recipe) {
        // Write recipe data if necessary, for now it's empty.
    }
}
