package servicebots.guis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;
import servicebots.containers.ContainerBotCloner;
import servicebots.tileentities.TileEntityBotCloner;

/**
 * Created by Imalune on 6/28/2014.
 */
@SideOnly(Side.CLIENT)
public class GuiBotCloner extends GuiContainer
{
   private TileEntityBotCloner furnaceInventory;

    public GuiBotCloner(InventoryPlayer player, TileEntityBotCloner botCloner)
    {
        super(new ContainerBotCloner (player, botCloner));
        this.furnaceInventory = botCloner;
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        int var4 = this.mc.renderEngine.getTexture("ServiceBots:textures/guis/cloner.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
        int var7;

        if (this.furnaceInventory.isBurning())
        {
            var7 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }

        var7 = this.furnaceInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
    }
}