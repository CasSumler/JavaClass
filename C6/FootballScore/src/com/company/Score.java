package com.company;

public class Score
{
    int points;

    public void setPoints(int points)
    {
        this.points = points;
    }

    public int getPoints()
    {
        return points;
    }

    public void completedFieldGoal()
    {
        points = points + 3;
    }

    public void completedTouchdown()
    {
        points = points + 6;
    }
}
