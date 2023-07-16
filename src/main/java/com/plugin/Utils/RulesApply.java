package com.plugin.Utils;

import arc.Events;
import mindustry.Vars;
import mindustry.content.UnitTypes;
import mindustry.game.Rules;
import mindustry.game.EventType.WorldLoadEndEvent;

/**
 * RulesApply
 */
public class RulesApply {

    public RulesApply() {
        Events.on(WorldLoadEndEvent.class, (e) -> {
            Rules rule = Vars.state.rules;

            rule.unitBuildSpeedMultiplier = 15;
            rule.buildSpeedMultiplier = 15;
            rule.bannedUnits.add(UnitTypes.corvus); 
        });
    }
}
