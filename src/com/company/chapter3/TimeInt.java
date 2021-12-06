package com.company.chapter3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeInt {
    public static void main(String[] args) throws ParseException {
        Integer value = 210101;
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");

        Date date = format.parse(value.toString());
        System.out.println(date);

    }
}
