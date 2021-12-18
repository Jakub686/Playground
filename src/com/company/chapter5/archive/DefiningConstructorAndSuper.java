package com.company.chapter5.archive;

public class DefiningConstructorAndSuper {}

class Personn
{
     Personn()
    {
        System.out.println("Person class Constructor");
    }
}
/* subclass Student extending the Person class */
class Studentt extends Personn
{
    Studentt()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}
/* Driver program to test*/
class Test
{
    public static void main(String[] args)
    {
        Studentt s = new Studentt();
    }
}