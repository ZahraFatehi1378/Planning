package com.example.myapplication.ui.fragments.courses;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.AllCoursesActivity;
import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import com.example.myapplication.recycler.CoursesListAdaptor;
import com.example.myapplication.recycler.OnAllCoursesItemClickListener;
import com.example.myapplication.recycler.OnStringClickListener;
import com.example.myapplication.recycler.StringsListAdaptor;
import com.example.myapplication.storage.shared_prefrences.Utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


public class CoursesListFragment extends Fragment {

    private TextView credits, courseName, courseId, type, preReq;
    private ArrayList<String> facultiesList;
    private RecyclerView facultiesRecyclerView;
    private RecyclerView coursesRecycler;
    private ArrayList<Course> tempCourses;
    private ConstraintLayout mainLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        facultiesList = new ArrayList<>();
        tempCourses = new ArrayList<>();
        facultiesList.add("عمومی");
        facultiesList.add("دانشکده صنایع");
        facultiesList.add("ریاضی");
        facultiesList.add("فیزیک");
        facultiesList.add("زبان");
        facultiesList.add("تربیت بدنی");
        return inflater.inflate(R.layout.fragment_courses_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainLayout = view.findViewById(R.id.mainLayout0);
        setBg(Utils.sTheme);
        init(view);
    }
    protected void setBg(String sTheme) {
        switch (sTheme) {
            case "dark":
                mainLayout.setBackgroundResource(R.drawable.dd);
                break;
            case "bright":
                mainLayout.setBackgroundResource(R.drawable.db);
                break;
        }
    }

    private void init(View view) {

        credits = view.findViewById(R.id.credits);
        courseName = view.findViewById(R.id.course_name);
        courseId = view.findViewById(R.id.course_id);
        type = view.findViewById(R.id.type);
        preReq = view.findViewById(R.id.pre_req);

        coursesRecycler = view.findViewById(R.id.coursesRecyclerView);
        //add courses
        CoursesListAdaptor ca = new CoursesListAdaptor(tempCourses, course -> {
            addCourseDetails(course);
        });
        coursesRecycler.setAdapter(ca);

        //add faculties
        facultiesRecyclerView = view.findViewById(R.id.faculties_recycler);
        facultiesRecyclerView.setAdapter(new StringsListAdaptor(facultiesList, new OnStringClickListener() {
            @Override
            public void onItemClicked(String course) {

                tempCourses.clear();
                switch (course) {
                    case "عمومی":
                        tempCourses.addAll(((AllCoursesActivity) requireActivity()).generalCourses);
                        break;
                    case "دانشکده صنایع":
                        tempCourses.addAll(((AllCoursesActivity) requireActivity()).industrialCourses);
                        break;
                    case "فیزیک":
                        tempCourses.addAll(((AllCoursesActivity) requireActivity()).physicCourses);

                        break;
                    case "ریاضی":
                        tempCourses.addAll(((AllCoursesActivity) requireActivity()).mathCourses);

                        break;
                    case "زبان":
                        tempCourses.addAll(((AllCoursesActivity) requireActivity()).englishCourses);

                        break;
                    case "تربیت بدنی":
                        tempCourses.addAll(((AllCoursesActivity) requireActivity()).sportCourses);

                        break;
                }

                ca.notifyDataSetChanged();
            }

            @Override
            public void onItemClickedPos(int pos) {

            }

            @Override
            public void onItemLongClick(int pos) {

            }
        }));
        facultiesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));

        coursesRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));

    }

    private void addCourseDetails(Course course) {
        credits.setText(course.getCredits() + "");
        courseName.setText(course.getName());
        courseId.setText(course.getId() + "");
        type.setText(course.getType());
        preReq.setText("");
        if (course.getPreReq() != null)
        for (Integer x : course.getPreReq()) {
            for (Course course1 : ((AllCoursesActivity) requireActivity()).industrialCourses) {
                if (course1.getId() == x)
                    preReq.append(course1.getName() + "   ");
            }
            for (Course course1 : ((AllCoursesActivity) requireActivity()).physicCourses) {
                if (course1.getId() == x)
                    preReq.append(course1.getName() + "   ");
            }
            for (Course course1 : ((AllCoursesActivity) requireActivity()).generalCourses) {
                if (course1.getId() == x)
                    preReq.append(course1.getName() + "   ");
            }
            for (Course course1 : ((AllCoursesActivity) requireActivity()).mathCourses) {
                if (course1.getId() == x)
                    preReq.append(course1.getName() + "   ");
            }            for (Course course1 : ((AllCoursesActivity) requireActivity()).sportCourses) {
                if (course1.getId() == x)
                    preReq.append(course1.getName() + "   ");
            }            for (Course course1 : ((AllCoursesActivity) requireActivity()).englishCourses) {
                if (course1.getId() == x)
                    preReq.append(course1.getName() + "   ");
            }
        }

    }
}