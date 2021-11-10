package com.company;

public class SBuilder {
    public static void main(String[] args) {

        String str = "abcd";
        StringBuilder sb = new StringBuilder() ;
        sb.append(str);
        System.out.println("String Builder = " + sb);

        sb.toString();

        System.out.println("String = " + sb);


    }
}
