package com.GenMaximusV.GensMod.util.handlers;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.blocks.oakchest.RenderOakChest;
import com.GenMaximusV.GensMod.blocks.oakchest.TileEntityOakChest;
import com.GenMaximusV.GensMod.init.BlockInit;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.init.VanillaFurnaceRecipes;
import com.GenMaximusV.GensMod.util.IHasModel;
import com.GenMaximusV.GensMod.util.handlers.ConfigHandler;
import com.GenMaximusV.GensMod.world.ModWorldGen;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class RegistryHandler 
{

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{	
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event)
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.OAK_CHEST), 0, "inventory");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOakChest.class, new RenderOakChest());

		for(Item item : ItemInit.ITEMS)
		{
			Main.proxy.registerItemRenderer(item, 0, "inventory");
		}
		for(Block block : BlockInit.BLOCKS)
		{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)

	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		ConfigHandler.registerConfig(event);
		EventHandler.registerEvents();
	}

	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		VanillaFurnaceRecipes.init();
	}

	public static void postInitRegistries()
	{

	}
	
	public static void serverRegistries(FMLServerStartingEvent event)

	{
		
	}
}
