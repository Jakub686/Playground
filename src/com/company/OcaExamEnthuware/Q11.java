package com.company.OcaExamEnthuware;

public class Q11 {
}
class Testt{
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main (String[] args){
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
    }
}