package net.ib36;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("IB36");

	@Override
	public void onInitializeClient() {
		LOGGER.info("IB36 Mod Initialized!");
	}
}