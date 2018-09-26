package com.example.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;


public class Container_HomeFragment extends Fragment {


    public Container_HomeFragment() {
        // Required empty public constructor
    }
    public static Container_HomeFragment newInstance() {
        Container_HomeFragment fragment = new Container_HomeFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_container__home, container, false);
    }

}
