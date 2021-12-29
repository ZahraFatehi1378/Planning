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
import com.example.myapplication.recycler.OnStringClickListener;
import com.example.myapplication.recycler.StringsListAdaptor;
import com.example.myapplication.ui.dialogs.TakePlanningDialog;
import com.example.myapplication.ui.table.CustomCourseTableListener;
import com.example.myapplication.ui.table.CustomTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PlanningFragment extends Fragment {
    private RecyclerView coursesCategoryRecyclerView;
    private CustomTable customTable;
    private ArrayList<Course> userTempPlanning;
    private Bundle bundle;
    private ArrayList<Course> bundleArray;
    private View view;
    int id;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_planning, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        init(view);
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);

    }

    private void init(View view) {
        customTable = view.findViewById(R.id.customTable);
        button = view.findViewById(R.id.button);
        userTempPlanning = new ArrayList<>();

        checkBundle();
        addRecycler(view);
        button.setOnClickListener(v -> {
            callback.handleOnBackPressed();
        });

    }

    private void checkBundle() {
        bundle = getArguments();
        if (bundle != null) {
            bundleArray = new ArrayList();
            id = bundle.getInt("planningId");
            MyPlanning myCourses = PlanningDataBase.getInstance(getContext()).planningDAO().getMyPlanning(id);
            for (String s : myCourses.getPlannings()) {
                Course courseModel = PlanningDataBase.getInstance(getContext()).CourseDAO().getCourse(Integer.parseInt(s));
                userTempPlanning.add(courseModel);
                bundleArray.add(courseModel);
            }
            for (Course course : userTempPlanning) {
                if (course != null)
                    addPlan(course);
            }
        }
    }



    private void addRecycler(View view) {
        //add faculties
        coursesCategoryRecyclerView = view.findViewById(R.id.categories_recycler);
        coursesCategoryRecyclerView.setAdapter(new StringsListAdaptor(((PlaningActivity) requireActivity()).coursesCategoryNames, new OnStringClickListener() {

            @Override
            public void onItemClickedPos(int pos) {
                List<Course> tempPlanning = PlanningDataBase.getInstance(getContext()).CourseDAO().getCourseByCategory(pos);
                if (tempPlanning != null) {
                    TakePlanningDialog takePlanningDialog = new TakePlanningDialog(getContext(), tempPlanning , true);
                    takePlanningDialog.setAddPlanningListener(planning -> {

                        int flag = 0;
                        System.out.println(userTempPlanning.size());
                        for (Course planning1 : userTempPlanning) {
                            if (planning1.getId() != planning.getId()
                                    && checkTimes(planning, planning1)) {
                                Toast.makeText(getContext(), " تداخل زمانی ", Toast.LENGTH_SHORT).show();
                                flag = 1;
                            }
                        }

                        for (Course planning1 : userTempPlanning) {
                            if (planning1.getId() != planning.getId()
                                    && checkExamTimes(planning, planning1)) {
                                Toast.makeText(getContext(), " تداخل امتحانی " + planning.getId(), Toast.LENGTH_SHORT).show();
                                flag = 1;
                            }
                        }


                        if (flag == 0 && planning != null) {
                            addPlan(planning);
                            userTempPlanning.add(planning);
                            Toast.makeText(getContext(), "اضافه شد", Toast.LENGTH_SHORT).show();
                        }


                    });
                }

            }

        }));
        coursesCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
    }

    private void addPlan(Course planning) {
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
        setAPlan(planning.getId(), planning.getName() + "\n" + planning.getInstructor(), startHour, startMin, endHour, endMin, planning.getDaysOfWeek());

    }

    //اگه تداخل داشت true
    private boolean checkTimes(Course planning, Course planning1) {
        int startHour1 = 0, startMin1 = 0, endHour1 = 0, endMin1 = 0;
        String[] s1 = planning1.getStartTime().split(":");
        String[] e1 = planning1.getEndTime().split(":");
        if (s1.length == 2) {
            startHour1 = Integer.parseInt(s1[0]);
            startMin1 = Integer.parseInt(s1[1]);
        } else {
            startHour1 = Integer.parseInt(planning1.getStartTime());
        }
        if (e1.length == 2) {
            endHour1 = Integer.parseInt(e1[0]);
            endMin1 = Integer.parseInt(e1[1]);
        } else {
            endHour1 = Integer.parseInt(planning1.getEndTime());
        }

        int startHour = 0, startMin = 0;
        String[] s = planning.getStartTime().split(":");
        if (s.length == 2) {
            startHour = Integer.parseInt(s[0]);
            startMin = Integer.parseInt(s[1]);
        } else {
            startHour = Integer.parseInt(planning.getStartTime());
        }

        int flag = 0;
        for (String day : planning.getDaysOfWeek()) {
            for (String day1 : planning1.getDaysOfWeek()) {
                if (day.equals("شنبه") && day1.equals("شنبه")) {
                    flag = 1;
                } else if (day.contains("یک") && day1.contains("یک")) {
                    flag = 1;
                } else if (day.contains("دو") && day1.contains("دو")) {
                    flag = 1;
                } else if (day.contains("سه") && day1.contains("سه")) {
                    flag = 1;
                } else if (day.contains("چهار") && day1.contains("چهار")) {
                    flag = 1;
                } else if (day.contains("پنج") && day1.contains("پنج")) {
                    flag = 1;
                }

            }
        }


        if (flag == 1 && startHour1 == startHour && startMin == startMin1)
            return true;


        if (flag == 1 && (startHour1 * 60 + startMin1) < (startHour * 60 + startMin) &&
                (endHour1 * 60 + endMin1) > (startHour * 60 + startMin)) {
            return true;
        }
        return false;
    }

    private boolean checkExamTimes(Course planning, Course planning1) {

        int startHour1 = 0, startMin1 = 0, endHour1 = 0, endMin1 = 0;
        String[] s1 = planning1.getStartTimeExam().split(":");
        String[] e1 = planning1.getEndTimeExam().split(":");
        if (s1.length == 2) {
            startHour1 = Integer.parseInt(s1[0]);
            startMin1 = Integer.parseInt(s1[1]);
        } else {
            startHour1 = Integer.parseInt(planning1.getStartTimeExam());
        }
        if (e1.length == 2) {
            endHour1 = Integer.parseInt(e1[0]);
            endMin1 = Integer.parseInt(e1[1]);
        } else {
            endHour1 = Integer.parseInt(planning1.getEndTimeExam());
        }

        int startHour = 0, startMin = 0, endHour = 0, endMin = 0;
        String[] s = planning.getStartTimeExam().split(":");
        if (s.length == 2) {
            startHour = Integer.parseInt(s[0]);
            startMin = Integer.parseInt(s[1]);
        } else {
            startHour = Integer.parseInt(planning.getStartTimeExam());
        }

        if (startHour == 0) return false;
        if ((startHour1 * 60 + startMin1) < (startHour * 60 + startMin)
                && (endHour1 * 60 + endMin1) > (startHour * 60 + startMin)
                && planning.getDayOfExam() == planning1.getDayOfExam()
                && planning.getMonthOfExam() == planning1.getMonthOfExam()) {
            return true;
        }
        return false;
    }

    private void setAPlan(int id, String plan, int startHour, int startMin, int endHour, int endMin, ArrayList<String> days) {
        ArrayList<Integer> fromTop = getFarFromTop(days);
        int start = (startHour - 7) * 60 + startMin;
        int duration = (endHour - startHour) * 60 + endMin - startMin;

        for (Integer integer : fromTop) {

            customTable.addView(id, plan, (float) start / 60, integer, (float) duration / 60, new CustomCourseTableListener() {
                @Override
                public void shewDeleteDialog(Integer id, TextView v) {
                    AlertDialog dialog = new AlertDialog.Builder(getContext())
                            .setMessage("مایل به حذف اطلاعات هستید؟")
                            .setCancelable(true)
                            .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog1, int which) {
                                    Iterator<Course> itr = userTempPlanning.iterator();

                                    while (itr.hasNext()) {
                                        Course element = itr.next();
                                        if (element.getId() == id) {
                                            userTempPlanning.remove(element);
                                            Toast.makeText(getContext(), "حذف شد", Toast.LENGTH_SHORT).show();


                                            break;
                                        }
                                    }
                                    customTable.removeView(v);

                                }
                            })


                            .setNegativeButton("خیر", null)
                            .show();

                    Typeface face = ResourcesCompat.getFont(getContext(), R.font.font);

                    TextView textView = dialog.findViewById(android.R.id.message);
                    textView.setTypeface(face);
                    textView.setTextColor(Color.BLACK);


                    Button button = dialog.getButton(Dialog.BUTTON_POSITIVE);
                    button.setTypeface(face);
                    button.setTextColor(Color.BLACK);

                    Button button2 = dialog.getButton(Dialog.BUTTON_NEGATIVE);
                    button2.setTypeface(face);
                    button2.setTextColor(Color.BLACK);

                    dialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_row);
                }
            });
        }
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

    OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
        @Override
        public void handleOnBackPressed() {
            if (getContext() != null) {
                if (userTempPlanning.size() != 0) {
                    if (!checkBundleArray()) {

                        ArrayList<String> x = new ArrayList<>();
                        for (Course planning : userTempPlanning) {
                            x.add(String.valueOf(planning.getId()));
                        }

                        AlertDialog dialog = new AlertDialog.Builder(getContext())
                                .setMessage("مایل به ذخیره اطلاعات هستید؟")
                                .setCancelable(true)
                                .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog1, int which) {

                                        if (bundleArray != null) {
                                            PlanningDataBase.getInstance(getContext()).planningDAO().updatePlanning(x, id);

                                        } else {
                                            PlanningDataBase.getInstance(getContext()).planningDAO().insertMyPlanning(new MyPlanning(0, "برنامه", x));
                                        }
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

                        TextView textView =  dialog.findViewById(android.R.id.message);
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
//                for (Planning planning1 : userTempPlanning) {
//                    for (Planning planning2 : bundleArray) {
//                        System.out.println(planning1.getId() +"                          "+planning2.getId());
//                        if (planning1.getId() != planning2.getId()) {
//                            return false;
//                        }
//                    }
//                }
                if (userTempPlanning.equals(bundleArray))
                    return true;

            } else {
                return false;
            }

            return false;
        }
    };
}