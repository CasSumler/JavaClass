package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter your first number here: ");
        int number1 = userInput.nextInt();

        System.out.println("Please enter your second number here: ");
        int number2 = userInput.nextInt();

        System.out.println("Please enter your third number here: ");
        int number3 = userInput.nextInt();

        boolean num1AndNum2Good = number1 + 1 == number2;
        boolean num2AndNum3Good = number2 + 1 == number3;

        if (num1AndNum2Good && num2AndNum3Good)
        {
            System.out.println("In a Row!");
        }
        else
        {
            System.out.println("Not in a Row!");
        }
    }
}
