package net.spacegateir.dwarfadventuremod.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.item.ModItems;

public class ModModelPredicates {
    public static void registerModelPredicates() {
        // Register the custom shield predicate for your custom shield
        registerCustomShield(ModItems.DWARF_STEEL_SHIELD);
        registerCustomShield(ModItems.DWARF_GOLD_SHIELD);
        registerCustomShield(ModItems.AER_SHIELD);
        registerCustomShield(ModItems.IGNIS_SHIELD);
        registerCustomShield(ModItems.AQUA_SHIELD);
        registerCustomShield(ModItems.TERA_SHIELD);
        registerCustomShield(ModItems.MAGIRITE_SHIELD);
        registerCustomShield(ModItems.MYTHRIL_SHIELD);
        registerCustomShield(ModItems.ADAMANTITE_SHIELD);
        registerCustomShield(ModItems.ORIKALKUM_SHIELD);
        registerCustomShield(ModItems.DRAGON_BANE_SHIELD);

    }

    private static void registerCustomShield(Item item) {
        // Register the blocking model predicate for the custom shield
        ModelPredicateProviderRegistry.register(
                item, // The custom shield item
                new Identifier("blocking"), // The predicate identifier
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
        );
    }
}
