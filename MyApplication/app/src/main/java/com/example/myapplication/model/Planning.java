package com.example.myapplication.model;

import java.util.ArrayList;

public class Planning {
    private int id ;
    private int courseId;
    private String instructor;
    private ArrayList<String> daysOfWeek;
    private String startTime;
    private String endTime;
    private String startTimeExam;
    private String endTimeExam;
    private int dayOfExam;
    private int monthOfExam;
    private String gender;

    public Planning(int id, int courseId, String instructor, ArrayList<String> daysOfWeek, String startTime, String endTime, String startTimeExam, String endTimeExam, int dayOfExam, int monthOfExam, String gender) {
        this.id = id;
        this.courseId = courseId;
        this.instructor = instructor;
        this.daysOfWeek = daysOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startTimeExam = startTimeExam;
        this.endTimeExam = endTimeExam;
        this.dayOfExam = dayOfExam;
        this.monthOfExam = monthOfExam;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public ArrayList<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(ArrayList<String> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTimeExam() {
        return startTimeExam;
    }

    public void setStartTimeExam(String startTimeExam) {
        this.startTimeExam = startTimeExam;
    }

    public String getEndTimeExam() {
        return endTimeExam;
    }

    public void setEndTimeExam(String endTimeExam) {
        this.endTimeExam = endTimeExam;
    }

    public int getDayOfExam() {
        return dayOfExam;
    }

    public void setDayOfExam(int dayOfExam) {
        this.dayOfExam = dayOfExam;
    }

    public int getMonthOfExam() {
        return monthOfExam;
    }

    public void setMonthOfExam(int monthOfExam) {
        this.monthOfExam = monthOfExam;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
