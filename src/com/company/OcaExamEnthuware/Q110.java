package com.company.OcaExamEnthuware;


class Messag {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Q110 {
    public static void change(Messag m) { //Line n5
        m = new Messag(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Messag obj = new Messag(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
