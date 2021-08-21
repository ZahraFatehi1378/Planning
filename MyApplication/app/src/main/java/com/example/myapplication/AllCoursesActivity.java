package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.model.Course;
import com.example.myapplication.storage.shared_prefrences.Utils;

import java.util.ArrayList;

public class AllCoursesActivity extends AppCompatActivity {

    public ArrayList<Course> mathCourses;
    public ArrayList<Course> physicCourses;
    public ArrayList<Course> generalCourses;
    public ArrayList<Course> industrialCourses;
    public ArrayList<Course> englishCourses;
    public ArrayList<Course> sportCourses;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_all_courses);
        Utils.onActivityCreateSetTheme(this , getSupportActionBar());

        mathCourses = (ArrayList<Course>)getIntent().getSerializableExtra("math");
        physicCourses = (ArrayList<Course>)getIntent().getSerializableExtra("physic");
        generalCourses = (ArrayList<Course>)getIntent().getSerializableExtra("general");
        industrialCourses = (ArrayList<Course>)getIntent().getSerializableExtra("industrial");
        englishCourses  = (ArrayList<Course>)getIntent().getSerializableExtra("english");
        sportCourses = (ArrayList<Course>)getIntent().getSerializableExtra("sport");

    }

}