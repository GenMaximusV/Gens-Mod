package com.GenMaximusV.GensMod.items;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this,0, "inventory");
	}
}
