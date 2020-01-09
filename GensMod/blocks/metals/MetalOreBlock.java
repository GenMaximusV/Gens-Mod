package com.GenMaximusV.GensMod.blocks.metals;

import com.GenMaximusV.GensMod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MetalOreBlock extends BlockBase
{

	public MetalOreBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
			
	}
	
}
