package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Score score = new Score();

        score.setPoints(0);
        int displayScore = score.getPoints();
        System.out.println("The score is: " + displayScore);

        score.completedFieldGoal();
        int displayFieldGoal = score.getPoints();
        System.out.println("With a field goal, the score is: " + displayFieldGoal);

        score.completedFieldGoal();
        displayFieldGoal = score.getPoints();
        System.out.println("With another field goal, the score is: " + displayFieldGoal);

        score.completedTouchdown();
        int displayTouchdown = score.getPoints();
        System.out.println("With a touchdown, the score is: " + displayTouchdown);

    }
}
