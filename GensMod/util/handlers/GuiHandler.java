package com.GenMaximusV.GensMod.util.handlers;



import com.GenMaximusV.GensMod.blocks.blastfurnace.ContainerBlastFurnace;
import com.GenMaximusV.GensMod.blocks.blastfurnace.GuiBlastFurnace;
import com.GenMaximusV.GensMod.blocks.blastfurnace.TileEntityBlastFurnace;
//
import com.GenMaximusV.GensMod.blocks.oakchest.ContainerOakChest;
import com.GenMaximusV.GensMod.blocks.oakchest.GuiOakChest;
import com.GenMaximusV.GensMod.blocks.oakchest.TileEntityOakChest;
//
import com.GenMaximusV.GensMod.blocks.recycler.ContainerRecycler;
import com.GenMaximusV.GensMod.blocks.recycler.GuiRecycler;
import com.GenMaximusV.GensMod.blocks.recycler.TileEntityRecycler;
//

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_OAK_CHEST)
		{
			return new ContainerOakChest(player.inventory, (TileEntityOakChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}

		if(ID == ConfigHandler.GUI_BLAST_FURNACE)
		{
			return new ContainerBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		if(ID == ConfigHandler.GUI_RECYCLER)
		{
			return new ContainerRecycler(player.inventory, (TileEntityRecycler)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_OAK_CHEST)
		{
			return new GuiOakChest(player.inventory, (TileEntityOakChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}

		if(ID == ConfigHandler.GUI_BLAST_FURNACE)
		{
			return new GuiBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		if(ID == ConfigHandler.GUI_RECYCLER)
		{
			return new GuiRecycler(player.inventory, (TileEntityRecycler)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}
}