package com.chimericdream.miniblockmerchants.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.data.DataTracker;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Entity.class)
abstract public class MMEntityMixin {
    @Shadow @Final
    public DataTracker dataTracker;
}
