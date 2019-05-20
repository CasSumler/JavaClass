package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int total = 0;
        int count = 0;

        do
        {
            System.out.println("Please enter a number here: ");
            int numberEntered = userInput.nextInt();
            count = count + 1;
            total = total + numberEntered;
            System.out.println("Total entered so far: " + total);
        } while (total <= 500);

        System.out.println("You reached a total of " + total + " to finally obtain a total greater than 500.");

        System.out.print("You entered " + count + " number");
        if (count > 1)
        {
            System.out.print("s");
        }
        System.out.println(".");
    }
}
