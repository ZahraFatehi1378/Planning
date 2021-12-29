package com.example.myapplication.ui.fragments.planning;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.core.content.res.ResourcesCompat;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.PlaningActivity;
import com.example.myapplication.R;
import com.example.myapplication.db.PlanningDataBase;
import com.example.myapplication.model.MyPlanning;
import com.example.myapplication.recycler.MainCoursesListAdaptor;
import com.example.myapplication.recycler.PlaningListAdaptor;
import com.example.myapplication.ui.fragments.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class PlanningListFragment extends BaseFragment {

    private RecyclerView planingRecyclerView;
    private RecyclerView mainCoursesRecyclerView;
    private LinearLayout addPlaningView;
    private ImageView info;


    @Override
    public void onViewCreated() {
        init(view);
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                getActivity().finish();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);
    }

    @Override
    public int layout() {
        return R.layout.fragment_planning_list;
    }

    private void init(View view) {
        info = view.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_infoFragment);

            }
        });
        addPlaningRecycler(view);
        addMainCoursesRecycler(view);


        addPlaningView = view.findViewById(R.id.add_planning);
        addPlaningView.setOnClickListener(v -> Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_planningFragment));
    }

    private void addMainCoursesRecycler(View view) {
        mainCoursesRecyclerView = view.findViewById(R.id.mainCoursesRecyclerView);
        Integer[] images = {
                R.drawable.omomi, R.drawable.fac,
                R.drawable.math, R.drawable.physics,
                R.drawable.english, R.drawable.sport,
        };
        MainCoursesListAdaptor mainCoursesListAdaptor = new MainCoursesListAdaptor(((PlaningActivity) requireActivity()).coursesCategoryNames , images);
        mainCoursesListAdaptor.setOnItemClickListener(pos -> {
            Bundle bundle = new Bundle();
            bundle.putString("category", ((PlaningActivity) requireActivity()).coursesCategoryNames.get(pos));
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
            bundle.putInt("planningId", myPlannings.get(pos).getId());
            Navigation.findNavController(view).navigate(R.id.action_planningListFragment_to_planningFragment, bundle);
        });

        planingRecyclerView.setAdapter(planingListAdaptor);
        planingRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN | ItemTouchHelper.UP) {

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                //Remove swiped item from list and notify the RecyclerView

                AlertDialog x = new AlertDialog.Builder(getContext())
                        .setMessage("آیا مایل به حذف برنامه هستید؟")
                        .setCancelable(true)
                        .setPositiveButton("بله", (dialog1, which) -> {
                            int position = viewHolder.getAdapterPosition();

                            PlanningDataBase.getInstance(getContext()).planningDAO().deleteMyPlanning
                                    (myPlannings.get(position).getId())
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(AndroidSchedulers.mainThread()).subscribe();
                            myPlanningsName.remove(position);
                            planingListAdaptor.notifyDataSetChanged();
                            Toast.makeText(getContext(), "انجام شد", Toast.LENGTH_SHORT).show();

                        })


                        .setNegativeButton("خیر", (dialog, which) -> {
                            planingListAdaptor.notifyDataSetChanged();
                        })

                        .show();
                Typeface face = ResourcesCompat.getFont(getContext(), R.font.font);

                TextView textView = (TextView) x.findViewById(android.R.id.message);
                textView.setTypeface(face);
                textView.setTextColor(Color.BLACK);


                Button button = x.getButton(Dialog.BUTTON_POSITIVE);
                button.setTypeface(face);
                button.setTextColor(Color.BLACK);

                Button button2 = x.getButton(Dialog.BUTTON_NEGATIVE);
                button2.setTypeface(face);
                button2.setTextColor(Color.BLACK);

                x.getWindow().setBackgroundDrawableResource(R.drawable.bg_row);

            }
        };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(planingRecyclerView);
    }


}