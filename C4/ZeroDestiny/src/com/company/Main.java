package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter number here: ");
        int userNumber = userInput.nextInt();

        int count = 0;

        while (userNumber != 0)
        {
            System.out.println("Enter another number: ");
            userNumber = userInput.nextInt();
            count++;

            if (userNumber == 0)
            {
                System.out.println("Congrats! You entered a number other than zero " + count + " times.");
            }
        }
    }
}
