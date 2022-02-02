package com.company.OcaExamEnthuware;

class Supe { static String ID = "QBANK"; }

class Subbb extends Supe{
    static { System.out.print("In Sub"); }
}

public class Q82 {
    public static void main(String[] args){
        System.out.println(Subbb.ID);
    }
}
