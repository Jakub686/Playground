package com.company;

import java.time.LocalDate;
import java.time.Period;

public class TImePeriod {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate plusTwoDays = now.plusDays(2);

        Period everyThreeWeeks = Period.ofWeeks(1);

        System.out.println(everyThreeWeeks);
        
        System.out.println("plusTwoDays = " + plusTwoDays);



    }
}
