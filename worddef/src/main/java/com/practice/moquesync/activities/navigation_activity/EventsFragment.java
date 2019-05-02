package com.practice.moquesync.activities.navigation_activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.moquesync.R;

/*
    This class creates a simple fragment.
 */
public class EventsFragment extends Fragment {


    /*
        This constructor is required.
     */
    public EventsFragment() {
        // Required empty public constructor

    }

    /*
        This static method return a simple instance of the the Events Fragment.
     */
    public static EventsFragment newInstance(){

        return new EventsFragment();
    }

    /*
        This method is invoked to inflate the fragment xml view.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events, container, false);
    }

}
