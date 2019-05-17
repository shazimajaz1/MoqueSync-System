package com.practice.worddefadmin.EventsAndNotificationManagerActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.practice.worddefadmin.R;

public class EventsAndNotificationManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_and_notification_manager);

        getSupportActionBar().setTitle("Manage Notifications and Events");
    }

    /*
        Invoked when New Notification button is clicked.
        Launches a new activity that allows the user to create a new notification.
     */
    public void createNewNotification(View view) {
        Intent intent = new Intent(this, NewNotification.class);
        startActivity(intent);
    }

    /*
        Invoked when Update Notification button is clicked
        Launches a new activity that allows the user to view, edit and remove
        existing notifications.
     */
    public void updateRemoveExistingNotifications(View view) {
        Intent intent = new Intent(this, UpdateExistingNotifications.class);
        startActivity(intent);
    }

    /*
        Invoked when New Event button is clicked.
        Launches a new activity that allows  that allows the user to crate a new event
     */
    public void createNewEvent(View view) {
        Intent intent = new Intent(this, NewEvent.class);
        startActivity(intent);

    }

    /*
        Invoked when Update event button is clicked.
        Launches a new activity that allows the user to manage all the events.
     */
    public void updateRemoveExistingEvents(View view) {
        Intent intent = new Intent(this, UpdateExistingEvents.class);
        startActivity(intent);

    }
}
