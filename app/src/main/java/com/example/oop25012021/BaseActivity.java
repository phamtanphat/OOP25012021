package com.example.oop25012021;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.util.Random;

// 1 : Khong dùng cho việc tạo object từ abstract
// 2 : Phương thức có từ abstract thì chỉ ghi tên hàm

public abstract class BaseActivity extends AppCompatActivity {

    abstract int getContentView();
    abstract void onCreate();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        onCreate();

    }
}
