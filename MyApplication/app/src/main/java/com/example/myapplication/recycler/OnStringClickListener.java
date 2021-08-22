package com.example.myapplication.recycler;

import com.example.myapplication.model.Course;

public interface OnStringClickListener {
    void onItemClicked(String course);
    void onItemClickedPos(int pos);
    void onItemLongClick(int pos);
}
