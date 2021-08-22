package com.example.myapplication.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myapplication.R;
import com.example.myapplication.model.Course;

import java.util.ArrayList;

public class InfoDialog {


    public InfoDialog(@NonNull final Context context , ArrayList<Course> courses ) {
        final Dialog dialog = new Dialog(context);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getCurrentFocus();
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.pax_dialog);


        TextView textView = dialog.findViewById(R.id.pax_txt);
        textView.setText("");



        dialog.show();
    }

}
