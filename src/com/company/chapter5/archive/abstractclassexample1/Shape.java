package com.company.chapter5.archive.abstractclassexample1;

public abstract class Shape {
    double area = -1;

    protected abstract void countArea();

    public double getArea() {
        if (area == -1) {
            countArea();
        }
        return area;
    }

    public String toString(){
        return "area: " +  getArea();
    }




}
