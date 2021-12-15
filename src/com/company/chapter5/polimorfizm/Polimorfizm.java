package com.company.chapter5.polimorfizm;

class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird{
    public void sing(){
        System.out.println("twiddledeedee");
    }
}

public class Polimorfizm {
    public static void main(String[] args) {
        Robin r = new Robin();
        r.sing();

    }
}
