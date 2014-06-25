package servicebots.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import servicebots.ProxyCommon;
import servicebots.entities.EntityEleBot;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ProxyClient extends ProxyCommon{
    @Override
    public void onModPreInit(FMLPreInitializationEvent evt){
            super.onModPreInit(evt);
        RenderingRegistry.registerEntityRenderingHandler(EntityEleBot.class, new RenderBiped(new ModelBiped(), 0.5f));
    }
    @Override
    public void onModInit(FMLInitializationEvent evt){
        super.onModInit(evt);
    }
}
