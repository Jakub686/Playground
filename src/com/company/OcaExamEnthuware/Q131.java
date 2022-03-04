package com.company.OcaExamEnthuware;

public class Q131 {
    public static void main(String[] args) {
        String[] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for (String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }
    }
}