package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;

public class PlaningActivity extends AppCompatActivity {

    public ArrayList<String> coursesCategoryNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_planing);

        coursesCategoryNames = new ArrayList<>(Arrays.asList("عمومی", "دانشکده", "ریاضی", "فیزیک", "زبان", "تربیت بدنی"));
    }
}