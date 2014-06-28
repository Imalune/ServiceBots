package servicebots.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import javax.swing.*;

/**
 * Created by Imalune on 6/27/2014.
 */
public class ItemRendererTileEntity implements IItemRenderer{
    private TileEntitySpecialRenderer render;
    private TileEntity tile;
    public ItemRendererTileEntity(TileEntitySpecialRenderer render, TileEntity tile){
        this.render = render;
        this.tile = tile;
    }
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type){
        return type == ItemRenderType.INVENTORY;
    }
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper){
        return true;
    }
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data){
        if (type == ItemRenderType.ENTITY)
            GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
        render.renderTileEntityAt(tile, 0, 0, 0, 0);
    }
}
