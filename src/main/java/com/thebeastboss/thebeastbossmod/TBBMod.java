package com.thebeastboss.thebeastbossmod;

import com.thebeastboss.thebeastbossmod.item.ModItemGroups;
import com.thebeastboss.thebeastbossmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBBMod implements ModInitializer {
	public static final String MOD_ID = "thebeastbossmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}