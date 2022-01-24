package com.company.OcaExamEnthuware;

public class Q58 {
    static int si = 10;

    public static void main(String args[]) {
        new Q58();
    }

    public Q58() {
        System.out.println(this);// o co chodzi tutaj ze slowem this?
    }


    public String toString() {
        return "TestClass.si = " + this.si;
    }
}
