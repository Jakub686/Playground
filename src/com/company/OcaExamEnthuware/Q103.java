package com.company.OcaExamEnthuware;

public class Q103 {
}
class Game{
    public void play(){
        System.out.println("Playing...");
    }
}

class Soccer extends Game{
    public void play(){
        System.out.println("Playing Soccer...");
    }
    public static void main(String[] args){
        Game g = new Soccer();
        g.play();
    }
}