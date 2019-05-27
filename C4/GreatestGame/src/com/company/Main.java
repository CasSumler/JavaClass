package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Let's play The Greatest Guessing Game in the World!");
        System.out.println("What is your name?");
        String playerName = input.next();

        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Please pick a number between 1 and 100.");
        int guessNumber = input.nextInt();

        int count = 1;

        while (guessNumber != randomNumber)
        {
            if (guessNumber < randomNumber)
            {
                System.out.println("You are too low!");
            }
            else if (guessNumber > randomNumber)
            {
                System.out.println("You are too high!");
            }

            guessNumber = input.nextInt();
            count = count + 1;
        }

        System.out.println("You are correct!");
        System.out.println("Congratulations, " + playerName + "! You won!");
        System.out.println("You made " + count + " guesses.");

    }
}
