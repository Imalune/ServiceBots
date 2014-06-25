package servicebots;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import servicebots.entities.EntityBuilderBot;
import servicebots.entities.EntityEleBot;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ProxyCommon {
    public void onModPreInit(FMLPreInitializationEvent evt){
        EntityRegistry.registerGlobalEntityID(EntityEleBot.class, "Elebot", EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0xcccccc);
        EntityRegistry.registerGlobalEntityID(EntityBuilderBot.class,"BuilderBot",EntityRegistry.findGlobalUniqueEntityId(),0x1ea2a7,0x969696);
    }
    public void onModInit(FMLInitializationEvent evt){
     }
}
