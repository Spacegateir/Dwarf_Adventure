package net.spacegateir.dwarfadventuremod.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.spacegateir.dwarfadventuremod.item.ModItems;

public class ModLibarianTradeModifications {

    public static void registerLibarianModifications() {

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,1,
                factories -> {

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,6),
                            new ItemStack(Items.PAPER,18),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,24),
                            new ItemStack(Items.BOOKSHELF,4),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,6),
                            new ItemStack(Items.BOOK,3),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            new ItemStack(Items.LANTERN,4),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,1),
                            new ItemStack(Items.INK_SAC,8),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,2),
                            new ItemStack(Items.GLASS,8),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,3),
                            new ItemStack(Items.WRITABLE_BOOK,1),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            new ItemStack(Items.CLOCK,1),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            new ItemStack(Items.COMPASS,1),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            new ItemStack(Items.NAME_TAG,1),
                            16, 1, 0.1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_PROTECTION,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BLAST_PROTECTION,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROJECTILE_PROTECTION,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.RESPIRATION,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.AQUA_AFFINITY,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.THORNS,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.DEPTH_STRIDER,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FROST_WALKER,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BINDING_CURSE,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SOUL_SPEED,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SWIFT_SNEAK,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SMITE,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BANE_OF_ARTHROPODS,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.KNOCKBACK,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_ASPECT,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LOOTING,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SWEEPING,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.POWER,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PUNCH,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FLAME,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.INFINITY,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.EFFICIENCY,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SILK_TOUCH,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.UNBREAKING,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FORTUNE,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LUCK_OF_THE_SEA,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LURE,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LOYALTY,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.IMPALING,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.RIPTIDE,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.CHANNELING,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.MULTISHOT,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.QUICK_CHARGE,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PIERCING,1)),
                            16, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,4),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.VANISHING_CURSE,1)),
                            16, 1, 0.5f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,2,
                factories -> {

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_PROTECTION,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BLAST_PROTECTION,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROJECTILE_PROTECTION,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.RESPIRATION,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.THORNS,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.DEPTH_STRIDER,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FROST_WALKER,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SOUL_SPEED,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SWIFT_SNEAK,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SMITE,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BANE_OF_ARTHROPODS,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.KNOCKBACK,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_ASPECT,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LOOTING,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SWEEPING,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.POWER,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PUNCH,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.EFFICIENCY,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.UNBREAKING,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FORTUNE,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LUCK_OF_THE_SEA,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LURE,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LOYALTY,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.IMPALING,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.RIPTIDE,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.QUICK_CHARGE,2)),
                            8, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,8),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PIERCING,2)),
                            8, 1, 0.5f));

                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,3,
                factories -> {

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_PROTECTION,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BLAST_PROTECTION,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROJECTILE_PROTECTION,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.RESPIRATION,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.THORNS,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.DEPTH_STRIDER,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SOUL_SPEED,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SWIFT_SNEAK,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SMITE,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BANE_OF_ARTHROPODS,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LOOTING,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SWEEPING,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.POWER,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.EFFICIENCY,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.UNBREAKING,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FORTUNE,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LUCK_OF_THE_SEA,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LURE,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.LOYALTY,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.IMPALING,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.RIPTIDE,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.QUICK_CHARGE,3)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,16),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PIERCING,3)),
                            4, 1, 0.5f));

                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,4,
                factories -> {

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_PROTECTION,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BLAST_PROTECTION,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROJECTILE_PROTECTION,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SMITE,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BANE_OF_ARTHROPODS,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.POWER,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.EFFICIENCY,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.IMPALING,4)),
                            4, 1, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PIERCING,4)),
                            4, 1, 0.5f));

                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,5,
                factories -> {

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROTECTION,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FIRE_PROTECTION,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BLAST_PROTECTION,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PROJECTILE_PROTECTION,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SMITE,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BANE_OF_ARTHROPODS,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.POWER,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.EFFICIENCY,5)),
                            2, 50, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DWARF_COPPER_COIN_S,32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.IMPALING,5)),
                            2, 50, 0.5f));

                });



    }
}
