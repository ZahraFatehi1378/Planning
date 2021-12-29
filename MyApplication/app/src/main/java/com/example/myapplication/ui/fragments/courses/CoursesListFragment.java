package com.example.myapplication.ui.fragments.courses;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import com.example.myapplication.recycler.CoursesListAdaptor;
import com.example.myapplication.recycler.OnStringClickListener;
import com.example.myapplication.recycler.StringsListAdaptor;

import java.util.ArrayList;


public class CoursesListFragment extends Fragment {

    private TextView credits, courseName, courseId, type, preReq;
    private RecyclerView facultiesRecyclerView;
    private RecyclerView coursesRecycler;
    private ArrayList<Course> tempCourses;
    private ConstraintLayout mainLayout;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tempCourses = new ArrayList<>();
        return inflater.inflate(R.layout.fragment_courses_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainLayout = view.findViewById(R.id.mainLayout0);
        init();
        this.view = view;
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);

    }


    private void init() {

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