package com.company.OcaExamEnthuware;

public class Q33 {
}
class TestCla implements I1, I2{
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        TestCla tc = new TestCla();
        ( (I1) tc).m1();
    }
}
interface I1{
    int VALUE = 1;
    void m1();
}
interface I2{
    int VALUE = 2;
    void m1();
}
