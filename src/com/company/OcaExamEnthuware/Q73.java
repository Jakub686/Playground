package com.company.OcaExamEnthuware;

public class Q73 {
}
class D {}
class D1 extends D {}
class D2 extends D {}
class ExtendsTesut{
    public static void main(String args[]){
        D d = new D();
        D1 d1 = new D1();
        D2 d2 = new D2();
        d1 = (D1) d1;
    }
}