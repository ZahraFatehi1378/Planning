package com.example.myapplication.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class MainCoursesListAdaptor extends RecyclerView.Adapter<MainCoursesListAdaptor.MyHolder> {


    private ArrayList<String> mainCourses;
    private OnStringItemClickListener onItemClickListener;
    private Integer[] images;


    public MainCoursesListAdaptor(ArrayList<String> mainCourses, Integer[] images) {
        this.mainCourses = mainCourses;
        this.images = images;
    }

    @NonNull
    @Override
    public MainCoursesListAdaptor.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_category_item, parent, false);
        return new MainCoursesListAdaptor.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainCoursesListAdaptor.MyHolder holder, int position) {
        holder.courseTV.setText(mainCourses.get(position));
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return mainCourses.size();
    }

    public void setOnItemClickListener(OnStringItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView courseTV;
        ImageView imageView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            courseTV = itemView.findViewById(R.id.category_course_name);
            imageView = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClicked(getAdapterPosition());
            }
        }
    }

}



