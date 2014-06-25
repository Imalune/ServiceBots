package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/22/2014.
 */
public class BotStation extends Block{
    @SideOnly(Side.CLIENT)
    private IIcon botstationface;
    @SideOnly(Side.CLIENT)
    private IIcon botstationside;
    @SideOnly(Side.CLIENT)
    private IIcon botstationtop;
    BotStation(Material material){
        super(material);
        setBlockName("BotStation");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
        setCreativeTab(ServiceBots.cTab);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister register){
        botstationface=register.registerIcon("ServiceBots:botstationface");
        botstationside=register.registerIcon("ServiceBots:botstationside");
        botstationtop=register.registerIcon("ServiceBots:botstationtop");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if (side == 4){
            return botstationface;
        }
        else if(side == 2){
            return botstationtop;
        }
        else{
            return botstationside;
        }
    }
}