package com.example.myapplication.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;


import java.util.ArrayList;

public class PlaningListAdaptor extends RecyclerView.Adapter<PlaningListAdaptor.MyHolder> {

    private ArrayList<String> plannings;
    private OnStringItemClickListener onItemClickListener;

    public PlaningListAdaptor(ArrayList<String> planningsName) {
        this.plannings = planningsName;
    }

    public void setOnItemClickListener(OnStringItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.planning_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.planningCourseNameTV.setText(plannings.get(position));
    }


    @Override
    public int getItemCount() {
        return plannings.size();
    }



    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView planningCourseNameTV ;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            planningCourseNameTV = itemView.findViewById(R.id.planning);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null ) {
                onItemClickListener.onItemClicked(getAdapterPosition());
            }
        }
    }
}
