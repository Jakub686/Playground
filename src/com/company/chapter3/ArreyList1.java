package com.company.chapter3;

import java.util.ArrayList;

public class ArreyList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.set(1,"def");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
