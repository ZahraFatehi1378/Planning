package com.example.myapplication.model;


import java.util.ArrayList;

public class CourseModel  {
    private int id , categoryId;
    private String name ;
    private String instructor;
    private ArrayList<String> daysOfWeek;
    private String startTime;
    private String endTime;
    private String startTimeExam;
    private String endTimeExam;
    private String dayOfExam;
    private String monthOfExam;

    public CourseModel(int categoryId, String name, String instructor, ArrayList<String> daysOfWeek, String startTime, String endTime, String startTimeExam, String endTimeExam, String dayOfExam, String monthOfExam) {
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


    //    protected CourseModel(Parcel in) {
//        id = in.readInt();
//        credits = in.readInt();
//        name = in.readString();
//        group = in.readString();
//        type = in.readString();
//        preReq = in.readArrayList(Integer.class.getClassLoader());
//    }

//    public static final Creator<Course> CREATOR = new Creator<Course>() {
//        @Override
//        public Course createFromParcel(Parcel in) {
//            return new Course(in);
//        }
//
//        @Override
//        public Course[] newArray(int size) {
//            return new Course[size];
//        }
//
//    };
//
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }

//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(id);
//        dest.writeInt(credits);
//        dest.writeString(name);
//        dest.writeString(group);
//        dest.writeString(type);
//        dest.writeList(preReq);
//    }
}
