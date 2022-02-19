package com.company.OcaExamEnthuware;

import java.util.ArrayList;
import java.util.List;

public class Q113 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("val1"); //1
        list.add(1, "val3"); //3
        list.add(2, "val2"); //2
        System.out.println(list);
    }
}
