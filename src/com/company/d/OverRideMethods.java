package com.company.d;

class Class {
    public void startEngine() {
        System.out.println("from class");
    }
}
class SubClass extends Class {
    public void startEngine() {
        System.out.println("from subclass");
        super.startEngine();

    }
}
public class OverRideMethods {
    public static void main(String[] args) {
        Class classs = new Class();
        SubClass subClass = new SubClass();
        classs.startEngine();
        subClass.startEngine();
    }
}



