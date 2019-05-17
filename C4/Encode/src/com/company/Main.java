package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int offset = 5;
        int DOWNSHIFT = 26;

        char first = 'C';
        char middle = 'N';
        char last = 'S';

        first += offset;

        if(first > 'Z')
        {
            first -= DOWNSHIFT;
        }

        middle += offset;

        if(middle > 'Z')
        {
            middle -= DOWNSHIFT;
        }

        last += offset;

        if(last > 'Z')
        {
            last -= DOWNSHIFT;
        }
        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);
    }
}
