package com.company.c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class TimeInt {
    public static void main(String[] args) throws ParseException {
        Integer value = 20210101;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        Date date = format.parse(value.toString());
        System.out.println(date);

    }
}
