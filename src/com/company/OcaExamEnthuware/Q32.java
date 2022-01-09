package com.company.OcaExamEnthuware;

public class Q32 {
}

class Superr {
    public String toString() {
        return "4";
    }
}

class SubClass extends Superr {
    public String toString() {
        return super.toString() + "3";
    }

    public static void main(String[] args) {
        System.out.println(new SubClass());
    }
}