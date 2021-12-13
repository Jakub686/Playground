package com.company.chapter5;

//Virtual Methods

class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    public void eat(){
        System.out.println("Lion is eating");
    }
}

public class MetodaVirtualna {
    public static void main(String[] args) {
        Animal animalAnimal = new Animal();
        animalAnimal.eat();
        Animal animalLion = new Lion();
        animalLion.eat();
    }
}
