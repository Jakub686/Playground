package com.company.OcaExamEnthuware;

public class Q8 {
}
class Square {
    private double side = 0;
    String color;
    public Square(double length){
        this.side = length;
    }
    public double getSide() {  return side;    }

    public void setSide(double side) {  this.side = side;   }

}

 class TestClassss {
    public static void main(String[] args) throws Exception {
        Square mysq = new Square(10);
        //side = 10;
        mysq.color = "red";

        //set mysq's side to 20
    }
}