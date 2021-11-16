package com.company.B;

public class B_18 {
    static void b_18() {
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);


    }


}
