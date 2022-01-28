package com.company.OcaExamEnthuware;

public class Q70 {
    static boolean a;
    static boolean b;
    static boolean c;
    static boolean d;

    public static void main(String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true) || (d=true);
        System.out.print(a + ", " + b + ", " + c + ", " + d);
    }
}