package com.plugin.Utils;

import arc.Events;
import mindustry.game.EventType.PlayerJoin;
import mindustry.gen.Call;

/**
 * PlayerJoinKeyWord
 */
public class PlayerAdminOwner {

  public PlayerAdminOwner() {
    Events.on(PlayerJoin.class, (e) -> {
      if (e.player.uuid().equals("BuiLkApxbJgAAAAAO2EgSw==") && e.player.admin) {
        e.player.name = "[<[gold]Owner[white]>] >> " + e.player.name;
      } else if (e.player.admin && e.player.uuid() != "BuiLkApxbJgAAAAAO2EgSw==") {
        e.player.name = "[<[red]Admin[white]>]" + e.player.name;
      }
      e.player.sendMessage(e.player.name + "[gold]Đã Rớt Vào Thế Giới Của Đa Cấp:)");

      Call.openURI(e.player.con, "https://discord.gg/4r3ey5ydYx");
    });
  }
}
