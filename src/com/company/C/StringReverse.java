package com.company.C;

public class StringReverse {
    public static void main(String[] args) {
        String inputString = "abrewrewcd";

        char tab1[] = new char[inputString.length()];
        char tab2[] = new char[inputString.length()];

        AssignStringToCharArray(inputString, tab1);
        ReverseArray(tab1, tab2);

        for (char object : tab1) System.out.print(object);
        System.out.println();
        for (char object : tab2) System.out.print(object);
    }

    private static void AssignStringToCharArray(String inPutString, char[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = inPutString.charAt(i);
        }
    }
    private static void ReverseArray(char[] tab1, char[] tab2) {
        int j = 0;
        for (int i = tab1.length - 1; i >= 0; i--) {
            tab2[j] = tab1[i];
            j++;
        }
    }
}


