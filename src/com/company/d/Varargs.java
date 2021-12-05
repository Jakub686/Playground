package com.company.d;

public class Varargs {
    public static void main(String[] args) {
        int result = add(2,2,1,3,2);
        System.out.println(result);
    }

    private static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            System.out.println("element " + (i + 1) + " to " + value);
            sum += value;
        }
        return sum;
    }
}
