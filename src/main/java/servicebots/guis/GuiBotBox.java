package servicebots.guis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import servicebots.ServiceBots;
import servicebots.containers.ContainerBotBox;
import servicebots.tileentities.TileEntityBotBox;

/**
 * Created by Imalune on 6/28/2014.
 */
@SideOnly(Side.CLIENT)
public class GuiBotBox extends GuiContainer {
    private static final ResourceLocation texture =
            new ResourceLocation(ServiceBots.MODID,"textures/guis/botboxinventory.png");
    public GuiBotBox (InventoryPlayer inventoryPlayer,
                    TileEntityBotBox tileEntity) {
        super(new ContainerBotBox(inventoryPlayer, tileEntity));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        fontRendererObj.drawString("BotBox", 8, 6, 4210752);
        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
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