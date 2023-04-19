package com.thesmilingparadx.hadesmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HADES_TAB = new CreativeModeTab("hadesmod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DARKNESS.get());
        }
    };
}
