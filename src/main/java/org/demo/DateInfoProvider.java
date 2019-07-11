package org.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateInfoProvider {
    public static void main(String[] args) {
        Date date;
        Calendar c;
        TimeZone tz;

        Arrays
                .stream(TimeZone.getAvailableIDs())
                .forEach((System.out::println));

        Date date1 = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 06, 11);

        System.out.println(calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        System.out.println("our year" + year);

        calendar.add(Calendar.DAY_OF_MONTH, 30);
        //последний день месяца
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        System.out.println("Last day of month is " + calendar.get(Calendar.DAY_OF_MONTH));


        //сравнить две даты

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2019, 8, 01);

        //datediff

        System.out.println("datedIff " + (calendar.getTime().getTime() - calendar1.getTime().getTime())/(1000 * 6 * 60 * 24));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS SSS");
        System.out.println(sdf.format(calendar.getTime()));





    }
}
