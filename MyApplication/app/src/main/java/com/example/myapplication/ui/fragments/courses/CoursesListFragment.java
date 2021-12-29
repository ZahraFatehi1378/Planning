package com.example.myapplication.ui.fragments.courses;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.Course;

import java.util.ArrayList;
import java.util.Arrays;


public class CoursesListFragment extends Fragment {

    private TextView startTime, endTime, startExam, endExam ,categoryName;
    private EditText instructor, courseName, days, examDay, examMonth;
    private View view;
    private Button addCourse;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_courses_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        init();
        addListener();
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);

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

        addCourse.setOnClickListener(v -> {
            if (checkFields()) {
                PlanningDataBase.getInstance(getContext()).CourseDAO().insertCourse
                        (new Course(0, ((PlaningActivity) requireActivity()).coursesCategoryNames.indexOf(categoryName.getText().toString())
                                , courseName.getText().toString(), instructor.getText().toString()
                                , new ArrayList<String>(Arrays.asList(days.getText().toString().split(","))), startTime.getText().toString()
                                , endTime.getText().toString(), startExam.getText().toString()
                                , endExam.getText().toString(), examDay.getText().toString(), examMonth.getText().toString(), ""));
                Toast.makeText(getContext(), "درس با موفقیت اضافه شد", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private boolean checkFields() {
        if (courseName.getText().toString().trim().equals(""))
            Toast.makeText(getContext(), "نام درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (instructor.getText().toString().trim().equals(""))
            Toast.makeText(getContext(), "نام استاد درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (!days.getText().toString().trim().contains("شنبه"))
            Toast.makeText(getContext(), "روز های ارائه درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (startTime.getText().toString().matches(".\\d+"))
            Toast.makeText(getContext(), "ساعت شروع ارائه درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (endTime.getText().toString().trim().matches(".\\d+"))
            Toast.makeText(getContext(), "ساعت پایان ارائه درس را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (startExam.getText().toString().trim().matches(".\\d+"))
            Toast.makeText(getContext(), "ساعت شروع امتحان را وارد کنید", Toast.LENGTH_SHORT).show();
        else if (endExam.getText().toString().trim().matches(".\\d+"))
            Toast.makeText(getContext(), "ساعت پایان امتحان را وارد کنید", Toast.LENGTH_SHORT).show();
//        else if (examDay.getText().toString().trim().matches(".*\\d.*"))
//            Toast.makeText(getContext(), "روز امتحان را وارد کنید", Toast.LENGTH_SHORT).show();
//        else if (examMonth.getText().toString().trim().matches(".*\\d.*"))
//            Toast.makeText(getContext(), " ماه امتحان را وارد کنید", Toast.LENGTH_SHORT).show();
        else {
            return true;
        }
        return false;
    }

    private void setTime(TextView view) {
        int hour = 0;
        int minute = 0;
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(getContext(), (timePicker, selectedHour, selectedMinute) -> view.setText(selectedHour + ":" + selectedMinute), hour, minute, true);//Yes 24 hour time
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