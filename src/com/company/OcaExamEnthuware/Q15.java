package com.company.OcaExamEnthuware;

public class Q15 {
}
class TestClas{
    public static void main(String args[ ] ){
        Object a, b, c ;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println(""+c);
    }
}