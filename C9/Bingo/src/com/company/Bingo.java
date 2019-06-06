package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Bingo
{
    HashSet<Integer> numbers = new HashSet<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a command.");

        boolean keepRunning = true;

        do
        {
            String command = input.next().toUpperCase();

            switch (command)
            {
                case "CALL":
                    int number = input.nextInt();
                    add(number);
                    break;
                case "CALLED":
                    called();
                    break;
                case "VERIFY":
                    number = input.nextInt();
                    verify(number);
                    break;
                case "CHALLENGE":
                    number = input.nextInt();
                    challenge(number);
                    break;
                case "BINGO":
                    bingo();
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        } while (keepRunning);
    }

    private void add(int number)
    {
        if (number >= 1 && number <= 75)
        {
            if(numbers.contains(number))
            {
                System.out.println("Already called!");
            }
            else
            {
                numbers.add(number);
                System.out.println("Added " + number);
            }
        }
        else
        {
            System.out.println("Not a valid number!");
        }
    }

    private void called()
    {
        System.out.println(numbers);
    }

    private void verify(int number)
    {
        if(numbers.contains(number))
        {
            System.out.println("Already called!");
        }
        else
        {
            System.out.println("Not called!");
        }
    }

    private void challenge(int number)
    {
        if(number >= 1 && number <= 75)
        {
            if(numbers.contains(number))
            {
                numbers.remove(number);
                System.out.println(number + " has been removed.");
            }
            else
            {
                System.out.println("That number has not been called.");
            }
        }
        else
        {
            System.out.println("Not a valid number!");
        }
    }

    private void bingo()
    {
        if(numbers.size() >= 4)
        {
            System.out.println("Congratulations, you win a fruit cake!");
            numbers.clear();
            System.out.println("The game has been reset.");
        }
        else
        {
            System.out.println("Cheater!");
        }
    }
}
