package com.company.OcaExamEnthuware;

public class Q95 {
    public static void testInts(int variable, int[] obj) {

        variable++;
        obj[0]++;
        System.out.println("In method: variable = " + variable + ", object= " + obj[0]);
        //For Primitive types, parameters are pass-by-value
        //For Object types, the object reference is pass-by-value
    }

    public static void main(String[] args) {

        int variable = 10;
        int[] obj = {20};
        System.out.println("Before method: variable = " + variable + ", object= " + obj[0]);
        testInts(variable,  obj);
        System.out.println("After method: variable = " + variable + ", object= " + obj[0]);
    }
}

