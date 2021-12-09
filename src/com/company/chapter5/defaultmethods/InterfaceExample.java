package com.company.chapter5.defaultmethods;


interface MyIF {
    //nie definiuje implementacji domyślnej
    int getNumber();

    //metoda domyślna definiuje implementację:
    default String getString() {
        return "Łańcuch domyślny";
    }
}

class MyIFImpl implements MyIF {
    //konieczne jest zaimplementowanie metody getNumber()
    public int getNumber() {
        return 100;
    }
}

public class InterfaceExample {
    public static void main(String args[]) {
        MyIFImpl obj = new MyIFImpl();

        //wywołanie metody jawnie zaimplementowanej w klasie MyIFImpl
        System.out.println(obj.getNumber());

        //wywołanie metody domyślnej interfejsu MyIF
        System.out.println(obj.getString());
    }

}
