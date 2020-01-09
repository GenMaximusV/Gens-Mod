package com.GenMaximusV.GensMod.blocks.other;

import com.GenMaximusV.GensMod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DustOreBlock extends BlockBase
{

	public DustOreBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
			
	}
	
}
