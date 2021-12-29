package com.example.myapplication.ui.fragments.courses;

import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myapplication.R;


public class CoursesListFragment extends Fragment {

    private TextView startTime, endTime, days, startExam, endExam, examDay, examMonth ,categoryName;
    private EditText instructor, courseName;
    private View view;


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
        instructor = view.findViewById(R.id.instructor);
        courseName = view.findViewById(R.id.course_name);
        startTime = view.findViewById(R.id.start_time);
        endTime = view.findViewById(R.id.end_time);
        days = view.findViewById(R.id.day_of_week);
        startExam = view.findViewById(R.id.start_exam_time);
        endExam = view.findViewById(R.id.end_exam_time);
        examDay = view.findViewById(R.id.exam_day);
        examMonth = view.findViewById(R.id.exam_month);
        categoryName = view.findViewById(R.id.category_name);

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