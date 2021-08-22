package com.example.myapplication.ui.fragments.planning;

;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
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

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.MyPlanning;
import com.example.myapplication.model.Planning;
import com.example.myapplication.recycler.OnStringClickListener;
import com.example.myapplication.recycler.StringsListAdaptor;
import com.example.myapplication.storage.shared_prefrences.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlanningListFragment extends Fragment {

    private ConstraintLayout mainLayout;
    private RecyclerView recyclerView;
    private FloatingActionButton floatingActionButton;
    private  StringsListAdaptor stringsListAdaptor;

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
        mainLayout = view.findViewById(R.id.mainLayout2);
        recyclerView = view.findViewById(R.id.planningRecyclerView);
        ArrayList<String> myPlanningsName = new ArrayList<>();
        List<MyPlanning> myPlannings = PlanningDataBase.getInstance(getContext()).planningDAO().getAllMyPlannings();
        if (myPlannings != null)
            for (MyPlanning planning : myPlannings) {
                myPlanningsName.add(planning.getName() + planning.getId());
            }
         stringsListAdaptor = new StringsListAdaptor(myPlanningsName, new OnStringClickListener() {
            @Override
            public void onItemClicked(String course) {
            }

            @Override
            public void onItemClickedPos(int pos) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("myPlanning", myPlannings.get(pos).getPlannings());
                Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_planningFragment, bundle);
            }

            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onItemLongClick(int pos) {

                AlertDialog dialog = new AlertDialog.Builder(getContext())
                        .setMessage("مایل به حذف هستید؟")
                        .setCancelable(true)
                        .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog1, int which) {
                                myPlanningsName.remove(pos);
                                stringsListAdaptor.notifyDataSetChanged();

                                PlanningDataBase.getInstance(getContext()).planningDAO().deleteMyPlanning(pos+1);
                                Toast.makeText(getContext(),"حذف شد",Toast.LENGTH_SHORT).show();

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
        recyclerView.setAdapter(stringsListAdaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
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