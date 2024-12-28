package net.spacegateir.dwarfadventuremod.util.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.spacegateir.dwarfadventuremod.block.entity.custom.CoverBlockEntity;

public class CoverBlockEntityRenderer implements BlockEntityRenderer<CoverBlockEntity> {

    private static final Identifier STONE = new Identifier("minecraft", "textures/block/stone.png");
    private static final Identifier COVER_BLOCK = new Identifier("dwarfadventuremod", "textures/block/cover_block.png");

    public CoverBlockEntityRenderer(BlockEntityRendererFactory.Context context) {}

    @Override
    public void render(CoverBlockEntity blockEntity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {

        boolean useStoneTexture = blockEntity.hasStoneTexture(); // Get the texture state

        // Choose the appropriate texture based on the state
        Identifier texture = useStoneTexture ? STONE : COVER_BLOCK;

        // Set the shader texture for rendering
        RenderSystem.setShaderTexture(0, texture);

        // Push the matrix stack for transformations
        matrices.push();

        // Render the block entity (assuming it's a simple cube for now)
        MinecraftClient.getInstance().getBlockRenderManager()
                .renderBlockAsEntity(blockEntity.getCachedState(), matrices, vertexConsumers, light, overlay);

        // Pop the matrix stack to restore the transformations
        matrices.pop();
    }

}
