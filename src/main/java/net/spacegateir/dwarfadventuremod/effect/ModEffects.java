package net.spacegateir.dwarfadventuremod.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dwarfadventuremod.DwarfAdventureMod;

public class ModEffects {
    public static final StatusEffect STICKY_FEAT = registerStatusEffect("sticky_feat",
            new StickyFeatEffect(StatusEffectCategory.NEUTRAL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            "7107DE5E-7CE8-4030-940E-514C1F160890", -0.25f,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final StatusEffect DISORIENT = registerStatusEffect("disorient",
            new DisorientEffect(StatusEffectCategory.HARMFUL, 0x7140C5));

    public static final StatusEffect CLEAR_POSITIVE_EFFECT = registerStatusEffect("clear_positive_effect",
            new ClearPositiveStatusEffect(StatusEffectCategory.HARMFUL, 0xA875F7));

    public static final StatusEffect CLEAR_NEGATIVE_EFFECT = registerStatusEffect("clear_negative_effect",
            new ClearNegativeStatusEffect(StatusEffectCategory.BENEFICIAL, 0x3A2065));

    public static final StatusEffect CLEAR_NEUTRAL_EFFECT = registerStatusEffect("clear_neutral_effect",
            new ClearNeutralStatusEffect(StatusEffectCategory.BENEFICIAL
                    , 0x6E6A6A));



    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(DwarfAdventureMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        DwarfAdventureMod.LOGGER.info("Registering Mod Effects for " + DwarfAdventureMod.MOD_ID);
    }
}
