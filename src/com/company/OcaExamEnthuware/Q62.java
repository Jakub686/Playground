package com.company.OcaExamEnthuware;

public class Q62 {
    public void m(int a){
    System.out.println("In int " + a);
}
    public void m(char c){
        System.out.println("In char " + c);
    }
    public static void main(String[] args) {
        Q62 n = new Q62();
        int a = 'a';
        char c = 6;
        n.m(a);
        n.m(c);
    }
}
