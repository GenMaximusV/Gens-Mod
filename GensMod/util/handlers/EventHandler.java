package com.GenMaximusV.GensMod.util.handlers;

import com.GenMaximusV.GensMod.events.LootTableEvent;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler 
{
	public static void registerEvents()
	{


		LootTableEvent lootEvent = new LootTableEvent();


		MinecraftForge.EVENT_BUS.register(lootEvent);


	}

}