package com.example.oop25012021;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tính kết thừa
        // Tính trừu tượng
        // Tính đa hình
        // Quan hệ has A
        // Tính đóng gói

//        Dog milu = new Dog("Milu",40 , 2.5f,"Màu Nâu");
//        Log.d("BBB",milu.getName());
//        Log.d("BBB",milu.getColor());
//        Log.d("BBB",milu.eat(1));

        // overload : phương thức nạp chồng

        // 1 : Giống nhau về tên
        // 2 : Định nghĩa cùng 1 nơi
        // 3 : Khác với nhau về tham số truyền vào

        showMessage(10);

    }
    private void showMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    private  void showMessage(int message){
        Toast.makeText(this, message + "", Toast.LENGTH_SHORT).show();
    }

}