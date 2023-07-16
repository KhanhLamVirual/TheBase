package com.plugin.CommandUtils;

import mindustry.game.Team;

public class Teams {
    public static Team getTeam(String name)
    {
        for (Team t : Team.all ) {
            if (t.name.equals(name))
            {
                return t;
            }
        }
        return null;
    }
}
