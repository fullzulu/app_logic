package com.app.logic.beans;

import com.app.logic.beans.objectives.Objective;
import com.app.logic.timer.properties.TimerProperties;

/**
 * @author Aliaksandr_Pleski
 */
public class Task {
    private TimerProperties props;
    /*
     * TODO will be replaced
     */
    private Objective objective;

    public Task(TimerProperties props, Objective objective) {
        this.props = props;
        this.objective = objective;
    }

    public TimerProperties getProps() {
        return props;
    }

    public void setProps(TimerProperties props) {
        this.props = props;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        return "Remaining:\n" + props;
    }
}
