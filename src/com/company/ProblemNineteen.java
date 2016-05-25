package com.company;

import sun.security.provider.Sun;

/**
 * Created by mr767 on 1/5/16.
 */
public class ProblemNineteen {
public static int[] monthDays = {31,28,31,30,31,30,31,31,30,30,31,31};
    public static String[] monthNames = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
    public static String[] dayNames={"Sun","Mon","Tued","Wed","Thur","Frid","Sat"};
    public static void problemNineteen(){
        int dayspassed=1;
        int day=1;
        int Sundays=0;
        int month=1;
        int year=1900;
        while(year<=2000){
            System.out.println(dayNames[dayspassed%7]+" "+day+" "+monthNames[month-1]+" "+year);

            if(dayspassed%7==0&&day==1&&year>1900){
                Sundays++;
                
            }
            dayspassed++;
            day++;
            int maxday=monthDays[month-1];
            if(day>maxday){
                day=1;
                month++;
            }
            if(month>12){
                month=1;
                year++;
                if(year%4==0){
                    monthDays[1]=29;

                }
                else {
                    monthDays[1]=28;
                }
            }






            }
        System.out.println(Sundays);

    }
}

