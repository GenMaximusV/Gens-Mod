package com.GenMaximusV.GensMod.items.magic;


import com.GenMaximusV.GensMod.entity.EntityLightningBall;
import com.GenMaximusV.GensMod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.item.Item;

import net.minecraft.item.ItemStack;

import net.minecraft.util.ActionResult;

import net.minecraft.util.EnumActionResult;

import net.minecraft.util.EnumHand;

import net.minecraft.util.math.Vec3d;

import net.minecraft.world.World;



public class TomeofLightning extends Item

{

	public TomeofLightning(String name) 

	{

		setUnlocalizedName(name);

		setRegistryName(name);

		setCreativeTab(CreativeTabs.COMBAT);

		

		ItemInit.ITEMS.add(this);

	}

	

	@Override

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 

	{

		ItemStack item = playerIn.getHeldItem(handIn);

		Vec3d look = playerIn.getLookVec();

		EntityLightningBall lightningBall = new EntityLightningBall(worldIn, 1D, 1D, 1D);

		lightningBall.setPosition(playerIn.posX + look.x * 1.5D, playerIn.posY + look.y * 1.5D, playerIn.posZ + look.z * 1.5D);

		lightningBall.motionX = look.x * 3.0D;

		lightningBall.motionY = look.y * 3.0D;

		lightningBall.motionZ = look.z * 3.0D;

		lightningBall.setGlowing(true);

		playerIn.getCooldownTracker().setCooldown(this, 1);

		worldIn.spawnEntity(lightningBall);

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);

	}

}