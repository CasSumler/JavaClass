package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a number.");

        double myNumber = userInput.nextDouble();

        System.out.println("The number you entered was " + myNumber + ".");
    }
}
