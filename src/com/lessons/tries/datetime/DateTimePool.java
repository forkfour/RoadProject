package com.lessons.tries.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimePool {
    public static void main(String[] args) {
        /*Date date1 = new Date();
        Thread.sleep(1000);
        Date date2 = new Date();
        System.out.println((date1.getTime() < date2.getTime()) ? "Date2 bigger than date 1" : "Date1 bigger than date 2");
        System.out.println(date1 + "// " + date2);
        System.out.println(date2.before(date1));
        System.out.println(date2.after(date1));
        System.out.println(date1.getHours());*/


        Calendar calendar = new GregorianCalendar(2017, Calendar.FEBRUARY, 25);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.HOUR, 9);
        calendar.set(Calendar.MINUTE, 40);
        calendar.set(Calendar.SECOND, 35);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH, -200);
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");
        System.out.println(df.format(calendar.getTime()));

        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date(121212121212L);
        System.out.println(sf.format(date));
        System.out.println();
        DateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date3 = formatter.parse("Sat, April 4, 2020");
            System.out.println(date3);
            System.out.println(formatter.format(date3));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(LocalDate.now().plusDays(5));
        System.out.println(LocalDate.now().getDayOfWeek());
        LocalTime time = LocalTime.now();
        System.out.printf("%s:%s:%s", time.getHour(), time.getMinute(), time.getSecond());
    }
}
