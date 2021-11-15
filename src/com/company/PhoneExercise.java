package com.company;

import java.util.ArrayList;

public class PhoneExercise {

    public static void main(String[] args) {
        String input = "hello";
        char num[] = new char[input.length()];
        ArrayList result = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            num[i] = input.charAt(i);
        }
        for (int i = 0; i < num.length; i++){
            char x = num[i];
            switch(x){
                case 'a':
                    result.add('2');
                break;
                case 'b':
                    result.add('2');
                    result.add('2');
                break;
                case 'c':
                    result.add('2');
                    result.add('2');
                    result.add('2');
                break;
                case 'd':
                    result.add('3');
                break;
                case 'e':
                    result.add('3');
                    result.add('3');
                break;
                case 'f':
                    result.add('3');
                    result.add('3');
                    result.add('3');
                break;
                case 'g':
                    result.add('4');
                break;
                case 'h':
                    result.add('4');
                    result.add('4');
                break;
                case 'i':
                    result.add('4');
                    result.add('4');
                    result.add('4');
                break;
                case 'j':
                    result.add('5');
                break;
                case 'k':
                    result.add('5');
                    result.add('5');
                break;
                case 'l':
                    result.add('5');
                    result.add('5');
                    result.add('5');
                break;
                case 'm':
                    result.add('6');
                break;
                case 'n':
                    result.add('6');
                    result.add('6');
                break;
                case 'o':
                    result.add('6');
                    result.add('6');
                    result.add('6');
                break;
                case 'p':
                    result.add('7');
                break;
                case 'q':
                    result.add('7');
                    result.add('7');
                break;
                case 'r':
                    result.add('7');
                    result.add('7');
                    result.add('7');
                break;
                case 's':
                    result.add('7');
                    result.add('7');
                    result.add('7');
                    result.add('7');
                break;
                case 't':
                    result.add('8');
                break;
                case 'u':
                    result.add('8');
                    result.add('8');
                break;
                case 'v':
                    result.add('8');
                    result.add('8');
                    result.add('8');
                break;
                case 'w':
                    result.add('9');
                break;
                case 'x':
                    result.add('9');
                    result.add('9');
                break;
                case 'y':
                    result.add('9');
                    result.add('9');
                    result.add('9');
                break;
                case 'z':
                    result.add('9');
                    result.add('9');
                    result.add('9');
                    result.add('9');
                break;
            }
        }
        PrintOut(input, result);
    }

    private static void PrintOut(String input, ArrayList result) {
        System.out.println(input.toUpperCase() + " = " + result);
        System.out.println("|     | ABC | DEF |");
        System.out.println("|  1  |  2  |  3  |");
        System.out.println("_________________");
        System.out.println("| GHI | JKL | MNO |");
        System.out.println("|  4  |  5  |  6  |");
        System.out.println("_________________");
        System.out.println("|PQRS | TUV |WXYZ |");
        System.out.println("|  7  |  8  |  9  |");
    }

}
