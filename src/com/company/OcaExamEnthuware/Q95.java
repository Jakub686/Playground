package com.company.OcaExamEnthuware;

public class Q95 {
    public static void testInts(Integer obj, int variable) {

        variable++;
        obj++;
        System.out.println(obj + " " + variable);
        //For Primitive types, parameters are pass-by-value
        //For Object types, the object reference is pass-by-value

    }
    public static void testInts2(Integer obj, int variable) {

        variable++;
        obj++;
        System.out.println(obj + " " + variable);
        //For Primitive types, parameters are pass-by-value
        //For Object types, the object reference is pass-by-value

    }
    public static void main(String[] args) {
        Integer obj = new Integer(5);
        int variable = 9;
        System.out.println(obj + " " + variable);
        testInts(obj, variable);
        System.out.println(obj + " " + variable);
    }
}
