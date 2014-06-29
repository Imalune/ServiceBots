package servicebots.handlers;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import servicebots.ServiceBots;
import servicebots.containers.ContainerBotBox;
import servicebots.containers.ContainerBotStation;
import servicebots.containers.ContainerEZBotMover;
import servicebots.guis.GuiBotBox;
import servicebots.guis.GuiBotStation;
import servicebots.guis.GuiEZBotMover;
import servicebots.tileentities.TileEntityBotBox;
import servicebots.tileentities.TileEntityEZBotMover;

/**
 * Created by Imalune on 6/28/2014.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(id== ServiceBots.GUIID.BotBox.ordinal() && tileEntity instanceof TileEntityBotBox){
            return new ContainerBotBox(player.inventory, (TileEntityBotBox) tileEntity);
        }
        else if (id == ServiceBots.GUIID.EZBotMover.ordinal() && tileEntity instanceof TileEntityEZBotMover){
            return new ContainerEZBotMover(player.inventory, (TileEntityEZBotMover) tileEntity);
        }
        else if (id == ServiceBots.GUIID.BotStation.ordinal()){
            return new ContainerBotStation(player.inventory,world,x,y,z);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(id == ServiceBots.GUIID.BotBox.ordinal() && tileEntity instanceof TileEntityBotBox){
            return new GuiBotBox(player.inventory, (TileEntityBotBox) tileEntity);
        }
        else if ( id == ServiceBots.GUIID.EZBotMover.ordinal() && tileEntity instanceof TileEntityEZBotMover){
            return new GuiEZBotMover(player.inventory,(TileEntityEZBotMover) tileEntity);
        }
        else if ( id ==ServiceBots.GUIID.BotStation.ordinal()){
            return new GuiBotStation(player.inventory,world,x,y,z);
        }
        return null;

    }
}