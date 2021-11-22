package com.company.d;

public class Overloading {


    public int sum(int a, int b) // parametry typu int
    {
        return a + b;
    }

    public double sum(double a, double b) // zmieniamy parametry na double
    {
        return a + b;
    }

//    public static void main(String[] args) {
//        Overloading o = new Overloading();
//        System.out.println(o.sum(4.5, 6)); // wynik = 10.5
//    }
}

