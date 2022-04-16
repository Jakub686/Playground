package com.company;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PlayingWithCode {
    public static void main(String args[]) {
        NumberFormat formatter  = new DecimalFormat("0.00");
        int ticketPurchasedNumber = 1;
        int row = 6;
        int seats = 6;
        double a = ((double) ticketPurchasedNumber*100/(row*seats));
        System.out.println(formatter.format(a)+ "%" );

    }
}

