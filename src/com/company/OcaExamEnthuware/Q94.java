package com.company.OcaExamEnthuware;

public class Q94 {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag)   //1
            if (flag)   //2
                System.out.println("True False");
            else        // 3
                System.out.println("True True");
        else        // 4
            System.out.println("False False");
    }

}
