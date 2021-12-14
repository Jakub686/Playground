package com.company.chapter5;


//ability to pass instances of a subclass or interface to a method parameter
//Utworzenie metody statycznej z superklasa jako parametr po czym wowlanie tej metody z obiektami jako parametr
public class PolymorphicParameters {
}

class Reptile {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}

class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}

class ZooWorker {
    public static void feed(Reptile reptile) { // utworzenie metody statycznej z superklasa jako parametr
        System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void main(String[] args) { // wywolanie metody statycznej z obiektami jako parametr
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
    }
}


