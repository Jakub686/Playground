package com.company.OcaExamEnthuware;

public class Q104 {
    public static int switchTest(int k){
        int j = 1;
        switch(k){
            case 1: j++;
                System.out.println(j);
            case 2: j++;
                System.out.println(j);
            case 3: j++;
                System.out.println(j);
            case 4: j++;
                System.out.println(j);
            case 5: j++;
                System.out.println(j);
            default : j++;
                System.out.println(j);
        }
        return j + k;
    }
    public static void main(String[] args){
        System.out.println( switchTest(4) );
    }
}
