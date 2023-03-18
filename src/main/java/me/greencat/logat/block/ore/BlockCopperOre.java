package me.greencat.logat.block.ore;

import me.greencat.logat.block.base.BlockBase;
import me.greencat.logat.block.loader.BlockLoader;
import me.greencat.logat.dictionary.OreDictionaryRegistry;
import me.greencat.logat.furnace.FurnaceRecipeRegistry;
import me.greencat.logat.item.loader.ItemLoader;
import me.greencat.logat.tab.CreativeTabLoader;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockCopperOre extends BlockBase {
    public BlockCopperOre() {
        super(Material.ROCK,"copper_ore",CreativeTabLoader.BLOCK_TAB);
        FurnaceRecipeRegistry.addRecipe(this.itemBlock,new ItemStack(ItemLoader.COPPER_INGOT),0.1F);
    }
}
