package com.app.logic.beans;

import com.app.logic.timer.properties.TimerProperties;

/**
 * @author Aliaksandr_Pleski
 */
public class Task {
    private TimerProperties props;
    /*
     * TODO will be replaced
     */
    private String objective;

    public Task(TimerProperties props, String objective) {
        this.props = props;
        this.objective = objective;
    }

    public TimerProperties getProps() {
        return props;
    }

    public void setProps(TimerProperties props) {
        this.props = props;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return "Remaining:\n" + props;
    }
}
