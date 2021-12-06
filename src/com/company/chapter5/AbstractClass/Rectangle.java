package com.company.chapter5.AbstractClass;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    protected void countArea(){
        super.area = sideA *  sideB;
    }

    public String toString(){
        return super.toString() + " type: rectangle";
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3,9);
        System.out.println(rec1.toString());

        Circle roundy = new Circle(4.5);
        System.out.println(roundy.toString());

        Triangle a = new Triangle(4.1,5.6);
        System.out.println(a.toString());
    }

}
