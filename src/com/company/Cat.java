package com.company;

import javafx.util.Builder;

public class Cat {
    private String color;


    public String getColor() {
        return color;
    }


    private Cat(Builder builder){
        this.color = color;

    }
    public static class Builder{
        private String color;


        public Builder color(String color){
            this.color =color;
            return this;
        }

        public Cat build(){
            return new Cat(this);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}

