package com.company.chapter4.overloadingconstructor;



class Product {

    private String name;
    private double price;
    //settery, gettery

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this(name);
        this.price = price;
    }


}

