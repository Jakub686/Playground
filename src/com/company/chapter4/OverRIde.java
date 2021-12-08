package com.company.chapter4;

class Animalss {
    void makeNoise() {
        System.out.println("the animal makes noise");
    }
}

class Dog extends Animalss {
    @Override
    void makeNoise() {
        System.out.println("the dog makes noise");
    }
}

public class OverRIde {
    public static void main(String[] args) {
        Animalss animal = new Animalss();
        Dog dog = new Dog();

        animal.makeNoise();
        dog.makeNoise();
    }
}
