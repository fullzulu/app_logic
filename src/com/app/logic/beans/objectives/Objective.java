package com.app.logic.beans.objectives;

/**
 * @author Aliaksandr_Pleski
 */
public interface Objective {
    /**
     * here needed some implementation of what we want to do in this objective
     */
    public void toDo();
    /**
     * method shows is the objective done
     */
    public boolean isDone();
    /**
     *
     */
    public String getDescription();
}
