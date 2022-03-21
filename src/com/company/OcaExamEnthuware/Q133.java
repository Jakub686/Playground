package com.company.OcaExamEnthuware;

public class Q133 {
    static int a = 0;
    int b = 0;
    int c = 5;

    public void foo(){
        while(c >0){
            c--;
            b++;
            a++;
        }
    }

    public static void main(String[] args) {
        Q133 p1 = new Q133();
        p1.foo();
        System.out.println(p1.a+" "+p1.b);

        Q133 p2 = new Q133();
        p2.foo();
        System.out.println(p2.a+" "+p2.b);

    }
}
