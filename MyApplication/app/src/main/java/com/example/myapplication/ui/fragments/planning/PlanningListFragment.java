package com.example.myapplication.ui.fragments.planning;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.storage.shared_prefrences.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PlanningListFragment extends Fragment {

    private ConstraintLayout mainLayout;
    private FloatingActionButton floatingActionButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_planning_list, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainLayout = view.findViewById(R.id.mainLayout2);
        setBg(Utils.sTheme);
        floatingActionButton = view.findViewById(R.id.addBtn);
        floatingActionButton.setOnClickListener(v -> Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_planningFragment));
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