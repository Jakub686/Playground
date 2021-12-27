package com.company.OcaExamEnthuware;

public class Q1 {
}

class TestClasss {
    static int si = 10;

    public static void main(String args[]) {
        new TestClasss();
    }

    public TestClasss() {
        System.out.println(this);
    }

    public String toString() {
        return "TestClass.si = " + this.si;
    }
}