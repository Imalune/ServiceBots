package servicebots.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
@SideOnly(Side.CLIENT)
public class RenderChargeBlock extends TileEntitySpecialRenderer {
    private static final IModelCustom model =
            AdvancedModelLoader.loadModel(new ResourceLocation("servicebots:models/chargeBlock.obj"));
    private static final ResourceLocation texture =
            new ResourceLocation(ServiceBots.MODID,"textures/entities/chargeblock.png");
    @Override
    public void renderTileEntityAt(TileEntity par1Entity, double x, double y, double z, float pitch)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        GL11.glTranslatef(.5f, .5f, .5f);
        GL11.glScalef(.45f, .45f, .45f);
        GL11.glDisable(GL11.GL_LIGHTING);
        bindTexture(texture);
        model.renderAll();
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
   }
