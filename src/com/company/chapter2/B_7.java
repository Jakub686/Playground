package com.company.chapter2;

public class B_7 {

    public static void main(String[] args) {





            int a = 1;
            System.out.println(a == 2 ? a > 2 ? 1 : 2 : 3); // false false = 3
            int b = 2;
            System.out.println(b == 2 ? b > 2 ? 1 : 2 : 3); // true false = 2
            int c = 3;
            System.out.println(c == 2 ? c > 2 ? 1 : 2 : 3); // false true = 3
            int d = 2;
            System.out.println(d == 2 ? d >= 2 ? 1 : 2 : 3); // true true = 1



    }
}
