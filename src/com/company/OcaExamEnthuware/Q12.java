package com.company.OcaExamEnthuware;

public class Q12 {
}

class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.print("In Sub");
    }
}

class Testtttttttttt {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}