package com.GenMaximusV.GensMod.events;

import java.util.Random;

import com.GenMaximusV.GensMod.init.BlockInit;
import com.GenMaximusV.GensMod.init.ItemInit;

import net.minecraft.block.BlockStone;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;

import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



public class LootTableEvent 

{
	@SubscribeEvent
	public void entityLootTableDrop(LivingDropsEvent event)
	{
		Random rand = new Random();
		if(event.getEntityLiving() instanceof EntityCow)
		{
			if(rand.nextInt(1) == 0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.RUBY), 0.0f);
			}
			if(rand.nextInt(20) == 0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(BlockInit.RUBY_BLOCK), 0.0f);
			}
		}
	}
}