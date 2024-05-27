package net.runelite.client.plugins.microbot.vorkath;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Teleport {
    VARROCK_TAB("Varrock teleport", "break"),
    CRAFTING_CAPE("Crafting Cape", "break");


    ;private final String itemName;
    private final String action;

    @Override
    public String toString()
    {
        return itemName;
    }
}
