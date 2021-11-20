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
        Integer value = 210101;
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");

        Date date = format.parse(value.toString());
        System.out.println(date);




        long dat = 890201;
        SimpleDateFormat format1 = new SimpleDateFormat("yyMMdd");

        Date date1 =  format1.parse(value.toString());
        System.out.println(date1);

    }
}
