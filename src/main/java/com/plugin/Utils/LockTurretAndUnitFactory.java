
package com.plugin.Utils;

import arc.Events;
import mindustry.content.Blocks;
import mindustry.game.Team;
import mindustry.game.EventType.BuildSelectEvent;
import mindustry.world.blocks.defense.turrets.Turret;
import mindustry.world.blocks.units.UnitFactory;

/**
 * LockTurretAndUnitFactory
 */
public class LockTurretAndUnitFactory {

    public LockTurretAndUnitFactory() {
        Events.on(BuildSelectEvent.class, (e) -> {
            if (e.team == Team.sharded) {
                if (e.builder.buildPlan().block instanceof UnitFactory || 
                    e.builder.buildPlan().block == Blocks.additiveReconstructor ||
                    e.builder.buildPlan().block == Blocks.multiplicativeReconstructor ||
                    e.builder.buildPlan().block == Blocks.exponentialReconstructor ||
                    e.builder.buildPlan().block == Blocks.tetrativeReconstructor ||
                    e.builder.buildPlan().block == Blocks.foreshadow
                        ) {
                    e.tile.removeNet();
                    e.tile.setBlock(Blocks.air);
                }
            } else if (e.team == Team.crux) {
                if (e.builder.buildPlan().block instanceof Turret || e.builder.buildPlan().block == Blocks.segment || e.builder.buildPlan().block == Blocks.parallax) {
                    e.tile.removeNet();
                    e.tile.setBlock(Blocks.air);
                }
            }
        });
    }
}
