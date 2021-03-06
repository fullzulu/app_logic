package com.app.logic.runner;

import com.app.logic.beans.Task;
import com.app.logic.beans.objectives.impl.TestObjective;
import com.app.logic.timer.properties.impl.TimerAtProps;
import com.app.logic.timer.TaskRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Aliaksandr_Pleski
 */
public class TimerRunner {
//    TODO think of some Manager class on init of the APP
//    just for test again
    public static void main(String[] args) throws Exception {
        /*Task task = new Task(new TimerInProps(0, 1, 4), "Task 1");
        new TaskRunner(task, 1);*/


        /*DateFormat formatter = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date date = formatter.parse("09/30/13 17:01:00");

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        Calendar now = new GregorianCalendar();
        now.setTime(new Date());

        System.out.println(now.getTimeI);

        System.out.println((calendar.get(Calendar.YEAR) - now.get(Calendar.YEAR)) + " " +
                (calendar.get(Calendar.MONTH) - now.get(Calendar.MONTH)) + " " +
                (calendar.get(Calendar.DAY_OF_MONTH) - now.get(Calendar.DAY_OF_MONTH)) + " " +
                (calendar.get(Calendar.HOUR) - now.get(Calendar.HOUR)) + " " +
                (calendar.get(Calendar.MINUTE) - now.get(Calendar.MINUTE)) + " " +
                (calendar.get(Calendar.SECOND) - now.get(Calendar.SECOND)));
          */

        DateFormat formatter = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        Date date = formatter.parse("09/02/13 22:30:15");

        Task task = new Task(new TimerAtProps(date), new TestObjective("Task 2"));
        TaskRunner runner = new TaskRunner(task, 1);
        runner.schedule();

        /* it's just a check for stopping
        long i = (long) 10000000000.0;
        while(i > 0){
            i--;
        }
        */

        //runner.stop();

    }
}
