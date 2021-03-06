package com.example.myapplication.ui.table;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.example.myapplication.R;

import java.util.Random;


public class CustomTable extends FrameLayout {

    int[] colors = new int[]{Color.parseColor("#e196d0"), Color.GREEN, Color.BLUE, Color.YELLOW};
    int height = 140;
    int width = 150;
    int marginTop = 60;
    Typeface face;
    Random random = new Random();
    private int color;

    public CustomTable(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
         face = ResourcesCompat.getFont(context,R.font.font);
        setTheme("dark");

    }

    public CustomTable(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        face = ResourcesCompat.getFont(context,R.font.font);
        setTheme("dark");
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

    public void setTheme(String sTheme){
        switch (sTheme) {
            case "dark":
                colors = new int[]{Color.parseColor("#ffda79"),Color.parseColor("#f0932b")
                        , Color.parseColor("#f2dbb2"), Color.parseColor("#d9d9d9")};
                color= Color.WHITE;
                break;
            case "bright":
                colors = new int[]{Color.parseColor("#e196d0")
                        , Color.parseColor("#E196D0"), Color.parseColor("#bde6f9"), Color.parseColor("#d9d9d9")};

                color = Color.BLACK;
                break;
        }
        setData();
    }



    public void addView(Integer planningId ,String text ,float right2, float top2 , float width2 , CustomCourseTableListener customCourseTableListener){
        TextView v = new TextView(getContext());
        addView(v, initLayoutParams((int) (right2* width + width), (int) (top2*height+marginTop), (int) (width2*width),height));
        v.setText(text);
        v.setTextColor(Color.BLACK);
        v.setGravity(Gravity.CENTER);
        v.setBackgroundColor(colors[random.nextInt(4)]);
        v.setTypeface(face);
        v.setTextSize(12);
        v.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v2) {
                customCourseTableListener.shewDeleteDialog(planningId , v);
                return false;
            }
        });
    }

    private void addBaseViews() {
        int txtSize =14;
        TextView v = new TextView(getContext());
        addView(v, initLayoutParams(0,marginTop, width,height));
        v.setText("????????");
        v.setTextColor(color);
        v.setGravity(Gravity.CENTER);
        v.setTypeface(face);
        v.setTextSize(txtSize);

        TextView v1 = new TextView(getContext());
        addView(v1, initLayoutParams(0,height+marginTop, width,height));
        v1.setText("1????????");
        v1.setTextColor(color);
        v1.setGravity(Gravity.CENTER);
        v1.setTypeface(face);
        v1.setTextSize(txtSize);

        TextView v2 = new TextView(getContext());
        addView(v2, initLayoutParams(0,2*height+marginTop, width,height));
        v2.setText("2????????");
        v2.setTextColor(color);
        v2.setGravity(Gravity.CENTER);
        v2.setTypeface(face);
        v2.setTextSize(txtSize);

        TextView v3 = new TextView(getContext());
        addView(v3, initLayoutParams(0,3*height+marginTop, width,height));
        v3.setText("3????????");
        v3.setTextColor(color);
        v3.setGravity(Gravity.CENTER);
        v3.setTypeface(face);
        v3.setTextSize(txtSize);

        TextView v4 = new TextView(getContext());
        addView(v4, initLayoutParams(0,4*height+marginTop, width,height));
        v4.setText("4????????");
        v4.setTextColor(color);
        v4.setGravity(Gravity.CENTER);
        v4.setTypeface(face);
        v4.setTextSize(txtSize);

        TextView v5 = new TextView(getContext());
        addView(v5, initLayoutParams(0,5*height+marginTop, width,height));
        v5.setText("5????????");
        v5.setTextColor(color);
        v5.setGravity(Gravity.CENTER);
        v5.setTypeface(face);
        v5.setTextSize(txtSize);


        TextView v6 = new TextView(getContext());
        addView(v6, initLayoutParams(0,0, width,marginTop));
        v6.setText("");
        v6.setTextColor(Color.WHITE);
        v6.setTypeface(face);
        v6.setTextSize(txtSize);

        TextView v7 = new TextView(getContext());
        addView(v7, initLayoutParams(width,0, width,marginTop));
        v7.setText("7");
        v7.setTextColor(Color.WHITE);
        v7.setBackgroundResource(R.drawable.bg_simple_bright);
        v7.setTypeface(face);
        v7.setTextSize(txtSize);

        TextView v8 = new TextView(getContext());
        addView(v8, initLayoutParams(2* width,0, width,marginTop));
        v8.setText("8");
        v8.setTextColor(Color.WHITE);
        v8.setBackgroundResource(R.drawable.bg_simple_bright);
        v8.setTypeface(face);
        v8.setTextSize(txtSize);


        TextView v9 = new TextView(getContext());
        addView(v9, initLayoutParams(3* width,0, width,marginTop));
        v9.setText("9");
        v9.setTextColor(Color.WHITE);
        v9.setBackgroundResource(R.drawable.bg_simple_bright);
        v9.setTypeface(face);
        v9.setTextSize(txtSize);


        TextView v10 = new TextView(getContext());
        addView(v10, initLayoutParams(4* width,0, width,marginTop));
        v10.setText("10");
        v10.setTextColor(Color.WHITE);
        v10.setBackgroundResource(R.drawable.bg_simple_bright);
        v10.setTypeface(face);
        v10.setTextSize(txtSize);


        TextView v11 = new TextView(getContext());
        addView(v11, initLayoutParams(5* width,0, width,marginTop));
        v11.setText("11");
        v11.setTextColor(Color.WHITE);
        v11.setBackgroundResource(R.drawable.bg_simple_bright);
        v11.setTypeface(face);
        v11.setTextSize(txtSize);


        TextView v12 = new TextView(getContext());
        addView(v12, initLayoutParams(6* width,0, width,marginTop));
        v12.setText("12");
        v12.setTextColor(Color.WHITE);
        v12.setBackgroundResource(R.drawable.bg_simple_bright);
        v12.setTypeface(face);
        v12.setTextSize(txtSize);


        TextView v13 = new TextView(getContext());
        addView(v13, initLayoutParams(7* width,0, width,marginTop));
        v13.setText("13");
        v13.setTextColor(Color.WHITE);
        v13.setBackgroundResource(R.drawable.bg_simple_bright);
        v13.setTypeface(face);
        v13.setTextSize(txtSize);


        TextView v14 = new TextView(getContext());
        addView(v14, initLayoutParams(8* width,0, width,marginTop));
        v14.setText("14");
        v14.setTextColor(Color.WHITE);
        v14.setBackgroundResource(R.drawable.bg_simple_bright);
        v14.setTypeface(face);
        v14.setTextSize(txtSize);


        TextView v15 = new TextView(getContext());
        addView(v15, initLayoutParams(9* width,0, width,marginTop));
        v15.setText("15");
        v15.setTextColor(Color.WHITE);
        v15.setBackgroundResource(R.drawable.bg_simple_bright);
        v15.setTypeface(face);
        v15.setTextSize(txtSize);


        TextView v16 = new TextView(getContext());
        addView(v16, initLayoutParams(10* width,0, width,marginTop));
        v16.setText("16");
        v16.setTextColor(Color.WHITE);
        v16.setBackgroundResource(R.drawable.bg_simple_bright);
        v16.setTypeface(face);
        v16.setTextSize(txtSize);


        TextView v17 = new TextView(getContext());
        addView(v17, initLayoutParams(11* width,0, width,marginTop));
        v17.setText("17");
        v17.setTextColor(Color.WHITE);
        v17.setBackgroundResource(R.drawable.bg_simple_bright);
        v17.setTypeface(face);
        v17.setTextSize(txtSize);

        TextView v18 = new TextView(getContext());
        addView(v18, initLayoutParams(12* width,0, width,marginTop));
        v18.setText("18");
        v18.setTextColor(Color.WHITE);
        v18.setBackgroundResource(R.drawable.bg_simple_bright);
        v18.setTypeface(face);
        v18.setTextSize(txtSize);


        TextView v19 = new TextView(getContext());
        addView(v19, initLayoutParams(12* width,0, width,marginTop));
        v19.setText("19");
        v19.setTextColor(Color.WHITE);
        v19.setBackgroundResource(R.drawable.bg_simple_bright);
        v19.setTypeface(face);
        v19.setTextSize(txtSize);


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
