package com.plugin;


import mindustry.gen.Player;
import mindustry.mod.Plugin;

import com.plugin.Utils.*;

import arc.util.CommandHandler;

public class App extends Plugin 
{
    @Override
    public void init() 
    {
        new Timer();
        new AddResources();
        new RulesApply();
        new LockTurretAndUnitFactory();
        new PlayerAdminOwner();
    }

    @Override
    public void registerClientCommands(CommandHandler handler) 
    {
      handler.<Player>register("changeteam", "", "Chuyển Team", (args, player) -> new ClientCommands(args, player));
    }
}
