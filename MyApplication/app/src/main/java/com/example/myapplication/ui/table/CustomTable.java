package com.example.myapplication.ui.table;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Random;


public class CustomTable extends FrameLayout {

    int[] colors = new int[]{Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
    int height = 140;
    int width = 150;
    int marginTop = 60;
    Random random = new Random();

    public CustomTable(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setData();
    }

    public CustomTable(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setData();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(13* width, 900);
    }

    public void setData() {
        removeAllViews();
        addBaseViews();
    }



    public void addView(String text ,float right2, float top2 , float width2){
        TextView v = new TextView(getContext());
        addView(v, initLayoutParams((int) (right2* width + width), (int) (top2*height+marginTop), (int) (width2*width),height));
        v.setText(text);
        v.setTextColor(Color.WHITE);
        v.setGravity(Gravity.CENTER);
        v.setBackgroundColor(colors[random.nextInt(3)]);
    }

    private void addBaseViews() {
        TextView v = new TextView(getContext());
        addView(v, initLayoutParams(0,marginTop, width,height));
        v.setText("شنبه");
        v.setTextColor(colors[2]);
        v.setGravity(Gravity.CENTER);

        TextView v1 = new TextView(getContext());
        addView(v1, initLayoutParams(0,height+marginTop, width,height));
        v1.setText("1شنبه");
        v1.setTextColor(colors[2]);
        v1.setGravity(Gravity.CENTER);

        TextView v2 = new TextView(getContext());
        addView(v2, initLayoutParams(0,2*height+marginTop, width,height));
        v2.setText("2شنبه");
        v2.setTextColor(colors[2]);
        v2.setGravity(Gravity.CENTER);

        TextView v3 = new TextView(getContext());
        addView(v3, initLayoutParams(0,3*height+marginTop, width,height));
        v3.setText("3شنبه");
        v3.setTextColor(colors[2]);
        v3.setGravity(Gravity.CENTER);

        TextView v4 = new TextView(getContext());
        addView(v4, initLayoutParams(0,4*height+marginTop, width,height));
        v4.setText("4شنبه");
        v4.setTextColor(colors[2]);
        v4.setGravity(Gravity.CENTER);

        TextView v5 = new TextView(getContext());
        addView(v5, initLayoutParams(0,5*height+marginTop, width,height));
        v5.setText("5شنبه");
        v5.setTextColor(colors[2]);
        v5.setGravity(Gravity.CENTER);


        TextView v6 = new TextView(getContext());
        addView(v6, initLayoutParams(0,0, width,marginTop));
        v6.setText("");
        v6.setTextColor(colors[2]);

        TextView v7 = new TextView(getContext());
        addView(v7, initLayoutParams(width,0, width,marginTop));
        v7.setText("7");
        v7.setTextColor(colors[2]);

        TextView v8 = new TextView(getContext());
        addView(v8, initLayoutParams(2* width,0, width,marginTop));
        v8.setText("8");
        v8.setTextColor(colors[2]);


        TextView v9 = new TextView(getContext());
        addView(v9, initLayoutParams(3* width,0, width,marginTop));
        v9.setText("9");
        v9.setTextColor(colors[2]);


        TextView v10 = new TextView(getContext());
        addView(v10, initLayoutParams(4* width,0, width,marginTop));
        v10.setText("10");
        v10.setTextColor(colors[2]);

        TextView v11 = new TextView(getContext());
        addView(v11, initLayoutParams(5* width,0, width,marginTop));
        v11.setText("11");
        v11.setTextColor(colors[2]);

        TextView v12 = new TextView(getContext());
        addView(v12, initLayoutParams(6* width,0, width,marginTop));
        v12.setText("12");
        v12.setTextColor(colors[2]);

        TextView v13 = new TextView(getContext());
        addView(v13, initLayoutParams(7* width,0, width,marginTop));
        v13.setText("13");
        v13.setTextColor(colors[2]);


        TextView v14 = new TextView(getContext());
        addView(v14, initLayoutParams(8* width,0, width,marginTop));
        v14.setText("14");
        v14.setTextColor(colors[2]);

        TextView v15 = new TextView(getContext());
        addView(v15, initLayoutParams(9* width,0, width,marginTop));
        v15.setText("15");
        v15.setTextColor(colors[2]);

        TextView v16 = new TextView(getContext());
        addView(v16, initLayoutParams(10* width,0, width,marginTop));
        v16.setText("16");
        v16.setTextColor(colors[2]);

        TextView v17 = new TextView(getContext());
        addView(v17, initLayoutParams(11* width,0, width,marginTop));
        v17.setText("17");
        v17.setTextColor(colors[2]);

        TextView v18 = new TextView(getContext());
        addView(v18, initLayoutParams(12* width,0, width,marginTop));
        v18.setText("18");
        v18.setTextColor(colors[2]);

        TextView v19 = new TextView(getContext());
        addView(v19, initLayoutParams(12* width,0, width,marginTop));
        v19.setText("19");
        v19.setTextColor(colors[2]);


//        View v2 = new View(getContext());
//        //  addView(v, initLayoutParams(100,120,300,300));
//        addView(v2, initLayoutParams(100,0,200,300));
//        v2.setBackgroundColor(colors[1]);
        }

    private LayoutParams initLayoutParams(int right, int top, int width, int height) {

        LayoutParams lp = new LayoutParams(width, height);
        lp.rightMargin = right;
        lp.topMargin = top;

        return lp;
    }


}
