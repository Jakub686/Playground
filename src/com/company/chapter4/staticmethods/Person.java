package com.company.chapter4.staticmethods;

public class Person {
    static int COUNTER = 0;
    final String name;

    public Person(final String name) {
        this.name = name;
        COUNTER++;
    }

    public void greet() {
        System.out.println("Hello. My name is " + name + ".");
    }

    public static int countPeople() {
        return COUNTER;
    }

    public static void main(String[] args) {
        System.out.println("There are " + Person.countPeople() + " people.");
        Person john = new Person("John");
        Person jane = new Person("Jane");

        countPeople();
        john.greet();
        System.out.println("There are " + Person.countPeople() + " people.");
    }

}
