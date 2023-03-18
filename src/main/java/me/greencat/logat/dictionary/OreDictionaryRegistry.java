package me.greencat.logat.dictionary;

import me.greencat.logat.Logat;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryRegistry {
    public static void addToDictionary(Block block,String key){
        OreDictionary.registerOre(key,block);
        Logat.logger.info("Registering ore dictionary: " + block.getRegistryName() + " -> " + key);
    }
    public static void addToDictionary(Item item, String key){
        OreDictionary.registerOre(key,item);
        Logat.logger.info("Registering ore dictionary: " + item.getRegistryName() + " -> " + key);
    }
    public static void addToDictionary(ItemStack stack, String key){
        OreDictionary.registerOre(key,stack);
        Logat.logger.info("Registering ore dictionary: " + stack.getItem().getRegistryName() + " -> " + key);
    }
}
