package servicebots.handlers;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import servicebots.containers.ContainerBotBox;
import servicebots.guis.GuiBotBox;
import servicebots.tileentities.TileEntityBotBox;

/**
 * Created by Imalune on 6/28/2014.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityBotBox){
            return new ContainerBotBox(player.inventory, (TileEntityBotBox) tileEntity);
        }
        return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityBotBox){
            return new GuiBotBox(player.inventory, (TileEntityBotBox) tileEntity);
        }
        return null;

    }
}