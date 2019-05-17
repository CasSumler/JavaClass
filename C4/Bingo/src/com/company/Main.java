package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a letter: ");
        char letter = userInput.next().charAt(0);

        System.out.println("Please enter a number: ");
        int number = userInput.nextInt();

        System.out.println("You entered: " + letter + number + ".");

        boolean valid = false;

        if (letter == 'B' && number >= 1 && number <= 15)
        {
            valid = true;
        }

        if (letter == 'I' && number >= 16 && number <= 30)
        {
            valid = true;
        }

        if (letter == 'N' && number >= 31 && number <= 45)
        {
            valid = true;
        }

        if (letter == 'G' && number >= 46 && number <= 60)
        {
            valid = true;
        }

        if (letter == 'O' && number >= 61 && number <= 75)
        {
            valid = true;
        }

        if (valid)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
