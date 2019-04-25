package com.practice.moquesync.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.practice.moquesync.R;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        //Setup the click listeners for bottom navigation view.
        bottomNavigationClickListenersSetup();



    }

    /*
        Bottom Navigation click listeners Control Panel Method
        Handles the selection
     */
    private void bottomNavigationClickListenersSetup(){
        //Setup click listeners for bottom_navigation_view
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_bottom_navigation_activity);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                switch (itemId){
                    case R.id.nav_events:
                        //Events is selected

                        break;
                    case R.id.nav_notifications:
                        //Notifications is selected

                        break;
                    case R.id.nav_portable_devices:
                        //Devices is selected

                        break;
                    case R.id.nav_prayer_times:
                        //Prayer time is selected

                        break;
                    case R.id.nav_preferences:
                        //Preferences is selected

                        break;
                }
                return true;
            }
        });
    }

}



