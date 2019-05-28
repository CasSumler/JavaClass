package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Boat minnow = new Boat();

        System.out.println("New Boat");
        printBoatSummary(minnow);

        minnow.caughtSmallFish();
        minnow.caughtMediumFish();
        minnow.caughtBigFish();
        System.out.println("Caught some fish");
        printBoatSummary(minnow);

        minnow.caughtBigFish(17);
        minnow.caughtMediumFish(2);
        minnow.caughtSmallFish(4);
        System.out.println("Caught some big fish");
        printBoatSummary(minnow);

        minnow.caughtSmallFish();
        System.out.println("Caught one more small fish");
        printBoatSummary(minnow);

        minnow.caughtBigFish();
        System.out.println("Caught one more big fish");
        printBoatSummary(minnow);
    }

    private static void printBoatSummary(Boat boat)
    {
        System.out.println("Total weight: " + boat.getTotalWeight());
        System.out.println("Close to sinking?: " + boat.isCloseToSinking());
        System.out.println("Sunk?: " + boat.isSunk());
    }

}
