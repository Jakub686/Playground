package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToArrayList {
    public static void main(String[] args) {


        List<String> listA = new ArrayList<>();

        listA.add("hawk");
        listA.add("robin");
        System.out.println("length of listA = " + listA.size());

        //Lista do tablicy
        String[] array = listA.toArray(new String[0]); // nowa tablica <- listaA // Dlaczego new String[0] ??
        System.out.println("length of Array = " + array.length); // dlugosc tablicy

        List<String> listB = Arrays.asList(array);
        System.out.println("length of listB = " + listB.size());


    }
}
