package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours){
        this.hours=hours;
    }
    public void setMinutes(int minutes){
        hours+=minutes/60;
        this.minutes=minutes%60;

    }
    public void setSeconds(int seconds){
        minutes+=seconds/60;
        this.seconds=seconds%60;

        //если минуты превысили 60
        hours+=minutes/60;
        this.minutes=minutes%60;
    }

    public int getHours() {return hours;}
    public int getMinutes(){return minutes;}
    public int getSeconds(){return seconds;}

    void add(TimeSpan time){
        this.setHours(this.hours+=time.getHours());
        this.setMinutes(this.minutes+=time.getMinutes());
        this.setSeconds(this.seconds+=time.getSeconds());
    }

    void subtract(TimeSpan time){
        this.setHours(this.hours-=time.getHours());
        this.setMinutes(this.minutes-time.getMinutes());
        this.setSeconds(this.seconds-time.getSeconds());
    }

    public String toString(){
        return String.format("%d:%02d:%02d",hours,minutes,seconds);
    }

}
