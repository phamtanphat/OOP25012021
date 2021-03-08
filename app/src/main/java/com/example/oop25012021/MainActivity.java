package com.example.oop25012021;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {

    @Override
    int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    void onCreate() {
        Dog dog = new Dog("Milu",30, 3.5f);
        dog.print();
    }
}