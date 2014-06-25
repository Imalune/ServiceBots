package servicebots.client;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import servicebots.entities.EntityEleBot;

import javax.swing.text.html.parser.Entity;

/**
 * Created by Imalune on 6/23/2014.
 */
public class RenderEleBot extends RenderBiped{
    public final ModelBiped botModel;
    public RenderEleBot(ModelBiped model) {
        super(model, 0.5f);
        botModel = model;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLiving par1EntityLiving) {
        if(par1EntityLiving instanceof EntityEleBot){
            return ((EntityEleBot) par1EntityLiving).texture;
        }
        return super.getEntityTexture(par1EntityLiving);
   }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        if(par1Entity instanceof EntityEleBot){
            return ((EntityEleBot) par1Entity).texture;
        }
        return super.getEntityTexture(par1Entity);
   }
}
