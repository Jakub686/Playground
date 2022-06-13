package com.company;

public class RegularExpresion {
    public static void main(String[] args) {


        String[] numberTrue = {"162"};


        System.out.println("Number true");
        for (String num: numberTrue) {
            System.out.print(num.matches("^[0-9]{1}$")|num.matches("^[0-9]{2}$")|num.matches("^[0-9]{3}$"));

//                    num.matches("^(\\+\\d{1}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{3}[- .]?\\d{5}$")
//                    | num.matches("^\\(\\d{3}\\) ([0-9]{3}) ([0-9]{3})-([0-9]{3})$")
//                    |num.matches("([0-9]{3}) ([0-9]{3}) ([0-9]{3})$")
//                    |num.matches("^(\\+\\d{1}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{3}[- .]?\\w{4}$")
//                    |num.matches("(.\\([a-zA-Z]{7}\\))")
//                    |num.matches("(.\\([a-zA-Z]{7}\\))")
//                    |num.matches("(.\\([a-zA-Z]{5}\\))")
//                    |num.matches("^([0-9]{3}) ([0-9]{2})-([a-zA-Z]{4})-([0-9]{2})")
//                    |num.matches("^([0-9]{3}) \\(\\d{2}\\)-([0-9]{2})-([0-9]{2})")
//                    |num.matches("^([0-9]{3}) ([0-9]{2})-([a-zA-Z]{2})-([0-9]{2})")
//                    |num.matches("^\\+\\d{1} \\d{2}$")
//                    |num.matches("^\\d{1}$")
//                    |num.matches("^\\d{3}$")
//                    |num.matches("\\(\\d{3}\\)")
//                    |num.matches("^([0-9]{3}) ([a-zA-Z]{3})$")
//                    |num.matches("^([0-9]{3})-\\(\\d{3}\\)$")
//                    |num.matches("^\\(\\d{3}\\) ([0-9]{3})$")
//                    |num.matches("^\\(\\d{3}\\) ([0-9]{3})-([0-9]{3})$")
//                    |num.matches("^\\(\\d{3}\\)-([0-9]{3}) ([0-9]{3})$")
//                    |num.matches("^([0-9]{3})-\\(\\d{3}\\)$")
//                    |num.matches("^([0-9]{3}) \\(\\d{3}\\) ([0-9]{3})$")
//                    |num.matches("^([0-9]{3})-\\(\\d{3}\\)-([0-9]{3})$")
//                    |num.matches("^([0-9]{3})-([a-zA-Z]{3})$")
//                    |num.matches("^([0-9]{3}) ([0-9]{3}) ([a-zA-Z]{3})$")
//                    |num.matches("^([0-9]{3}) ([0-9]{3})-([0-9]{3})$")
//                    |num.matches("^([0-9]{3})-([0-9]{3})-([a-zA-Z]{3})$")
//                    |num.matches("^([0-9]{3})-([0-9]{3}) ([0-9]{3})$")); //"+(another)"
//
//
//

            //System.out.print(num.matches("^(\\d{3}[- ]?)\\w{3}$"));
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$")+" ");
//            System.out.print(num.matches("^/d(?:-/d{3}){3}/d$")+" ");
//            System.out.print(num.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" )+" ");
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" )+" ");
//            System.out.print(num.matches("|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$")+" ");
//            System.out.print(num.matches("^(\\\\d{3}[- ]?){2}\\\\d{3}$"));
//            System.out.print(num.matches("^((\\(\\d{3}\\))|\\d{3})[- ]?\\d{3}[- ]?\\d{3}$"));

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

