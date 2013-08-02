package com.app.logic.timer.properties.impl;

import com.app.logic.timer.properties.TimerProperties;

import java.util.Date;

/**
 * @author Aliksandr_Pleski
 */
public class TimerAtProps extends TimerInProps implements TimerProperties {
    private static final int SECONDS_IN_MINUTE_MINUTES_IN_HOUR = 60;
    private static final int MILLIS_IN_SECOND = 1000;
    private static final int HOURS_IN_DAY = 24;
    private static final int DAYS_IN_WEEK = 7;
    //TODO think of it please!!! and so .....format of date PM/AM......
    //currently it's not important
    private Date date;

    private int days;
    //TODO WEEKS!!!!
    private int weeks;

    public TimerAtProps(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public void decrease() {
        long timeDiff = date.getTime() - new Date().getTime();
        sec = (int) (timeDiff / MILLIS_IN_SECOND % SECONDS_IN_MINUTE_MINUTES_IN_HOUR);
        min = (int) (timeDiff / (SECONDS_IN_MINUTE_MINUTES_IN_HOUR * MILLIS_IN_SECOND) % SECONDS_IN_MINUTE_MINUTES_IN_HOUR);
        hours = (int) (timeDiff / (SECONDS_IN_MINUTE_MINUTES_IN_HOUR * SECONDS_IN_MINUTE_MINUTES_IN_HOUR * MILLIS_IN_SECOND) % HOURS_IN_DAY);
        weeks = (int) (timeDiff / (DAYS_IN_WEEK * HOURS_IN_DAY * SECONDS_IN_MINUTE_MINUTES_IN_HOUR * SECONDS_IN_MINUTE_MINUTES_IN_HOUR * MILLIS_IN_SECOND));
        days = (int) (timeDiff / (HOURS_IN_DAY * SECONDS_IN_MINUTE_MINUTES_IN_HOUR * SECONDS_IN_MINUTE_MINUTES_IN_HOUR * MILLIS_IN_SECOND) - (weeks * DAYS_IN_WEEK));
    }

    @Override
    public boolean isCompleted() {
        return super.isCompleted() && days == 0;
    }

    @Override
    public String getStatus() {
        return "Remaining " + getWeeks() + " weeks " + getDays() + " days " + getHours() + " hours " +
                getMin() + " min " + getSec() + " sec";
    }

    @Override
    public String toString() {
        return "Days " + days + " " + super.toString();
    }

    @Override
    public void init() {
        System.out.println("TimerAtProps method init.......");

    }
}
