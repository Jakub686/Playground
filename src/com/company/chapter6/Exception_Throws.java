package com.company.chapter6;

import java.util.Scanner;

public class Exception_Throws {
}

class Main {
    public static void main(String[] agrs) throws ArithmeticException {
        int x = 10;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj dzielnik: ");
        y = sc.nextInt();
        if (y == 0)
            throw new ArithmeticException("Nie mozna dzielić przez 0");
        else
            System.out.println(x / (double) y);
    }
}