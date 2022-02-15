package com.company.OcaExamEnthuware;

public class Q107 {
    public static void main(String[] args){
        Ba b = new Ba2();
        System.out.println(b.getValue()); //3
    }
}

class Ba{
    public String getValue(){  return "ba"; } //1
}

class Ba2 extends Ba{
    public String getValue(){ return "ba2"; } //2
}