package com.GenMaximusV.GensMod.util.handlers;

import com.GenMaximusV.GensMod.blocks.blastfurnace.TileEntityBlastFurnace;
import com.GenMaximusV.GensMod.blocks.oakchest.TileEntityOakChest;
import com.GenMaximusV.GensMod.blocks.recycler.TileEntityRecycler;
import com.GenMaximusV.GensMod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;




public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityOakChest.class, new ResourceLocation(Reference.MOD_ID + ":oak_chest"));
		//GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, new ResourceLocation(Reference.MOD_ID + ":blast_furnace"));
		GameRegistry.registerTileEntity(TileEntityRecycler.class, new ResourceLocation(Reference.MOD_ID + ":recycler"));

	}
}