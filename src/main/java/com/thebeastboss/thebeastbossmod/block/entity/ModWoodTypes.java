package com.thebeastboss.thebeastbossmod.block.entity;

import com.thebeastboss.thebeastbossmod.TBBMod;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWoodTypes {
    public static final WoodType BEASTBOSS = WoodTypeRegistry.register(new Identifier(TBBMod.MOD_ID, "beastboss"), BlockSetType.OAK);
}
