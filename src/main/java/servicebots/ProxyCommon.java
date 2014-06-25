package servicebots;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import servicebots.entities.EntityEleBot;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ProxyCommon {
    public void onModPreInit(FMLPreInitializationEvent evt){
        EntityRegistry.registerGlobalEntityID(EntityEleBot.class, "Elebot", EntityRegistry.findGlobalUniqueEntityId() );
    }
    public void onModInit(FMLInitializationEvent evt){
     }
}
