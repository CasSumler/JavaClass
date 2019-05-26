package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Please select (C)ircle, (S)qaure, or (R)ectangle");
        String shape = input.next();

        switch (shape)
        {
            case "C":
            case "c":
                circle();
                break;

            case "S":
            case "s":
                square();
                break;

            case "R":
            case "r":
                rectangle();
                break;

            default:
                System.out.println("I don't understand.");
        }
    }

    private static void circle()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("You selected circle.");
        System.out.println("Please enter the radius.");

        double radius = input.nextDouble();
        double circlePerimeter = getCirclePerimeter(radius);
        double circleArea = getCircleArea(radius);

        System.out.println("The perimeter is: " + circlePerimeter);
        System.out.println("The area is: " + circleArea);
    }

    private static void square()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("You selected square.");
        System.out.println("Please enter the side length.");

        double sideLength = input.nextDouble();
        double squarePerimeter = getSquarePerimeter(sideLength);
        double squareArea = getSquareArea(sideLength);

        System.out.println("The perimeter is: " + squarePerimeter);
        System.out.println("The area is: " + squareArea);
    }

    private static void rectangle()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("You selected rectangle.");

        System.out.println("Please enter the height.");
        double height = input.nextDouble();

        System.out.println("Please enter the length.");
        double length = input.nextDouble();

        double rectanglePerimeter = getRectanglePerimeter(height, length);
        double rectangleArea = getRectangleArea(height, length);

        System.out.println("The perimeter is: " + rectanglePerimeter);
        System.out.println("The area is: " + rectangleArea);
    }

    private static double getCirclePerimeter(double radius)
    {
        return Math.PI * (radius * 2);
    }

    private static double getCircleArea(double radius)
    {

        return Math.PI * radius * radius;
    }

    private static double getSquarePerimeter(double sideLength)
    {
        return 4 * sideLength;
    }

    private static double getSquareArea(double sideLength)
    {
        return sideLength * sideLength;
    }

    private static double getRectanglePerimeter(double height, double length)
    {
        return (2 * height) + (2 * length);
    }

    private static double getRectangleArea(double height, double length)
    {
        return height * length;
    }
}
