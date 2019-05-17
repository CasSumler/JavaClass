package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;

        System.out.println("    Truth Table");
        System.out.println(" a     b    | a && b");
        System.out.println("--------------------");
        System.out.println("false false | " + (false && false));
        System.out.println("false true  | " + (b && a));
        System.out.println("true false  | " + (a && b));
        System.out.println("true true   | " + (a && a));
    }
}
