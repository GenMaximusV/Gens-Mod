package com.GenMaximusV.GensMod.blocks.blastfurnace;

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

public class BlastFurnaceRecipes extends VanillaFurnaceRecipes

{

	private static final BlastFurnaceRecipes COOKING_BASE = new BlastFurnaceRecipes();
	private final Map<ItemStack, ItemStack> cookingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static BlastFurnaceRecipes instance()
    {
        return COOKING_BASE;
    }
	private BlastFurnaceRecipes()
	{
		//GEMS
		this.addCookingRecipeForBlock(Blocks.DIAMOND_ORE, new ItemStack(Items.DIAMOND), 0.6f);
		this.addCookingRecipeForBlock(Blocks.EMERALD_ORE, new ItemStack(Items.EMERALD), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.RUBY_ORE_BLOCK, new ItemStack(ItemInit.RUBY), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.TOPAZ_ORE_BLOCK, new ItemStack(ItemInit.TOPAZ), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.SAPPHIRE_ORE_BLOCK, new ItemStack(ItemInit.SAPPHIRE), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.AMETHYST_ORE_BLOCK, new ItemStack(ItemInit.AMETHYST), 0.6f);

		//INGOTS
		this.addCookingRecipeForBlock(BlockInit.PLATINUM_ORE_BLOCK, new ItemStack(ItemInit.PLATINUM_INGOT), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.TUNGSTEN_ORE_BLOCK, new ItemStack(ItemInit.TUNGSTEN_INGOT), 0.6f);
		this.addCookingRecipeForBlock(Blocks.GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.SILVER_ORE_BLOCK, new ItemStack(ItemInit.SILVER_INGOT), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.LEAD_ORE_BLOCK, new ItemStack(ItemInit.LEAD_INGOT), 0.6f);
		this.addCookingRecipeForBlock(Blocks.IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.COPPER_ORE_BLOCK, new ItemStack(ItemInit.COPPER_INGOT), 0.6f);
		this.addCookingRecipeForBlock(BlockInit.TIN_ORE_BLOCK, new ItemStack(ItemInit.TIN_INGOT), 0.6f);

		//COINS
		this.addCooking(ItemInit.PLATINUM_NUGGET, new ItemStack(ItemInit.PLATINUM_COIN), 0.6f);
		this.addCooking(ItemInit.TUNGSTEN_NUGGET, new ItemStack(ItemInit.TUNGSTEN_COIN), 0.6f);
		this.addCooking(Items.GOLD_NUGGET, new ItemStack(ItemInit.GOLD_COIN), 0.6f);
		this.addCooking(ItemInit.SILVER_NUGGET, new ItemStack(ItemInit.SILVER_COIN), 0.6f);
		this.addCooking(ItemInit.LEAD_NUGGET, new ItemStack(ItemInit.LEAD_COIN), 0.6f);
		this.addCooking(Items.IRON_NUGGET, new ItemStack(ItemInit.IRON_COIN), 0.6f);
		this.addCooking(ItemInit.COPPER_NUGGET, new ItemStack(ItemInit.COPPER_COIN), 0.6f);
		this.addCooking(ItemInit.TIN_NUGGET, new ItemStack(ItemInit.TIN_COIN), 0.6f);
		
		//FOOD
		this.addCooking(Items.POTATO, new ItemStack(Items.POTATO), 0.6f);
		this.addCooking(Items.CHICKEN, new ItemStack(Items.CHICKEN), 0.6f);
		this.addCooking(Items.FISH, new ItemStack(Items.FISH), 0.6f);
		this.addCooking(Items.PORKCHOP, new ItemStack(Items.PORKCHOP), 0.6f);
		this.addCooking(Items.BEEF, new ItemStack(Items.BEEF), 0.6f);

		//OTHER PROCESSING
		this.addCooking(Items.CLAY_BALL, new ItemStack(Items.BRICK), 0.6f);
		this.addCookingRecipeForBlock(Blocks.CLAY, new ItemStack(Blocks.HARDENED_CLAY), 0.6f);
		this.addCookingRecipeForBlock(Blocks.NETHERRACK, new ItemStack(Items.NETHERBRICK), 0.6f);
		this.addCookingRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(Blocks.STONE), 0.6f);
		
		//DYE=LAPIS LAZULI !!NEEDS META DATA!!
		this.addCookingRecipeForBlock(Blocks.LAPIS_ORE, new ItemStack(Items.DYE), 0.6f);
		this.addCookingRecipeForBlock(Blocks.QUARTZ_ORE, new ItemStack(Items.QUARTZ), 0.6f);
		this.addCookingRecipeForBlock(Blocks.REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.6f);
		
		//DYE=CHARCOAL !!NEEDS META DATA!!
		this.addCookingRecipeForBlock(Blocks.LOG, new ItemStack(Items.COAL), 0.6f);
		
		//DYE=GREEN DYE !!NEEDS META DATA!!
		this.addCookingRecipeForBlock(Blocks.CACTUS, new ItemStack(Items.DYE), 0.6f);

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