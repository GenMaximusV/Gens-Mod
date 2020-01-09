package com.GenMaximusV.GensMod.items.fuel;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelBase extends Item implements IHasModel {

	public FuelBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) 
	{
		return 50;
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this,0, "inventory");
	}
}
