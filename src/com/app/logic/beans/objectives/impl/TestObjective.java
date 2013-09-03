package com.app.logic.beans.objectives.impl;

import com.app.logic.beans.objectives.AbstractObjective;
import java.io.InputStream;

/**
 * @author Aliaksandr_Pleski
 */
public class TestObjective extends AbstractObjective {

    public TestObjective(String description) {
        super(description);
    }

    @Override
    public void toDo() {
        System.out.println("Here is toDo method of test Objective class");
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("test/test.properties");
        done = input != null;
    }

}
