package com.example.myapplication.ui.fragments.planning;

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
import android.widget.Button;
import android.widget.GridLayout;

import com.example.myapplication.AllCoursesActivity;
import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;
import com.example.myapplication.recycler.CoursesListAdaptor;
import com.example.myapplication.recycler.OnStringClickListener;
import com.example.myapplication.recycler.StringsListAdaptor;
import com.example.myapplication.storage.shared_prefrences.Utils;
import com.example.myapplication.ui.dialogs.AddPlanningListener;
import com.example.myapplication.ui.dialogs.TakePlanningDialog;
import com.example.myapplication.ui.table.CustomTable;

import java.util.ArrayList;

public class PlanningFragment extends Fragment {
    private ArrayList<String> facultiesList;
    private RecyclerView facultiesRecyclerView;
    private ArrayList<Course> tempCourses;
    private RecyclerView coursesRecycler;
    private ConstraintLayout mainLayout;
    private CustomTable customTable;
    private ArrayList<Planning> tempPlanning;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        facultiesList = new ArrayList<>();
        tempCourses = new ArrayList<>();
        tempPlanning = new ArrayList<>();
        facultiesList.add("عمومی");
        facultiesList.add("دانشکده صنایع");
        facultiesList.add("ریاضی");
        facultiesList.add("فیزیک");
        facultiesList.add("زبان");
        facultiesList.add("تربیت بدنی");
        return inflater.inflate(R.layout.fragment_planning, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainLayout = view.findViewById(R.id.mainLayout3);
        setBg(Utils.sTheme);
        init(view);

    }



    private void init(View view) {
        customTable = view.findViewById(R.id.customTable);


        coursesRecycler = view.findViewById(R.id.courses_recycler2);
        //add courses
        CoursesListAdaptor ca = new CoursesListAdaptor(tempCourses, course -> {
            switch (course.getGroup()){
                case "عمومی":
                    for (Planning planning:((PlaningActivity) requireActivity()).generalPlannings){
                        if (planning.getCourseId() == course.getId()){
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "دانشکده صنایع":
                    for (Planning planning:((PlaningActivity) requireActivity()).industrialPlannings){
                        if (planning.getCourseId() == course.getId()){
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "فیزیک":
                    for (Planning planning:((PlaningActivity) requireActivity()).physicPlannings){
                        if (planning.getCourseId() == course.getId()){
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "ریاضی":
                    for (Planning planning:((PlaningActivity) requireActivity()).mathPlannings){
                        if (planning.getCourseId() == course.getId()){
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "زبان":
                    for (Planning planning:((PlaningActivity) requireActivity()).englishPlannings){
                        if (planning.getCourseId() == course.getId()){
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "تربیت بدنی":
                    for (Planning planning:((PlaningActivity) requireActivity()).sportPlannings){
                        if (planning.getCourseId() == course.getId()){
                            tempPlanning.add(planning);
                        }
                    }
                    break;
            }

            if (tempPlanning != null){
                TakePlanningDialog takePlanningDialog = new TakePlanningDialog(getContext() ,tempPlanning , course);
                takePlanningDialog.show();
                takePlanningDialog.setAddPlanningListener(planning -> {
                    int startHour = 0, startMin = 0, endHour = 0, endMin = 0;
                    String[] s=planning.getStartTime().split(":");
                    String[] e=planning.getEndTime().split(":");
                    if (s.length == 2){
                        startHour = Integer.parseInt(s[0]);
                        startMin = Integer.parseInt(s[1]);
                    }else {
                        startHour = Integer.parseInt(planning.getStartTime());
                    }
                    if (e.length == 2){
                        endHour = Integer.parseInt(e[0]);
                        endMin =Integer.parseInt(e[1]);
                    }else {
                        endHour = Integer.parseInt(planning.getEndTime());
                    }
                    setAPlan(course.getName()+"\n"+planning.getInstructor() , startHour , startMin , endHour , endMin ,planning.getDaysOfWeek());

                });

            }

        });
        coursesRecycler.setAdapter(ca);

        //add faculties
        facultiesRecyclerView = view.findViewById(R.id.faculties_recycler2);
        facultiesRecyclerView.setAdapter(new StringsListAdaptor(facultiesList, string -> {
            tempCourses.clear();
            switch (string) {
                case "عمومی":
                    tempCourses.addAll(((PlaningActivity) requireActivity()).generalCourses);
                    break;
                case "دانشکده صنایع":
                    tempCourses.addAll(((PlaningActivity) requireActivity()).industrialCourses);
                    break;
                case "فیزیک":
                    tempCourses.addAll(((PlaningActivity) requireActivity()).physicCourses);

                    break;
                case "ریاضی":
                    tempCourses.addAll(((PlaningActivity) requireActivity()).mathCourses);

                    break;
                case "زبان":
                    tempCourses.addAll(((PlaningActivity) requireActivity()).englishCourses);

                    break;
                case "تربیت بدنی":
                    tempCourses.addAll(((PlaningActivity) requireActivity()).sportCourses);

                    break;
            }

            ca.notifyDataSetChanged();
        }));
        facultiesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        coursesRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
    }

    private void setAPlan(String plan, int startHour, int startMin, int endHour, int endMin , ArrayList<String> days) {
        ArrayList<Integer> fromTop = getFarFromTop(days);
        int start = (startHour-7) * 60 +startMin;
        int duration = (endHour-startHour) *60 + endMin  - startMin;
        for (Integer integer : fromTop)
        customTable.addView(plan ,(float)start/60 , integer, (float)duration/60);

    }

    private ArrayList<Integer> getFarFromTop(ArrayList<String> days) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (String day : days){
            if (day.equals("شنبه")){
                newArray.add(0);
            }else if (day.contains("یک")){
                newArray.add(1);
            }else if (day.contains("دو")){
                newArray.add(2);
            }else if (day.contains("سه")){
                newArray.add(3);
            }else if (day.contains("چهار")){
                newArray.add(4);
            }else if (day.contains("پنج")){
                newArray.add(5);
            }
        }
        return newArray;
    }

    protected void setBg(String sTheme) {
        switch (sTheme) {
            case "dark":
                mainLayout.setBackgroundResource(R.drawable.main_bg_dark);
                break;
            case "bright":
                mainLayout.setBackgroundResource(R.drawable.main_bg_bright);
                break;
        }
    }
}