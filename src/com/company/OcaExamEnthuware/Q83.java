package com.company.OcaExamEnthuware;

public class Q83 {
    public static void main(String[] args) {
        short b = 1;
        byte s = 1;

        //s = s * b ; //operands of mathematical operators are ALWAYS promoted to AT LEAST int. dlatego wynik s * b bedzie int wiec nie mozna go przypisac do s bo s to byte
        System.out.println(s);
        b *= b ; // dlaczego to sie kompiluje?
        System.out.println(s);
    }
}
