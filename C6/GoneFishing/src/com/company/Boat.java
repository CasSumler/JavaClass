package com.company;

public class Boat
{
    private int smallFish = 0;
    private int mediumFish = 0;
    private int bigFish = 0;

    public void caughtSmallFish()
    {
        smallFish++;
    }

    public void caughtSmallFish(int quantity)
    {
        smallFish += quantity;
    }

    public void caughtMediumFish()
    {
        mediumFish++;
    }

    public void caughtMediumFish(int quantity)
    {
        mediumFish += quantity;
    }

    public void caughtBigFish()
    {
        bigFish++;
    }

    public void caughtBigFish (int quantity)
    {
        bigFish += quantity;
    }

    public int getTotalWeight()
    {
        int totalWeight = smallFish;
        totalWeight += 5 * mediumFish;
        totalWeight += 10 * bigFish;

        return totalWeight;
    }

    public boolean isCloseToSinking()
    {
        return getTotalWeight() > 200;
    }

    public boolean isSunk()
    {
        return getTotalWeight() > 210;
    }


}
