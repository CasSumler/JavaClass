package com.company;

public class Main
{

    public static void main(String[] args)
    {
        final int WINNING_SCORE = 21;

        java.util.Random random = new java.util.Random();

        int playerOneScore = 1;
        int playerTwoScore = 1;

        do
        {
            //player one
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            System.out.println("Player One rolled: " + die1 + " and " + die2);

            if (die1 + die2 == 2 || die1 + die2 == 10 || die1 + die2 == 12)
            {
                System.out.println("Player One has gained 3 points.");
                playerOneScore += 3;
            }
            else if (die1 + die2 == 4 || die1 + die2 == 6 || die1 + die2 == 8)
            {
                System.out.println("Player One has gained 2 points.");
                playerOneScore += 2;
            }
            else if (die1 + die2 == 5)
            {
                System.out.println("Player One has gained 1 point.");
                playerOneScore += 1;
            }
            else if (die1 + die2 == 3 || die1 + die2 == 7 || die1 + die2 == 9 || die1 + die2 == 11)
            {
                System.out.println("Player One has gained 0 point.");
                playerOneScore += 0;
            }
            playerOneScore++;

            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.println("Player Two rolled: " + die1 + " and " + die2);

            if (die1 + die2 == 2 || die1 + die2 == 10 || die1 + die2 == 12)
            {
                System.out.println("Player Two has 3 points.");
                playerTwoScore += 3;
            }
            else if (die1 + die2 == 4 || die1 + die2 == 6 || die1 + die2 == 8)
            {
                System.out.println("Player Two has 2 points.");
                playerTwoScore += 0;
            }
            else if (die1 + die2 == 5)
            {
                System.out.println("Player Two has 1 points.");
                playerTwoScore += 2;
            }
            else if (die1 + die2 == 3 || die1 + die2 == 7 || die1 + die2 == 9 || die1 + die2 == 11)
            {
                System.out.println("Player Two has 0 point.");
                playerTwoScore +=1;
            }
            playerTwoScore++;

        } while (playerOneScore <= WINNING_SCORE || playerTwoScore >= WINNING_SCORE);

        System.out.println("We have a winner!");
    }
}
