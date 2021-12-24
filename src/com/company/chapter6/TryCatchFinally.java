package com.company.chapter6;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int i  = 7;
            int j =0;
            int k=i/j; //jesli wystapi exception, sterowanie przechodzi do catch
            System.out.println("output is " + k);
        } catch (Exception e){
            System.out.println("wytake zlapany"); //catch wykonuje sie wtylko wtedy kiedys zlapiemy wyjatek w Try
        } finally { // kod wykonuje sie zawsze
            System.out.println("finally - kod wykonuje sie zawsze");
        }

    }
}
