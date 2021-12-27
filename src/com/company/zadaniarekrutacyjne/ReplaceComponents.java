package com.company.zadaniarekrutacyjne;

public class ReplaceComponents {
    public static void main(String[] args) {
        //        020
        //        020
        //        020
        int tab[][] = {{0, 0}, {0, 0}, {0, 0}};

        for (int i = 0; i < tab.length; i++) {
            tab[i][1] = 2;
        }
//        tab[0][1] = 2;
//        tab[1][1] = 2;
//        tab[2][1] = 2;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}
