package com.plugin.Utils;

import mindustry.game.Team;
import mindustry.gen.Call;
import mindustry.gen.Player;

/**
 * ClientCommands
 */
public class ClientCommands {

  public ClientCommands(String[] args, Player player)
  {
    if (player.team() == Team.crux) {
      Call.setPlayerTeamEditor(player, Team.sharded);
      player.team(Team.sharded);
      player.unit().team(Team.sharded);
    } else {
      Call.setPlayerTeamEditor(player, Team.crux);
      player.team(Team.crux);
      player.unit().team(Team.crux);

    }
  }
}
