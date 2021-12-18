package com.company.chapter5.abstractclassexample2;
// Klasa Zawiera zwykle metody z ciałem i metody abkstrakcyjne bez ciała
// Klasa abstrakcyjna nie tworzy obiektow, lecz mowi jak obiekty maja wygladac
// mozna dziedziczyc tylko po jednej klasie abstrakcyjnej
abstract class Dog {
    public void bark() { // metoda nie abstrakcyjna moze zawierac cialo
        System.out.println("Bark!");
    }

    public abstract void run(); // metoda abstrakcyjna nie moze miec ciala
}

class Husky extends Dog { // Conctere Class - pierwsza klasa nie abstrakcyjna ktora musi
                          // zawierac wszystkie metody abstrakcyjne dziecziczone po superklasie abstrakcyjnej
    public void run() {   // implementacja metody abstrakcynej
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
