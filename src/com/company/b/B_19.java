package com.company.b;

public class B_19 {

     static void b_19() {


        int m = 9, n = 1, x = 0;
        while (m > n) {
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);

    }

}