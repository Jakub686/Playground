package com.company.chapter5.abstractclassexample2;

abstract class Dog {
    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void run();
}

class Husky extends Dog {
    public void run() {
        System.out.println("Dog runs");
    }
}

public class AbstractTutorial {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.bark();
        husky.run();
    }
}
