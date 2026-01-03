package com.straydoghider;

import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.RuneLite;

public class RunRunelite
{
    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(StrayDogHiderPlugin.class);
        RuneLite.main(args);
    }
}