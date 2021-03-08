package com.example.oop25012021;

import android.util.Log;

public class Dog extends Animal implements OnPrintable{
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
        String result = "";
        switch (category){
            case 1 : result = "Chó kiểng";
                break;
            case 2 : result = "Chó săn";
                break;
            default:
                result = "Chó chưa xác định";
                break;
        }
        return result;
    }


    @Override
    public void print() {
        Log.d("BBB","Lớp dog");
    }
}
