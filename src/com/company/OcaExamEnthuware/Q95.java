package com.company.OcaExamEnthuware;

public class Q95 {
    public static void testInts(Integer obj, int variable) {

        variable++;
        obj++;

        //For Primitive types, parameters are pass-by-value
        //For Object types, the object reference is pass-by-value

    }

    public static void main(String[] args) {
        Integer obj = new Integer(5);
        int variable = 9;
        testInts(obj, variable);
        System.out.println(obj + " " + variable);
    }
}
