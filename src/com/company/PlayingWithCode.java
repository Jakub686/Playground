package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PlayingWithCode {
    public static void main(String[] args) {

        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList1.add("111");
        arrayList1.add("aaa");

        arrayList2.add("222");
        arrayList2.add("bbb");

        show(arrayList1);
        show(arrayList2);

    }

    public static void show(ArrayList arrayList){
        System.out.println(arrayList);
    }
}
