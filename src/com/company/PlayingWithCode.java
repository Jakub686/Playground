package com.company;

import com.company.d.Overloading;

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

public class PlayingWithCode {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.sum(4.5, 6)); // wynik = 10.5
    }
}

