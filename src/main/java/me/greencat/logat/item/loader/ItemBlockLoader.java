package me.greencat.logat.item.loader;

import net.minecraft.item.ItemBlock;

public class ItemBlockLoader extends ItemLoader {
    public static void register(ItemBlock item){
        registerItemAndModel(item);
    }
    public static void register(ItemBlock item,int metadata){
        registerItemAndModel(item,metadata);
    }
}
