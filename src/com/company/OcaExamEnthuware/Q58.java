package com.company.OcaExamEnthuware;

public class Q58 {
    static int si = 10;

    public static void main(String args[]) {
        new TestClass();
    }

    public Q58() {
        System.out.println(this);
    }

    public String toString() {
        return "TestClass.si = " + this.si;
    }
}
