package com.thesmilingparadx.hadesmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties FOOD = (new FoodProperties.Builder()).nutrition(0).saturationMod(0.0f).effect(new MobEffectInstance(MobEffects.HEAL, 10, 0), 1.0f).fast().fast().alwaysEat().build();
    public static final FoodProperties RED_ONION = (new FoodProperties.Builder()).nutrition(0).saturationMod(0.0f).effect(new MobEffectInstance(MobEffects.HEAL, 10, 0), 1.0f).fast().fast().alwaysEat().build();
}