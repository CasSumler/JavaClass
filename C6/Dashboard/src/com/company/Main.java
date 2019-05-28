package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Dashboard dashboard = new Dashboard();

        dashboard.setSpeed(65);
        dashboard.setRpm(1500);
        String display = dashboard.getDisplay();
        System.out.println(display);

        dashboard.setSpeed(75);
        dashboard.setRpm(2000);
        display = dashboard.getDisplay();
        System.out.println(display);

    }
}
