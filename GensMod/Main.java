package com.GenMaximusV.GensMod;

import java.io.File;

import com.GenMaximusV.GensMod.init.VanillaFurnaceRecipes;
import com.GenMaximusV.GensMod.proxy.CommonProxy;
import com.GenMaximusV.GensMod.util.Reference;
import com.GenMaximusV.GensMod.util.handlers.ConfigHandler;
import com.GenMaximusV.GensMod.util.handlers.GuiHandler;
import com.GenMaximusV.GensMod.util.handlers.RegistryHandler;
import com.GenMaximusV.GensMod.util.handlers.TileEntityHandler;
import com.GenMaximusV.GensMod.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static File config;
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{

		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{

		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries();
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)

	{
		RegistryHandler.serverRegistries(event);
	}
}
