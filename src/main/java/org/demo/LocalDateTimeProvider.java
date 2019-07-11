package org.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class LocalDateTimeProvider {
    public static void main(String[] args) {

        ZoneId zone;
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt;

        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        LocalDate ld2 = LocalDate.of(2019, 7, 1);

        ld2 = ld2.plus(10, ChronoUnit.DAYS);

        System.out.println("local date " + ld2);

        LocalDate ld3 = LocalDate.of(2019, 10, 1);
        Period  period = Period.between(ld2, ld3);
       // int days = period.get(ChronoUnit.DAYS);


        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(ld3.format(df));





    }
}
