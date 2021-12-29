package com.example.myapplication.recycler;

import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Course;

import java.util.ArrayList;
import java.util.List;

public class PlanningsDetailListAdaptor extends RecyclerView.Adapter<PlanningsDetailListAdaptor.MyHolder> {

    private List<Course> plannings;
    private OnALlPlanningsItemClickListener onItemClickListener;

    public PlanningsDetailListAdaptor(List<Course> plannings ) {
        this.plannings = plannings;
    }

    public void setOnItemClickListener(OnALlPlanningsItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dialog_planning_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.instructor.setText(plannings.get(position).getInstructor());
        holder.planningCourseNameTV.setText(plannings.get(position).getName());
        holder.daysOfWeek.setText(plannings.get(position).getDaysOfWeek().toString()+"");
        holder.examDate.setText(" امتحان: "+plannings.get(position).getStartTimeExam()+"-"+plannings.get(position).getEndTimeExam()+"    "+("1401"+"/"+plannings.get(position).getMonthOfExam() +"/"+plannings.get(position).getDayOfExam()) );
        holder.class_time.setText(plannings.get(position).getStartTime()+"-"+plannings.get(position).getEndTime());
    }


    @Override
    public int getItemCount() {
        return plannings.size();
    }



    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView planningCourseNameTV, instructor, daysOfWeek, examDate, class_time;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            planningCourseNameTV = itemView.findViewById(R.id.planning_course_name);
            instructor = itemView.findViewById(R.id.instructor);
            daysOfWeek = itemView.findViewById(R.id.day_of_week);
            examDate = itemView.findViewById(R.id.exam_date);
            class_time = itemView.findViewById(R.id.class_time);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClicked(plannings.get(getAdapterPosition()));
            }
        }


    }
}
