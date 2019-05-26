package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
        int fast = safeSpeed(0);
        System.out.println(fast);
        fast = safeSpeed(14);
        System.out.println(fast);
        fast = safeSpeed(15);
        System.out.println(fast);
        fast = safeSpeed(16);
        System.out.println(fast);
        fast = safeSpeed(55);
        System.out.println(fast);
    }

    private static int safeSpeed(int neighborSpeed)
    {
        int safe = neighborSpeed - 15;
        if (safe <= 0)
        {
            return 0;
        }
        return safe;
    }
}
