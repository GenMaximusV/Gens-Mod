package com.GenMaximusV.GensMod.init;

import java.util.ArrayList;
import java.util.List;

import com.GenMaximusV.GensMod.items.ItemBase;
import com.GenMaximusV.GensMod.items.armor.ArmorBase;
import com.GenMaximusV.GensMod.items.food.FoodBase;
import com.GenMaximusV.GensMod.items.food.Spaghetti;
import com.GenMaximusV.GensMod.items.fuel.FuelBase;
import com.GenMaximusV.GensMod.items.magic.TomeofFire;
import com.GenMaximusV.GensMod.items.magic.TomeofLightning;
import com.GenMaximusV.GensMod.items.tools.ToolAxe;
import com.GenMaximusV.GensMod.items.tools.ToolHoe;
import com.GenMaximusV.GensMod.items.tools.ToolPickaxe;
import com.GenMaximusV.GensMod.items.tools.ToolSpade;
import com.GenMaximusV.GensMod.items.tools.ToolSword;
import com.GenMaximusV.GensMod.items.tools.copper.CopperToolAxe;
import com.GenMaximusV.GensMod.items.tools.copper.CopperToolHoe;
import com.GenMaximusV.GensMod.items.tools.copper.CopperToolPickaxe;
import com.GenMaximusV.GensMod.items.tools.copper.CopperToolSpade;
import com.GenMaximusV.GensMod.items.tools.copper.CopperToolSword;
import com.GenMaximusV.GensMod.items.tools.flint.FlintToolAxe;
import com.GenMaximusV.GensMod.items.tools.flint.FlintToolHoe;
import com.GenMaximusV.GensMod.items.tools.flint.FlintToolPickaxe;
import com.GenMaximusV.GensMod.items.tools.flint.FlintToolSpade;
import com.GenMaximusV.GensMod.items.tools.flint.FlintToolSword;
import com.GenMaximusV.GensMod.items.tools.platinum.PlatinumToolAxe;
import com.GenMaximusV.GensMod.items.tools.platinum.PlatinumToolHoe;
import com.GenMaximusV.GensMod.items.tools.platinum.PlatinumToolPickaxe;
import com.GenMaximusV.GensMod.items.tools.platinum.PlatinumToolSpade;
import com.GenMaximusV.GensMod.items.tools.platinum.PlatinumToolSword;
import com.GenMaximusV.GensMod.items.tools.silver.SilverToolAxe;
import com.GenMaximusV.GensMod.items.tools.silver.SilverToolHoe;
import com.GenMaximusV.GensMod.items.tools.silver.SilverToolPickaxe;
import com.GenMaximusV.GensMod.items.tools.silver.SilverToolSpade;
import com.GenMaximusV.GensMod.items.tools.silver.SilverToolSword;
import com.GenMaximusV.GensMod.items.tools.tin.TinToolAxe;
import com.GenMaximusV.GensMod.items.tools.tin.TinToolHoe;
import com.GenMaximusV.GensMod.items.tools.tin.TinToolPickaxe;
import com.GenMaximusV.GensMod.items.tools.tin.TinToolSpade;
import com.GenMaximusV.GensMod.items.tools.tin.TinToolSword;
import com.GenMaximusV.GensMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	//--------------------------------------------------------------
	
	
	//MATERIALS
	//TOOL MATERIALS
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_TUNGSTEN = EnumHelper.addToolMaterial("material_tungsten", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 0, 32, 12.0F, 0.0F, 22);
	public static final ToolMaterial MATERIAL_LEAD = EnumHelper.addToolMaterial("material_lead", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_TIN = EnumHelper.addToolMaterial("material_tin", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_FLINT = EnumHelper.addToolMaterial("material_flint", 1, 132, 4.0F, 1.0F, 5);
	public static final ToolMaterial MATERIAL_BONE = EnumHelper.addToolMaterial("material_bone", 1, 132, 4.0F, 1.0F, 5);


	//ARMOR MATERIALS
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("armor_material_platinum", Reference.MOD_ID + ":platinum", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TUNGSTEN = EnumHelper.addArmorMaterial("armor_material_tungsten", Reference.MOD_ID + ":tungsten", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MOD_ID + ":silver", 33,
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_LEAD = EnumHelper.addArmorMaterial("armor_material_lead", Reference.MOD_ID + ":lead", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MOD_ID + ":copper", 33,
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TIN = EnumHelper.addArmorMaterial("armor_material_tin", Reference.MOD_ID + ":tin", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BONE = EnumHelper.addArmorMaterial("armor_material_bone", Reference.MOD_ID + ":bone", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WOOD = EnumHelper.addArmorMaterial("armor_material_wood", Reference.MOD_ID + ":wood", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_PLANT = EnumHelper.addArmorMaterial("armor_material_plant", Reference.MOD_ID + ":plant", 33, 
			new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	//-----------------------------------------------------------
	
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//TIER 1 - RAW
	public static final Item PLANT_FIBER = new FuelBase("plant_fiber");
	public static final Item WOOD = new FuelBase("wood");
	public static final Item STONE = new ItemBase("stone");
	public static final Item OBSIDION = new ItemBase("obsidion");
	public static final Item SAND_DUST = new ItemBase("sand_dust");

	public static final Item RUBY = new ItemBase("ruby");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item SULPHUR_DUST = new ItemBase("sulphur_dust");
	
	public static final Item PLATINUM_ORE = new ItemBase("platinum_ore");
	public static final Item TUNGSTEN_ORE = new ItemBase("tungsten_ore");
	public static final Item GOLD_ORE = new ItemBase("gold_ore");
	public static final Item SILVER_ORE = new ItemBase("silver_ore");
	public static final Item LEAD_ORE = new ItemBase("lead_ore");
	public static final Item IRON_ORE = new ItemBase("iron_ore");
	public static final Item COPPER_ORE = new ItemBase("copper_ore");
	public static final Item TIN_ORE = new ItemBase("tin_ore");

	//TIER 2 - REFINED
	public static final Item PLANT_FABRIC = new FuelBase("plant_fabric");
	public static final Item WOOL_FABRIC = new FuelBase("wool_fabric");
	public static final Item COTON_FABRIC = new FuelBase("coton_fabric");
	public static final Item ROPE = new FuelBase("rope");
	public static final Item CHAIN = new ItemBase("chain");
	public static final Item CHARCOAL_DUST = new ItemBase("charcoal_dust");
	
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");	
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	
	public static final Item PLATINUM_NUGGET = new ItemBase("platinum_nugget");
	public static final Item TUNGSTEN_NUGGET = new ItemBase("tungsten_nugget");
	public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	public static final Item LEAD_NUGGET = new ItemBase("lead_nugget");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	public static final Item TIN_NUGGET = new ItemBase("tin_nugget");
	
	public static final Item PLATINUM_COIN = new ItemBase("platinum_coin");
	public static final Item GOLD_COIN = new ItemBase("gold_coin");
	public static final Item TUNGSTEN_COIN = new ItemBase("tungsten_coin");
	public static final Item SILVER_COIN = new ItemBase("silver_coin");
	public static final Item LEAD_COIN = new ItemBase("lead_coin");
	public static final Item IRON_COIN = new ItemBase("iron_coin");
	public static final Item COPPER_COIN = new ItemBase("copper_coin");
	public static final Item TIN_COIN = new ItemBase("tin_coin");

	//DYES
	public static final Item BLACK_DYE = new ItemBase("black_dye");
	public static final Item WHITE_DYE = new ItemBase("white_dye");
	public static final Item BROWN_DYE = new ItemBase("brown_dye");
	public static final Item BLUE_DYE = new ItemBase("blue_dye");
	
	//SEEDS
	public static final Item STRAWBERRY_SEED = new ItemBase("strawberry_seed");
	public static final Item RASPBERRY_SEED = new ItemBase("raspberry_seed");
	public static final Item BLUEBERRY_SEED = new ItemBase("blueberry_seed");
	public static final Item CORN_SEED = new ItemBase("corn_seed");
	public static final Item RICE_SEED = new ItemBase("rice_seed");
	
	//OTHER
	public static final Item MUG = new ItemBase("mug");
	public static final Item PLATE = new ItemBase("plate");

	
	//----------------------------------------------------------------------------
	
	
	//TOMES
	public static final Item TOME_OF_FIRE = new TomeofFire("tome_of_fire");
	public static final Item TOME_OF_LIGHTNING = new TomeofLightning("tome_of_lightning");
	
	
	//----------------------------------------------------------------------------
	
	
	//TOOLS & WEAPONS
	//PLATINUM
	public static final Item PLATINUM_SWORD = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
	public static final Item PLATINUM_AXE = new ToolAxe("platinum_axe", MATERIAL_PLATINUM);
	public static final Item PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", MATERIAL_PLATINUM);
	public static final Item PLATINUM_SHOVEL = new ToolSpade("platinum_shovel", MATERIAL_PLATINUM);
	public static final Item PLATINUM_HOE = new ToolHoe("platinum_hoe", MATERIAL_PLATINUM);
	
	//TUNGSTEN
	public static final Item TUNGSTEN_SWORD = new ToolSword("tungsten_sword", MATERIAL_TUNGSTEN);
	public static final Item TUNGSTEN_AXE = new ToolAxe("tungsten_axe", MATERIAL_TUNGSTEN);
	public static final Item TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", MATERIAL_TUNGSTEN);	
	public static final Item TUNGSTEN_SHOVEL = new ToolSpade("tungsten_shovel", MATERIAL_TUNGSTEN);
	public static final Item TUNGSTEN_HOE = new ToolHoe("tungsten_hoe", MATERIAL_TUNGSTEN);
	
	//SILVER
	public static final Item SILVER_SWORD = new ToolSword("silver_sword", MATERIAL_SILVER);
	public static final Item SILVER_AXE = new ToolAxe("silver_axe", MATERIAL_SILVER);
	public static final Item SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", MATERIAL_SILVER);
	public static final Item SILVER_SHOVEL = new ToolSpade("silver_shovel", MATERIAL_SILVER);
	public static final Item SILVER_HOE = new ToolHoe("silver_hoe", MATERIAL_SILVER);
	
	//LEAD
	public static final Item LEAD_SWORD = new ToolSword("lead_sword", MATERIAL_SILVER);
	public static final Item LEAD_AXE = new ToolAxe("lead_axe", MATERIAL_LEAD);
	public static final Item LEAD_PICKAXE = new ToolPickaxe("lead_pickaxe", MATERIAL_LEAD);
	public static final Item LEAD_SHOVEL = new ToolSpade("lead_shovel", MATERIAL_LEAD);
	public static final Item LEAD_HOE = new ToolHoe("lead_hoe", MATERIAL_LEAD);
	
	//COPPER
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final Item COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
	//TIN
	public static final Item TIN_SWORD = new ToolSword("tin_sword", MATERIAL_TIN);
	public static final Item TIN_AXE = new ToolAxe("tin_axe", MATERIAL_TIN);
	public static final Item TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", MATERIAL_TIN);
	public static final Item TIN_SHOVEL = new ToolSpade("tin_shovel", MATERIAL_TIN);
	public static final Item TIN_HOE = new ToolHoe("tin_hoe", MATERIAL_TIN);
	
	//FLINT
	public static final Item FLINT_SWORD = new ToolSword("flint_sword", MATERIAL_FLINT);
	public static final Item FLINT_AXE = new ToolAxe("flint_axe", MATERIAL_FLINT);
	public static final Item FLINT_PICKAXE = new ToolPickaxe("flint_pickaxe", MATERIAL_FLINT);	
	public static final Item FLINT_SHOVEL = new ToolSpade("flint_shovel", MATERIAL_FLINT);
	public static final Item FLINT_HOE = new ToolHoe("flint_hoe", MATERIAL_FLINT);
	
	//FLINT
	public static final Item BONE_SWORD = new ToolSword("bone_sword", MATERIAL_BONE);
	public static final Item BONE_AXE = new ToolAxe("bone_axe", MATERIAL_FLINT);
	public static final Item BONE_PICKAXE = new ToolPickaxe("bone_pickaxe", MATERIAL_BONE);	
	public static final Item BONE_SHOVEL = new ToolSpade("bone_shovel", MATERIAL_BONE);
	public static final Item BONE_HOE = new ToolHoe("bone_hoe", MATERIAL_BONE);	
	
	//WOOD
	//WOOD BUCKET
	
	
	
	//----------------------------------------------------
	
	
	//ARMOUR
	//PLATINUM
	public static final Item PLATINUM_HELMET = new ArmorBase("platinum_helmet", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHESTPLATE = new ArmorBase("platinum_chestplate", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_LEGGINGS = new ArmorBase("platinum_leggings", ARMOR_MATERIAL_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_BOOTS = new ArmorBase("platinum_boots", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	
	//TUNGSTEN
	public static final Item TUNGSTEN_HELMET = new ArmorBase("tungsten_helmet", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TUNGSTEN_CHESTPLATE = new ArmorBase("tungsten_chestplate", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TUNGSTEN_LEGGINGS = new ArmorBase("tungsten_leggings", ARMOR_MATERIAL_TUNGSTEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TUNGSTEN_BOOTS = new ArmorBase("tungsten_boots", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.FEET);
	
	//SILVER
	public static final Item SILVER_HELMET = new ArmorBase("silver_helmet", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new ArmorBase("silver_chestplate", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new ArmorBase("silver_leggings", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new ArmorBase("silver_boots", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
	
	//LEAD
	public static final Item LEAD_HELMET = new ArmorBase("lead_helmet", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEAD_CHESTPLATE = new ArmorBase("lead_chestplate", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAD_LEGGINGS = new ArmorBase("lead_leggings", ARMOR_MATERIAL_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEAD_BOOTS = new ArmorBase("lead_boots", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.FEET);
	
	//COPPER
	public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
	
	//TIN
	public static final Item TIN_HELMET = new ArmorBase("tin_helmet", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TIN_CHESTPLATE = new ArmorBase("tin_chestplate", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TIN_LEGGINGS = new ArmorBase("tin_leggings", ARMOR_MATERIAL_TIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TIN_BOOTS = new ArmorBase("tin_boots", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.FEET);

	//BONE
	public static final Item BONE_HELMET = new ArmorBase("bone_helmet", ARMOR_MATERIAL_BONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BONE_CHESTPLATE = new ArmorBase("bone_chestplate", ARMOR_MATERIAL_BONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BONE_LEGGINGS = new ArmorBase("bone_leggings", ARMOR_MATERIAL_BONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BONE_BOOTS = new ArmorBase("bone_boots", ARMOR_MATERIAL_BONE, 1, EntityEquipmentSlot.FEET);
	
	//PLANT
	public static final Item WOOD_HELMET = new ArmorBase("wood_helmet", ARMOR_MATERIAL_PLANT, 1, EntityEquipmentSlot.HEAD);
	public static final Item WOOD_CHESTPLATE = new ArmorBase("wood_chestplate", ARMOR_MATERIAL_PLANT, 1, EntityEquipmentSlot.CHEST);
	public static final Item WOOD_LEGGINGS = new ArmorBase("wood_leggings", ARMOR_MATERIAL_PLANT, 2, EntityEquipmentSlot.LEGS);
	public static final Item WOOD_BOOTS = new ArmorBase("wood_boots", ARMOR_MATERIAL_PLANT, 1, EntityEquipmentSlot.FEET);
	
	//PLANT
	public static final Item PLANT_HELMET = new ArmorBase("plant_helmet", ARMOR_MATERIAL_PLANT, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLANT_CHESTPLATE = new ArmorBase("plant_chestplate", ARMOR_MATERIAL_PLANT, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLANT_LEGGINGS = new ArmorBase("plant_leggings", ARMOR_MATERIAL_PLANT, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLANT_BOOTS = new ArmorBase("plant_boots", ARMOR_MATERIAL_PLANT, 1, EntityEquipmentSlot.FEET);
	
	
	//--------------------------------------------------
	
	
	//FOOD
	//TIER 1 - RAW
	public static final Item STRAWBERRY = new FoodBase("strawberry", 4, 2.4F, false);
	public static final Item RASPBERRY = new FoodBase("raspberry", 4, 2.4F, false);
	public static final Item BLUEBERRY = new FoodBase("blueberry", 4, 2.4F, false);
	public static final Item CORN = new FoodBase("corn", 4, 2.4F, false);
	public static final Item RICE = new FoodBase("rice", 4, 2.4F, false);
	
	//TIER 2 - REFINED
	public static final Item PASTA = new FoodBase("pasta", 4, 2.4F, false);
	public static final Item STRAWBERRY_JAM = new FoodBase("strawberry_jam", 4, 2.4F, false);
	public static final Item RASPBERRY_JAM = new FoodBase("raspberry_jam", 4, 2.4F, false);
	public static final Item BLUEBERRY_JAM = new FoodBase("blueberry_jam", 4, 2.4F, false);
	public static final Item APPLE_JAM = new FoodBase("apple_jam", 4, 2.4F, false);
	public static final Item CHOCOLATE_MILK = new FoodBase("chocolate_milk", 4, 2.4F, false);

	
	//TIER 3 - FINAL
	public static final Item SPAGHETTI = new Spaghetti("spaghetti", 4, 2.4F, false);
	public static final Item STRAWBERRY_SANDWICH = new FoodBase("strawberry_sandwich", 4, 2.4F, false);
	public static final Item RASPBERRY_SANDWICH = new FoodBase("raspberry_sandwich", 4, 2.4F, false);
	public static final Item BLUEBERRY_SANDWICH = new FoodBase("blueberry_sandwich", 4, 2.4F, false);
	public static final Item APPLE_SANDWICH = new FoodBase("apple_sandwich", 4, 2.4F, false);

}
