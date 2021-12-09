package com.company.chapter5.abstractclassexample1;

public class Circle extends Shape {
    private double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    @Override
    protected void countArea(){
        super.area = Math.PI * ray * ray;
    }
    public String toString(){
        return  super.toString() + " type: circle";
    }

    public static void main(String[] args) {
        Circle roundy = new Circle(4.5);
        System.out.println(roundy.toString());
    }

}
