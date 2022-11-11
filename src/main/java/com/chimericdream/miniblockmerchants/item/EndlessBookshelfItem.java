package com.chimericdream.miniblockmerchants.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class EndlessBookshelfItem extends VillagerConversionItem {
    public static final String ID = "endless_bookshelf";

    public EndlessBookshelfItem() {
        super(new FabricItemSettings().group(ItemGroup.MISC));
    }

    @Override
    public String getVillagerProfession() {
        return "mm_furnisher";
    }
}