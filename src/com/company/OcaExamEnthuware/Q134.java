package com.company.OcaExamEnthuware;

import com.company.zadaniarekrutacyjne.TestClass;

public class Q134 {
    int i;
    public Q134(int i) { this.i = i;  }
    public String toString() {
        if (i == 0) return null;
        else return "" + i;
    }
    public static void main(String[ ] args){
        Q134 t1 = new Q134(0);
        Q134 t2 = new Q134(2);
        System.out.println(t2);
        System.out.println(""+t1);
    }
}
