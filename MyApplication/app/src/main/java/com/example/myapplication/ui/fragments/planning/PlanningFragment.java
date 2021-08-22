package com.example.myapplication.ui.fragments.planning;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.Course;
import com.example.myapplication.model.MyPlanning;
import com.example.myapplication.model.Planning;
import com.example.myapplication.recycler.CoursesListAdaptor;
import com.example.myapplication.recycler.OnStringClickListener;
import com.example.myapplication.recycler.StringsListAdaptor;
import com.example.myapplication.storage.shared_prefrences.Utils;
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
    private ArrayList<Planning> userTempPlanning;
    private Bundle bundle;
    private ArrayList<Planning> bundleArray;
    private View view;

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
        this.view = view;
        init(view);
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);

    }

    private void init(View view) {
        customTable = view.findViewById(R.id.customTable);
        customTable.setTheme(Utils.sTheme);
        userTempPlanning = new ArrayList<>();

        checkBundle();
        addRecyclers(view);

    }

    private void checkBundle() {
        bundle = getArguments();
        if (bundle != null) {
            bundleArray = new ArrayList();
            for (String s : bundle.getStringArrayList("myPlanning")) {
                Planning x = findPlanning(Integer.parseInt(s));
                userTempPlanning.add(x);
                bundleArray.add(x);
            }
            for (Planning planning : userTempPlanning) {
                addPlan(planning, findCourse(planning));
            }
        }
    }

    private Planning findPlanning(Integer planningId) {
        for (Planning planning : (((PlaningActivity) requireActivity()).physicPlannings)) {
            if (planning.getId() == planningId) {
                return planning;
            }
        }
        for (Planning planning : (((PlaningActivity) requireActivity()).SportPlannings)) {
            if (planning.getId() == planningId) {
                return planning;
            }
        }
        for (Planning planning : (((PlaningActivity) requireActivity()).mathPlannings)) {
            if (planning.getId() == planningId) {
                return planning;
            }
        }
        for (Planning planning : (((PlaningActivity) requireActivity()).englishPlannings)) {
            if (planning.getId() == planningId) {
                return planning;
            }
        }
        for (Planning planning : (((PlaningActivity) requireActivity()).industrialPlannings)) {
            if (planning.getId() == planningId) {
                return planning;
            }
        }
        for (Planning planning : (((PlaningActivity) requireActivity()).generalPlannings)) {
            if (planning.getId() == planningId) {
                return planning;
            }
        }
        return null;

    }

    private Course findCourse(Planning planning) {

        for (Course course : (((PlaningActivity) requireActivity()).physicCourses)) {
            if (course.getId() == planning.getCourseId()) {
                return course;
            }

        }
        for (Course course : (((PlaningActivity) requireActivity()).mathCourses)) {
            if (course.getId() == planning.getCourseId()) {
                return course;
            }

        }
        for (Course course : (((PlaningActivity) requireActivity()).englishCourses)) {
            if (course.getId() == planning.getCourseId()) {
                return course;
            }

        }
        for (Course course : (((PlaningActivity) requireActivity()).industrialCourses)) {
            if (course.getId() == planning.getCourseId()) {
                return course;
            }

        }
        for (Course course : (((PlaningActivity) requireActivity()).sportCourses)) {
            if (course.getId() == planning.getCourseId()) {
                return course;
            }

        }
        for (Course course : (((PlaningActivity) requireActivity()).generalCourses)) {
            if (course.getId() == planning.getCourseId()) {
                return course;
            }

        }
        return null;

    }

    private void addRecyclers(View view) {
        coursesRecycler = view.findViewById(R.id.courses_recycler2);
        //add courses
        CoursesListAdaptor ca = new CoursesListAdaptor(tempCourses, course -> {
            tempPlanning.clear();
            switch (course.getGroup()) {
                case "عمومی":
                    for (Planning planning : ((PlaningActivity) requireActivity()).generalPlannings) {
                        if (planning.getCourseId() == course.getId()) {
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "دانشکده صنایع":
                    for (Planning planning : ((PlaningActivity) requireActivity()).industrialPlannings) {
                        if (planning.getCourseId() == course.getId()) {
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "فیزیک":
                    for (Planning planning : ((PlaningActivity) requireActivity()).physicPlannings) {
                        if (planning.getCourseId() == course.getId()) {
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "ریاضی":
                    for (Planning planning : ((PlaningActivity) requireActivity()).mathPlannings) {
                        if (planning.getCourseId() == course.getId()) {
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "زبان":
                    for (Planning planning : ((PlaningActivity) requireActivity()).englishPlannings) {
                        if (planning.getCourseId() == course.getId()) {
                            tempPlanning.add(planning);
                        }
                    }
                    break;
                case "تربیت بدنی":
                    for (Planning planning : ((PlaningActivity) requireActivity()).SportPlannings) {
                        if (planning.getCourseId() == course.getId()) {
                            tempPlanning.add(planning);
                        }
                    }
                    break;
            }

            if (tempPlanning != null) {
                TakePlanningDialog takePlanningDialog = new TakePlanningDialog(getContext(), tempPlanning, course);
                takePlanningDialog.setAddPlanningListener(planning -> {
                    addPlan(planning, course);
                    userTempPlanning.add(planning);
                });
            }
        });
        coursesRecycler.setAdapter(ca);

        //add faculties
        facultiesRecyclerView = view.findViewById(R.id.faculties_recycler2);
        facultiesRecyclerView.setAdapter(new StringsListAdaptor(facultiesList, new OnStringClickListener() {
            @Override
            public void onItemClicked(String string) {
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
            }

            @Override
            public void onItemClickedPos(int pos) {

            }
        }));
        facultiesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        coursesRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
    }

    private void addPlan(Planning planning, Course course) {
        int startHour = 0, startMin = 0, endHour = 0, endMin = 0;
        String[] s = planning.getStartTime().split(":");
        String[] e = planning.getEndTime().split(":");
        if (s.length == 2) {
            startHour = Integer.parseInt(s[0]);
            startMin = Integer.parseInt(s[1]);
        } else {
            startHour = Integer.parseInt(planning.getStartTime());
        }
        if (e.length == 2) {
            endHour = Integer.parseInt(e[0]);
            endMin = Integer.parseInt(e[1]);
        } else {
            endHour = Integer.parseInt(planning.getEndTime());
        }
        setAPlan(course.getName() + "\n" + planning.getInstructor(), startHour, startMin, endHour, endMin, planning.getDaysOfWeek());

    }

    private void setAPlan(String plan, int startHour, int startMin, int endHour, int endMin, ArrayList<String> days) {
        ArrayList<Integer> fromTop = getFarFromTop(days);
        int start = (startHour - 7) * 60 + startMin;
        int duration = (endHour - startHour) * 60 + endMin - startMin;
        for (Integer integer : fromTop)
            customTable.addView(plan, (float) start / 60, integer, (float) duration / 60);

    }

    private ArrayList<Integer> getFarFromTop(ArrayList<String> days) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (String day : days) {
            if (day.equals("شنبه")) {
                newArray.add(0);
            } else if (day.contains("یک")) {
                newArray.add(1);
            } else if (day.contains("دو")) {
                newArray.add(2);
            } else if (day.contains("سه")) {
                newArray.add(3);
            } else if (day.contains("چهار")) {
                newArray.add(4);
            } else if (day.contains("پنج")) {
                newArray.add(5);
            }
        }
        return newArray;
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


    OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
        @Override
        public void handleOnBackPressed() {
            if (getContext() != null) {
                if (userTempPlanning.size() != 0) {
                    if (!checkBundleArray()) {

                        ArrayList<String> x = new ArrayList<>();
                        for (Planning planning : userTempPlanning) {
                            x.add(String.valueOf(planning.getId()));
                        }

                        AlertDialog dialog = new AlertDialog.Builder(getContext())
                                .setMessage("مایل به ذخیره اطلاعات هستید؟")
                                .setCancelable(true)
                                .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog1, int which) {

                                        PlanningDataBase.getInstance(getContext()).planningDAO().insertMyPlanning(new MyPlanning(0, "برنامه", x));

                                        Toast.makeText(getContext(), "افزوده شد", Toast.LENGTH_SHORT).show();
                                        {
                                            Navigation.findNavController(view).popBackStack();
                                        }
                                    }
                                })


                                .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Navigation.findNavController(view).popBackStack();
                                    }
                                })

                                .show();

                        Typeface face = ResourcesCompat.getFont(getContext(), R.font.font);

                        TextView textView = (TextView) dialog.findViewById(android.R.id.message);
                        textView.setTypeface(face);
                        textView.setTextColor(Color.BLACK);


                        Button button = dialog.getButton(Dialog.BUTTON_POSITIVE);
                        button.setTypeface(face);
                        button.setTextColor(Color.BLACK);

                        Button button2 = dialog.getButton(Dialog.BUTTON_NEGATIVE);
                        button2.setTypeface(face);
                        button2.setTextColor(Color.BLACK);

                        dialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_row);
                    } else {
                        Navigation.findNavController(view).popBackStack();
                    }

                } else {
                    Navigation.findNavController(view).popBackStack();
                }
            }
        }

        //is equal to first bundle
        private boolean checkBundleArray() {
            if (bundleArray != null) {
                for (Planning planning1 : userTempPlanning) {
                    for (Planning planning2 : bundleArray) {
                        if (planning1.getId() != planning2.getId()) {
                            return false;
                        }
                    }
                }
                return true;

            } else {
                return false;
            }
        }
    };
}