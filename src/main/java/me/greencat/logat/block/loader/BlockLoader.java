package me.greencat.logat.block.loader;

import me.greencat.logat.block.logic.BlockCopperFramework;
import me.greencat.logat.block.logic.BlockRedstoneConverter;
import me.greencat.logat.block.ore.BlockCopperOre;
import me.greencat.logat.block.oreBlock.BlockCopper;

public class BlockLoader extends BlockRegistry{
    //Metal Ore
    public static final BlockCopperOre COPPER_ORE = register(new BlockCopperOre());
    //Metal Block
    public static final BlockCopper COPPER_BLOCK = register(new BlockCopper());
    //LogicGate
    public static final BlockCopperFramework COPPER_FRAMEWORK = register(new BlockCopperFramework());
    public static final BlockRedstoneConverter REDSTONE_CONVERTER = register(new BlockRedstoneConverter());

    public BlockLoader() {
        super();
    }
}
