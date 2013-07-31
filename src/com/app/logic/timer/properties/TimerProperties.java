package com.app.logic.timer.properties;

/**
 * @author Aliaksandr_Pleski
 */
public interface TimerProperties {
    void init();
    void decrease();
    boolean isCompleted();
    //TODO should be replaced in future
    String getStatus();

}
