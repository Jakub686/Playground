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
//        Integer value = 210101;
//        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
//
//        Date date = format.parse(value.toString());
//        System.out.println(date);


    int x = 211132;
    Integer xI = x;
    SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
    Date date = format.parse(xI.toString());
        System.out.println(date);

        int y = 211132;
        String dataString;
        dataString = toString(y);




    }
}
