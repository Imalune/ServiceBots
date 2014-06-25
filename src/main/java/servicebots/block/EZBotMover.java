package servicebots.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import servicebots.ServiceBots;
import servicebots.tileentities.TileEntityEZBotMover;

/**
 * Created by Imalune on 6/23/2014.
 */
public class EZBotMover extends Block {
    EZBotMover(Material material){
        super(material);
        //setBlockTextureName();
        setCreativeTab(ServiceBots.cTab);
        setBlockName("EZBotMover");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe",0);
    }
    @Override
    public TileEntity createNewTileEntity(World world, int stuff){
        return new TileEntityEZBotMover();
    }
}
