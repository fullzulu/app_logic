package com.app.logic.beans.objectives;

/**
 * @author Aliaksandr_Pleski
 */
public abstract class AbstractObjective implements Objective {
    protected String description;
    protected boolean done;

    protected AbstractObjective(String description) {
        this.description = description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    protected void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
