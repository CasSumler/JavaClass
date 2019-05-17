package com.company;

public class Main
{

    public static void main(String[] args)
    {
        float flt = 1.0f / 3.0f;        //f suffix means float constant
        double dbl = 1.0 / 3.0;         //no suffix for double constant

        System.out.println(flt);        //displays 0.33333334
        System.out.println(dbl);        //displays 0.33333333333333

        dbl = 3.99999999;
        long lg = (long)dbl;            //fractional part truncated; want to change it to long constant

        System.out.println(lg);
    }
}
