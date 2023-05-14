package com.thesmilingparadx.hadesmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INFERNAL = new ForgeTier(5,-1,1.5f,
            2f,-1, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.EMPTY);
}
