package com.company.OcaExamEnthuware;
public class Q4 {


    public static void testInts(Integer a, int b){
        a = b++;
        a++;
    }
    public static void main(String[] args) {
        Integer a = new Integer(5);
        int b = 9;
        testInts(a++, ++b);
        System.out.println(a+" "+b);
    }
}