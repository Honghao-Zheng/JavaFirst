package com.sparta;

public class Program {
    public static void main (String[] args){
        int timeOfDay=21;
        //short-ciruiting operation
        String result=greeting(timeOfDay);
        System.out.println(result);
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if(timeOfDay >=5 && timeOfDay <=12){
            greeting="Good morning";
        }
        else if(timeOfDay >12 && timeOfDay <=18){
            greeting="Good afternoon";
        }
        else if(){
            greeting="Good evening";
        }
        return greeting;
    }
}
