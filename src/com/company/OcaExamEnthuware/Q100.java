package com.company.OcaExamEnthuware;

public class Q100 {
    public void m(int a){
        System.out.println("In int " + a);
    }
    public void m(char c){
        System.out.println("In char " + c);
    }
    public static void main(String[] args) {
        Q100 n = new Q100();
        int a = 'a';
        char c = '5';
        n.m(a);
        n.m(c);
    }
}
