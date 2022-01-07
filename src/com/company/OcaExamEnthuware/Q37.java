package com.company.OcaExamEnthuware;

public class Q37 {
        public static void main(String args[]){
        Aa[] a, a1;
        Bb[] b;
        a = new Aa[10]; a1  = a;
        b =  new Bb[20];
        a = b;  // 1
        b = (Bb[]) a;  // 2
       // b = (Bb[]) a1; // 3
    }
}
class Aa { }
class Bb extends Aa { }