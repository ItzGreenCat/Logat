package me.greencat.logat;

import me.greencat.logat.item.CopperIngot;
import me.greencat.logat.model.ModelRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {
    private static final List<Item> registerList = new ArrayList<Item>();

    public ItemRegistry() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onRegisterItem(RegistryEvent.Register<Item> event){
        for(Item item : registerList){
            event.getRegistry().register(item);
        }
    }
    protected static <T extends Item> T register(T item){
        registerList.add(item);
        return item;
    }
    protected static <T extends Item> T registerItemAndModel(T item){
        registerModel(item);
        register(item);
        return item;
    }
    protected static <T extends Item> T registerItemAndModel(T item,int metadata){
        registerModel(item,metadata);
        register(item);
        return item;
    }
    protected static <T extends Item> T registerModel(T item){
        ModelRegistry.registerModel(item);
        return item;
    }
    protected static <T extends Item> T registerModel(T item,int metadata){
        ModelRegistry.registerModel(item,metadata);
        return item;
    }
}
