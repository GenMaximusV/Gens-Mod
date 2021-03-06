package com.GenMaximusV.GensMod.blocks.gems;

import java.util.Random;

import com.GenMaximusV.GensMod.blocks.BlockBase;
import com.GenMaximusV.GensMod.init.BlockInit;
import com.GenMaximusV.GensMod.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GemTopazOreBlock extends BlockBase
{

	public GemTopazOreBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
			
	}
	
	public Item getItemDropped(IBlockState state, Random random, int fortute)
	{
		return ItemInit.TOPAZ;
	}
	
	public int quantityDropped(Random rand)
	{
		int max = 1;
		int min =1;
		return rand.nextInt(max) + min;
	}

	
	
}
