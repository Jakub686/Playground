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
        for (String object : listA) {
            System.out.println("Components from listA = " + object);
        }

        //--------------------------------------------

        String[] array = listToArray(listA);

        //--------------------------------------------

        System.out.println("Conversion to a list");

        List<String> listB = Arrays.asList(array);

        System.out.println("length of listB = " + listB.size());
        for (String object : listB) {
            System.out.println("Components from a listB = " + object);
        }
    }

    private static String[] listToArray(List<String> listA) {
        //Lista do tablicy
        System.out.println("Conversion to an array");
        //String[] array = (String[]) listA.toArray();//// po leckji
        String[] array = listA.toArray(new String[0]); // nowa tablica <- listaA // Dlaczego new String[0] ??

        System.out.println("length of array = " + array.length); // dlugosc tablicy
        for (String object : array) {
            System.out.println("Components from an array = " + object);
        }
        return array;
    }
}
