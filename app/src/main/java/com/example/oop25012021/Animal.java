package com.example.oop25012021;

public class Animal {
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

    // 3 : getter , setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == null){
            throw new NullPointerException("Giá trị truyền vào là null");
        }
        if (name.isEmpty()){
            throw new NullPointerException("Người dùng không được nhập chuỗi rỗng");
        }
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
}
