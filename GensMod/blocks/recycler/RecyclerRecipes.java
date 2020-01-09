package com.GenMaximusV.GensMod.blocks.recycler;

import java.util.Map;
import java.util.Map.Entry;

import com.GenMaximusV.GensMod.init.BlockInit;
import com.GenMaximusV.GensMod.init.ItemInit;
import com.GenMaximusV.GensMod.init.VanillaFurnaceRecipes;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecyclerRecipes extends VanillaFurnaceRecipes

{

	private static final RecyclerRecipes COOKING_BASE = new RecyclerRecipes();
	private final Map<ItemStack, ItemStack> cookingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static RecyclerRecipes instance()
    {
        return COOKING_BASE;
    }
	private RecyclerRecipes()
	{
		//PROCESSING
		//AMOURS
		this.addCooking(ItemInit.PLATINUM_HELMET, new ItemStack(ItemInit.PLATINUM_INGOT, 2), 0.6f);
		this.addCooking(ItemInit.PLATINUM_CHESTPLATE, new ItemStack(ItemInit.PLATINUM_INGOT, 4), 0.6f);
		this.addCooking(ItemInit.PLATINUM_LEGGINGS, new ItemStack(ItemInit.PLATINUM_INGOT, 3), 0.6f);
		this.addCooking(ItemInit.PLATINUM_BOOTS, new ItemStack(ItemInit.PLATINUM_INGOT, 2), 0.6f);
		
		this.addCooking(ItemInit.TUNGSTEN_HELMET, new ItemStack(ItemInit.TUNGSTEN_INGOT, 2), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_CHESTPLATE, new ItemStack(ItemInit.TUNGSTEN_INGOT, 4), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_LEGGINGS, new ItemStack(ItemInit.TUNGSTEN_INGOT, 3), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_BOOTS, new ItemStack(ItemInit.TUNGSTEN_INGOT, 2), 0.6f);
		
		this.addCooking(Items.GOLDEN_HELMET, new ItemStack(Items.GOLD_INGOT, 2), 0.6f);
		this.addCooking(Items.GOLDEN_CHESTPLATE, new ItemStack(Items.GOLD_INGOT, 4), 0.6f);
		this.addCooking(Items.GOLDEN_LEGGINGS, new ItemStack(Items.GOLD_INGOT, 3), 0.6f);
		this.addCooking(Items.GOLDEN_BOOTS, new ItemStack(Items.GOLD_INGOT, 2), 0.6f);
		
		this.addCooking(ItemInit.SILVER_HELMET, new ItemStack(ItemInit.SILVER_INGOT, 2), 0.6f);
		this.addCooking(ItemInit.SILVER_CHESTPLATE, new ItemStack(ItemInit.SILVER_INGOT, 4), 0.6f);
		this.addCooking(ItemInit.SILVER_LEGGINGS, new ItemStack(ItemInit.SILVER_INGOT, 3), 0.6f);
		this.addCooking(ItemInit.SILVER_BOOTS, new ItemStack(ItemInit.SILVER_INGOT, 2), 0.6f);
		
		this.addCooking(ItemInit.LEAD_HELMET, new ItemStack(ItemInit.LEAD_INGOT, 2), 0.6f);
		this.addCooking(ItemInit.LEAD_CHESTPLATE, new ItemStack(ItemInit.LEAD_INGOT, 4), 0.6f);
		this.addCooking(ItemInit.LEAD_LEGGINGS, new ItemStack(ItemInit.LEAD_INGOT, 3), 0.6f);
		this.addCooking(ItemInit.LEAD_BOOTS, new ItemStack(ItemInit.LEAD_INGOT, 2), 0.6f);
		
		this.addCooking(Items.IRON_HELMET, new ItemStack(Items.IRON_INGOT, 2), 0.6f);
		this.addCooking(Items.IRON_CHESTPLATE, new ItemStack(Items.IRON_INGOT, 4), 0.6f);
		this.addCooking(Items.IRON_LEGGINGS, new ItemStack(Items.IRON_INGOT, 3), 0.6f);
		this.addCooking(Items.IRON_BOOTS, new ItemStack(Items.IRON_INGOT, 2), 0.6f);
		
		this.addCooking(ItemInit.COPPER_HELMET, new ItemStack(ItemInit.COPPER_INGOT, 2), 0.6f);
		this.addCooking(ItemInit.COPPER_CHESTPLATE, new ItemStack(ItemInit.COPPER_INGOT, 4), 0.6f);
		this.addCooking(ItemInit.COPPER_LEGGINGS, new ItemStack(ItemInit.COPPER_INGOT, 3), 0.6f);
		this.addCooking(ItemInit.COPPER_BOOTS, new ItemStack(ItemInit.COPPER_INGOT, 2), 0.6f);
		
		this.addCooking(ItemInit.TIN_HELMET, new ItemStack(ItemInit.TIN_INGOT, 2), 0.6f);
		this.addCooking(ItemInit.TIN_CHESTPLATE, new ItemStack(ItemInit.TIN_INGOT, 4), 0.6f);
		this.addCooking(ItemInit.TIN_LEGGINGS, new ItemStack(ItemInit.TIN_INGOT, 3), 0.6f);
		this.addCooking(ItemInit.TIN_BOOTS, new ItemStack(ItemInit.TIN_INGOT, 2), 0.6f);
		
		//TOOLS
		this.addCooking(ItemInit.PLATINUM_SWORD, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.PLATINUM_AXE, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.PLATINUM_PICKAXE, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.PLATINUM_SHOVEL, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.PLATINUM_HOE, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 0.6f);

		this.addCooking(ItemInit.TUNGSTEN_SWORD, new ItemStack(ItemInit.TUNGSTEN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_AXE, new ItemStack(ItemInit.TUNGSTEN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_PICKAXE, new ItemStack(ItemInit.TUNGSTEN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_SHOVEL, new ItemStack(ItemInit.TUNGSTEN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_HOE, new ItemStack(ItemInit.TUNGSTEN_INGOT, 1), 0.6f);

		this.addCooking(Items.GOLDEN_SWORD, new ItemStack(Items.GOLD_INGOT, 1), 0.6f);
		this.addCooking(Items.GOLDEN_AXE, new ItemStack(Items.GOLD_INGOT, 1), 0.6f);
		this.addCooking(Items.GOLDEN_PICKAXE, new ItemStack(Items.GOLD_INGOT, 1), 0.6f);
		this.addCooking(Items.GOLDEN_SHOVEL, new ItemStack(Items.GOLD_INGOT, 1), 0.6f);
		this.addCooking(Items.GOLDEN_HOE, new ItemStack(Items.GOLD_INGOT, 1), 0.6f);

		this.addCooking(ItemInit.SILVER_SWORD, new ItemStack(ItemInit.SILVER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.SILVER_AXE, new ItemStack(ItemInit.SILVER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.SILVER_PICKAXE, new ItemStack(ItemInit.SILVER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.SILVER_SHOVEL, new ItemStack(ItemInit.SILVER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.SILVER_HOE, new ItemStack(ItemInit.SILVER_INGOT, 1), 0.6f);

		this.addCooking(ItemInit.LEAD_SWORD, new ItemStack(ItemInit.LEAD_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.LEAD_AXE, new ItemStack(ItemInit.LEAD_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.LEAD_PICKAXE, new ItemStack(ItemInit.LEAD_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.LEAD_SHOVEL, new ItemStack(ItemInit.LEAD_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.LEAD_HOE, new ItemStack(ItemInit.LEAD_INGOT, 1), 0.6f);

		this.addCooking(Items.IRON_SWORD, new ItemStack(Items.IRON_INGOT, 1), 0.6f);
		this.addCooking(Items.IRON_AXE, new ItemStack(Items.IRON_INGOT, 1), 0.6f);
		this.addCooking(Items.IRON_PICKAXE, new ItemStack(Items.IRON_INGOT, 1), 0.6f);
		this.addCooking(Items.IRON_SHOVEL, new ItemStack(Items.IRON_INGOT, 1), 0.6f);
		this.addCooking(Items.IRON_HOE, new ItemStack(Items.IRON_INGOT, 1), 0.6f);

		this.addCooking(ItemInit.COPPER_SWORD, new ItemStack(ItemInit.COPPER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.COPPER_AXE, new ItemStack(ItemInit.COPPER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.COPPER_PICKAXE, new ItemStack(ItemInit.COPPER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.COPPER_SHOVEL, new ItemStack(ItemInit.COPPER_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.COPPER_HOE, new ItemStack(ItemInit.COPPER_INGOT, 1), 0.6f);

		this.addCooking(ItemInit.TIN_SWORD, new ItemStack(ItemInit.TIN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TIN_AXE, new ItemStack(ItemInit.TIN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TIN_PICKAXE, new ItemStack(ItemInit.TIN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TIN_SHOVEL, new ItemStack(ItemInit.TIN_INGOT, 1), 0.6f);
		this.addCooking(ItemInit.TIN_HOE, new ItemStack(ItemInit.TIN_INGOT, 1), 0.6f);


		
		
		
		
	}
	
	public void addCookingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addCooking(Item.getItemFromBlock(input), stack, experience);
    }
	public void addCooking(Item input, ItemStack stack, float experience)
    {
        this.addCookingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }
	public void addCookingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getCookingResult(input) != ItemStack.EMPTY) 
        { 
        	net.minecraftforge.fml.common.FMLLog.log.info("Ignored cooking recipe with conflicting input: {} = {}", input, stack); return; 
        }
        this.cookingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }
	public ItemStack getCookingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.cookingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }
        return ItemStack.EMPTY;
    }
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }
    public Map<ItemStack, ItemStack> getCookingList()
    {
        return this.cookingList;
    }
    public float getCookingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}