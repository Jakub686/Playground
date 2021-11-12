package com.company;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeAndTimeZones {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28
        date = date.minusYears(10);
        System.out.println(date); // 2019-02-28

        System.out.println();
        System.out.println();

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date1.getDayOfWeek()); // MONDAY
        System.out.println(date1.getMonth()); // JANUARY
        System.out.println(date1.getYear()); // 2020
        System.out.println(date1.getDayOfYear()); // 20

        System.out.println();
        System.out.println();

        LocalDate date2 = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.of(date2, time);System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        LocalDate ld = LocalDate.now();
        DateTimeFormatter ldf = DateTimeFormatter.ofPattern("dd MM yy");
        System.out.println(ld.format(ldf));

    }
}
