package com.example.oop25012021;

public class Dog extends Animal{
    private String color;

    public Dog(String name , int height , float weight , String color){
        super(name, height, weight);
        this.color = color;
    }

    public Dog(String name , int height , float weight){
        super(name, height, weight);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected String eat(int category) {
        return super.eat(category);
    }
}
