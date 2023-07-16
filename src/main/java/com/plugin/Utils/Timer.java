package com.plugin.Utils;

import arc.Events;
import mindustry.game.Team;
import mindustry.game.EventType.WorldLoadEndEvent;
import mindustry.gen.Call;
import mindustry.world.consumers.ConsumeLiquidFlammable;



/**
 * Timer
 */
public class Timer {

    private int timeCount = 1800;
    private int winerCount = 0;

    public Timer() {

        Events.on(WorldLoadEndEvent.class , (e) -> {
            winerCount = 0;
            timeCount = 1800;
            Call.sendMessage("[green]Team Sharded Has Win After : " + timeCount + "s" );
            arc.util.Timer.instance().clear();
            arc.util.Timer.schedule(() -> {
                timeCount -= 1;
                if (timeCount > 0) {

                    if (timeCount > 0) {
                        Call.infoPopup("[gold]Sharded [white]Win After : " + timeCount + "s", 1, 0, 0, 0, 450, 0);
                    }
                } else {
                    if (winerCount == 0) {
                        Events.fire(new mindustry.game.EventType.GameOverEvent(Team.sharded));
                        Call.sendMessage("[green]Chúc Mừng : [gold]Sharded [green]Đã Dành Chiến Thắng !");
                        winerCount += 1;
                    }
                }
            }, 1, 1);
        });
    }
}
