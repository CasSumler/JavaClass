package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double area = getArea(4.0);
        System.out.println("The area of the circle is: " + area);

        double diameter = getDiameter(4.0);
        System.out.println("The diameter of the circle is: " + diameter);

        double circumference = getCircumference(8.0);
        System.out.println("The circumference of the circle is: " + circumference);
    }

    private static double getArea(double radius)
    {
        double calculateArea = 3.14 * (radius * radius);
        return calculateArea;
    }

    private static double getDiameter(double radius)
    {
        double calculateDiameter = 2 * radius;
        return calculateDiameter;
    }

    private static double getCircumference(double diameter)
    {
        double calculateCircumference = 3.14 * diameter;
        return calculateCircumference;
    }
}
