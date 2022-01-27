package com.company.chapter4;

public class Hidingdemo {
}
class Aaa{
    public int i = 10;
    private int j = 20;

}

class Bbb extends Aaa{
    private int i = 30; //1
    public int k = 40;

}

class Ccc extends Bbb{
}

class TestClaa{
    public static void main(String args[]){
        Ccc c = new Ccc();
        //System.out.println(c.i); // nie dziala, zmienne z Klasy A sa schowane przez klase B. zasloniete
        //System.out.println(c.j); // nie dziala, zmienne z Klasy A sa schowane przez klase B. zasloniete //3
        System.out.println(c.k);
    }
}