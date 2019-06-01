package com.company;

public class Clock
{
    private int hour;
    private int minute;
    private boolean pm;

    public Clock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public String getMilitaryTime()
    {
        String hourText = getPrintableUnit(hour);
        String minuteText = getPrintableUnit(minute);

        return hourText + ":" + minuteText;
    }

    public String getTime()
    {
        String hourText;
        String minuteText = getPrintableUnit(minute);
        String ampm;

        if (hour == 0)
        {
            hourText = "12";
        }
        else if (hour > 12)
        {
            hourText = getPrintableUnit(hour - 12);
        }
        else
        {
            hourText = getPrintableUnit(hour);
        }

        if (hour > 11)
        {
            ampm = "PM";
        }
        else
        {
            ampm = "AM";
        }

        return hourText + ":" + minuteText + " " + ampm;
    }

    public Clock(int hour, int minute, boolean pm)
    {
        this.hour = hour;
        this.minute = minute;
        this.pm = pm;
    }

    private String getPrintableUnit(int units)
    {
        String unitText;

        if (units < 10)
        {
            unitText = "0" + units;
        }
        else
        {
            unitText = "" + units;
        }
        return unitText;
    }

   public void incrementHour()
   {
       hour++;
   }

   public void decrementHour()
   {
       hour--;
   }

   public void incrementMinute()
   {
       minute++;
       if (minute >= 60)
       {
           minute = 0;
           hour++;
       }
   }

   public void decrementMinute()
   {
       minute--;
       if (minute < 0)
       {
           minute = 59;
           hour--;
       }
   }

}
