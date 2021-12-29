package com.example.myapplication.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import com.example.myapplication.recycler.PlanningsDetailListAdaptor;

import java.util.ArrayList;
import java.util.List;

public class TakePlanningDialog  {

    private PlanningsDetailListAdaptor planningsAdaptor;
    private AddPlanningListener addPlanningListener;

    public void setAddPlanningListener(AddPlanningListener addPlanningListener) {
        this.addPlanningListener = addPlanningListener;
    }

    public TakePlanningDialog(@NonNull final Context context , List<Course> plannings ) {
        final Dialog dialog = new Dialog(context);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getCurrentFocus();
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.take_planning_dialog);
        RecyclerView recyclerView = dialog.findViewById(R.id.planningRecyclerView2);
        planningsAdaptor = new PlanningsDetailListAdaptor(plannings );
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(planningsAdaptor);

        planningsAdaptor.setOnItemClickListener(planning -> {
            // Continue with delete operation
            AlertDialog x = new AlertDialog.Builder(context)
                    .setMessage(planning.getName()+" \n "+planning.getStartTime()+"-"+planning.getEndTime()+" "+planning.getDaysOfWeek()
                    +"\n"+planning.getStartTimeExam()+"-"+planning.getEndTimeExam()+"___"
                            +("1400"+"/"+planning.getMonthOfExam() +"/"+planning.getDayOfExam())+"تاریخ و ساعت امتحان"+"\n"
                    +planning.getInstructor())
                    .setCancelable(true)
                    .setPositiveButton("تایید", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog1, int which) {
                            addPlanningListener.addPlanning(planning);
                            Toast.makeText(context, "افزوده شد", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    })



                    .setNegativeButton("لفو", null)

                    .show();

            Typeface face=ResourcesCompat.getFont(context,R.font.font);

            TextView textView = (TextView) x.findViewById(android.R.id.message);
            textView.setTypeface(face);
            textView.setTextColor(Color.BLACK);


            Button button = x.getButton(Dialog.BUTTON_POSITIVE);
            button.setTypeface(face);
            button.setTextColor(Color.BLACK);

            Button button2 = x.getButton(Dialog.BUTTON_NEGATIVE);
            button2.setTypeface(face);
            button2.setTextColor(Color.BLACK);

            x.getWindow().setBackgroundDrawableResource(R.drawable.bg_row);
        });
        dialog.show();
    }



}
