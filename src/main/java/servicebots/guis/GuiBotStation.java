package servicebots.guis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import servicebots.ServiceBots;
import servicebots.containers.ContainerBotBox;
import servicebots.containers.ContainerBotStation;
import servicebots.tileentities.TileEntityBotBox;

/**
 * Created by Imalune on 6/28/2014.
 */
@SideOnly(Side.CLIENT)
public class GuiBotStation extends GuiContainer {
    private static final ResourceLocation texture =
            new ResourceLocation(ServiceBots.MODID,"textures/guis/craftingtable.png");
    public GuiBotStation(InventoryPlayer par1InventoryPlayer, World world, int var1, int var2, int var3)
    {
        super(new ContainerBotStation(par1InventoryPlayer, world, var1, var2, var3));
    }


    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                                                   int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(texture);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }

}