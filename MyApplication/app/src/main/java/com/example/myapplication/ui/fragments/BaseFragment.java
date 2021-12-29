package com.example.myapplication.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

public abstract class BaseFragment extends Fragment {

    public View view;
    public CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(layout() , container , false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewCreated();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        compositeDisposable.clear();
    }

    public abstract void onViewCreated();

    public abstract int layout();
}
