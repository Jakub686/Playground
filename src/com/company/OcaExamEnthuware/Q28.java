package com.company.OcaExamEnthuware;

public class Q28 {

    private int myValue = 0;

    public void showOne(int myValue) {
        this.myValue = myValue;
    }

    public void showTwo(int myValue) {
        myValue = myValue;
    }

    public static void main(String[] args) {
        Q28 ct = new Q28();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
        System.out.println(ct.getClass());
    }
}

// familiar Q23