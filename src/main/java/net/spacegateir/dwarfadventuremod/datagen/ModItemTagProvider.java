package net.spacegateir.dwarfadventuremod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.ModItems;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {



        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(Items.NETHERITE_INGOT, Items.EMERALD, Items.DIAMOND, Items.GOLD_INGOT, Items.IRON_INGOT,
                        ModItems.DWARF_STEEL_INGOT, ModItems.DWARF_GOLD_INGOT, ModItems.AER_SPIRIT_INGOT, ModItems.IGNIS_SPIRIT_INGOT,
                        ModItems.AQUA_SPIRIT_INGOT, ModItems.TERA_SPIRIT_INGOT, ModItems.ELEMENTAL_GEM, ModItems.MAGIRITE_INGOT,
                        ModItems.PUREFICATED_MYTHRIL, ModItems.ADAMANTITE_INGOT, ModItems.ORIKALKUM_INGOT, ModItems.DRAGON_BANE_INGOT);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.DWARF_STEEL_HELMET, ModItems.DWARF_STEEL_CHESTPLATE, ModItems.DWARF_STEEL_LEGGINGS, ModItems.DWARF_STEEL_BOOTS)
                .add(ModItems.DWARF_GOLD_HELMET, ModItems.DWARF_GOLD_CHESTPLATE, ModItems.DWARF_GOLD_LEGGINGS, ModItems.DWARF_GOLD_BOOTS)
                .add(ModItems.AER_HELMET, ModItems.AER_CHESTPLATE, ModItems.AER_LEGGINGS, ModItems.AER_BOOTS)
                .add(ModItems.IGNIS_HELMET, ModItems.IGNIS_CHESTPLATE, ModItems.IGNIS_LEGGINGS, ModItems.IGNIS_BOOTS)
                .add(ModItems.AQUA_HELMET, ModItems.AQUA_CHESTPLATE, ModItems.AQUA_LEGGINGS, ModItems.AQUA_BOOTS)
                .add(ModItems.TERA_HELMET, ModItems.TERA_CHESTPLATE, ModItems.TERA_LEGGINGS, ModItems.TERA_BOOTS)
                .add(ModItems.MAGIRITE_HELMET, ModItems.MAGIRITE_CHESTPLATE, ModItems.MAGIRITE_LEGGINGS, ModItems.MAGIRITE_BOOTS)
                .add(ModItems.MYTHRIL_HELMET, ModItems.MYTHRIL_CHESTPLATE, ModItems.MYTHRIL_LEGGINGS, ModItems.MYTHRIL_BOOTS)
                .add(ModItems.ADAMANTITE_HELMET, ModItems.ADAMANTITE_CHESTPLATE, ModItems.ADAMANTITE_LEGGINGS, ModItems.ADAMANTITE_BOOTS)
                .add(ModItems.ORIKALKUM_HELMET, ModItems.ORIKALKUM_CHESTPLATE, ModItems.ORIKALKUM_LEGGINGS, ModItems.ORIKALKUM_BOOTS)
                .add(ModItems.DRAGON_BANE_HELMET, ModItems.DRAGON_BANE_CHESTPLATE, ModItems.DRAGON_BANE_LEGGINGS, ModItems.DRAGON_BANE_BOOTS);



    }

    public static class ModTags {
        public static class Items {
            public static final TagKey<Item> ANCIENT_FLOWER = TagKey.of(RegistryKeys.ITEM, new Identifier("dwarfadventuremod", "ancient_flower"));

        }
    }



}
