package com.company.zadaniarekrutacyjne;

import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        System.out.println("enter word");
        Scanner sc1 = new Scanner(System.in);
        String word = sc1.next();

        char wordArray[] = new char[word.length()];
        for (int i = 0; i < wordArray.length ; i++) {
            wordArray[i] = word.charAt(i);
            //System.out.print(wordArray[i]);
        }
        //ArrayList<char> charArrayList = new ArrayList<char>();



//        String word[] = {"a"," 'b'", "y"};
//        int counter = 0;
//        for (int i = 0; i < input.length; i++) {
//            if(goal.contains(input[i])){
//                System.out.println("Trafiles litere");
//            }else {
//                counter++;
//            }
//        }
    }
}
