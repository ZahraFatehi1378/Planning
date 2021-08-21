package com.example.myapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Course implements Parcelable  {
    private int id , credits;
    private String name , group , type ;
    private ArrayList<Integer> preReq;

    public Course(int id, int credits, String name, String group, String type, ArrayList<Integer> preReq) {
        this.id = id;
        this.credits = credits;
        this.name = name;
        this.group = group;
        this.type = type;
        this.preReq = preReq;
    }

    protected Course(Parcel in) {
        id = in.readInt();
        credits = in.readInt();
        name = in.readString();
        group = in.readString();
        type = in.readString();
        preReq = in.readArrayList(Integer.class.getClassLoader());
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }

    };

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ArrayList<Integer> getPreReq() {
        return preReq;
    }

    public void setPreReq(ArrayList<Integer> preReq) {
        this.preReq = preReq;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(credits);
        dest.writeString(name);
        dest.writeString(group);
        dest.writeString(type);
       dest.writeList(preReq);
    }
}
