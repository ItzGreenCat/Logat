package me.greencat.logat.block.base;

import me.greencat.logat.block.loader.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockBaseRotatable extends BlockBase{
    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    public BlockBaseRotatable(Material material, String name, Boolean hasItemBlock) {
        super(material, name, hasItemBlock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockBaseRotatable(Material material, String name, Boolean hasItemBlock, CreativeTabs tab) {
        super(material, name, hasItemBlock, tab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockBaseRotatable(Material material, String name, CreativeTabs tab) {
        super(material, name, tab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockBaseRotatable(Material material, String name) {
        super(material, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }
    public IBlockState withRotation(IBlockState blockState, Rotation rotation) {
        return blockState.withProperty(FACING, rotation.rotate(blockState.getValue(FACING)));
    }

    public IBlockState withMirror(IBlockState blockState, Mirror mirror) {
        return blockState.withProperty(FACING, mirror.mirror(blockState.getValue(FACING)));
    }
    public IBlockState getStateForPlacement(World worldObj, BlockPos pos, EnumFacing facing, float f1, float f2, float f3, int i1, EntityLivingBase entity) {
        return this.getDefaultState().withProperty(FACING, facing);
    }
    public IBlockState getStateFromMeta(int metadata) {
        IBlockState blockState = this.getDefaultState();
        blockState = blockState.withProperty(FACING, EnumFacing.getFront(metadata));
        return blockState;
    }
    public int getMetaFromState(IBlockState blockState) {
        return blockState.getValue(FACING).getIndex();
    }
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }
}
