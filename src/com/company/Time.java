package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Time {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date = date.plusDays(10);
        System.out.println(date);
    }
}
