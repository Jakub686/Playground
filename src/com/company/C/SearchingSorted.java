package com.company.C;


import java.util.Arrays;
import java.util.Locale;

public class SearchingSorted {
    public static void main(String[] args) {
        int[] numbers = {2,5,9};
        System.out.println(Arrays.binarySearch(numbers, 4)); // -2
        System.out.println(Arrays.binarySearch(numbers, 7)); // -3

    }
}
