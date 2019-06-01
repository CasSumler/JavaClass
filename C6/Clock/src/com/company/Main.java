package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //first constructor
        Clock clock = new Clock(9, 3);          //9:03
        System.out.println(clock.getMilitaryTime());        //09:03
        System.out.println(clock.getTime());

        Clock clock2 = new Clock(9, 45);        //9:45
        System.out.println(clock2.getMilitaryTime());       //09:45
        System.out.println(clock2.getTime());

        Clock clock3 = new Clock(14, 7);        //2:07
        System.out.println(clock3.getMilitaryTime());       //14:07 PM
        System.out.println(clock3.getTime());

        Clock clock4 = new Clock(14, 30);       //2:30
        System.out.println(clock4.getMilitaryTime());       //14:30 PM
        System.out.println(clock4.getTime());

        Clock clock5 = new Clock (0, 0);
        System.out.println(clock5.getMilitaryTime());
        System.out.println(clock5.getTime());

        Clock clock6 = new Clock (12, 0);
        System.out.println(clock6.getMilitaryTime());
        System.out.println(clock6.getTime());

        //increment minute
        Clock clock7 = new Clock (6, 59);
        System.out.println(clock7.getTime());
        clock7.incrementMinute();
        System.out.println(clock7.getTime());

        //decrement minute
        Clock clock8 = new Clock (5, 0);
        System.out.println(clock8.getTime());
        clock8.decrementMinute();
        System.out.println(clock8.getTime());

        //increment and decrement hour
        Clock clock9 = new Clock (2, 5);
        System.out.println(clock9.getTime());
        clock9.incrementHour();
        System.out.println(clock9.getTime());
        clock9.decrementHour();
        clock9.decrementHour();
        System.out.println(clock9.getTime());
    }
}
