package com.company.OcaExamEnthuware;

import java.util.function.Predicate;

public class Q128 {
    public static void main(String[] args) {
        printNumbers(i -> i % 2 != 0);
    }
    private static void printNumbers(Predicate<Integer> predicate) {
        for(int i = 1; i <= 10; i++) {
            if(predicate.test(i)) {
                System.out.print(i);
            }
        }
    }
}
