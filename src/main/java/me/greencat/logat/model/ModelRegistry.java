package me.greencat.logat.model;

import me.greencat.logat.Logat;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Level;

import java.util.*;

public class ModelRegistry {
    public ModelRegistry() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    private static final List<AbstractMap.SimpleEntry<Item,AbstractMap.SimpleEntry<Integer,ModelResourceLocation>>> registerList = new ArrayList<>();
    @SubscribeEvent
    public void onModelRegister(ModelRegistryEvent event){
        for(AbstractMap.SimpleEntry<Item,AbstractMap.SimpleEntry<Integer,ModelResourceLocation>> modelInformation : registerList){
            ModelLoader.setCustomModelResourceLocation(modelInformation.getKey(),modelInformation.getValue().getKey(),modelInformation.getValue().getValue());
        }
    }
    public static void registerModel(Item item,int metadata){
        try {
            AbstractMap.SimpleEntry<Item, AbstractMap.SimpleEntry<Integer, ModelResourceLocation>> entry = new AbstractMap.SimpleEntry<>(item, new AbstractMap.SimpleEntry<>(metadata, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory")));
            registerList.add(entry);
        } catch (Exception e) {
            Logat.logger.warning("Cannot register model for item: " + item.getRegistryName() + ",metadata: " + metadata);
        }
    }
    public static void registerModel(Item item){
        registerModel(item,0);
    }
}
