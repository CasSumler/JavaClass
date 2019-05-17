package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 1;
        int y = 2;
        System.out.println(x < y);          //displays true

        boolean b1 = x < y;                 //b1 assigned true
        boolean b2 = false;                 //b2 assigned false

        System.out.println(b1 && b2);       //displays false
        System.out.println(b1 || b2);       //displays true
        System.out.println(!b2);            //displays true
    }
}
