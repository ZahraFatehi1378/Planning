package com.example.myapplication.recycler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import java.util.ArrayList;

public class CoursesListAdaptor extends RecyclerView.Adapter<CoursesListAdaptor.MyHolder> {

    private ArrayList<Course> courses;
    private OnAllCoursesItemClickListener onItemClickListener;

    public CoursesListAdaptor(ArrayList<Course> courses, OnAllCoursesItemClickListener onItemClickListener) {
        this.courses = courses;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faculty_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
    //    holder.numTV.setText((position+1)+"");
        holder.courseTV.setText(courses.get(position).getName());
   //     holder.creditsTV.setText((courses.get(position).getCredits())+"واحد");

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView courseTV ;
                //, creditsTV , numTV;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            courseTV = itemView.findViewById(R.id.faculty_name);
         //   creditsTV = itemView.findViewById(R.id.credits0);
          //  numTV = itemView.findViewById(R.id.number0);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null ) {
                onItemClickListener.onItemClicked(courses.get(getAdapterPosition()));
            }
        }
    }
}
