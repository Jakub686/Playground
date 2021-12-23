package com.company.chapter6;

public class Exception_Throw {
    public static int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
    public static void main(String[] args) {
        System.out.println(getNumberOfSeconds(5));
        System.out.println(getNumberOfSeconds(-1));
    }
}
