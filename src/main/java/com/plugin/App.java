package com.plugin;

import mindustry.gen.Player;
import mindustry.mod.Plugin;
import mindustry.game.Team;
import com.plugin.Utils.*;

import arc.util.CommandHandler;

public class App extends Plugin {
    @Override
    public void init() {
        EventCenter.EventLoad();
    }

    @Override
    public void registerClientCommands(CommandHandler handler) {
        handler.<Player>register("changeteam", "", "Chuyển Team", (args, player) -> new ClientCommands(args, player));
    }

    @Override
    public void registerServerCommands(CommandHandler handler) {
    }
}
