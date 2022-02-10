package com.company.OcaExamEnthuware;

public class Q99 {
}
public class TestClss{
    Q99 getMyClassObject(){
        Q99 mc = new Q99(); //1
        return mc; //2
    }
    public static void main(String[] args){
        TestClss tc = new TestClss(); //3
        Q99 x = tc.getMyClassObject(); //4
        System.out.println("got myclass object"); //5
        x = new Q99(); //6
        System.out.println("done"); //7
    }
}