package servicebots.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
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
public class RenderBuilderBot extends Render {
    private static final IModelCustom model =
            AdvancedModelLoader.loadModel(new ResourceLocation("servicebots:models/builderBot.obj"));
    private static final ResourceLocation texture =
            new ResourceLocation(ServiceBots.MODID,"textures/entities/builderbot.png");
    @Override
    public void doRender(Entity par1Entity, double x, double y, double z, float pitch, float yaw)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        GL11.glTranslatef(0f, 1f, .25f);
        GL11.glScalef(.45f, .45f, .45f);
        bindTexture(texture);
        model.renderAll();
        GL11.glPopMatrix();
    }
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return texture;
    }
}
