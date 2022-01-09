package com.company;

public class PlayingWithCode {
}
class A1 {
}

class AA1 extends A1 {
}


class TestC {
    public static void main(String[] args) throws Exception {
        A1 a = new A1();
        AA1 aa = new AA1();
        a = aa;
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());
    }
}




