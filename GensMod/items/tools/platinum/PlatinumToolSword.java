package com.GenMaximusV.GensMod.items.tools.platinum;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class PlatinumToolSword extends ItemSword implements IHasModel
{
	public PlatinumToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
	
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{

		Main.proxy.registerItemRenderer(this,0, "inventory");
		
	}
}
