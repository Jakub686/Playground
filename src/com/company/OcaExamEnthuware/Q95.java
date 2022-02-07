package com.company.OcaExamEnthuware;

public class Q95 {
    public static void testInts(Integer val1, int var) {
        val1 = var++;
        val1++;
        System.out.println(val1);
        // As a result of this, whenever we make any change in the same object in the method, that change is reflected in the original object. However, if we allocate a new object to the passed reference variable, then it won't be reflected in the original object.

    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);
    }
}
