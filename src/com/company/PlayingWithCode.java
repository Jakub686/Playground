package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PlayingWithCode {
    public static void main(String[] args) {
        String patterns
                = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

        String[] numberTrue = { "123","123 abc","123-ABC","123 456 xyz","123-456-XYZ","123 456-789","123-456 789","123 45-up-89","(123)","(123) 456,123-(456)","123 (456) 789","123-(456)-789","(123) 456-789","(123)-456 789","123 (45)-67-89","+(phone)","9","193","129 abf","129 abf","129 abf","123-566-XYZ","123 456-349","134-456 789","123 45-down-89","(234)","(123) 566","873-(456)","123 (786) 789","163-(456)-789","(123) 496-789","(173)-456 789","123 (95)-67-89","+(another)","+1 11"};
        String[] numberFasle = {   "123+456 78912","(123)-456-(78912)","123 456 9","123 9 9234","123 4?5 678","+(with space)","132+456 78912","(123)-456-(45912)","153 456 9","823 9 9234","123 4?5 654","+(another space)","+1 ()"};

                // System.out.println(number[0].matches("{1-9}"));
        System.out.println("Number true");
        for (String num: numberTrue) {
            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$")+" ");
            System.out.print(num.matches("^/d(?:-/d{3}){3}/d$")+" ");
            System.out.print(num.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" )+" ");
            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" )+" ");
            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$")+" ");
            System.out.println();
        }
        System.out.println("Number false");
        for (String num: numberFasle) {
            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$")+" ");
            System.out.print(num.matches("^/d(?:-/d{3}){3}/d$")+" ");
            System.out.print(num.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" )+" ");
            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" )+" ");
            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$")+" ");
            System.out.println();
        }




    }
}
