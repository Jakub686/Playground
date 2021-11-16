package com.company;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Play {
    public static void main(String[] args) {


//        020
//        020
//        020
        int tab[][] = {{0, 0, 0,}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < tab.length; i++) {

        }
        for (int j = 0; j < tab.length; j++) {
            tab[j][1] = 2;
        }
        System.out.println();

//        tab[0][1] =2;
//        tab[1][1] =2;
//        tab[2][1] =2;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}

