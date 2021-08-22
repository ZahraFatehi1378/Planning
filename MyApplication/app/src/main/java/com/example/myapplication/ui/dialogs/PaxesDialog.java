package com.example.myapplication.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import java.util.ArrayList;

public class PaxesDialog {


    public PaxesDialog(@NonNull final Context context , ArrayList<Course> courses ) {
        final Dialog dialog = new Dialog(context);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getCurrentFocus();
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.pax_dialog);

        String pax2 = getPaxItems(courses , "صنایع");
        String pax3 = getPaxItems(courses , "اجرایی");
        String pax4 = getPaxItems(courses , "اطلاعاتی");
        String pax5 = getPaxItems(courses , "تولیدی خدماتی");
        String pax6 = getPaxItems(courses , "تخصصی");
        String pax7 = getPaxItems(courses , "اصلی");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("بسته اخیاری مهندسی صنایع");
        stringBuilder.append("\n");
        stringBuilder.append(pax2);
        stringBuilder.append("------------------------\n");
        stringBuilder.append("بسته اخیاری مدیریت اجرایی");
        stringBuilder.append("\n");
        stringBuilder.append(pax3);
        stringBuilder.append("------------------------\n");
        stringBuilder.append("بسته اخیاری سیستم های اطلاعاتی");
        stringBuilder.append("\n");
        stringBuilder.append(pax4);
        stringBuilder.append("------------------------\n");

        stringBuilder.append("بسته اخیاری سیستم های تولیدی و خدماتی");
        stringBuilder.append("\n");
        stringBuilder.append(pax5);
        stringBuilder.append("------------------------\n");

        stringBuilder.append("تخصصی");
        stringBuilder.append("\n");
        stringBuilder.append(pax6);
        stringBuilder.append("------------------------\n");
        stringBuilder.append("اصلی");
        stringBuilder.append("\n");
        stringBuilder.append(pax7);

        TextView textView = dialog.findViewById(R.id.pax_txt);
        textView.setText(stringBuilder.toString());



        dialog.show();
    }

    private String getPaxItems(ArrayList<Course> courses , String type) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Course course :courses){
            if (course.getType().contains(type)){
                stringBuilder.append(course.getName());
                stringBuilder.append("\n");
            }

        }
        return stringBuilder.toString();
    }


}
