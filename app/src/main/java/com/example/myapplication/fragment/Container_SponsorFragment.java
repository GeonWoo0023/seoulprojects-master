package com.example.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Container_SponsorFragment extends Fragment {


    public Container_SponsorFragment() {
        // Required empty public constructor
    }

    public static Container_SponsorFragment newInstance() {
        Container_SponsorFragment fragment = new Container_SponsorFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_container__sponsor, container, false);
    }

}
