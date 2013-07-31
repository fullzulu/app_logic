package com.app.logic.timer.properties.impl;

import com.app.logic.timer.properties.TimerProperties;

import java.util.Date;

/**
 * @author Aliksandr_Pleski
 */
public class TimerAtProps extends TimerInProps implements TimerProperties {
    //TODO think of it please!!! and so .....format of date PM/AM......
    //currently it's not important
    private Date date;

    private int days;

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

    @Override
    public void decrease() {
        long timeDiff = date.getTime() - new Date().getTime();
        sec = (int) (timeDiff / 1000 % 60);
        min = (int) (timeDiff / (60 * 1000) % 60);
        hours = (int) (timeDiff / (60 * 60 * 1000) % 24);
        days = (int) (timeDiff / (24 * 60 * 60 * 1000));
    }

    @Override
    public boolean isCompleted() {
        return super.isCompleted() && days == 0;
    }

    @Override
    public String getStatus() {
        return "Remaining " + getDays() + " days " + getHours() + " hours " +
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