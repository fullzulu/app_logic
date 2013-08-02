package com.app.logic.timer;

import com.app.logic.beans.Task;
import com.app.logic.timer.properties.TimerProperties;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Aliaksandr_Pleski
 */
public class TaskRunner {

    private Timer timer;
    private Task task;
    private int delay;

    public TaskRunner(Task task, int delay) {
        this.task = task;
        this.delay = delay;
        this.timer = new Timer();
    }

    public void schedule(){
        timer.schedule(new RunnerTimerTask(), delay*1000, 1000);
    }

    private class RunnerTimerTask extends TimerTask{
        @Override
        public void run() {
            TimerProperties taskProps = task.getProps();
            taskProps.decrease();
            System.out.println("Execute " + task.getObjective() +
                    ". " + taskProps.getStatus());
            if(taskProps.isCompleted()){
                timer.cancel();
                System.out.println("Executing....");
            }
        }
    }

    public void stop(){
        timer.cancel();
    }
}
