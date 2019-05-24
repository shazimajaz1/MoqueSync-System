package com.practice.moquesync.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.practice.moquesync.R;
import com.practice.moquesync.activities.navigation_activity.NavigationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Start the navigation activity
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);




    }
}
