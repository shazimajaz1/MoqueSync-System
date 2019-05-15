package com.practice.worddefadmin.EventsAndNotificationManagerActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.practice.worddefadmin.R;

public class NewNotification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_notification);

        //Change the activity title
        getSupportActionBar().setTitle("Create Notification");
    }

    /*
        This method is invoked when attach image button is clicked.
     */
    public void attachNewImage(View view) {
    }
}
