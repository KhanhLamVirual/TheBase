package com.plugin.Utils;

import arc.Events;
import mindustry.content.UnitTypes;
import mindustry.game.EventType.UnitCreateEvent;
import mindustry.game.EventType.UnitSpawnEvent;

/**
 * LockUnit
 */
public class LockUnit {

  public LockUnit() {
    Events.on(UnitSpawnEvent.class, (e) -> {
      if (e.unit.type == UnitTypes.corvus) {
        e.unit.kill();
      }
    });
    Events.on(UnitCreateEvent.class, (e) -> {
      if (e.unit.type() == UnitTypes.corvus) {
        e.unit.kill();
      }
    });
  }
}
