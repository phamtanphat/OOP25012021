package com.example.oop25012021;

public class Animal {
    // 1 : Thuộc tính
    String name;
    int height;
    float weight;

    // constructor : Phương thức khởi
    public Animal(String name , int height , float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 2 : Hành vi(Phương thức)
    public String eat(int category){
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
}
