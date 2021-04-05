package org.example;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Time!" );
        int check = 0;
        Scanner s = new Scanner(System.in);
        Time time = new Time();

        do {
            System.out.print("Ingrese la hora: ");
            int hour = s.nextInt();
            if (hour >= 0 && hour <= 23) {
                time.setHour(hour);
                check = 0;
            } else {
                System.out.println("La hora introducida no es valida!");
                check = 1;
            }
        }while(check == 1);

        do {
            System.out.print("Ingrese los minutos: ");
            int minute = s.nextInt();
            if (minute >= 0 && minute <= 59) {
                time.setMinutes(minute);
                check = 0;
            } else {
                System.out.println("Los minutos introducidos no son válidos!");
                check = 1;
            }
        }while(check == 1);

        do {
            System.out.print("Ingrese los segundos: ");
            int second = s.nextInt();
            if (second >= 0 && second <= 59) {
                time.setSeconds(second);
                check = 0;
            } else {
                System.out.println("Los segundos introducidos no son válidos");
                check = 1;
            }
        }while(check == 1);

        System.out.println(time.verDetalle());
        time.retrocederSegundo();
        System.out.println("-1 SEGUNDO");
        System.out.println(time.verDetalle());
        time.avanzarSegundo();
        System.out.println("+1 SEGUNDO");
        System.out.println(time.verDetalle());

        /**Fecha con dateFormat**/
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yy"); //4M=mes completo-3M=mes abreviado,2M=mes numerico
        String dateFormat = df.format(date);
        System.out.println("Dia = " + dateFormat);
    }
}
