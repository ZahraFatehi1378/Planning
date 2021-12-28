package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;

import java.util.ArrayList;

public class PlaningActivity extends AppCompatActivity {

    public ArrayList<Course> mathCourses;
    public ArrayList<Course> physicCourses;
    public ArrayList<Course> generalCourses;
    public ArrayList<Course> industrialCourses;
    public ArrayList<Course> englishCourses;
    public ArrayList<Course> sportCourses;

    public ArrayList<Planning> generalPlannings;
    public ArrayList<Planning> physicPlannings;
    public ArrayList<Planning> industrialPlannings;
    public ArrayList<Planning> englishPlannings;
    public ArrayList<Planning> mathPlannings;
    public ArrayList<Planning> SportPlannings;
    public ArrayList<String> coursesCategoryNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_planing);

        coursesCategoryNames = new ArrayList<>();
        coursesCategoryNames.add("عمومی");
        coursesCategoryNames.add("دانشکده");
        coursesCategoryNames.add("ریاضی");
        coursesCategoryNames.add("فیزیک");
        coursesCategoryNames.add("زبان");
        coursesCategoryNames.add("تربیت بدنی");

        mathCourses = (ArrayList<Course>) getIntent().getSerializableExtra("math");
        physicCourses = (ArrayList<Course>) getIntent().getSerializableExtra("physic");
        generalCourses = (ArrayList<Course>) getIntent().getSerializableExtra("general");
        industrialCourses = (ArrayList<Course>) getIntent().getSerializableExtra("industrial");
        englishCourses = (ArrayList<Course>) getIntent().getSerializableExtra("english");
        sportCourses = (ArrayList<Course>) getIntent().getSerializableExtra("sport");

        generalPlannings = new ArrayList();
        physicPlannings = new ArrayList<>();
        industrialPlannings = new ArrayList<>();
        englishPlannings = new ArrayList<>();
        mathPlannings = new ArrayList<>();
        SportPlannings = new ArrayList<>();



    }


    public void planningClicked(View view) {
        Intent intent = new Intent(getApplicationContext(), PlaningActivity.class);
        intent.putExtra("math", mathCourses);
        intent.putExtra("physic", physicCourses);
        intent.putExtra("general", generalCourses);
        intent.putExtra("industrial", industrialCourses);
        intent.putExtra("english", englishCourses);
        intent.putExtra("sport", sportCourses);
        startActivity(intent);
    }


}