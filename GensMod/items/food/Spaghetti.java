package com.GenMaximusV.GensMod.items.food;

import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Spaghetti extends ItemFood
{
	public Spaghetti(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		setAlwaysEdible();
			ItemInit.ITEMS.add(this);
	}

	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) 
	{
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3000, 5, false, false));
		
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
}
