package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter number here: ");
        int userNumber = userInput.nextInt();

        int count = 0;

        do
        {
            System.out.println("Please enter another number: ");
            userNumber = userInput.nextInt();
            count++;
        } while (userNumber != 99);

        System.out.println("I've been waiting so long.");

    }
}
