package com.company.OcaExamEnthuware;

public class Q95 {
    public static void testInts(Integer obj, int variable, int[] array) {

        variable++;
        obj++;
        array[0]++;
        System.out.println("In method     " + obj + " " + variable + " " + array[0]);
        //For Primitive types, parameters are pass-by-value
        //For Object types, the object reference is pass-by-value


    }

    public static void main(String[] args) {
        Integer obj = new Integer(5);
        int variable = 10;
        int[] array = {20};
        System.out.println("Before method " + obj + " " + variable + " " + array[0]);
        testInts(obj, variable, array);
        System.out.println("After method  " + obj + " " + variable + " " +array[0]);
    }
}
