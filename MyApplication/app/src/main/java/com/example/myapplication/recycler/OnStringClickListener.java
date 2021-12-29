package com.example.myapplication.recycler;

public interface OnStringClickListener {
    void onItemClicked(String course);
    void onItemClickedPos(int pos);
    void onItemLongClick(int pos);
}
