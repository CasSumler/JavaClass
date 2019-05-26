package com.company;

public class Main
{

    public static void main(String[] args)
    {
        char direction = response('R');
        System.out.println(direction);

        direction = response('Y');
        System.out.println(direction);

        direction = response('G');
        System.out.println(direction);

        direction = response('Z');
        System.out.println(direction);

        System.out.println();

        char nextLight = nextColor('R');
        System.out.println(nextLight);

        nextLight = nextColor('G');
        System.out.println(nextLight);

        nextLight = nextColor('Y');
        System.out.println(nextLight);

        nextLight = nextColor('P');
        System.out.println(nextLight);
    }

    private static char response(char color)
    {
        char red = 'R';
        char yellow = 'Y';
        char green = 'G';

        char stop = 'S';
        char caution = 'C';
        char go = 'G';
        char error = 'E';

        if (color == red)
        {
            return stop;
        }
        else if (color == yellow)
        {
            return caution;
        }
        else if (color == green)
        {
            return go;
        }
        else
        {}
        return error;
    }

    private static char nextColor(char color)
    {
        char red = 'R';
        char yellow = 'Y';
        char green = 'G';

        char error = 'E';

        if (color == red)
        {
            return green;
        }
        else if (color == green)
        {
            return yellow;
        }
        else if (color == yellow)
        {
            return red;
        }
        else
        {}
        return error;
    }
}
