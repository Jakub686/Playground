package com.company.OcaExamEnthuware;

import java.util.ArrayList;
import java.util.List;

public class Q89 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.set(0, "List");

        System.out.println(list);
    }
}
