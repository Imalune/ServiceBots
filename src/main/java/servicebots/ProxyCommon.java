package servicebots;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import servicebots.entities.EntityThing;

/**
 * Created by Imalune on 6/23/2014.
 */
public class ProxyCommon {
    public void onModPreInit(FMLPreInitializationEvent evt){
        EntityRegistry.registerGlobalEntityID(EntityThing.class, "Elebot", EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0xcccccc);
    }
    public void onModInit(FMLInitializationEvent evt){
     }
}
