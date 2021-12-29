package com.example.myapplication.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Course {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private int categoryId;
    @ColumnInfo
    private String name;
    @ColumnInfo
    private String instructor;
    @ColumnInfo
    private ArrayList<String> daysOfWeek;
    @ColumnInfo
    private String startTime;
    @ColumnInfo
    private String endTime;
    @ColumnInfo
    private String startTimeExam;
    @ColumnInfo
    private String endTimeExam;
    @ColumnInfo
    private String dayOfExam;
    @ColumnInfo
    private String monthOfExam;
    @ColumnInfo
    private String date;

    public Course(int id, int categoryId, String name, String instructor, ArrayList<String> daysOfWeek, String startTime, String endTime, String startTimeExam, String endTimeExam, String dayOfExam, String monthOfExam, String date) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.instructor = instructor;
        this.daysOfWeek = daysOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startTimeExam = startTimeExam;
        this.endTimeExam = endTimeExam;
        this.dayOfExam = dayOfExam;
        this.monthOfExam = monthOfExam;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public ArrayList<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTimeExam() {
        return startTimeExam;
    }

    public String getEndTimeExam() {
        return endTimeExam;
    }

    public String getDayOfExam() {
        return dayOfExam;
    }

    public String getMonthOfExam() {
        return monthOfExam;
    }

}
