package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int area = getArea(4, 5);
        System.out.println("Area is: " + area);

        int perimeter = getPerimeter(4, 5);
        System.out.println("Perimeter is: " + perimeter);
    }

    private static int getArea(int height, int width)
    {
        int total = height * width;
        return total;
    }

    private static int getPerimeter(int height, int width)
    {
        int around = (2 * height) + (2 * width);
        return around;
    }
}
