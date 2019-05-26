package com.company;

public class Main
{

    public static void main(String[] args)
    {
       java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Please enter a number here: ");
        int userNumber = input.nextInt();

        int total = 0 + userNumber;
        int count = 1;

        while (total <= 1000)
        {
            System.out.println("Please enter another number: ");
            userNumber = input.nextInt();
            total = total + userNumber;
            count++;
        }

        System.out.println("You reached a total of " + total + " to finally obtain a total greater than 1000.");

        if (count > 1)
        {
            System.out.println("You entered " + count + " numbers.");
        }
        else
        {
            System.out.println("You entered " + count + " number.");
        }
    }
}
