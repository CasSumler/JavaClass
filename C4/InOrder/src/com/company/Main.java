package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a number: ");
        int firstNumber = userInput.nextInt();

        System.out.println("Please enter a second number: ");
        int secondNumber = userInput.nextInt();

        System.out.println("Please enter a third number: ");
        int thirdNumber = userInput.nextInt();

        if (secondNumber > firstNumber && thirdNumber > secondNumber)
        {
            System.out.println("In order!");
        }
        else
        {
            System.out.println("Out of Order!");
        }
    }
}
