package com.company.OcaExamEnthuware;

public class Q17 {
    public static void main(String[] args) {
        int a = 1;
        int[] ia = new int[10];
        int b = ia[a];
        int c = b + a;
        int d = 2;
        int e = 3;
        int f = 4;

        System.out.println(b = c);
        System.out.println(d=f=e);
    }
}
