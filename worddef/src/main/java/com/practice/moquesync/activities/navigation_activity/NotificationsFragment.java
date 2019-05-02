package com.practice.moquesync.activities.navigation_activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.moquesync.R;


public class NotificationsFragment extends Fragment {

    public NotificationsFragment() {
        // Required empty public constructor
    }


    public static NotificationsFragment getInstance(){
        return new NotificationsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifications, container, false);
    }


}
