package com.straydoghider;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("straydoghider")
public interface StrayDogHiderConfig extends Config
{
	@ConfigItem(
			keyName = "hideVarrockDog",
			name = "Hide Varrock Stray Dog",
			description = "Hides the standard Stray Dog found in Varrock.",
			position = 1
	)
	default boolean hideVarrockDog() { return true; }

	@ConfigItem(
			keyName = "hideClanDog",
			name = "Hide Clan Hall Dog",
			description = "Hides the Stray Dog found in the Clan Hall.",
			position = 2
	)
	default boolean hideClanDog() { return true; }

	@ConfigItem(
			keyName = "hideMolossus",
			name = "Hide Varlamore Molossus",
			description = "Hides the Molossus dogs in Varlamore.",
			position = 3
	)
	default boolean hideMolossus() { return true; }
}