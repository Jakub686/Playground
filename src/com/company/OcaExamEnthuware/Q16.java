package com.company.OcaExamEnthuware;
public class Q16 {
}
class Wrapper{
    int w = 10;
}
class TestClassa{
    static Wrapper changeWrapper(Wrapper w){
        System.out.println(w.w);
        w = new Wrapper();
        System.out.println(w.w);
        w.w += 9;
        System.out.println(w.w);
        return w;
    }
    public static void main(String[] args){
        Wrapper w = new Wrapper();
        System.out.println(w.w);
        w.w = 20;
        System.out.println(w.w);
        changeWrapper(w);
        System.out.println(w.w); //
        w.w += 30;
        System.out.println(w.w);
        w = changeWrapper(w);
        System.out.println(w.w);
    }
}