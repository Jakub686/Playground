package com.company.OcaExamEnthuware;




public class PlayingWithCodeQ2 {
 }

class TestClass{
    public static void main(String args[] ){ Aaaa b = new Bbbb("good bye");  }
}
class Aaaa{
    Aaaa() { this("hello", " world");  }
    Aaaa(String s) { System.out.println(s); }
    Aaaa(String s1, String s2){ this(s1 + s2); }
}
class Bbbb extends Aaaa{
    Bbbb(){ super("good bye"); };
    Bbbb(String s){ super(s, " world"); }
    Bbbb(String s1, String s2){ this(s1 + s2 + " ! "); }
}


