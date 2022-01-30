package com.company;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithCode {

}




class Q{
    private int i = 10;
    public void  f(){}
    public void g(){}
}

class E extends Q{
    public int i = 20;
    public void g(){}
}

class C{
    Q a = new Q();//1
    Q b = new E();//2
}