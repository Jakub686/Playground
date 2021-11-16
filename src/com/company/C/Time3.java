package com.company.C;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time3 {
    public static void main(String[] args) {



        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted LocalDateTime : " + formattedDateTime);



    }
}
