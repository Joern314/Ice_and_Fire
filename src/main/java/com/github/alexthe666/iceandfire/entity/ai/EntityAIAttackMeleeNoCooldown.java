package com.github.alexthe666.iceandfire.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIAttackMeleeNoCooldown extends EntityAIAttackMelee {
    public EntityAIAttackMeleeNoCooldown(EntityCreature creature, double speed, boolean memory) {
        super(creature, speed, memory);
    }

    public void updateTask() {
        super.updateTask();
        this.attackTick = 0;
    }
}
