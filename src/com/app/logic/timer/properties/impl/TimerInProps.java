package com.app.logic.timer.properties.impl;

import com.app.logic.timer.properties.TimerProperties;

/**
 * @author Aliksandr_Pleski
 */
public class TimerInProps implements TimerProperties {
    protected int hours;
    protected int min;
    protected int sec;

    public TimerInProps() {
    }

    public TimerInProps(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public void init() {
        System.out.println("TimerInProeprties init method.....");
    }

    @Override
    public void decrease(){
        if(sec != 0){
            sec--;
        }else if(min != 0){
            min--;
            sec = 59;
        }else if(hours != 0){
            hours--;
            min = 59;
        }
    }

    @Override
    public boolean isCompleted(){
        return sec == 0 && min == 0 && hours == 0;
    }

    @Override
    public String getStatus() {
        return "Remaining " + getHours() + " hours " +
                getMin() + " min " + getSec() + " sec";
    }

    @Override
    public String toString() {
        return "Hours " + hours + " min " + min + " sec " + sec;
    }
}
