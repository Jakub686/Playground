package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PlayingWithCode {

    public static void main(String[] args) {
            int i = 5;
            float f = 5.5f;
            double d = 3.8;
            char c = 'a';
            if (i == f) c++;
            if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
            System.out.println(c);
            //(int)(f + d) => (int) (5.5 + 3.8) => (int)(9.3) => 9, so this also return false.
    }

}
