package com.company.c;

import java.util.ArrayList;

public class Alist {
    public static void main(String[] args) {
        ArrayList  first = new ArrayList();
        ArrayList  second = new ArrayList();
        first.add("A");
        first.add(2);
        first.add(3);

        second.add("B");
        second.add(2);

        System.out.println(first.get(1));
        System.out.println("size is = " + first.size());
    }
}
