package com.company.OcaExamEnthuware;

import java.util.ArrayList;

public class Q130Lambda {
    public static void main(String[] args) {
        ArrayList<String>  shoppinglist = new ArrayList<>();
        shoppinglist.add("meat");
        shoppinglist.add("cheese");
        shoppinglist.add("veges");
        shoppinglist.add("yogurt");

        shoppinglist.forEach((n)-> System.out.println(n));
        /*
        Zapewnia implementacje interfacu funkcyjnego
        Jedno argumentowy interface funkcyjny (funkcja ktore nie nalezy do klasy, funkcja ktora moze byc stosowane jako wartosc zmiennej)
        parameter list -> body funcion
        usuwamy z metody:
        - modifiers
        - name
        - return type
        + ->
         */

    }
}
