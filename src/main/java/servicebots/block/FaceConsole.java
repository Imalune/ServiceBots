package servicebots.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import servicebots.ServiceBots;

/**
 * Created by Imalune on 6/23/2014.
 */
public class FaceConsole extends Block {
    @SideOnly(Side.CLIENT)
            private IIcon botface;
    @SideOnly(Side.CLIENT)
            private IIcon bbotside;
    @SideOnly(Side.CLIENT)
            private IIcon botback;
    FaceConsole(Material material){
        super(material);
        setBlockName("FaceConsole");
        setBlockTextureName("ServiceBots:botface");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
        setCreativeTab(ServiceBots.cTab);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister register){
        botface=register.registerIcon("ServiceBots:botface");
        bbotside=register.registerIcon("ServiceBots:bbotside");
        botback=register.registerIcon("ServiceBots:botback");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if (side == 4){
            return botface;
        }
        else if (side == 5){
            return botback;
        }
        else{
            return bbotside;
        }
    }
}
