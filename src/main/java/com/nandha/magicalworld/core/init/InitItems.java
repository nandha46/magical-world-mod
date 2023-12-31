package com.nandha.magicalworld.core.init;

import com.nandha.magicalworld.MagicalWorld;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MagicalWorld.MOD_ID);
	public static final RegistryObject<Item> FIRST_ITEM = ITEMS.register("first_item", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
