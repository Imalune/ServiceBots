package servicebots.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import servicebots.ProxyCommon;
import servicebots.entities.EntityBuilderBot;
import servicebots.entities.EntityEleBot;
import servicebots.render.*;
import servicebots.tileentities.TileEntityBotBox;
import servicebots.tileentities.TileEntityChargeBlock;
import servicebots.tileentities.TileEntityEZBotMover;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ProxyClient extends ProxyCommon{
    @Override
    public void onModPreInit(FMLPreInitializationEvent evt){
            super.onModPreInit(evt);
        RenderingRegistry.registerEntityRenderingHandler(EntityEleBot.class, new RenderEleBot());
        RenderingRegistry.registerEntityRenderingHandler(EntityBuilderBot.class, new RenderBuilderBot());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChargeBlock.class, new RenderChargeBlock());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBotBox.class, new RenderBotBox());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEZBotMover.class, new RenderEZBotMover());
    }
    @Override
    public void onModInit(FMLInitializationEvent evt){
        super.onModInit(evt);
    }
}
