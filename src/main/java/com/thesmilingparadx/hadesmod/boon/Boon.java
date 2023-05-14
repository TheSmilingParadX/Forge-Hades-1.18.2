package com.thesmilingparadx.hadesmod.boon;

import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

import java.util.Arrays;
import java.util.List;

public abstract class Boon {
    private String name;

    public Boon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<Boon> availableBoons = Arrays.asList(
            new Boon("Swift Strike") {
                @Override
                public void apply(Player pPlayer) {
                    AttributeInstance attackSpeed = pPlayer.getAttribute(Attributes.ATTACK_SPEED);

                    if (attackSpeed != null) {
                        double currAttackSpeed = attackSpeed.getValue();
                        double newAttackSpeed = currAttackSpeed * 1.1;
                        attackSpeed.setBaseValue(newAttackSpeed);
                    }
                }
            },
            new Boon("Greater Haste") {
                @Override
                public void apply(Player pPlayer) {
                    AttributeInstance moveSpeed = pPlayer.getAttribute(Attributes.MOVEMENT_SPEED);

                    if (moveSpeed != null) {
                        double currMoveSpeed = moveSpeed.getValue();
                        double newMoveSpeed = currMoveSpeed * 1.2;
                        moveSpeed.setBaseValue(newMoveSpeed);
                    }
                }
            }
    );


    public abstract void apply(Player pPlayer);
}
