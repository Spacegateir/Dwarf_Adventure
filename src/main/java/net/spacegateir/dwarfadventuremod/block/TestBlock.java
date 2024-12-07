package net.spacegateir.dwarfadventuremod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.text.Text; // Correct import for Text
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TestBlock extends Block {
    // Add a property to store the redstone power level
    public static final IntProperty POWER = IntProperty.of("power", 0, 15);

    public TestBlock(Settings settings) {
        super(settings);
        // Set the default state with the power level of 0
        this.setDefaultState(this.stateManager.getDefaultState().with(POWER, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POWER);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true; // Block emits redstone power
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return state.get(POWER); // Output the power level
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            int currentPower = state.get(POWER);
            int newPower;

            if (player.isSneaking()) {
                // Decrease power level with shift-right-click
                newPower = MathHelper.clamp(currentPower - 1, 0, 15);
            } else {
                // Increase power level with right-click
                newPower = MathHelper.clamp(currentPower + 1, 0, 15);
            }

            // Update the block state with the new power level
            world.setBlockState(pos, state.with(POWER, newPower), Block.NOTIFY_ALL);

            // Send feedback to the player
            player.sendMessage(Text.literal("Redstone power level set to: " + newPower), true);
        }

        return ActionResult.SUCCESS;
    }
}
