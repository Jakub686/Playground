package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class PlayingWithCode {

    public static void main(String[] args) {
        Stack list1 = new Stack();
        Stack list2 = new Stack();
        list1.push("100");
        list2 = list1;
        System.out.println(list1 + " " + list2);


    }
}




