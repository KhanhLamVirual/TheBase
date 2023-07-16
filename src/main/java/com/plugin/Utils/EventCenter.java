package com.plugin.Utils;


/**
 * CommandCenter
 */
public class EventCenter {

  public static void EventLoad() {
    new AddResources();
    new LockTurretAndUnitFactory();
    new PlayerAdminOwner();
    new RulesApply();
    new Timer();
    new LockUnit();
  }
}
