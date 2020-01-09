package com.GenMaximusV.GensMod.init;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.GenMaximusV.GensMod.blocks.BlockBase;
import com.GenMaximusV.GensMod.blocks.blastfurnace.BlastFurnace;
import com.GenMaximusV.GensMod.blocks.compressed.CompressedDustBlock;
import com.GenMaximusV.GensMod.blocks.compressed.CompressedGemBlock;
import com.GenMaximusV.GensMod.blocks.compressed.CompressedMetalBlock;
import com.GenMaximusV.GensMod.blocks.compressed.CompressedWeakMetalBlock;
import com.GenMaximusV.GensMod.blocks.gems.GemAmethystOreBlock;
import com.GenMaximusV.GensMod.blocks.gems.GemRubyOreBlock;
import com.GenMaximusV.GensMod.blocks.gems.GemSapphireOreBlock;
import com.GenMaximusV.GensMod.blocks.gems.GemTopazOreBlock;
import com.GenMaximusV.GensMod.blocks.metals.MetalOreBlock;
import com.GenMaximusV.GensMod.blocks.metals.WeakMetalOreBlock;
import com.GenMaximusV.GensMod.blocks.oakchest.BlockOakChest;
import com.GenMaximusV.GensMod.blocks.other.DustOreBlock;
import com.GenMaximusV.GensMod.blocks.recycler.Recycler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Bootstrap;
import net.minecraft.util.ResourceLocation;

public class BlockInit 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Gems
	public static final Block RUBY_ORE_BLOCK = new GemRubyOreBlock("ruby_ore_block", Material.ROCK);
	public static final Block TOPAZ_ORE_BLOCK = new GemTopazOreBlock("topaz_ore_block", Material.ROCK);
	public static final Block AMETHYST_ORE_BLOCK = new GemAmethystOreBlock("amethyst_ore_block", Material.ROCK);
	public static final Block SAPPHIRE_ORE_BLOCK = new GemSapphireOreBlock("sapphire_ore_block", Material.ROCK);
	
	public static final Block RUBY_BLOCK = new CompressedGemBlock("ruby_block", Material.ROCK);
	public static final Block TOPAZ_BLOCK = new CompressedGemBlock("topaz_block", Material.ROCK);
	public static final Block AMETHYST_BLOCK = new CompressedGemBlock("amethyst_block", Material.ROCK);
	public static final Block SAPPHIRE_BLOCK = new CompressedGemBlock("sapphire_block", Material.ROCK);
	
	//Sulphur
	public static final Block SULPHUR_ORE = new DustOreBlock("sulphur_ore", Material.ROCK);
	
	public static final Block SULPHUR_BLOCK = new CompressedDustBlock("sulphur_block", Material.ROCK);
	
	//Metal
	public static final Block PLATINUM_ORE_BLOCK = new MetalOreBlock("platinum_ore_block", Material.ROCK);
	public static final Block TUNGSTEN_ORE_BLOCK = new MetalOreBlock("tungsten_ore_block", Material.ROCK);
	public static final Block SILVER_ORE_BLOCK = new MetalOreBlock("silver_ore_block", Material.ROCK);
	public static final Block LEAD_ORE_BLOCK = new WeakMetalOreBlock("lead_ore_block", Material.ROCK);
	public static final Block COPPER_ORE_BLOCK = new WeakMetalOreBlock("copper_ore_block", Material.ROCK);
	public static final Block TIN_ORE_BLOCK = new WeakMetalOreBlock("tin_ore_block", Material.ROCK);

	
	public static final Block PLATINUM_BLOCK = new CompressedMetalBlock("platinum_block", Material.IRON);
	public static final Block TUNGSTEN_BLOCK = new CompressedMetalBlock("tungsten_block", Material.IRON);
	public static final Block SILVER_BLOCK = new CompressedMetalBlock("silver_block", Material.IRON);
	public static final Block LEAD_BLOCK = new CompressedMetalBlock("lead_block", Material.IRON);
	public static final Block COPPER_BLOCK = new CompressedWeakMetalBlock("copper_block", Material.IRON);
	public static final Block TIN_BLOCK = new CompressedWeakMetalBlock("tin_block", Material.IRON);

	
	//MACHINES
	public static final Block BLAST_FURNACE_OFF = new BlastFurnace("blast_furnace_off", false);
	public static final Block BLAST_FURNACE_ON = new BlastFurnace("blast_furnace_on", true);
	
	public static final Block RECYCLER_OFF = new Recycler ("recycler_off", false);
	public static final Block RECYCLER_ON = new Recycler("recycler_on", true);
	
	//public static final Block BREWING_STAND = new BrewingStand ("blast_furnace_off");

	//CONTAINERS
	public static final Block OAK_CHEST = new BlockOakChest("oak_chest", Material.WOOD);
	//public static final Block DARK_OAK_CHEST = new BlockDarkOakChest("dark_oak_chest", Material.WOOD);
	//public static final Block JUNGLE_CHEST = new BlockJungleChest("jungle_chest", Material.WOOD);




}




