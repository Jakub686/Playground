package com.company.chapter5.super1;

class Superclass
{
    int num = 100;
}
class Subclass extends Superclass {
    int num = 110;
    void printNumber() {
        System.out.println(num);
    }
}
    public class Super {
        public static void main(String[] args) {
            Subclass obj = new Subclass();
            obj.printNumber();
        }
    }
