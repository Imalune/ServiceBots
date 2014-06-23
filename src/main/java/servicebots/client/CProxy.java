package servicebots.client;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import servicebots.ProxyCommon;

/**
 * Created by Imalune on 6/23/2014.
 */
public class CProxy extends ProxyCommon{
    @Override
    public void onModPreInit(FMLPreInitializationEvent evt){
            super.onModPreInit(evt);
    }
    @Override
    public void onModInit(FMLInitializationEvent evt){
        super.onModInit(evt);
    }
}
