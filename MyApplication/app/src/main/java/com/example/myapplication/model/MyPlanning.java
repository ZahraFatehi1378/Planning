package com.example.myapplication.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class MyPlanning {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String name;
    @ColumnInfo
    private ArrayList<String> plannings;

    public MyPlanning(int id, String name, ArrayList<String> plannings) {
        this.id = id;
        this.name = name;
        this.plannings = plannings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPlannings() {
        return plannings;
    }

    public void setPlannings(ArrayList<String> plannings) {
        this.plannings = plannings;
    }
}
