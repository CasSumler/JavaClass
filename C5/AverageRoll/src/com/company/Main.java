package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printAverage(1);
        printAverage(10);
        printAverage(100);
    }

    private static void printAverage(int rolls)
    {
        java.util.Random random = new java.util.Random();

        int count = 0;
        int total = 0;

        while (count < rolls)
        {
            int roll = random.nextInt(20) + 1;
            total = total + roll;
            count++;
        }
        System.out.println("The total of all the rolls is: " + total);

        int average = total / rolls;
        System.out.println("The average of all the rolls is: " + average);
    }
}
