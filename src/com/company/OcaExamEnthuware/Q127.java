package com.company.OcaExamEnthuware;

import java.time.LocalDate;

public class Q127 {
    public static void main(String [] args) {
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(1));
        System.out.println(joiningDate.withDayOfYear(2));
    }
}
