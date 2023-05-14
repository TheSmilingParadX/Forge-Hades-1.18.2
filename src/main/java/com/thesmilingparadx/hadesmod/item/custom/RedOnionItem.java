package com.thesmilingparadx.hadesmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RedOnionItem extends Item {
    public RedOnionItem(Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack stack, Level level, Player player) {
        if (player.getHealth() < player.getMaxHealth()) {
            player.heal((float) player.getMaxHealth() + 1.0f);

            if (!player.level.isClientSide) {
                player.addEffect(new MobEffectInstance(MobEffects.HEAL));
            }
        }

        return super.finishUsingItem(stack, level, player);
    }
}
