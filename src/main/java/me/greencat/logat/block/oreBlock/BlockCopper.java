package me.greencat.logat.block.oreBlock;

import me.greencat.logat.block.base.BlockBase;
import me.greencat.logat.block.loader.BlockLoader;
import me.greencat.logat.dictionary.OreDictionaryRegistry;
import me.greencat.logat.tab.CreativeTabLoader;
import net.minecraft.block.material.Material;

public class BlockCopper extends BlockBase {
    public BlockCopper() {
        super(Material.IRON, "copper_block", CreativeTabLoader.BLOCK_TAB);
    }
}
