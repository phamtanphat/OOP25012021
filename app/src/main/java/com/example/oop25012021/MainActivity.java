package com.example.oop25012021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object và class

        // Object : đối tượng cụ thể
        // Class : tập thể các đối tượng giống với nhau về thuộc tính và hành vi (Kiểu dữ liệu)


        // Tạo ra 1 object
        Animal dog = new Animal();
        dog.height = 50;
        dog.name = "Milu";
        dog.weight = 5.3f;

        Log.d("BBB","Tên con vật : " +dog.name);
        Log.d("BBB","Chiều cao con vật : " +dog.height + " cm");
        Log.d("BBB","Cân nặng con vật : " +dog.weight + " cm");
        Log.d("BBB",dog.eat(2));

    }
}