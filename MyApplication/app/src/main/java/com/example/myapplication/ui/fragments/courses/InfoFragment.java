package com.example.myapplication.ui.fragments.courses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.ViewPagerAdapter;

public class InfoFragment extends Fragment {

    ViewPager mViewPager;
    ViewPagerAdapter mViewPagerAdapter;
    View view;


    int[] images = {R.drawable.first, R.drawable.second, R.drawable.third};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_info, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.viewPagerMain);
        mViewPagerAdapter = new ViewPagerAdapter(getContext(), images);
        mViewPager.setAdapter(mViewPagerAdapter);
        requireActivity().getOnBackPressedDispatcher().addCallback(getActivity(), callback);
        return view;
    }

    OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
        @Override
        public void handleOnBackPressed() {

            Navigation.findNavController(view).popBackStack();
        }

    };
}
