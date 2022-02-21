package com.company.OcaExamEnthuware;

class G{
    public G(){
        System.out.println("In G");
    }
}
class E extends G {
    public E(){
        super();
        System.out.println("In E");
    }
}
class F extends E {
    public F(){
        System.out.println("In F");
    }
}
public class Q114 {

    public static void main(String[] args) {
        E e = new F();
    }
}
