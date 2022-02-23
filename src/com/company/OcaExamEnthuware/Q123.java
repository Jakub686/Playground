package com.company.OcaExamEnthuware;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q123  {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove("Y");
        System.out.println(list);
    }
}