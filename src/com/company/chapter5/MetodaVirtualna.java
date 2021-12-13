package com.company.chapter5;

//Virtual Methods to metoda która może być nadpisana przez podklase
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
        Animal animal = new Animal();
        animal.eat();
        Animal animal1 = new Lion(); // Referencja jest typu Animal, ale rzeczywisty obiekt jest typu, Lion.
        animal1.eat(); // Metoda nadpisana przez klase
        Lion lion = new Lion();
        lion.eat();

//        result:
//        Animal is eating
//        Lion is eating
//        Lion is eating
    }
}
