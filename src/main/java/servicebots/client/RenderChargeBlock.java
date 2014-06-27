package servicebots.client;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import servicebots.ServiceBots;
import servicebots.block.BotBlocks;

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
        int i = BotBlocks.blockChargeBlock.getLightValue(par1Entity.getWorldObj(), (int)x, (int)y, (int)z);
        FMLClientHandler.instance().getClient().getTextureManager().bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        GL11.glTranslatef(0f, 0f, .25f);
        GL11.glScalef(.45f, .45f, .45f);
        Tessellator.instance.setColorOpaque_F(i, i, i);
        model.renderAll();
        GL11.glPopMatrix();
    }
   }
