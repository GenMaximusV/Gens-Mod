package com.GenMaximusV.GensMod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaFurnaceRecipes
{

	public static void init()
	{
		//GEMS
		GameRegistry.addSmelting(BlockInit.RUBY_ORE_BLOCK, new ItemStack(ItemInit.RUBY, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.TOPAZ_ORE_BLOCK, new ItemStack(ItemInit.TOPAZ, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.AMETHYST_ORE_BLOCK, new ItemStack(ItemInit.AMETHYST, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.SAPPHIRE_ORE_BLOCK, new ItemStack(ItemInit.SAPPHIRE, 1), 1.5F);
		
		//INGOTS
		GameRegistry.addSmelting(BlockInit.PLATINUM_ORE_BLOCK, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.TUNGSTEN_ORE_BLOCK, new ItemStack(ItemInit.TUNGSTEN_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.SILVER_ORE_BLOCK, new ItemStack(ItemInit.SILVER_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.LEAD_ORE_BLOCK, new ItemStack(ItemInit.LEAD_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.COPPER_ORE_BLOCK, new ItemStack(ItemInit.COPPER_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.TIN_ORE_BLOCK, new ItemStack(ItemInit.TIN_INGOT, 1), 1.5F);

		//COINS
		GameRegistry.addSmelting(ItemInit.PLATINUM_NUGGET, new ItemStack(ItemInit.PLATINUM_COIN, 1), 3.0F);
		GameRegistry.addSmelting(ItemInit.TUNGSTEN_NUGGET, new ItemStack(ItemInit.TUNGSTEN_COIN, 1), 3.0F);
		GameRegistry.addSmelting(ItemInit.SILVER_NUGGET, new ItemStack(ItemInit.SILVER_COIN, 1), 3.0F);
		GameRegistry.addSmelting(Items.GOLD_NUGGET, new ItemStack(ItemInit.GOLD_COIN, 1), 3.0F);
		GameRegistry.addSmelting(ItemInit.COPPER_NUGGET, new ItemStack(ItemInit.COPPER_COIN, 1), 3.0F);
		GameRegistry.addSmelting(ItemInit.LEAD_NUGGET, new ItemStack(ItemInit.LEAD_COIN, 1), 3.0F);
		GameRegistry.addSmelting(Items.IRON_NUGGET, new ItemStack(ItemInit.IRON_COIN, 1), 3.0F);
		GameRegistry.addSmelting(ItemInit.TIN_NUGGET, new ItemStack(ItemInit.TIN_COIN, 1), 3.0F);

	}
	
}
