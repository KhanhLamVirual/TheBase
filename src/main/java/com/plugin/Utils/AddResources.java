package com.plugin.Utils;

import arc.Events;
import arc.util.Timer;
import mindustry.content.Items;
import mindustry.game.Team;
import mindustry.game.EventType.BlockBuildBeginEvent;
import mindustry.game.EventType.WorldLoadEndEvent;
import mindustry.type.Item;
import mindustry.type.TeamEntry;

/**
 * AddResources
 */
public class AddResources {

    public AddResources() {
        Events.on(WorldLoadEndEvent.class, (e) -> {
            Timer.schedule(() -> {
                try {
                        for (var i : Items.serpuloItems) {
                            Team.sharded.core().items.add(i, 2000);
                        }
                        for (var i : Items.erekirItems) {
                            Team.sharded.core().items.add(i, 2000);
                        }
                        for (var i : Items.serpuloItems) {
                            Team.crux.core().items.add(i, 2000);
                        }
                        for (var i : Items.erekirItems) {
                            Team.crux.core().items.add(i, 2000);
                        }
                } catch (Exception er) {
                }
            }, 1, 1);
        });
    }
}
