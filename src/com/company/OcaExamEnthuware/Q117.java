package com.company.OcaExamEnthuware;

import java.util.ArrayList;
import java.util.List;

public class Q117 {
    public static void main(String[] args) {
    String s = new String("Hello");
    List<String> list = new ArrayList<>();
    list.add(s);
    list.add(new String("Hello"));
       s = s.replace("l", "L");
    list.add(s);

    System.out.println(list);
}
}
