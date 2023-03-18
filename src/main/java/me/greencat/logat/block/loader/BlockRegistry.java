package me.greencat.logat.block.loader;

import me.greencat.logat.model.ModelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class BlockRegistry {
    private static final List<Block> registerList = new ArrayList<>();

    public BlockRegistry() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onRegisterItem(RegistryEvent.Register<Block> event){
        for(Block block : registerList){
            event.getRegistry().register(block);
        }
    }
    protected static <T extends Block> T register(T block){
        registerList.add(block);
        return block;
    }
}
