package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String returnValue = getMyName();
        System.out.println(returnValue);

        int triangleSideCount = getTriangleSideCount();
        System.out.println("The number of sides a triangle has is: " + triangleSideCount);

        int sqaureSideCount = getSquareSideCount();
        System.out.println("The number of sides a square has is: " + sqaureSideCount);
    }

    private static String getMyName()
    {
        String myname = "Cassi";
        return myname;
    }

    private static int getTriangleSideCount()
    {
        int sides = 3;
        return sides;
    }

    private static int getSquareSideCount()
    {
        int sides = 4;
        return sides;
    }
}
