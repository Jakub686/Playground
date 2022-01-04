package com.company;

public class PlayingWithCode {


    public static void crazyLoop(){
        int c = 0;
         while (c < 8){
            System.out.println(c);
            if (c > 3) break; else c++;
        }
    }
    public static void main(String[] args) {

        PlayingWithCode.crazyLoop();
    }
}





