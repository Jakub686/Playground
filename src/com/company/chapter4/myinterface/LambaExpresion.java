/*
Lambda
Zapewnia implementacje interfacu funkcyjnego
Interface fukcyjny posiada tylko jedna metoda abstrakcyjną
Jedno argumentowy interface funkcyjny (funkcja ktore nie nalezy do klasy, metoda moze byc przekazywana jako wartosc zmiennej)
parameter list -> body funcion
usuwamy z metody:
- modifiers
- name
- return type
+ ->
 */

package com.company.chapter4.myinterface;

public class LambaExpresion {
    public static void main(String[] args) {
        String name = "Bro";
        char symbol = '!';

        MyInter_face myInterface = (x,y) -> {
            System.out.println("Hello World");
            System.out.println("It is a nice day " + x + y);
        };


        myInterface.message(name, symbol);
    }
}

