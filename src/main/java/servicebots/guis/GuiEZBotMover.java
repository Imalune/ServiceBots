package servicebots.guis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import servicebots.ServiceBots;
import servicebots.containers.ContainerBotBox;
import servicebots.containers.ContainerEZBotMover;
import servicebots.tileentities.TileEntityBotBox;
import servicebots.tileentities.TileEntityEZBotMover;

/**
 * Created by Imalune on 6/28/2014.
 */
@SideOnly(Side.CLIENT)
public class GuiEZBotMover extends GuiContainer {
    private static final ResourceLocation texture =
            new ResourceLocation(ServiceBots.MODID,"textures/guis/ezbotmoverinventory.png");
    public GuiEZBotMover (InventoryPlayer inventoryPlayer,
                      TileEntityEZBotMover tileEntity) {
        super(new ContainerEZBotMover(inventoryPlayer, tileEntity));
        xSize = 176;
        ySize = 166;
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