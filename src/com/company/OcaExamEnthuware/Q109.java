package com.company.OcaExamEnthuware;

import java.time.LocalDate;
import java.time.LocalTime;

public class Q109 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
    }
}
