package me.greencat.logat.tileentity.loader;

import me.greencat.logat.Logat;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.IdentityHashMap;
import java.util.Map;

public class TileEntityRegistry {
    protected static final IdentityHashMap<Class<? extends TileEntity>, ResourceLocation> registerList = new IdentityHashMap<>();
    public TileEntityRegistry() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onBlockRegistry(RegistryEvent.Register<Block> event){
        for(Map.Entry<Class<? extends TileEntity>, ResourceLocation> entry : registerList.entrySet()){
            GameRegistry.registerTileEntity(entry.getKey(), entry.getValue());
        }
    }
    public static void register(Class<? extends TileEntity> tileEntity,String id){
        registerList.put(tileEntity,new ResourceLocation(Logat.MOD_ID,id));
    }
}
