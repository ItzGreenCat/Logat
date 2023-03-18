package me.greencat.logat.block.base;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLogicGateBase extends BlockBaseRotatable{
    public BlockLogicGateBase(Material material, String name, Boolean hasItemBlock) {
        super(material, name, hasItemBlock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockLogicGateBase(Material material, String name, Boolean hasItemBlock, CreativeTabs tab) {
        super(material, name, hasItemBlock, tab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockLogicGateBase(Material material, String name, CreativeTabs tab) {
        super(material, name, tab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockLogicGateBase(Material material, String name) {
        super(material, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }
    @Override
    public boolean isOpaqueCube(IBlockState blockState) {
        return false;
    }
    public boolean isFullCube(IBlockState blockState) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
