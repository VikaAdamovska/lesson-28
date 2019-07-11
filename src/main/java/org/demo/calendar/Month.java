package org.demo.calendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Month {

    private String name;
    private int num;
    private int year;
    private List<Day> days;


    public String getMonthName(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM");
        return simpleDateFormat.format(date).toUpperCase();
    }


    public int getYear(Date date){
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear();
    }

    public int getMonthNumber(Date date){
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int monthNumber = localDate.getMonthValue();
        return monthNumber;
    }



}
