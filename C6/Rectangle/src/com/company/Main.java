package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(4);
        rectangle.setWidth(5);
        System.out.println("The height is: " + rectangle.getHeight());
        System.out.println("The width is: " + rectangle.getWidth());

        System.out.println("Double the height is: " + rectangle.doubleHeight());
        System.out.println("Double the width is: " + rectangle.doubleWidth());

        rectangle.rotate();
        System.out.println("The height is now: " + rectangle.getHeight());
        System.out.println("The width is now: " + rectangle.getWidth());
    }
}
