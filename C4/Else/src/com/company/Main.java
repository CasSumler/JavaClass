package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int hrs = 21;

        if (hrs < 13)
        {
            System.out.println("Good morning: " + hrs);
        }
        else if (hrs < 18)
        {
            System.out.println("Good afternoon: " + hrs);
        }

        System.out.println("Good evening: " + hrs);
    }
}
