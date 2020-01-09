package com.GenMaximusV.GensMod.blocks.compressed;

import com.GenMaximusV.GensMod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompressedGemBlock extends BlockBase
{

	public CompressedGemBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
			
	}
	
}
