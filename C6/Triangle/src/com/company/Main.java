package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();

        triangle.setSideA(4);
        triangle.setSideB(4);
        triangle.setSideC(4);

        Triangle triangle2 = new Triangle();

        triangle2.setSideA(4);
        triangle2.setSideB(5);
        triangle2.setSideC(8);

        printTriangleSummary(triangle);
        printTriangleSummary(triangle2);
    }

    public static void printTriangleSummary(Triangle triangle)
    {
        System.out.println("The length of sideA is: " + triangle.getSideA());
        System.out.println("The length of sideB is: " + triangle.getSideB());
        System.out.println("The length of sideC is: " + triangle.getSideC());

        System.out.println("The perimeter is: " + triangle.getPerimeter());
        System.out.println("The triangle is equilateral: " + triangle.isEquilateral());


    }
}
