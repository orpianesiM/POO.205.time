package org.example;

import java.text.SimpleDateFormat;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    /*****************************GETTERS AND SETTERS****************************************/
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /*******************************METODOS********************************************/
    public String verDetalle()
    {
         StringBuilder sb = new StringBuilder();

         if(hour < 10){
             sb.append("0");
         }
         sb.append(this.hour).append(":");
         if(minutes < 10) {
             sb.append("0");
         }
         sb.append(this.minutes).append(":");
         if(seconds < 10){
             sb.append("0");
         }
         sb.append(this.seconds);
    return sb.toString();
    }

    public int avanzarSegundo(){
        return this.seconds +=1;
    }
    public int retrocederSegundo(){
        return this.seconds -=1;
    }


}
