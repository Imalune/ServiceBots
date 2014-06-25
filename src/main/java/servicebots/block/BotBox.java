package servicebots.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import servicebots.ServiceBots;
import servicebots.tileentities.TileEntityBotBox;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotBox extends BlockContainer{
    BotBox(Material material){
    super(material);
    setCreativeTab(ServiceBots.cTab);
    setBlockName("BotBox");
    //setBlockTextureName("ServiceBots:botbox");
    setHardness(3);
    setResistance(4);
    setHarvestLevel("pickaxe",0);
}
    @Override
    public TileEntity createNewTileEntity(World world, int stuff){
        return new TileEntityBotBox();
    }
}
