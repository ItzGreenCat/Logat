package me.greencat.logat.item.loader;

import me.greencat.logat.item.ItemCopperRod;
import me.greencat.logat.item.ingot.ItemCopperIngot;
import net.minecraft.item.Item;

public class ItemLoader extends ItemRegistry {
    //Metal Ingot
    public static final ItemCopperIngot COPPER_INGOT = registerItemAndModel(new ItemCopperIngot());
    //Misc Item
    public static final ItemCopperRod COPPER_ROD = registerItemAndModel(new ItemCopperRod());

    public ItemLoader() {
        super();
    }
}
