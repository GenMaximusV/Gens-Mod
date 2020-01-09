package com.GenMaximusV.GensMod.items.tools.flint;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class FlintToolHoe extends ItemHoe implements IHasModel
{

	public FlintToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
	
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{

		Main.proxy.registerItemRenderer(this,0, "inventory");
		
	}
	
}
