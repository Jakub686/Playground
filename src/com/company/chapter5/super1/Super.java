package com.company.chapter5.super1;
//Super. owoduje sie do zmiennej superklasy
class Superclass {
    int num = 100;

    public int printMethod() {
        return 200;}
}

class Subclass extends Superclass {
    int num = 110;

    void printNumber() {
        System.out.println(num); }

    void printNumberSuper() {
        System.out.println(super.num);} // super odwoluje sie do zmiennej superklasy

    public int printMethod() {
        return super.printMethod() + 10;} // super odwoluje sie do metody w superklasie
}

public class Super {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        Superclass superclass = new Superclass();
        subclass.printNumber();                       //subclass wyswietla swoja zmienna
        subclass.printNumberSuper();                  //subclass wyswietla zmienna z superklasy
        System.out.println(subclass.printMethod());   //subclass wywoluje swoja metode
        System.out.println(superclass.printMethod()); //subclass wywoluje metode superklasy
    }
}
