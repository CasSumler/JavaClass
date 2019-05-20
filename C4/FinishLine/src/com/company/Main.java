package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Random random = new java.util.Random();
        int playerOnePosition = 1;
        int playerTwoPosition = 1;

        do
        {
            //player one
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            System.out.println("Rolled: " + die1 + " and " + die2);
            int nextPosition = playerOnePosition + 1;
            if (die1 == nextPosition || die2 == nextPosition || die1 + die2 == nextPosition)
            {
             playerOnePosition++;
            }
            System.out.println("Player One score is: " + playerOnePosition);

            //player two
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.println("Rolled: " + die1 + " and " + die2);
            nextPosition = playerTwoPosition + 1;
            if (die1 == nextPosition || die2 == nextPosition || die1 + die2 == nextPosition)
            {
                playerTwoPosition++;
            }
            System.out.println("Player Two score is: " + playerTwoPosition);

        } while (playerOnePosition < 10 && playerTwoPosition < 10);

        System.out.println("We have a winner");
    }
}
