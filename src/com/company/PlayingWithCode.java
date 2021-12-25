package com.company;


public class PlayingWithCode {
    public static void main(String args[] ){
        String s = "blooper";
        StringBuilder sb = new StringBuilder(s);
        sb.append(s.substring(4));
        sb.delete(3, 5);
        System.out.println(sb);


    }

}




