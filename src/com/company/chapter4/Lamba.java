package com.company.chapter4;

import java.util.ArrayList;

public class Lamba {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); }         );
        for (Integer n: numbers) { System.out.println(n);}

        numbers.forEach((a) ->{System.out.println(a);});
    }
}
