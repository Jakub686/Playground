package com.company.OcaExamEnthuware;

public class Q75 {
    public static void main(String args[]) {
        Base b = new Subb(); //1

        b.methodA(); //2
        System.out.println(b.a);

    }
}

class Base {
    void methodA() {
        System.out.println("base - MethodA");
    }

    int a = 1;
}

class Subb extends Base {
    public void methodA() {
        System.out.println("sub - MethodA");
    }
        int a = 2;

}