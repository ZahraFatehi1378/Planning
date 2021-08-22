package com.example.myapplication.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class StringsListAdaptor extends RecyclerView.Adapter<StringsListAdaptor.MyHolder> {

    private ArrayList<String> strings;
    private OnStringClickListener onItemClickListener;

    public StringsListAdaptor(ArrayList<String> faculties, OnStringClickListener onItemClickListener) {
        this.strings = faculties;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faculty_item, parent, false);
        return new StringsListAdaptor.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.stringTV.setText(strings.get(position));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }


    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener , View.OnLongClickListener {
        TextView stringTV;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            stringTV = itemView.findViewById(R.id.faculty_name);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null ) {
                onItemClickListener.onItemClicked(strings.get(getAdapterPosition()));
                onItemClickListener.onItemClickedPos(getAdapterPosition());
            }
        }

        @Override
        public boolean onLongClick(View v) {
            onItemClickListener.onItemLongClick(getAdapterPosition());
            return false;
        }
    }
}
