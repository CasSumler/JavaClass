package com.company;

public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getDiameter()
    {
        return radius * 2;
    }

    public double getArea()
    {
        return Math.PI * (radius * radius);
    }
}
