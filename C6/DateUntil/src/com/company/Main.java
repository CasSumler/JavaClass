package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Date date = new Date(29, 5, 2019);
        System.out.println("The date is: " + date.getDay());
        System.out.println("The month is: " + date.getMonth());
        System.out.println("The year is: " + date.getYear());

        System.out.println(date.getFormattedDate());

        Date date2 = new Date(7, 12, 2019);
        System.out.println("The date is: " + date2.getDay());
        System.out.println("The month is: " + date2.getMonth());
        System.out.println("The year is: " + date2.getYear());

        System.out.println(date2.getFormattedDate());

        Date date3 = new Date(7, 8, 2019);
        System.out.println("The date is: " + date3.getDay());
        System.out.println("The month is: " + date3.getMonth());
        System.out.println("The year is: " + date3.getYear());

        System.out.println(date3.getFormattedDate());

        Date date4 = new Date(25, 11, 2019);
        System.out.println("The date is: " + date4.getDay());
        System.out.println("The month is: " + date4.getMonth());
        System.out.println("The year is: " + date4.getYear());

        System.out.println(date4.getFormattedDate());
    }
}
