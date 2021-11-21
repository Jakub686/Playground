package com.company.zadaniarekrutacyjne;

import java.util.Scanner;

public class TimeDivider {
    public static void main(String[] args) {

        System.out.println("Enter hours");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Enter minutes");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Enter sessions");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();

        int all = a * 60 + b; // wszystkie minuty
        int resultM = (all / c) % 60;  // reszta z wszystkich minut
        int resultH = (all / c) / 60;
        String zero;
        if(resultM<10) { zero = "0";} else {zero = "";}
        System.out.println("You have to study " + resultH + ":" + zero + resultM + "h per session");
    }
}

//1,10,2 the result under an hour
//2,2,2 the result over an hour