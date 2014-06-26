package servicebots.client;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/25/2014.
 */
@SideOnly(Side.CLIENT)
public class RenderBuilderBot extends RenderBiped {
    private static final IModelCustom Model =
            AdvancedModelLoader.loadModel(new ResourceLocation("servicebots:models/builderBot.obj"));
    private static final ResourceLocation texture =
            new ResourceLocation("servicebots:entities/builderbot.png");

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef(0f, .5f, .25f);
        GL11.glScalef(.45f, -.45f, -.45f);
        TextureManager renderEngine = FMLClientHandler.instance().getClient().renderEngine;
        renderEngine.bindTexture(texture);
        Model.renderAll();
        GL11.glPopMatrix();
    }
    public final ModelBiped botModel;
    public RenderBuilderBot(ModelBiped model)
    {
        super(model, 0.5f);
        botModel = model;
    }
}
