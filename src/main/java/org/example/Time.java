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

    /*************************************************************************/
    public void avanzarSegundo(){
        if(this.seconds >= 59) {
            setearSegundosAvanzando();
            if (this.minutes >= 59) {
                setearMinutosAvanzando();
            }
        }else {
            this.seconds += 1;
        }
    }

    public void setearSegundosAvanzando(){
            this.minutes+=1;
            this.seconds=00;
    }

    public void setearMinutosAvanzando(){
            this.hour+=1;
            this.minutes=00;
    }

    /*************************************************************************/
    public void retrocederSegundo(){
        if(this.seconds == 00) {
            setearSegundosRetrocediendo();
            if (this.minutes == 00) {
                setearMinutosRetrocediendo();
            }
        }else{
            this.seconds -=1;
        }
    }

    public void setearSegundosRetrocediendo(){
            this.seconds=59;
    }

    public void setearMinutosRetrocediendo(){
            this.hour-=1;
            this.minutes=59;
    }

}
