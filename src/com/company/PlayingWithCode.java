package com.company;



public class PlayingWithCode {
    public static void main(String args[]) {
        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);
        x = 6;
        y = (x >= 6) | (++x <= 7);
        System.out.println(x);
    }
}
