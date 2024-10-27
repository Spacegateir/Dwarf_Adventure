package net.spacegateir.dwarfadventuremod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.ModItems;

public class ModLootTableModifiers {

    private static final Identifier JUNGLE_TEMPLE_ID =
            new Identifier("minecraft","chests/jungle_temple");
    private static final Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft","chests/buried_treasure");
    private static final Identifier ZOMBIE_ID =
            new Identifier("minecraft","entities/zombie");
    private static final Identifier ZOMBIE_VILLAGER_ID =
            new Identifier("minecraft","entities/zombie_villager");
    private static final Identifier IRON_GOLEM_ID =
            new Identifier("minecraft","entities/iron_golem");

    private static final Identifier GHAST_ID =
            new Identifier("minecraft","entities/ghast");
    private static final Identifier BLAZE_ID =
            new Identifier("minecraft","entities/blaze");
    private static final Identifier GUARDIAN_ID =
            new Identifier("minecraft","entities/guardian");
    private static final Identifier SLIME_ID =
            new Identifier("minecraft","entities/slime");

//Bosses
    private static final Identifier ENDER_DRAGON_ID =
            new Identifier("minecraft","entities/ender_dragon");
    private static final Identifier WARDEN_ID =
            new Identifier("minecraft","entities/warden");
    private static final Identifier WITHER_ID =
            new Identifier("minecraft","entities/wither");
    private static final Identifier ELDER_GUARDIAN_ID =
            new Identifier("minecraft","entities/elder_guardian");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.ANCIENT_SEED))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.ANCIENT_SEED))
                        .with(ItemEntry.builder(ModItems.THALORUNS_SOULSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (ZOMBIE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.025f)) // Drops 2.5% of the time
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only drops when killed by player
                        .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (ZOMBIE_VILLAGER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // 5% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                        .with(ItemEntry.builder(ModItems.WAR_HAMMER))
                        .with(ItemEntry.builder(ModItems.DWARF_HAMMER))
                        .with(ItemEntry.builder(ModItems.PRESSURE_HAMMER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (IRON_GOLEM_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.005f)) // 0.5% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.GOLEM_CORE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (GHAST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // 50% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                        .with(ItemEntry.builder(ModItems.WIND_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (BLAZE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // 50% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                        .with(ItemEntry.builder(ModItems.FIRE_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (GUARDIAN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // 50% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                        .with(ItemEntry.builder(ModItems.WATER_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (SLIME_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // 50% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                        .with(ItemEntry.builder(ModItems.EARTH_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (ENDER_DRAGON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f)) // 0.1% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.PRESSURE_HAMMER))
                        .with(ItemEntry.builder(Blocks.DRAGON_EGG))
                        .with(ItemEntry.builder(ModBlocks.WIND_GEM_BLOCK))
                        .with(ItemEntry.builder(ModItems.ELEMENTAL_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (ENDER_DRAGON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // 100% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.WIND_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WITHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f)) // 0.1% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.WAR_HAMMER))
                        .with(ItemEntry.builder(ModBlocks.FIRE_GEM_BLOCK))
                        .with(ItemEntry.builder(ModItems.ELEMENTAL_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WITHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // 10% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.WITHER_BONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WITHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // 100% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.FIRE_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WARDEN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f)) // 0.1% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.DWARF_HAMMER))
                        .with(ItemEntry.builder(ModBlocks.EARTH_GEM_BLOCK))
                        .with(ItemEntry.builder(ModItems.ELEMENTAL_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WARDEN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // 10% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.WARDEN_HIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WARDEN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // 100% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.EARTH_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (ELDER_GUARDIAN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // 1% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.WAR_HAMMER))
                        .with(ItemEntry.builder(ModItems.DWARF_HAMMER))
                        .with(ItemEntry.builder(ModItems.PRESSURE_HAMMER))
                        .with(ItemEntry.builder(ModBlocks.WATER_GEM_BLOCK))
                        .with(ItemEntry.builder(ModItems.ELEMENTAL_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (ELDER_GUARDIAN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // 100% drop chance
                        .conditionally(KilledByPlayerLootCondition.builder().build()) // Only when killed by player
                        .with(ItemEntry.builder(ModItems.WATER_GEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (isChestLootTable(id)) {
                addLootToChests(tableBuilder);
            }
        }));
    }

    private static boolean isChestLootTable(Identifier id) {
        // Check if the loot table ID matches known chest loot tables
        return
                id.equals(new Identifier("minecraft", "chests/buried_treasure")) ||
                id.equals(new Identifier("minecraft", "chests/abandoned_mineshaft")) ||
                id.equals(new Identifier("minecraft", "chests/desert_pyramid")) ||
                id.equals(new Identifier("minecraft", "chests/jungle_temple")) ||
                id.equals(new Identifier("minecraft", "chests/jungle_temple_dispenser")) ||
                id.equals(new Identifier("minecraft", "chests/stronghold_corridor")) ||
                id.equals(new Identifier("minecraft", "chests/stronghold_crossing")) ||
                id.equals(new Identifier("minecraft", "chests/stronghold_library")) ||
                id.equals(new Identifier("minecraft", "chests/underwater_ruin_big")) ||
                id.equals(new Identifier("minecraft", "chests/underwater_ruin_small")) ||
                id.equals(new Identifier("minecraft", "chests/simple_dungeon"));
    }

    private static void addLootToChests(LootTable.Builder tableBuilder) {
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                .with(ItemEntry.builder(ModItems.DWARF_STEEL_INGOT))
                .with(ItemEntry.builder(ModItems.RAW_DWARF_STEEL))
                .with(ItemEntry.builder(ModItems.DWARF_GOLD_INGOT))
                .with(ItemEntry.builder(ModItems.RAW_DWARF_GOLD))
                .with(ItemEntry.builder(ModItems.ANCESTRAL_FORGE_COAL))
                .with(ItemEntry.builder(ModItems.CORRUPT_GEM))
                .with(ItemEntry.builder(ModItems.MORTAR_AND_PESTLE))
                .with(ItemEntry.builder(ModItems.DWARF_COPPER_COIN_S))
                .with(ItemEntry.builder(ModItems.DWARF_COPPER_COIN_M))

                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

        tableBuilder.pool(poolBuilder.build());
    }
}








