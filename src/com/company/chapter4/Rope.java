package com.company.chapter4;

public class Rope {


    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {    //metoda statyczna nie moze wywoływac metodzy instacji
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        //climb();  //metoda statyczna nie moze wywoływac metodzy instacji
    }


    public static void main(String[] args) {



        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();



    }
}