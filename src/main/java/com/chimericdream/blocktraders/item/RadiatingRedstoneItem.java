package com.chimericdream.blocktraders.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class RadiatingRedstoneItem extends VillagerConversionItem {
    public static final String ID = "radiating_redstone";

    public RadiatingRedstoneItem() {
        super(new FabricItemSettings().group(ItemGroup.MISC));
    }

    @Override
    protected String getVillagerProfession() {
        return "bt_engineer";
    }
}