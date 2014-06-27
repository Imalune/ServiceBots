package servicebots.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import servicebots.ServiceBots;
import servicebots.tileentities.TileEntityChargeBlock;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ChargeBlock extends BlockContainer {
    ChargeBlock(Material material){
        super(material);
        setBlockName("ChargeBlock");
        setCreativeTab(ServiceBots.cTab);
        setHarvestLevel("pickaxe",0);
        setResistance(4);
        setHardness(3);
    }
    @Override
    public TileEntity createNewTileEntity(World world, int stuff){
        return new TileEntityChargeBlock();
    }
    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }
    @Override
    public boolean isOpaqueCube(){
        return false;
    }
    @Override
    public int getRenderType(){
        return -1;
    }
}
