package com.company.OcaExamEnthuware;

public class Q50 {
}
class TestCla543534ss{
    public static void main(String args[ ] ){
        A_ o1 = new C_( );
        B_ o2 = (B_) o1;
        System.out.println(o1.m1( ) );
        System.out.println(o2.i );
    }
}
class A_ { int i = 10;  int m1( ) { return i; } }
class B_ extends A_ { int i = 20;  int m1() { return i; } }
class C_ extends B_ { int i = 30;  int m1() { return i; } }