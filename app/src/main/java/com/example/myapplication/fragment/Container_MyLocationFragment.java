package com.example.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;


public class Container_MyLocationFragment extends Fragment {
    private View mLayout;

    public Container_MyLocationFragment() {
        // Required empty public constructor
    }

    public static Container_MyLocationFragment newInstance() {
        Container_MyLocationFragment fragment = new Container_MyLocationFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mLayout= inflater.inflate(R.layout.fragment_container__my_location, container, false);
        // Inflate the layout for this fragment
        return mLayout;
    }

}
