package com.example.myapplication.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;
import com.example.myapplication.recycler.OnALlPlanningsItemClickListener;
import com.example.myapplication.recycler.PlanningsListAdaptor;

import java.util.ArrayList;

public class TakePlanningDialog extends Dialog {

    private PlanningsListAdaptor planningsAdaptor;
    private AddPlanningListener addPlanningListener;

    public void setAddPlanningListener(AddPlanningListener addPlanningListener) {
        this.addPlanningListener = addPlanningListener;
    }

    public TakePlanningDialog(@NonNull final Context context , ArrayList<Planning> plannings , Course course) {
        super(context);
        final Dialog dialog = new Dialog(context);

        dialog.setContentView(R.layout.take_planning_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCancelable(true);
        RecyclerView recyclerView = dialog.findViewById(R.id.planningRecyclerView2);
        planningsAdaptor = new PlanningsListAdaptor(plannings , course);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(planningsAdaptor);

        planningsAdaptor.setOnItemClickListener(planning -> {
            // Continue with delete operation
            AlertDialog x = new AlertDialog.Builder(context)
                    .setTitle("افزودن واحد")
                    .setMessage("not completed")
                    .setCancelable(true)

                    .setPositiveButton("تایید", new OnClickListener() {
                        public void onClick(DialogInterface dialog1, int which) {
                            //todo add to database
                            addPlanningListener.addPlanning(planning);
                        }
                    })

                    .setNegativeButton(android.R.string.no, null)
                    .show();

            x.getWindow().setBackgroundDrawableResource(R.drawable.bg_row);
        });



        dialog.show();



    }



}
