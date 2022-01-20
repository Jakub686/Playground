package com.company.OcaExamEnthuware;

public class Q60 {
    static void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL:{ System.out.println(c);
            if (c > 3) break JILL; else c++;}
        }
    }

    public static void main(String[] args) {
       crazyLoop();
    }
}
