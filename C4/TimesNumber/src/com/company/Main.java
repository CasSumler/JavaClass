package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Please enter a number here: ");

        int numberEntered = input.nextInt();

        int count = 1;

        if (numberEntered < 1 || numberEntered > 10)
        {
            System.out.println("That number is out of range.");
        }
        else
        {
            while (count <= 10)
            {
                int answer = numberEntered * count;
                System.out.printf(numberEntered + " X %2d = %2d%n", count, answer);
                count++;
            }
        }

    }
}
