package com.example.oop25012021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object và class

        // Object : đối tượng cụ thể
        // Class : tập thể các đối tượng giống với nhau về thuộc tính và hành vi (Kiểu dữ liệu)


        // Tạo ra 1 object
        Animal dog = new Animal("Milu",50,5.3f);
        dog.setName("Kiki");
        Log.d("BBB","Tên con vật : " +dog.getName());
//        Log.d("BBB","Chiều cao con vật : " +dog.height + " cm");
//        Log.d("BBB","Cân nặng con vật : " +dog.weight + " kg");
//        Log.d("BBB",dog.eat(2));

        // Access modifier : phạm vi khi sử dụng biến, class , phương thức ...
        // public : đứng ở đâu cũng dùng được
        // private : định nghĩa giá trị ở đâu thì sử dụng ở đó
    }
}