package me.greencat.logat.item;

import me.greencat.logat.Logat;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    private final String name;

    public ItemBase(String name){
        this.name = name;
        this.setRegistryName(name);
        this.setUnlocalizedName(Logat.MOD_ID + "." + name);
    }
}
