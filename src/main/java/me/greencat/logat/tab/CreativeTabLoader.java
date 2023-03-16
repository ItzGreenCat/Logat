package me.greencat.logat.tab;

import me.greencat.logat.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabLoader {
    public static final CreativeTabs ITEM_TAB = new CreativeTabs("logat_item") {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.COPPER_INGOT);
        }
    };
}
