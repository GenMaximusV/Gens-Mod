package com.GenMaximusV.GensMod.util.handlers;

import java.io.File;

import com.GenMaximusV.GensMod.Main;
import com.GenMaximusV.GensMod.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



public class ConfigHandler 

{
	public static Configuration config;
	
	//GUI IDs
	public static int GUI_OAK_CHEST = 2;
	public static int GUI_BLAST_FURNACE = 3;
	public static int GUI_RECYCLER = 4;

	
	public static void init(File file)
	{
		config = new Configuration(file);
		String category;
		
		//GUI
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set IDs for each GUI.");
		
		GUI_OAK_CHEST = config.getInt("GUI Oak Chest", category, 2, 0, 500, "GUI ID for the Oak Chest");
		GUI_BLAST_FURNACE = config.getInt("GUI Blast Furnace", category, 3, 0, 500, "GUI ID for the Blast Furnace");
		GUI_RECYCLER = config.getInt("GUI Recycler", category, 4, 0, 500, "GUI ID for the Recycler");

		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}