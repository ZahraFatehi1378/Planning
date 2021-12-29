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
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.Course;
import com.example.myapplication.recycler.PlanningsDetailListAdaptor;

import java.util.List;

public class TakePlanningDialog  {

    private PlanningsDetailListAdaptor planningsAdaptor;
    private AddPlanningListener addPlanningListener;

    public void setAddPlanningListener(AddPlanningListener addPlanningListener) {
        this.addPlanningListener = addPlanningListener;
    }

    public TakePlanningDialog(@NonNull final Context context, List<Course> courses, Boolean isForTakeCourse) {
        final Dialog dialog = new Dialog(context);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getCurrentFocus();
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.take_planning_dialog);
        RecyclerView recyclerView = dialog.findViewById(R.id.planningRecyclerView2);
        planningsAdaptor = new PlanningsDetailListAdaptor(courses);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(planningsAdaptor);


        if (isForTakeCourse) {

            planningsAdaptor.setOnItemClickListener(planning -> {
                // Continue with delete operation
                AlertDialog x = new AlertDialog.Builder(context)
                        .setMessage(planning.getName() + " \n " + planning.getStartTime() + "-" + planning.getEndTime() + " " + planning.getDaysOfWeek()
                                + "\n" + planning.getStartTimeExam() + "-" + planning.getEndTimeExam() + "___"
                                + ("1400" + "/" + planning.getMonthOfExam() + "/" + planning.getDayOfExam()) + "تاریخ و ساعت امتحان" + "\n"
                                + planning.getInstructor())
                        .setCancelable(true)
                        .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog1, int which) {
                                addPlanningListener.addPlanning(planning);
                                Toast.makeText(context, "انجام شد", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })


                        .setNegativeButton("خیر", null)

                        .show();

                Typeface face = ResourcesCompat.getFont(context, R.font.font);

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


        } else {
            ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN | ItemTouchHelper.UP) {


                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                    return false;
                }

                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                    //Remove swiped item from list and notify the RecyclerView

                    AlertDialog x = new AlertDialog.Builder(context)
                            .setMessage("آیا مایل به حذف برنامه هستید؟")
                            .setCancelable(true)
                            .setPositiveButton("بله", (dialog1, which) -> {
                                int position = viewHolder.getAdapterPosition();
                                courses.remove(position);
                                planningsAdaptor.notifyDataSetChanged();
                                PlanningDataBase.getInstance(context).CourseDAO().deleteCourse(courses.get(position).getId());
                                Toast.makeText(context, "انجام شد", Toast.LENGTH_SHORT).show();

                            })


                            .setNegativeButton("خیر", (dialog, which) -> {
                                planningsAdaptor.notifyDataSetChanged();
                            })

                            .show();

                    Typeface face = ResourcesCompat.getFont(context, R.font.font);

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

                }
            };
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
            itemTouchHelper.attachToRecyclerView(recyclerView);
        }
        dialog.show();

    }


}
