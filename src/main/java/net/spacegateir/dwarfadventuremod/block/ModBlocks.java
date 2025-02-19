package net.spacegateir.dwarfadventuremod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;
import net.spacegateir.dwarfadventuremod.block.MythrilBuddingCluster.BuddingMythrilBlock;
import net.spacegateir.dwarfadventuremod.block.MythrilBuddingCluster.MythrilBlock;
import net.spacegateir.dwarfadventuremod.block.MythrilBuddingCluster.MythrilClusterBlock;
import net.spacegateir.dwarfadventuremod.block.custom.*;
import net.spacegateir.dwarfadventuremod.block.custom.GlassLikeBlock;
import net.spacegateir.dwarfadventuremod.block.custom.SkeletonParts.SkeletonBoneParts;
import net.spacegateir.dwarfadventuremod.block.custom.SkeletonParts.SkeletonHalfParts;
import net.spacegateir.dwarfadventuremod.block.custom.SkeletonParts.SkeletonParts;
import net.spacegateir.dwarfadventuremod.block.traps.*;
import net.spacegateir.dwarfadventuremod.block.traps.EffectBlocks.*;
import net.spacegateir.dwarfadventuremod.block.workstations.*;

public class ModBlocks {

    public static final Block POWER_PRECISION_BLOCK = registerBlock("power_precision_block_0",
            new PowerPrecisionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).resistance(50.0F).hardness(50.0F)));



    public static final Block CURSED_BLOCK = registerBlock("cursed_block",
            new CursedBlock(FabricBlockSettings.copyOf(Blocks.SCULK).resistance(50.0F).hardness(50.0F)));

    public static final Block COURSE_DIRT_TRAP_BLOCK = registerBlock("course_dirt_trap_block",
            new CourseDirtTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block COURSE_DIRT_TRAP_BLOCK_SPIKES = registerBlock("course_dirt_trap_block_spikes",
            new CourseDirtTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block STONE_TRAP_BLOCK = registerBlock("stone_trap_block",
            new StoneTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STONE_TRAP_BLOCK_SPIKES = registerBlock("stone_trap_block_spikes",
            new StoneTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block DEEPSLATE_TRAP_BLOCK = registerBlock("deepslate_trap_block",
            new DeepslateTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block DEEPSLATE_TRAP_BLOCK_SPIKES = registerBlock("deepslate_trap_block_spikes",
            new DeepslateTrapBlock(FabricBlockSettings.copyOf(Blocks.STONE).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block SAND_QUICKSAND = registerBlock("sand_quicksand",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.SAND).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block RED_SAND_QUICKSAND = registerBlock("red_sand_quicksand",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block GRAVEL_SINKSTONE = registerBlock("gravel_sinkstone",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block MUD_SINKING_SLUDGE = registerBlock("mud_sinking_sludge",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.MUD).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));
    public static final Block SOUL_SAND_PHANTOM_QUICKSAND = registerBlock("soul_sand_phantom_quicksand",
            new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).noCollision().solid()));

    public static final Block FLAREFORGE_BLOCK = registerBlock("flareforge_block",
            new FlareforgeBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block NETHER_STEAM_VENT = registerBlock("nether_steam_vent",
            new FlareforgeBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_TOTEM_BLOCK = registerBlock("cursed_totem_block",
            new WonderingTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).nonOpaque().resistance(50.0F).hardness(50.0F)));
    public static final Block TELEPORT_TRAP_BLOCK = registerBlock("teleport_trap_block",
            new TeleportTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block FROST_BITE_TRAP_BLOCK = registerBlock("frost_bite_trap_block",
            new FrostBitTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_NAUSEA_TRAP_BLOCK = registerBlock("cursed_nausea_trap_block",
            new CursedNauseaTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_POISON_SPORE_TRAP_BLOCK = registerBlock("cursed_poison_spore_trap_block",
            new CursedPoisonSporeTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).nonOpaque().allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CURSED_BRASIER_TRAP_BLOCK = registerBlock("cursed_brasier_trap_block",
            new HungerZoneTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).nonOpaque().allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block SPIRIT_JUMP_TRAP = registerBlock("spirit_jump_trap",
            new SpiritJumpTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block SPIRIT_JUMP_TRAP_BLOCK = registerBlock("spirit_jump_trap_block",
            new SpiritJumpTrapBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new TestBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F).ticksRandomly()));

    public static final Block SPEED_BLOCK = registerBlock("speed_block",
            new SpeedBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block SLOWNESS_BLOCK = registerBlock("slowness_block",
            new SlownessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block ABSORBING_BLOCK = registerBlock("absorbing_block",
            new AbsorptionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block HUNGER_BLOCK = registerBlock("hunger_block",
            new HungerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block SATURATION_BLOCK = registerBlock("saturation_block",
            new SaturationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block BAD_OMEN_BLOCK = registerBlock("bad_omen_block",
            new BadOmenBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block BLINDNESS_BLOCK = registerBlock("blindness_block",
            new BlindnessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block CONDUIT_POWER_BLOCK = registerBlock("conduit_power_block",
            new ConduitPowerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block DARKNESS_BLOCK = registerBlock("darkness_block",
            new DarknessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block DOLPHINS_GRACE_BLOCK = registerBlock("dolphins_grace_block",
            new DolphinsGraceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block FIRE_RESISTANCE_BLOCK = registerBlock("fire_resistance_block",
            new FireResistanceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block GLOWING_BLOCK = registerBlock("glowing_block",
            new GlowingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block HASTE_BLOCK = registerBlock("haste_block",
            new HasteBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block HERO_OF_THE_VILLAGE_BLOCK = registerBlock("hero_of_the_village_block",
            new HeroOfTheVillageBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block INSTANT_DAMAGE_BLOCK = registerBlock("instant_damage_block",
            new InstantDamageBlcok(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block INVISIBILITY_BLOCK = registerBlock("invisibility_block",
            new InvisibilityBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block JUMP_BOOST_BLOCK = registerBlock("jump_boost_block",
            new JumpBoostBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block LEVEITATION_BLOCK = registerBlock("levitation_block",
            new LevitationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block LUCK_BLOCK = registerBlock("luck_block",
            new LuckBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block MINING_FATIGUE_BLOCK = registerBlock("mining_fatigue_block",
            new MiningFatigueBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block NAUSEA_BLOCK = registerBlock("nausea_block",
            new NauseaBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block NIGHT_VISION_BLOCK = registerBlock("night_vision_block",
            new NightVisionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block POISON_BLOCK = registerBlock("poison_block",
            new PoisonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block REGENERATION_BLOCK = registerBlock("regeneration_block",
            new RegenerationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block RESISTANCE_BLOCK = registerBlock("resistance_block",
            new ResistanceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block SLOW_FALLING_BLOCK = registerBlock("slow_falling_block",
            new SlowFallingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STRENGTH_BLOCK = registerBlock("strength_block",
            new StrengthBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block UNLUCK_BLOCK = registerBlock("unluck_block",
            new UnluckBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block WATER_BREATHING_BLOCK = registerBlock("water_breathing_block",
            new WaterBreathingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block WEAKNESS_BLOCK = registerBlock("weakness_block",
            new WeaknessBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block WITHER_BLOCK = registerBlock("wither_block",
            new WitherBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block HEALTH_BOOST_BLOCK = registerBlock("health_boost_block",
            new HealthBoostBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block INSTANT_HEALTH_BLOCK = registerBlock("instant_health_block",
            new InstantHealthBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));

    public static final Block DISORIENT_BLOCK = registerBlock("disorient_block",
            new DisorientBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STICKY_FEAT_BLOCK = registerBlock("sticky_feat_block",
            new StickyFeatBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STATUS_REMOVAL_BLOCK = registerBlock("status_removal_block",
            new StatusRemovalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STATUS_REMOVAL_POSITIVE_BLOCK = registerBlock("status_removal_positive_block",
            new StatusRemovalPositiveBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STATUS_REMOVAL_NEGATIVE_BLOCK = registerBlock("status_removal_negative_block",
            new StatusRemovalNegativeBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));
    public static final Block STATUS_REMOVAL_NEUTRAL_BLOCK = registerBlock("status_removal_neutral_block",
            new StatusRemovalNeutralBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).resistance(50.0F).hardness(50.0F)));





    public static final Block EMPTY_BRASIER = registerBlock("empty_brasier",
            new BrasierBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque().luminance(15)));

    public static final Block SKELETON_SITTING = registerBlock("skeleton_sitting",
            new SkeletonParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_HEAD = registerBlock("skeleton_head",
            new SkeletonHalfParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_CHEST = registerBlock("skeleton_chest",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_ARM = registerBlock("skeleton_arm",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_LEG = registerBlock("skeleton_leg",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_PELVIS = registerBlock("skeleton_pelvis",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_SPINE = registerBlock("skeleton_spine",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_TORSO = registerBlock("skeleton_torso",
            new SkeletonParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_HALF_BODY = registerBlock("skeleton_half_body",
            new SkeletonHalfParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_HEAD_STACK = registerBlock("skeleton_head_stack",
            new SkeletonParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_ARMS_CROSS = registerBlock("skeleton_arms_cross",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_LEGS_CROSS = registerBlock("skeleton_legs_cross",
            new SkeletonBoneParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));
    public static final Block SKELETON_LAYING = registerBlock("skeleton_laying",
            new SkeletonHalfParts(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never).nonOpaque()));



    public static final Block CASH_REGISTER = registerBlock("cash_register",
            new CashRegisterBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block WEAPON_RACK = registerBlock("weapon_rack",
            new WeaponRackBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block TOOL_RACK = registerBlock("tool_rack",
            new ToolRackBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block GARDEN_BENCH = registerBlock("garden_bench",
            new GardenBenchBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block GARDEN_POT = registerBlock("garden_pot",
            new GardenPotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block GARDEN_POTTED_POT = registerBlock("garden_potted_pot",
            new GardenPottedPotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block DWARF_ANVIL = registerBlock("dwarf_anvil",
            new DwarfAnvilBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));
    public static final Block DWARF_ANVIL_GROUND = registerBlock("dwarf_anvil_ground",
            new DwarfAnvilGroundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));
    public static final Block DWARF_ANVIL_TURN = registerBlock("dwarf_anvil_turn",
            new DwarfAnvilTurnBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));
    public static final Block DWARF_ANVIL_STACK = registerBlock("dwarf_anvil_stack",
            new DwarfAnvilStackBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));
    public static final Block DWARF_ANVIL_OVER = registerBlock("dwarf_anvil_over",
            new DwarfAnvilOverBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));
    public static final Block DWARF_FORGE = registerBlock("dwarf_forge",
            new DwarfForgeBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).nonOpaque()));
    public static final Block DWARF_BELLOWS = registerBlock("dwarf_bellows",
            new DwarfBellowsBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block STORAGE_CREATE = registerBlock("storage_create",
            new StorageCreateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block STORAGE_CREATE_SMALL = registerBlock("storage_create_small",
            new StorageCreateSmallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block STORAGE_CREATE_LARGE = registerBlock("storage_create_large",
            new StorageCreateLargeBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block STORAGE_CREATE_DOUBLE = registerBlock("storage_create_double",
            new StorageCreateDoubleBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

//Dwarf Steel
    public static final Block RAW_DWARF_STEEL_BLOCK = registerBlock("raw_dwarf_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DWARF_STEEL_BLOCK = registerBlock("dwarf_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));

    public static final Block DWARF_STEEL_STAIRS = registerBlock("dwarf_steel_stairs",
            new StairsBlock(ModBlocks.DWARF_STEEL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DWARF_STEEL_SLAB = registerBlock("dwarf_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DWARF_STEEL_BUTTON = registerBlock("dwarf_steel_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block DWARF_STEEL_PRESSURE_PLATE = registerBlock("dwarf_steel_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));
    public static final Block DWARF_STEEL_FENCE = registerBlock("dwarf_steel_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DWARF_STEEL_FENCE_GATE = registerBlock("dwarf_steel_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.OAK));
    public static final Block DWARF_STEEL_WALL = registerBlock("dwarf_steel_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DWARF_STEEL_DOOR = registerBlock("dwarf_steel_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block DWARF_STEEL_TRAPDOOR = registerBlock("dwarf_steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block RAW_DWARF_STEEL_STAIRS = registerBlock("raw_dwarf_steel_stairs",
            new StairsBlock(ModBlocks.RAW_DWARF_STEEL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DWARF_STEEL_SLAB = registerBlock("raw_dwarf_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DWARF_STEEL_BUTTON = registerBlock("raw_dwarf_steel_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAW_DWARF_STEEL_PRESSURE_PLATE = registerBlock("raw_dwarf_steel_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));
    public static final Block RAW_DWARF_STEEL_FENCE = registerBlock("raw_dwarf_steel_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_DWARF_STEEL_FENCE_GATE = registerBlock("raw_dwarf_steel_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.OAK));
    public static final Block RAW_DWARF_STEEL_WALL = registerBlock("raw_dwarf_steel_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_DWARF_STEEL_DOOR = registerBlock("raw_dwarf_steel_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_DWARF_STEEL_TRAPDOOR = registerBlock("raw_dwarf_steel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));


    //Wind Gem Block

    public static final Block WIND_GEM_BLOCK = registerBlock("wind_gem_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block WIND_GEM_STAIRS = registerBlock("wind_gem_stairs",
            new StairsBlock(ModBlocks.WIND_GEM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block WIND_GEM_SLAB = registerBlock("wind_gem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block WIND_GEM_BUTTON = registerBlock("wind_gem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block WIND_GEM_PRESSURE_PLATE = registerBlock("wind_gem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block WIND_GEM_FENCE = registerBlock("wind_gem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block WIND_GEM_FENCE_GATE = registerBlock("wind_gem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block WIND_GEM_WALL = registerBlock("wind_gem_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block AER_SPIRITSTONE_DOOR = registerBlock("aer_spiritstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block AER_SPIRITSTONE_TRAPDOOR = registerBlock("aer_spiritstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Aer Block

    public static final Block AER_BLOCK = registerBlock("aer_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block AER_STAIRS = registerBlock("aer_stairs",
            new StairsBlock(ModBlocks.AER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block AER_SLAB = registerBlock("aer_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block AER_BUTTON = registerBlock("aer_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block AER_PRESSURE_PLATE = registerBlock("aer_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block AER_FENCE = registerBlock("aer_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block AER_FENCE_GATE = registerBlock("aer_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block AER_WALL = registerBlock("aer_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block AER_DOOR = registerBlock("aer_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block AER_TRAPDOOR = registerBlock("aer_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Fire Gem Block

    public static final Block FIRE_GEM_BLOCK = registerBlock("fire_gem_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block FIRE_GEM_STAIRS = registerBlock("fire_gem_stairs",
            new StairsBlock(ModBlocks.FIRE_GEM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block FIRE_GEM_SLAB = registerBlock("fire_gem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block FIRE_GEM_BUTTON = registerBlock("fire_gem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block FIRE_GEM_PRESSURE_PLATE = registerBlock("fire_gem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block FIRE_GEM_FENCE = registerBlock("fire_gem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block FIRE_GEM_FENCE_GATE = registerBlock("fire_gem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block FIRE_GEM_WALL = registerBlock("fire_gem_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block IGNIS_SPIRITSTONE_DOOR = registerBlock("ignis_spiritstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block IGNIS_SPIRITSTONE_TRAPDOOR = registerBlock("ignis_spiritstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Ignis Block

    public static final Block IGNIS_BLOCK = registerBlock("ignis_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block IGNIS_STAIRS = registerBlock("ignis_stairs",
            new StairsBlock(ModBlocks.IGNIS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block IGNIS_SLAB = registerBlock("ignis_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block IGNIS_BUTTON = registerBlock("ignis_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block IGNIS_PRESSURE_PLATE = registerBlock("ignis_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block IGNIS_FENCE = registerBlock("ignis_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block IGNIS_FENCE_GATE = registerBlock("ignis_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block IGNIS_WALL = registerBlock("ignis_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block IGNIS_DOOR = registerBlock("ignis_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block IGNIS_TRAPDOOR = registerBlock("ignis_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Water Gem Block

    public static final Block WATER_GEM_BLOCK = registerBlock("water_gem_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block WATER_GEM_STAIRS = registerBlock("water_gem_stairs",
            new StairsBlock(ModBlocks.WATER_GEM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block WATER_GEM_SLAB = registerBlock("water_gem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block WATER_GEM_BUTTON = registerBlock("water_gem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block WATER_GEM_PRESSURE_PLATE = registerBlock("water_gem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block WATER_GEM_FENCE = registerBlock("water_gem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block WATER_GEM_FENCE_GATE = registerBlock("water_gem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block WATER_GEM_WALL = registerBlock("water_gem_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block AQUA_SPITIRSTONE_DOOR = registerBlock("aqua_spiritstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block AQUA_SPIRITSTONE_TRAPDOOR = registerBlock("aqua_spiritstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Aqua Block

    public static final Block AQUA_BLOCK = registerBlock("aqua_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block AQUA_STAIRS = registerBlock("aqua_stairs",
            new StairsBlock(ModBlocks.AQUA_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block AQUA_SLAB = registerBlock("aqua_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block AQUA_BUTTON = registerBlock("aqua_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block AQUA_PRESSURE_PLATE = registerBlock("aqua_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block AQUA_FENCE = registerBlock("aqua_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block AQUA_FENCE_GATE = registerBlock("aqua_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block AQUA_WALL = registerBlock("aqua_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block AQUA_DOOR = registerBlock("aqua_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block AQUA_TRAPDOOR = registerBlock("aqua_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Earth Gem Block

    public static final Block EARTH_GEM_BLOCK = registerBlock("earth_gem_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block EARTH_GEM_STAIRS = registerBlock("earth_gem_stairs",
            new StairsBlock(ModBlocks.EARTH_GEM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block EARTH_GEM_SLAB = registerBlock("earth_gem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block EARTH_GEM_BUTTON = registerBlock("earth_gem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block EARTH_GEM_PRESSURE_PLATE = registerBlock("earth_gem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block EARTH_GEM_FENCE = registerBlock("earth_gem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block EARTH_GEM_FENCE_GATE = registerBlock("earth_gem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block EARTH_GEM_WALL = registerBlock("earth_gem_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block TERA_SPIRITSTONE_DOOR = registerBlock("tera_spiritstone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block TERA_SPIRITSTONE_TRAPDOOR = registerBlock("tera_spiritstone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Tera Block

    public static final Block TERA_BLOCK = registerBlock("tera_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block TERA_STAIRS = registerBlock("tera_stairs",
            new StairsBlock(ModBlocks.TERA_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block TERA_SLAB = registerBlock("tera_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block TERA_BUTTON = registerBlock("tera_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block TERA_PRESSURE_PLATE = registerBlock("tera_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block TERA_FENCE = registerBlock("tera_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block TERA_FENCE_GATE = registerBlock("tera_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block TERA_WALL = registerBlock("tera_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block TERA_DOOR = registerBlock("tera_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block TERA_TRAPDOOR = registerBlock("tera_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Elemental Gem Block

    public static final Block ELEMENTAL_GEM_BLOCK = registerBlock("elemental_gem_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).strength(3F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block ELEMENTAL_GEM_STAIRS = registerBlock("elemental_gem_stairs",
            new StairsBlock(ModBlocks.ELEMENTAL_GEM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ELEMENTAL_GEM_SLAB = registerBlock("elemental_gem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ELEMENTAL_GEM_BUTTON = registerBlock("elemental_gem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block ELEMENTAL_GEM_PRESSURE_PLATE = registerBlock("elemental_gem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block ELEMENTAL_GEM_FENCE = registerBlock("elemental_gem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block ELEMENTAL_GEM_FENCE_GATE = registerBlock("elemental_gem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block ELEMENTAL_GEM_WALL = registerBlock("elemental_gem_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block QUINTESSENCE_DOOR = registerBlock("quintessence_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block QUINTESSENCE_TRAPDOOR = registerBlock("quintessence_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //Magirite
    public static final Block RAW_MAGIRITE_BLOCK = registerBlock("raw_magirite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_MAGIRITE_STAIRS = registerBlock("raw_magirite_stairs",
            new StairsBlock(ModBlocks.RAW_MAGIRITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_MAGIRITE_SLAB = registerBlock("raw_magirite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_MAGIRITE_BUTTON = registerBlock("raw_magirite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAW_MAGIRITE_PRESSURE_PLATE = registerBlock("raw_magirite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block RAW_MAGIRITE_FENCE = registerBlock("raw_magirite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_MAGIRITE_FENCE_GATE = registerBlock("raw_magirite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block RAW_MAGIRITE_WALL = registerBlock("raw_magirite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_MAGIRITE_DOOR = registerBlock("raw_magirite_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_MAGIRITE_TRAPDOOR = registerBlock("raw_magirite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block MAGIRITE_BLOCK = registerBlock("magirite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block MAGIRITE_STAIRS = registerBlock("magirite_stairs",
            new StairsBlock(ModBlocks.MAGIRITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block MAGIRITE_SLAB = registerBlock("magirite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block MAGIRITE_BUTTON = registerBlock("magirite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block MAGIRITE_PRESSURE_PLATE = registerBlock("magirite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block MAGIRITE_FENCE = registerBlock("magirite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block MAGIRITE_FENCE_GATE = registerBlock("magirite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block MAGIRITE_WALL = registerBlock("magirite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block MAGIRITE_DOOR = registerBlock("magirite_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block MAGIRITE_TRAPDOOR = registerBlock("magirite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    //mythril

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new MythrilBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never)));
    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new StairsBlock(ModBlocks.MYTHRIL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block MYTHRIL_WALL = registerBlock("mythril_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block MYTHRIL_DOOR = registerBlock("mythril_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque(), BlockSetType.OAK));
    public static final Block MYTHRIL_TRAPDOOR = registerBlock("mythril_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque(), BlockSetType.OAK));

    //Pureficated Mythril

    public static final Block PUREFICATED_MYTHRIL_BLOCK = registerBlock("pureficated_mythril_block",
            new GlassLikeBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().allowsSpawning(Blocks::never).nonOpaque()
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PUREFICATED_MYTHRIL_STAIRS = registerBlock("pureficated_mythril_stairs",
            new StairsBlock(ModBlocks.PUREFICATED_MYTHRIL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .allowsSpawning(Blocks::never).nonOpaque().solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PUREFICATED_MYTHRIL_SLAB = registerBlock("pureficated_mythril_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).allowsSpawning(Blocks::never)
                    .nonOpaque().solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PUREFICATED_MYTHRIL_BUTTON = registerBlock("pureficated_mythril_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK, 10, true));
    public static final Block PUREFICATED_MYTHRIL_PRESSURE_PLATE = registerBlock("pureficated_mythril_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), BlockSetType.OAK));
    public static final Block PUREFICATED_MYTHRIL_FENCE = registerBlock("pureficated_mythril_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .nonOpaque().solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PUREFICATED_MYTHRIL_FENCE_GATE = registerBlock("pureficated_mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK), WoodType.OAK));
    public static final Block PUREFICATED_MYTHRIL_WALL = registerBlock("pureficated_mythril_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque().solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PUREFICATED_MYTHRIL_DOOR = registerBlock("pureficated_mythril_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque(), BlockSetType.OAK));
    public static final Block PUREFICATED_MYTHRIL_TRAPDOOR = registerBlock("pureficated_mythril_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).nonOpaque(), BlockSetType.OAK));


    //Adamantite
    public static final Block RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_ADAMANTITE_STAIRS = registerBlock("raw_adamantite_stairs",
            new StairsBlock(ModBlocks.RAW_ADAMANTITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_ADAMANTITE_SLAB = registerBlock("raw_adamantite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_ADAMANTITE_BUTTON = registerBlock("raw_adamantite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAW_ADAMANTITE_PRESSURE_PLATE = registerBlock("raw_adamantite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block RAW_ADAMANTITE_FENCE = registerBlock("raw_adamantite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_ADAMANTITE_FENCE_GATE = registerBlock("raw_adamantite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block RAW_ADAMANTITE_WALL = registerBlock("raw_adamantite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_ADAMANTITE_DOOR = registerBlock("raw_adamantite_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_ADAMANTITE_TRAPDOOR = registerBlock("raw_adamantite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ADAMANTITE_STAIRS = registerBlock("adamantite_stairs",
            new StairsBlock(ModBlocks.ADAMANTITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ADAMANTITE_SLAB = registerBlock("adamantite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ADAMANTITE_BUTTON = registerBlock("adamantite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block ADAMANTITE_PRESSURE_PLATE = registerBlock("adamantite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block ADAMANTITE_FENCE = registerBlock("adamantite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ADAMANTITE_FENCE_GATE = registerBlock("adamantite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block ADAMANTITE_WALL = registerBlock("adamantite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ADAMANTITE_DOOR = registerBlock("adamantite_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block ADAMANTITE_TRAPDOOR = registerBlock("adamantite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));


    //Orikalkum
    public static final Block RAW_ORIKALKUM_BLOCK = registerBlock("raw_orikalkum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_ORIKALKUM_STAIRS = registerBlock("raw_orikalkum_stairs",
            new StairsBlock(ModBlocks.RAW_ORIKALKUM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_ORIKALKUM_SLAB = registerBlock("raw_orikalkum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_ORIKALKUM_BUTTON = registerBlock("raw_orikalkum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAW_ORIKALKUM_PRESSURE_PLATE = registerBlock("raw_orikalkum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block RAW_ORIKALKUM_FENCE = registerBlock("raw_orikalkum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_ORIKALKUM_FENCE_GATE = registerBlock("raw_orikalkum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block RAW_ORIKALKUM_WALL = registerBlock("raw_orikalkum_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_ORIKALKUM_DOOR = registerBlock("raw_orikalkum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_ORIKALKUM_TRAPDOOR = registerBlock("raw_orikalkum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block ORIKALKUM_BLOCK = registerBlock("orikalkum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ORIKALKUM_STAIRS = registerBlock("orikalkum_stairs",
            new StairsBlock(ModBlocks.ORIKALKUM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ORIKALKUM_SLAB = registerBlock("orikalkum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block ORIKALKUM_BUTTON = registerBlock("orikalkum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block ORIKALKUM_PRESSURE_PLATE = registerBlock("orikalkum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block ORIKALKUM_FENCE = registerBlock("orikalkum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ORIKALKUM_FENCE_GATE = registerBlock("orikalkum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block ORIKALKUM_WALL = registerBlock("orikalkum_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ORIKALKUM_DOOR = registerBlock("orikalkum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block ORIKALKUM_TRAPDOOR = registerBlock("orikalkum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));


    //Dragon Bane
    public static final Block RAW_DRAGON_BANE_BLOCK = registerBlock("raw_dragon_bane_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DRAGON_BANE_STAIRS = registerBlock("raw_dragon_bane_stairs",
            new StairsBlock(ModBlocks.RAW_DRAGON_BANE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DRAGON_BANE_SLAB = registerBlock("raw_dragon_bane_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DRAGON_BANE_BUTTON = registerBlock("raw_dragon_bane_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAW_DRAGON_BANE_PRESSURE_PLATE = registerBlock("raw_dragon_bane_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block RAW_DRAGON_BANE_FENCE = registerBlock("raw_dragon_bane_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_DRAGON_BANE_FENCE_GATE = registerBlock("raw_dragon_bane_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block RAW_DRAGON_BANE_WALL = registerBlock("raw_dragon_bane_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_DRAGON_BANE_DOOR = registerBlock("raw_dragon_bane_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_DRAGON_BANE_TRAPDOOR = registerBlock("raw_dragon_bane_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block DRAGON_BANE_BLOCK = registerBlock("dragon_bane_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DRAGON_BANE_STAIRS = registerBlock("dragon_bane_stairs",
            new StairsBlock(ModBlocks.DRAGON_BANE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DRAGON_BANE_SLAB = registerBlock("dragon_bane_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DRAGON_BANE_BUTTON = registerBlock("dragon_bane_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block DRAGON_BANE_PRESSURE_PLATE = registerBlock("dragon_bane_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block DRAGON_BANE_FENCE = registerBlock("dragon_bane_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block DRAGON_BANE_FENCE_GATE = registerBlock("dragon_bane_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block DRAGON_BANE_WALL = registerBlock("dragon_bane_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block DRAGON_BANE_DOOR = registerBlock("dragon_bane_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block DRAGON_BANE_TRAPDOOR = registerBlock("dragon_bane_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));


    //Dwarf Gold
    public static final Block RAW_DWARF_GOLD_BLOCK = registerBlock("raw_dwarf_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DWARF_GOLD_STAIRS = registerBlock("raw_dwarf_gold_stairs",
            new StairsBlock(ModBlocks.RAW_DWARF_GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DWARF_GOLD_SLAB = registerBlock("raw_dwarf_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block RAW_DWARF_GOLD_BUTTON = registerBlock("raw_dwarf_gold_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAW_DWARF_GOLD_PRESSURE_PLATE = registerBlock("raw_dwarf_gold_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block RAW_DWARF_GOLD_FENCE = registerBlock("raw_dwarf_gold_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_DWARF_GOLD_FENCE_GATE = registerBlock("raw_dwarf_gold_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block RAW_DWARF_GOLD_WALL = registerBlock("raw_dwarf_gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block RAW_DWARF_GOLD_DOOR = registerBlock("raw_dwarf_gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_DWARF_GOLD_TRAPDOOR = registerBlock("raw_dwarf_gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));

    public static final Block DWARF_GOLD_BLOCK = registerBlock("dwarf_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DWARF_GOLD_STAIRS = registerBlock("dwarf_gold_stairs",
            new StairsBlock(ModBlocks.DWARF_GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DWARF_GOLD_SLAB = registerBlock("dwarf_gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).allowsSpawning(Blocks::never)));
    public static final Block DWARF_GOLD_BUTTON = registerBlock("dwarf_gold_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block DWARF_GOLD_PRESSURE_PLATE = registerBlock("dwarf_gold_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), BlockSetType.IRON));
    public static final Block DWARF_GOLD_FENCE = registerBlock("dwarf_gold_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block DWARF_GOLD_FENCE_GATE = registerBlock("dwarf_gold_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK), WoodType.OAK));
    public static final Block DWARF_GOLD_WALL = registerBlock("dwarf_gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block DWARF_GOLD_DOOR = registerBlock("dwarf_gold_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Block DWARF_GOLD_TRAPDOOR = registerBlock("dwarf_gold_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).nonOpaque(), BlockSetType.OAK));



    public static final Block ANCIENT_FLOWER_CROP = Registry.register(Registries.BLOCK, new Identifier(DwarfAdventureMod.MOD_ID,"ancient_flower_crop"),
            new AncientCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    public static final Block SNOW_DROP_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "snow_drop_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_SNOW_DROP_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_snow_drop_flower"),
            new FlowerPotBlock(SNOW_DROP_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_SNOW_DROP_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_snow_drop_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_SNOW_DROP_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_snow_drop_flower"),
            new FlowerPotBlock(CORRUPT_SNOW_DROP_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_SNOW_DROP_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_snow_drop_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_SNOW_DROP_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_snow_drop_flower"),
            new FlowerPotBlock(ANCIENT_SNOW_DROP_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block CARNATION_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "carnation_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_CARNATION_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_carnation_flower"),
            new FlowerPotBlock(CARNATION_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_CARNATION_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_carnation_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_CARNATION_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_carnation_flower"),
            new FlowerPotBlock(CORRUPT_CARNATION_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_CARNATION_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_carnation_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_CARNATION_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_carnation_flower"),
            new FlowerPotBlock(ANCIENT_CARNATION_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block VIOLET_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "violet_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_VIOLET_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_violet_flower"),
            new FlowerPotBlock(VIOLET_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_VIOLET_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_violet_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_VIOLET_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_violet_flower"),
            new FlowerPotBlock(CORRUPT_VIOLET_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_VIOLET_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_violet_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_VIOLET_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_violet_flower"),
            new FlowerPotBlock(ANCIENT_VIOLET_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block IRIS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "iris_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_IRIS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_iris_flower"),
            new FlowerPotBlock(IRIS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_IRIS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_iris_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_IRIS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_iris_flower"),
            new FlowerPotBlock(CORRUPT_IRIS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_IRIS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_iris_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_IRIS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_iris_flower"),
            new FlowerPotBlock(ANCIENT_IRIS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block PRIMROSE_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "primrose_flower"),
            new FlowerBlock(StatusEffects.REGENERATION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_PRIMROSE_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_primrose_flower"),
            new FlowerPotBlock(PRIMROSE_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_PRIMROSE_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_primrose_flower"),
            new FlowerBlock(StatusEffects.REGENERATION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_PRIMROSE_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_primrose_flower"),
            new FlowerPotBlock(CORRUPT_PRIMROSE_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_PRIMROSE_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_primrose_flower"),
            new FlowerBlock(StatusEffects.REGENERATION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_PRIMROSE_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_primrose_flower"),
            new FlowerPotBlock(ANCIENT_PRIMROSE_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block DAFFODIL_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "daffodil_flower"),
            new FlowerBlock(StatusEffects.SPEED, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_DAFFODIL_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_daffodil_flower"),
            new FlowerPotBlock(DAFFODIL_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_DAFFODIL_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_daffodil_flower"),
            new FlowerBlock(StatusEffects.SPEED, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_DAFFODIL_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_daffodil_flower"),
            new FlowerPotBlock(CORRUPT_DAFFODIL_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_DAFFODIL_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_daffodil_flower"),
            new FlowerBlock(StatusEffects.SPEED, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_DAFFODIL_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_daffodil_flower"),
            new FlowerPotBlock(ANCIENT_DAFFODIL_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block DELPHINIUM_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "delphinium_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_DELPHINIUM_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_delphinium_flower"),
            new FlowerPotBlock(DELPHINIUM_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_DELPHINIUM_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_delphinium_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_DELPHINIUM_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_delphinium_flower"),
            new FlowerPotBlock(CORRUPT_DELPHINIUM_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_DELPHINIUM_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_delphinium_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_DELPHINIUM_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_delphinium_flower"),
            new FlowerPotBlock(ANCIENT_DELPHINIUM_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block DAHLIA_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "dahlia_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_DAHLIA_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_dahlia_flower"),
            new FlowerPotBlock(DAHLIA_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_DAHLIA_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_dahlia_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_DAHLIA_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_dahlia_flower"),
            new FlowerPotBlock(CORRUPT_DAHLIA_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_DAHLIA_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_dahlia_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_DAHLIA_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_dahlia_flower"),
            new FlowerPotBlock(ANCIENT_DAHLIA_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block HYDRANGEA_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "hydrangea_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_HYDRANGEA_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_hydrangea_flower"),
            new FlowerPotBlock(HYDRANGEA_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_HYDRANGEA_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_hydrangea_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_HYDRANGEA_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_hydrangea_flower"),
            new FlowerPotBlock(CORRUPT_HYDRANGEA_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_HYDRANGEA_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_hydrangea_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_HYDRANGEA_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_hydrangea_flower"),
            new FlowerPotBlock(ANCIENT_HYDRANGEA_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block MIDNIGHT_MYSTIC_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "midnight_mystic_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_MIDNIGHT_MYSTIC_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_midnight_mystic_flower"),
            new FlowerPotBlock(MIDNIGHT_MYSTIC_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_midnight_mystic_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_MIDNIGHT_MYSTIC_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_midnight_mystic_flower"),
            new FlowerPotBlock(CORRUPT_MIDNIGHT_MYSTIC_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_midnight_mystic_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_MIDNIGHT_MYSTIC_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_midnight_mystic_flower"),
            new FlowerPotBlock(ANCIENT_MIDNIGHT_MYSTIC_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block HAWTHORN_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "hawthorn_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_HAWTHORN_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_hawthorn_flower"),
            new FlowerPotBlock(HAWTHORN_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_HAWTHORN_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_hawthorn_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_HAWTHORN_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_hawthorn_flower"),
            new FlowerPotBlock(CORRUPT_HAWTHORN_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_HAWTHORN_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_hawthorn_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_HAWTHORN_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_hawthorn_flower"),
            new FlowerPotBlock(ANCIENT_HAWTHORN_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block BONSAI_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "bonsai_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_BONSAI_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_bonsai_flower"),
            new FlowerPotBlock(BONSAI_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_BONSAI_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_bonsai_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_BONSAI_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_bonsai_flower"),
            new FlowerPotBlock(CORRUPT_BONSAI_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_BONSAI_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_bonsai_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_BONSAI_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_bonsai_flower"),
            new FlowerPotBlock(ANCIENT_BONSAI_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block SPIDERLILY_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "spiderlily_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_SPIDERLILY_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_spiderlily_flower"),
            new FlowerPotBlock(SPIDERLILY_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_SPIDERLILY_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_spiderlily_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_SPIDERLILY_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_spiderlily_flower"),
            new FlowerPotBlock(CORRUPT_SPIDERLILY_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_SPIDERLILY_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_spiderlily_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_SPIDERLILY_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_spiderlily_flower"),
            new FlowerPotBlock(ANCIENT_SPIDERLILY_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));


    public static final Block LARKSPUR_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "larkspur_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_LARKSPUR_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_larkspur_flower"),
            new FlowerPotBlock(LARKSPUR_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_LARKSPUR_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_larkspur_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_LARKSPUR_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_larkspur_flower"),
            new FlowerPotBlock(CORRUPT_LARKSPUR_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_LARKSPUR_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_larkspur_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_LARKSPUR_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_larkspur_flower"),
            new FlowerPotBlock(ANCIENT_LARKSPUR_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));

    public static final Block AGAPANTHUS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "agapanthus_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_AGAPANTHUS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_agapanthus_flower"),
            new FlowerPotBlock(AGAPANTHUS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_AGAPANTHUS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_agapanthus_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_AGAPANTHUS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_agapanthus_flower"),
            new FlowerPotBlock(CORRUPT_AGAPANTHUS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_AGAPANTHUS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_agapanthus_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_AGAPANTHUS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_agapanthus_flower"),
            new FlowerPotBlock(ANCIENT_AGAPANTHUS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));

    public static final Block BLUE_COSMOS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "blue_cosmos_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_BLUE_COSMOS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_blue_cosmos_flower"),
            new FlowerPotBlock(BLUE_COSMOS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block CORRUPT_BLUE_COSMOS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "corrupt_blue_cosmos_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(8).nonOpaque().noCollision()));
    public static final Block POTTED_CORRUPT_BLUE_COSMOS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_corrupt_blue_cosmos_flower"),
            new FlowerPotBlock(CORRUPT_BLUE_COSMOS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(8).nonOpaque()));

    public static final Block ANCIENT_BLUE_COSMOS_FLOWER_BLOCK = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "ancient_blue_cosmos_flower"),
            new FlowerBlock(StatusEffects.NIGHT_VISION, 200, FabricBlockSettings.copyOf(Blocks.ALLIUM).luminance(15).nonOpaque().noCollision()));
    public static final Block POTTED_ANCIENT_BLUE_COSMOS_FLOWER = Registry.register(Registries.BLOCK,
            new Identifier(DwarfAdventureMod.MOD_ID, "potted_ancient_blue_cosmos_flower"),
            new FlowerPotBlock(ANCIENT_BLUE_COSMOS_FLOWER_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).luminance(15).nonOpaque()));





    public static final Block BUDDING_MYTHRIL = registerBlock("budding_mythril",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

    public static final Block MYTHRIL_CLUSTER = registerBlock("mythril_cluster",
            new MythrilClusterBlock(7, 3,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .solid()
                            .nonOpaque()
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

    public static final Block LARGE_MYTHRIL_BUD = registerBlock("large_mythril_bud",
            new MythrilClusterBlock(5, 3,
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD)
                            .solid()
                            .luminance(state -> 4)
                            .pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

    public static final Block MEDIUM_MYTHRIL_BUD = registerBlock("medium_mythril_bud",
            new MythrilClusterBlock(4, 3,
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.LARGE_AMETHYST_BUD)
                            .solid()
                            .luminance(state -> 2)
                            .pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

    public static final Block SMALL_MYTHRIL_BUD = registerBlock("small_mythril_bud",
            new MythrilClusterBlock(3, 4,
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)
                            .solid()
                            .luminance(state -> 1)
                            .pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

    //Dwarf Ore

    public static final Block STONE_DWARF_STEEL_ORE = registerBlock("stone_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DEEPSLATE_DWARF_STEEL_ORE = registerBlock("deepslate_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4.5F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block NETHERRACK_DWARF_STEEL_ORE = registerBlock("netherrack_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block END_STONE_DWARF_STEEL_ORE = registerBlock("end_stone_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6.0F, 4.5F), UniformIntProvider.create(0, 5)));

    public static final Block ANDESITE_DWARF_STEEL_ORE = registerBlock("andesite_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block DIORITE_DWARF_STEEL_ORE = registerBlock("diorite_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIORITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block GRANITE_DWARF_STEEL_ORE = registerBlock("granite_dwarf_steel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GRANITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));


    public static final Block MAGIRITE_STONE_ORE = registerBlock("magirite_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block MAGIRITE_DEEPSLATE_ORE = registerBlock("magirite_deepslate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4.5F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block MAGIRITE_NETHERRACK_ORE = registerBlock("magirite_netherrack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block MAGIRITE_END_STONE_ORE = registerBlock("magirite_end_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6.0F, 4.5F), UniformIntProvider.create(0, 5)));

    public static final Block MAGIRITE_ANDESITE_ORE = registerBlock("magirite_andesite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block MAGIRITE_DIORITE_ORE = registerBlock("magirite_diorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIORITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block MAGIRITE_GRANITE_ORE = registerBlock("magirite_granite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GRANITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));


    public static final Block BUDDING_MYTHRIL_STONE = registerBlock("budding_mythril_stone",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

  public static final Block BUDDING_MYTHRIL_DEELSLATE = registerBlock("budding_mythril_deepslate",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

  public static final Block BUDDING_MYTHRIL_NETHERRACK = registerBlock("budding_mythril_netherrack",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

  public static final Block BUDDING_MYTHRIL_END_STONE = registerBlock("budding_mythril_end_stone",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

  public static final Block BUDDING_MYTHRIL_ANDESITE = registerBlock("budding_mythril_andesite",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

  public static final Block BUDDING_MYTHRIL_DIORITE = registerBlock("budding_mythril_diorite",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE_GRAY).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));

  public static final Block BUDDING_MYTHRIL_GRANDITE = registerBlock("budding_mythril_granite",
            new BuddingMythrilBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));


    public static final Block ADAMANTITE_STONE_ORE = registerBlock("adamantite_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block ADAMANTITE_DEEPSLATE_ORE = registerBlock("adamantite_deepslate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4.5F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block ADAMANTITE_NETHERRACK_ORE = registerBlock("adamantite_netherrack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block ADAMANTITE_END_STONE_ORE = registerBlock("adamantite_end_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6.0F, 4.5F), UniformIntProvider.create(0, 5)));

    public static final Block ADAMANTITE_ANDESITE_ORE = registerBlock("adamantite_andesite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block ADAMANTITE_DIORITE_ORE = registerBlock("adamantite_diorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIORITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block ADAMANTITE_GRANITE_ORE = registerBlock("adamantite_granite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GRANITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));


    public static final Block ORIKALKUM_STONE_ORE = registerBlock("orikalkum_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block ORIKALKUM_DEEPSLATE_ORE = registerBlock("orikalkum_deepslate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4.5F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block ORIKALKUM_NETHERRACK_ORE = registerBlock("orikalkum_netherrack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block ORIKALKUM_END_STONE_ORE = registerBlock("orikalkum_end_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6.0F, 4.5F), UniformIntProvider.create(0, 5)));

    public static final Block ORIKALKUM_ANDESITE_ORE = registerBlock("orikalkum_andesite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block ORIKALKUM_DIORITE_ORE = registerBlock("orikalkum_diorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIORITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block ORIKALKUM_GRANITE_ORE = registerBlock("orikalkum_granite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GRANITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));


    public static final Block DRAGON_BANE_STONE_ORE = registerBlock("dragon_bane_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DRAGON_BANE_DEEPSLATE_ORE = registerBlock("dragon_bane_deepslate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4.5F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DRAGON_BANE_NETHERRACK_ORE = registerBlock("dragon_bane_netherrack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DRAGON_BANE_END_STONE_ORE = registerBlock("dragon_bane_end_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6.0F, 4.5F), UniformIntProvider.create(0, 5)));

    public static final Block DRAGON_BANE_ANDESITE_ORE = registerBlock("dragon_bane_andesite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block DRAGON_BANE_DIORITE_ORE = registerBlock("dragon_bane_diorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIORITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block DRAGON_BANE_GRANITE_ORE = registerBlock("dragon_bane_granite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GRANITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));


    public static final Block DWARF_GOLD_STONE_ORE = registerBlock("dwarf_gold_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DWARF_GOLD_DEEPSLATE_ORE = registerBlock("dwarf_gold_deepslate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4.5F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DWARF_GOLD_NETHERRACK_ORE = registerBlock("dwarf_gold_netherrack_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)
                    .strength(3.0F, 3.0F), UniformIntProvider.create(0, 5)));

    public static final Block DWARF_GOLD_END_STONE_ORE = registerBlock("dwarf_gold_end_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6.0F, 4.5F), UniformIntProvider.create(0, 5)));

    public static final Block DWARF_GOLD_ANDESITE_ORE = registerBlock("dwarf_gold_andesite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block DWARF_GOLD_DIORITE_ORE = registerBlock("dwarf_gold_diorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIORITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));

    public static final Block DWARF_GOLD_GRANITE_ORE = registerBlock("dwarf_gold_granite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GRANITE)
                    .strength(3.0F, 3F), UniformIntProvider.create(0, 5)));





















    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DwarfAdventureMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DwarfAdventureMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DwarfAdventureMod.LOGGER.info("Registering ModBlocks for " + DwarfAdventureMod.MOD_ID);
    }





}