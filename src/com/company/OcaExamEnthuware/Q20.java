package com.company.OcaExamEnthuware;

public class Q20 {
}

// Najpierw wykonują się metody statyczne pozniej main?
class InitTest {
    public static void main(String args[]) {
        InitTest it = new InitTest();
    }

    static String s1;

    {  // o co chodzi z tymi nawiasami
        s1 = sM1("b");
    }

    static {
        s1 = sM1("c");
    }

    public InitTest() {
        System.out.println("constructor");
    }

    private static String sM1(String s) {
        System.out.println(s);
        return s;
    }
}