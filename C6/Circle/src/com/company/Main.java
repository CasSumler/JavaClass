package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Circle circle = new Circle(3.0);
        System.out.println("The radius is: " + circle.getRadius());

        double diameter = circle.getDiameter();
        System.out.println("The diameter is: " + diameter);

        double area = circle.getArea();
        System.out.println("The area is: " + area);
    }
}
