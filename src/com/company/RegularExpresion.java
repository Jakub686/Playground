package com.company;

public class RegularExpresion {
    public static void main(String[] args) {
        String patterns
                = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

//{"+0 (123) 456-789-ABcd"};
        String[] numberTrue = {"+0 (123) 456-789-12345"};
//       String[] numberTrue = { "+0 (123) 456-789-ABcd","9","123","193","(123)","(234)","129 abf","873-(456)","129 abf","129 abf","123 abc","+1 11","123-ABC","123 456 xyz","123-456-XYZ","123 456-789","123-456 789","123 45-up-89","(123) 456","123-(456)","123 (456) 789","123-(456)-789","(123) 456-789","(123)-456 789","123 (45)-67-89","123-566-XYZ","123 456-349","134-456 789","123 45-down-89","(123) 566","123 (786) 789","163-(456)-789","(123) 496-789","(173)-456 789","123 (95)-67-89","+(another)","+(phone)"};

//        String[] numberFasle = {   "123+456 78912","(123)-456-(78912)","123 456 9","123 9 9234","123 4?5 678","+(with space)","132+456 78912","(123)-456-(45912)","153 456 9","823 9 9234","123 4?5 654","+(another space)","+1 ()"};

        // System.out.println(number[0].matches("{1-9}"));
        System.out.println("Number true");
        for (String num: numberTrue) {
            System.out.print(num.matches("^(\\+\\d{1}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{3}[- .]?\\d{5}$")
                    | num.matches("^\\(\\d{3}\\) ([0-9]{3}) ([0-9]{3})-([0-9]{3})$")
                    |num.matches("([0-9]{3}) ([0-9]{3}) ([0-9]{3})$")
                    |num.matches("^(\\+\\d{1}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{3}[- .]?\\w{4}$")
                    |num.matches("(.\\([a-zA-Z]{7}\\))")
                    |num.matches("(.\\([a-zA-Z]{7}\\))")
                    |num.matches("(.\\([a-zA-Z]{5}\\))")
                    |num.matches("^([0-9]{3}) ([0-9]{2})-([a-zA-Z]{4})-([0-9]{2})")
                    |num.matches("^([0-9]{3}) \\(\\d{2}\\)-([0-9]{2})-([0-9]{2})")
                    |num.matches("^([0-9]{3}) ([0-9]{2})-([a-zA-Z]{2})-([0-9]{2})")
                    |num.matches("^\\+\\d{1} \\d{2}$")
                    |num.matches("^\\d{1}$")
                    |num.matches("^\\d{3}$")
                    |num.matches("\\(\\d{3}\\)")
                    |num.matches("^([0-9]{3}) ([a-zA-Z]{3})$")
                    |num.matches("^([0-9]{3})-\\(\\d{3}\\)$")
                    |num.matches("^\\(\\d{3}\\) ([0-9]{3})$")
                    |num.matches("^\\(\\d{3}\\) ([0-9]{3})-([0-9]{3})$")
                    |num.matches("^\\(\\d{3}\\)-([0-9]{3}) ([0-9]{3})$")
                    |num.matches("^([0-9]{3})-\\(\\d{3}\\)$")
                    |num.matches("^([0-9]{3}) \\(\\d{3}\\) ([0-9]{3})$")
                    |num.matches("^([0-9]{3})-\\(\\d{3}\\)-([0-9]{3})$")
                    |num.matches("^([0-9]{3})-([a-zA-Z]{3})$")
                    |num.matches("^([0-9]{3}) ([0-9]{3}) ([a-zA-Z]{3})$")
                    |num.matches("^([0-9]{3}) ([0-9]{3})-([0-9]{3})$")
                    |num.matches("^([0-9]{3})-([0-9]{3})-([a-zA-Z]{3})$")
                    |num.matches("^([0-9]{3})-([0-9]{3}) ([0-9]{3})$")); //"+(another)"




            //System.out.print(num.matches("^(\\d{3}[- ]?)\\w{3}$"));
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$")+" ");
//            System.out.print(num.matches("^/d(?:-/d{3}){3}/d$")+" ");
//            System.out.print(num.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" )+" ");
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" )+" ");
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$")+" ");
//            System.out.print(num.matches("^(\\\\d{3}[- ]?){2}\\\\d{3}$"));
//            System.out.print(num.matches("^((\\(\\d{3}\\))|\\d{3})[- ]?\\d{3}[- ]?\\d{3}$"));
            System.out.println();
        }
//        System.out.println("Number false");
//        for (String num: numberFasle) {
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$")+" ");
//            System.out.print(num.matches("^/d(?:-/d{3}){3}/d$")+" ");
//            System.out.print(num.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" )+" ");
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" )+" ");
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$")+" ");
//            System.out.println();
//        }




    }
}

