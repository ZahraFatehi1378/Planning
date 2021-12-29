package com.example.myapplication.ui.fragments.planning;

;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.myapplication.MainActivity;
import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.MyPlanning;
import com.example.myapplication.recycler.MainCoursesListAdaptor;
import com.example.myapplication.recycler.PlaningListAdaptor;
import com.example.myapplication.recycler.StringsListAdaptor;

import java.util.ArrayList;
import java.util.List;

public class PlanningListFragment extends Fragment {

    private RecyclerView planingRecyclerView;
    private RecyclerView mainCoursesRecyclerView;
    private LinearLayout addPlaningView;
    private StringsListAdaptor stringsListAdaptor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_planning_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);

    }

    private void init(View view) {
        addPlaningRecycler(view);
        addMainCoursesRecycler(view);


        addPlaningView = view.findViewById(R.id.add_planning);
        addPlaningView.setOnClickListener(v -> Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_planningFragment));
    }

    private void addMainCoursesRecycler(View view) {
        mainCoursesRecyclerView = view.findViewById(R.id.mainCoursesRecyclerView);
        MainCoursesListAdaptor mainCoursesListAdaptor = new MainCoursesListAdaptor(((PlaningActivity) requireActivity()).coursesCategoryNames);
        mainCoursesListAdaptor.setOnItemClickListener(pos -> {
            Bundle bundle = new Bundle();
            bundle.putString("myCourse", ((PlaningActivity) requireActivity()).coursesCategoryNames.get(pos));
            Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_coursesListFragment, bundle);
        });
        mainCoursesRecyclerView.setAdapter(mainCoursesListAdaptor);
        mainCoursesRecyclerView.setLayoutManager(new LinearLayoutManager((getContext()), LinearLayoutManager.HORIZONTAL, true));

    }

    private void addPlaningRecycler(View view) {
        planingRecyclerView = view.findViewById(R.id.planningRecyclerView);
        ArrayList<String> myPlanningsName = new ArrayList<>();
        List<MyPlanning> myPlannings = PlanningDataBase.getInstance(getContext()).planningDAO().getAllMyPlannings();
        if (myPlannings != null)
            for (MyPlanning planning : myPlannings) {
                myPlanningsName.add(planning.getName() + planning.getId());
            }
        PlaningListAdaptor planingListAdaptor = new PlaningListAdaptor(myPlanningsName);
        planingListAdaptor.setOnItemClickListener(pos -> {

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("myPlanning", myPlannings.get(pos).getPlannings());
            bundle.putInt("planningId", myPlannings.get(pos).getId());
            Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_planningFragment, bundle);
        });

        planingRecyclerView.setAdapter(planingListAdaptor);
        planingRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }



}