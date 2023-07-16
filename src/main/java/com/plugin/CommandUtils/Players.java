package com.plugin.CommandUtils;

import mindustry.gen.Groups;
import mindustry.gen.Player;

public class Players {
    public static Player findPlayerPrefix(String preifx)
    {
        Player player = Groups.player.find(p -> p.name.startsWith(prefix) || p.name.endsWith(preifx));
        return player;
    }
}
