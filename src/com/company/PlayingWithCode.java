package com.company;

import java.util.Arrays;

public class PlayingWithCode {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 3, 3, 5, 5, 1, 2, 4, 4, 20, 20, -10};
        int[][] c = new int[a.length][2];
        int[] b = new int[200];
        for(int i = 0; i<a.length;i++){
            c[i][0]=a[i];
        }

        for (int i = -100; i <= 99; i++) { //zakres
            b[i + 100] = i;
        }
        for (int i = 0; i <= 200; i++){
            for (int j = 0; j == a.length-1; j++) {
                if (b[i] == a [j]){
                    c[j][1]++;
                }
            }
        }
        for (int[] arr : c) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
