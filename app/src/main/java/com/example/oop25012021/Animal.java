package com.example.oop25012021;

import android.util.Log;

public class Animal implements OnPrintable{
    // 1 : Thuộc tính
    private String name;
    private int height;
    private float weight;

    // constructor : Phương thức khởi
    public Animal(String name , int height , float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 2 : Hành vi(Phương thức)
    protected String eat(int category){
        String result = "";
        switch (category){
            case 1 : result = "Động vật ăn cỏ";
                    break;
            case 2 : result = "Động vật ăn thịt";
                    break;
            default:
                result = "Thức ăn chưa được xác định";
                break;
        }
        return result;
    }

    // 3 : getter , setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

//    alt + insert

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        Log.d("BBB","Lớp Animal");
    }
}
