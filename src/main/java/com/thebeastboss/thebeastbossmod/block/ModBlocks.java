package com.thebeastboss.thebeastbossmod.block;

import com.thebeastboss.thebeastbossmod.TBBMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BEASTBOSS_BLOCK = registerBlock("beastboss_block", new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG)
            .requiresTool().strength(6.4f, 6.9f).sounds(BlockSoundGroup.METAL).mapColor(MapColor.LAPIS_BLUE)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TBBMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TBBMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        TBBMod.LOGGER.info("Registering Mod Blocks for " + TBBMod.MOD_ID);
    }
}
