package com.GenMaximusV.GensMod.blocks.oakchest;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.blocks.blastfurnace.TileEntityBlastFurnace;
import com.GenMaximusV.GensMod.init.BlockInit;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.util.handlers.ConfigHandler;

import net.minecraft.block.BlockContainer;

import net.minecraft.block.SoundType;

import net.minecraft.block.material.Material;

import net.minecraft.block.properties.IProperty;

import net.minecraft.block.properties.PropertyDirection;

import net.minecraft.block.state.BlockStateContainer;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.inventory.InventoryHelper;

import net.minecraft.item.ItemBlock;

import net.minecraft.item.ItemStack;

import net.minecraft.tileentity.TileEntity;

import net.minecraft.util.BlockRenderLayer;

import net.minecraft.util.EnumBlockRenderType;

import net.minecraft.util.EnumFacing;

import net.minecraft.util.EnumHand;

import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;



public class BlockOakChest extends BlockContainer

{

	public static final PropertyDirection FACING = PropertyDirection.create("facing");

	public BlockOakChest(String name, Material material) 

	{

		super(material);

		setRegistryName(name);

		setUnlocalizedName(name);

		setCreativeTab(CreativeTabs.DECORATIONS);

		setHardness(8.0f);

		setHarvestLevel("pickaxe", -1);

		setResistance(18.0f);

		setSoundType(SoundType.WOOD);

		//setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH));

		

		BlockInit.BLOCKS.add(this);

		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	

	@Override

	public TileEntity createNewTileEntity(World worldIn, int meta) 

	{

		return new TileEntityOakChest();

	}

	

	@Override

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 

	{

		playerIn.openGui(Main.instance, ConfigHandler.GUI_OAK_CHEST, worldIn, pos.getX(), pos.getY(), pos.getZ());

		return true;

	}
	
	@Override

	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 

	{

		TileEntityOakChest tileentity = (TileEntityOakChest)worldIn.getTileEntity(pos);

		InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);

		super.breakBlock(worldIn, pos, state);

	}

	

	@Override

	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 

	{

		if(stack.hasDisplayName())

		{

			TileEntity tileentity = worldIn.getTileEntity(pos);

			if(tileentity instanceof TileEntityOakChest)

			{

				((TileEntityOakChest)tileentity).setCustomName(stack.getDisplayName());

			}

		}

	}

	

	@Override

	public IBlockState getStateFromMeta(int meta) 

	{

		IBlockState state = this.getDefaultState();

		state = state.withProperty(FACING, EnumFacing.getFront(meta));

		return state;

	}

	

	@Override

	public int getMetaFromState(IBlockState state) 

	{
		return ((EnumFacing)state.getValue(FACING)).getIndex();
	}

	

	@Override

	protected BlockStateContainer createBlockState() 

	{

		return new BlockStateContainer(this, new IProperty[] {FACING});

	}

	

	@Override

	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) 

	{

		IBlockState state = worldIn.getBlockState(pos.offset(facing.getOpposite()));

		if(state.getBlock() ==  this)

		{

			EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

			if(enumfacing == facing)

			{

				return this.getDefaultState().withProperty(FACING, facing);
			}
		}
		
		return this.getDefaultState().withProperty(FACING, facing);
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() 
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) 

	{
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}
}