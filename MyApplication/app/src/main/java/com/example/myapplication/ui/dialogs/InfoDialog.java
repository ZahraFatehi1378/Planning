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


    public InfoDialog(@NonNull final Context context ) {
        final Dialog dialog = new Dialog(context);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getCurrentFocus();
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.pax_dialog);


        TextView textView = dialog.findViewById(R.id.pax_txt);
        textView.setText("این برنامه برای استفاده دانشجویان مهندسی صنایع دانشگاه امیرکبیر برای برنامه ریزی ساده تر برای انتخاب واحد ساخته شده است\n" +
                "\n" +
                "\nارتباط:\ns.fatehi1378@gmail.com\n" +
                "\nگیتهاب:\nhttps://github.com/ZahraFatehi1378/Planning\n" +
                "\n" +
                "سازنده:سیده زهرا سید فاتحی\n باتشکر از\nمهتاب رئیس دانایی\n" +
                "شمیم محمودزاده \n" +
                "شهاب الدین آبرودی\n" +
                "سارا چراغی\n" +
                "حسین همتی\n" +
                "سپهر عسگری \n" +
                "سپهر مسعودی \n" +
                "شهرزاد شهابی نژاد\n" +
                "ریحانه سلیمانی\n" +
                "محمد حسین میرابوطالبی\n" +
                "علی قادری\n" +
                "عماد امینی \n" +
                "زهرا بقراط پور");



        dialog.show();
    }

}
