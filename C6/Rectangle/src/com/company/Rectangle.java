package com.company;

public class Rectangle
{
    private int height;
    private int width;
    private int temp;

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int doubleHeight()
    {
        return height = height * 2;
    }

    public int doubleWidth()
    {
        return width = width * 2;
    }

    public void rotate()
    {
        temp = height;
        height = width;
        width = temp;
    }
}
