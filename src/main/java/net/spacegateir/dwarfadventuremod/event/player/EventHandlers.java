package net.spacegateir.dwarfadventuremod.event.player;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.spacegateir.dwarfadventuremod.CauldronConversions.LavaCauldronRecipes;
import net.spacegateir.dwarfadventuremod.CauldronConversions.WaterCauldronRecipes;

public class EventHandlers {
    public static void registerEventHandlers() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            BlockPos blockPos = hitResult.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            ItemStack stack = player.getStackInHand(hand);

            // Call the water cauldron conversion method
            ActionResult waterResult = WaterCauldronRecipes.handleWaterCauldronRecipes(blockState, world, blockPos, player, hand, stack);

            // If a recipe was matched, and it is not a PASS action, return the result
            if (waterResult != ActionResult.PASS) {
                return waterResult; // Return the result of the water cauldron action (e.g., SUCCESS or FAIL)
            }

            // Call the lava cauldron conversion method
            ActionResult lavaResult = LavaCauldronRecipes.handleLavaCauldronRecipes(blockState, world, blockPos, player, hand, stack);

            // If a recipe was matched, and it is not a PASS action, return the result
            if (lavaResult != ActionResult.PASS) {
                return lavaResult; // Return the result of the lava cauldron action (e.g., SUCCESS or FAIL)
            }

            // If no recipe was matched, allow normal block placement
            return ActionResult.PASS; // This allows the player to place a block
        });
    }
}
