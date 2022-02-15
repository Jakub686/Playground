package com.company.OcaExamEnthuware;

public class Q106 {
    static int a = 0;
    int b = 5;

    public void foo(){
        while(b>0){
            b--;
            a++;
        }
    }

    public static void main(String[] args) {
        Q106 p1 = new Q106();
        p1.foo();
        Q106 p2 = new Q106();
        p2.foo();
        int[][] array2D = new int[][] { { 0, 1, 2, 4}, {5, 6}};

        System.out.println(p1.a+" "+p2.a);
    }
}
