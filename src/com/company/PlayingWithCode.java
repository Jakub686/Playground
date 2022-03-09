package com.company;


import com.company.zadaniarekrutacyjne.TestClass;

import java.time.LocalDate;

public class PlayingWithCode {


    public static void main(String[] args) {
        String string ="-1312";
        int count = string.length() - string.replaceAll("2"," ").length();
        System.out.println(count);


    }
}