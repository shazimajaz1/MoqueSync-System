package com.practice.worddefadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup initial data.
    }

    /*
        This method is invoked when update prayer times button is pressed.
        This button launches a new activity that allows the user to update the prayer times.
        @Version 1: There is no data passing to the new activity.
     */
    public void updatePrayerTimes(View view) {
        //Create a new Intent and Start the Activity with that intent
        Intent intent = new Intent(this, UpdatePrayerTimesActivity.class);
        startActivity(intent);
    }

    /*
        This method is invoked when user presses manage events and notifications button.
        When called, it launches a new activity that does not take any data as input as of
        initial implementation.
     */
    public void manageEventsAndNotifications(View view) {
        //Start Event and Notifications Manager Activity
        Intent intent = new Intent(this, EventsAndNotificationManagerActivity.class);
        startActivity(intent);

    }

    /*
        This method is invoked when the user presses Manage Scholars Button. This launches the activity
        and allows the user to add or remove scholars.
     */
    public void manageScholars(View view) {
        //Start Scholar management activity
        Intent intent = new Intent(this, ScholarManagerActivity.class);
        startActivity(intent);

    }

    /*
        This method is invoked when Get Help! button is pressed.
        This launches a new activity where the user can send an email to the developer.
     */
    public void getHelp(View view) {
        //Start getHelp Activity
        Intent intent = new Intent(this, GetHelpActivity.class);
        startActivity(intent);
    }

}
