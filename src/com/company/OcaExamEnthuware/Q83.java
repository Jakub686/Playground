package com.company.OcaExamEnthuware;

public class Q83 {
    public static void main(String[] args) {
        short s = 1;
        byte b = 2;
        double d = 3;

        //s = s * b ; //operands of mathematical operators are ALWAYS promoted to AT LEAST int. dlatego wynik s * b bedzie int wiec nie mozna go przypisac do s bo s to byte
        System.out.println(s);
        s *= b ; // dlaczego to sie kompiluje?
        System.out.println(s);
        b*= d; // ?????
        System.out.println(b);
        // jak sprawdzidz jakim typem jest zmienna
    }
}
