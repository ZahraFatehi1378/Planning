package com.example.myapplication.ui.fragments.courses;

import static android.content.DialogInterface.BUTTON_NEGATIVE;
import static android.content.DialogInterface.BUTTON_POSITIVE;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.navigation.Navigation;

import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.Course;
import com.example.myapplication.ui.dialogs.TakePlanningDialog;
import com.example.myapplication.ui.fragments.BaseFragment;

import java.util.ArrayList;
import java.util.Arrays;

import io.reactivex.rxjava3.schedulers.Schedulers;


public class CoursesListFragment extends BaseFragment {

    private TextView startTime, endTime, startExam, endExam, categoryName, days;
    private EditText instructor, courseName, examDay, examMonth;
    private Button addCourse;
    private ImageView back;
    private ImageView list;


    @Override
    public void onViewCreated() {
        init();
        addListener();
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);
    }

    @Override
    public int layout() {
        return R.layout.fragment_courses_list;
    }


    private void init() {
        courseName = view.findViewById(R.id.course_name);
        instructor = view.findViewById(R.id.instructor_name);
        startTime = view.findViewById(R.id.start_time);
        endTime = view.findViewById(R.id.end_time);
        days = view.findViewById(R.id.day_of_week);
        startExam = view.findViewById(R.id.start_exam_time);
        endExam = view.findViewById(R.id.end_exam_time);
        examDay = view.findViewById(R.id.exam_day);
        examMonth = view.findViewById(R.id.exam_month);
        categoryName = view.findViewById(R.id.category_name);
        addCourse = view.findViewById(R.id.add_course);
        back = view.findViewById(R.id.back);
        list = view.findViewById(R.id.list);

        categoryName.setText(getArguments().getString("category"));
    }

    private void addListener() {
        startTime.setOnClickListener(v -> {
            setTime(startTime);
        });
        endTime.setOnClickListener(v -> {
            setTime(endTime);
        });
        startExam.setOnClickListener(v -> {
            setTime(startExam);
        });
        endExam.setOnClickListener(v -> {
            setTime(endExam);
        });

        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                String[] array = {"شنبه,دوشنبه", "یک شنبه,سه شنبه", "شنبه", "یک شنبه", "دو شنبه", "سه شنبه", "چهار شنبه", "پنج شنبه"};
                builder.setItems(array, (dialog, which) -> {
                    days.setText(array[which]);

                });

                AlertDialog dialog = builder.create();
                dialog.show();
                dialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_row);
            }
        });



        addCourse.setOnClickListener(v -> {
            if (checkFields()) {
                Toast.makeText(getContext(), "درس با موفقیت اضافه شد", Toast.LENGTH_SHORT).show();
                compositeDisposable.add(PlanningDataBase.getInstance(getContext()).CourseDAO().insertCourse
                        (new Course(0, ((PlaningActivity) requireActivity()).coursesCategoryNames.indexOf(categoryName.getText().toString())
                                , courseName.getText().toString().trim(), instructor.getText().toString().trim()
                                , new ArrayList<>(Arrays.asList(days.getText().toString().split(","))), startTime.getText().toString()
                                , endTime.getText().toString().trim(), startExam.getText().toString().trim()
                                , endExam.getText().toString().trim(), examDay.getText().toString().trim(), examMonth.getText().toString().trim(), ""))
                        .subscribeOn(Schedulers.io()).subscribe());
            }
        });

        back.setOnClickListener(v -> {
            Navigation.findNavController(view).popBackStack();
        });

        list.setOnClickListener(v -> {

            TakePlanningDialog takePlanningDialog = new TakePlanningDialog(getContext(), PlanningDataBase.getInstance(getContext()).CourseDAO().getAllCourses(), false);
            takePlanningDialog.setAddPlanningListener(planning -> {
            });

        });

    }

    private boolean checkFields() {
        if (
        !startTime.getText().toString().trim().contains(":")&&
        !endTime.getText().toString().trim().contains(":")&&
        !startExam.getText().toString().trim().contains(":")&&
        !endExam.getText().toString().trim().contains(":")
        )

        {
            Toast.makeText(getContext(), "ساعت را وارد کنید", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (courseName.getText().toString().trim().equals(""))
            Toast.makeText(getContext(), "نام درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (Integer.parseInt(examDay.getText().toString().trim()) > 31)
            Toast.makeText(getContext(), "روز امتحان را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (Integer.parseInt(examMonth.getText().toString().trim()) > 12)
            Toast.makeText(getContext(), " ماه امتحان را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (instructor.getText().toString().trim().equals(""))
            Toast.makeText(getContext(), "نام استاد درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (!days.getText().toString().trim().contains("شنبه"))
            Toast.makeText(getContext(), "روز های ارائه درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (PlanningDataBase.getInstance(getContext()).CourseDAO().
                courseExist(courseName.getText().toString().trim(), instructor.getText().toString().trim(),
                        startTime.getText().toString().trim(), endTime.getText().toString().trim(),
                        startExam.getText().toString().trim(), endExam.getText().toString().trim(),
                        examDay.getText().toString(), examMonth.getText().toString()))
            Toast.makeText(getContext(), "اطلاعات قبلا وارد شده است", Toast.LENGTH_SHORT).show();
        else {
            return true;
        }
        return false;
    }

    private void setTime(TextView view) {
        int hour = 0;
        int minute = 0;
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(new ContextThemeWrapper(getActivity(), AlertDialog.THEME_HOLO_DARK), (timePicker, selectedHour, selectedMinute) -> view.setText(selectedHour + ":" + selectedMinute), hour, minute, true);//Yes 24 hour time
        mTimePicker.setButton(BUTTON_POSITIVE, "تایید", mTimePicker);
        mTimePicker.setButton(BUTTON_NEGATIVE, "انصراف", mTimePicker);
        mTimePicker.show();

    }

    OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
        @Override
        public void handleOnBackPressed() {
            if (getContext() != null) {
                Navigation.findNavController(view).popBackStack();
            }
        }
    };
}