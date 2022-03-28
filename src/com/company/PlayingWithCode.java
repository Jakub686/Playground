package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PlayingWithCode {
    static String a;

    public static void main(String[] args) {
        System.out.println(PlayingWithCode.a);
        try{
            RuntimeException re = null;
            throw re;
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
