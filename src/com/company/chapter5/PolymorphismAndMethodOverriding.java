package com.company.chapter5;

public class PolymorphismAndMethodOverriding {
}
class Animall {
    public String getName() {
        return "Animal";
    }
}
class Gorilla extends Animall {
   // protected String getName() { // DOES NOT COMPILE
    //    return "Gorilla";
   // }
}