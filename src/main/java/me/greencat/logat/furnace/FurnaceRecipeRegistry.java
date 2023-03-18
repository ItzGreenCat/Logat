package me.greencat.logat.furnace;

import me.greencat.logat.Logat;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.AbstractMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class FurnaceRecipeRegistry {
    private static final IdentityHashMap<ItemStack, AbstractMap.SimpleEntry<ItemStack,Float>> recipes = new IdentityHashMap<>();
    public static void push() {
        for(Map.Entry<ItemStack, AbstractMap.SimpleEntry<ItemStack,Float>> entry : recipes.entrySet()){
            GameRegistry.addSmelting(entry.getKey(),entry.getValue().getKey(),entry.getValue().getValue());
            Logat.logger.info("Registering smelting recipe: " + entry.getKey().getItem().getRegistryName() + " -> " + entry.getValue().getKey().getItem().getRegistryName());
        }
    }
    public static void addRecipe(ItemStack input,ItemStack output,float exp){
        recipes.put(input, new AbstractMap.SimpleEntry<>(output, exp));
    }
    public static void addRecipe(Item input, ItemStack output, float exp){
        recipes.put(new ItemStack(input,1, 32767), new AbstractMap.SimpleEntry<>(output, exp));
    }
    public static void addRecipe(Block input, ItemStack output, float exp){
        recipes.put(new ItemStack(Item.getItemFromBlock(input),1, 32767), new AbstractMap.SimpleEntry<>(output, exp));
    }
}
