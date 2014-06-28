package servicebots.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import servicebots.ServiceBots;
import servicebots.tileentities.TileEntityBotBox;

/**
 * Created by Imalune on 6/23/2014.
 */
public class BotBox extends BlockContainer {
    BotBox(Material material) {
        super(material);
        setCreativeTab(ServiceBots.cTab);
        setBlockName("BotBox");
        setHardness(3);
        setResistance(4);
        setHarvestLevel("pickaxe", 0);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int stuff) {
        return new TileEntityBotBox();
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                                    EntityPlayer player, int metadata, float what, float these, float are) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity == null || player.isSneaking()) {
            return false;
        }
        player.openGui(ServiceBots.instance, 0, world, x, y, z);
        return true;
    }
}
