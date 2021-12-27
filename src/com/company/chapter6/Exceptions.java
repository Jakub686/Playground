package com.company.chapter6;

class ArithmeticException_Demo
{
    public static void main(String args[])
    {
        try {
            int a = 30, b = 1;
            int c = a/b;  // the program immediately goes to catch if an error occurred
            System.out.println ("code from try: Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("code from catch: Can't divide a number by 0");
        } finally {
            System.out.println("code from finally");
        }
    }
}

public class Exceptions {
}
