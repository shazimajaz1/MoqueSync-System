package com.practice.moquesync.activities.navigation_activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.practice.moquesync.R;

public class NavigationActivity extends AppCompatActivity {

    /*
        Class Variables
     */
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        //Setup the click listeners for bottom navigation view.
        bottomNavigationClickListenersSetup();

        //Start a default segment when the activity starts.(nav_events)
        EventsFragment eventsFragment = EventsFragment.newInstance();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, eventsFragment).addToBackStack(null).commit();
        bottomNavigationView = findViewById(R.id.nav_bottom_navigation_activity);
        bottomNavigationView.setSelectedItemId(R.id.nav_events);


    }

    /*
        Bottom Navigation click listeners Control Panel Method
        Handles the selection
     */
    private void bottomNavigationClickListenersSetup() {
        //Setup click listeners for bottom_navigation_view
        bottomNavigationView = findViewById(R.id.nav_bottom_navigation_activity);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                int selectedItemId = bottomNavigationView.getSelectedItemId();
                switch (itemId) {
                    case R.id.nav_events:
                        //When events option is selected
                        if (R.id.nav_events != selectedItemId) {
                            EventsFragment eventsFragment = EventsFragment.newInstance();
                            fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, eventsFragment).addToBackStack(null).commit();
                        }

                        break;
                    case R.id.nav_notifications:
                        //Notifications is selected
                        if (R.id.nav_notifications != selectedItemId) {
                            //Replace the fragment with new fragment
                            NotificationsFragment notificationFragment = NotificationsFragment.getInstance();
                            fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, notificationFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();

                        }


                        break;
                    case R.id.nav_portable_devices:
                        //Devices is selected
                        PortableDevicesFragment portableDevicesFragment = new PortableDevicesFragment();
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, portableDevicesFragment);
                        fragmentTransaction.addToBackStack(null).commit();

                        break;
                    case R.id.nav_prayer_times:
                        //Prayer time is selected
                        PrayerTimesFragment prayerTimesFragment = new PrayerTimesFragment();
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, prayerTimesFragment);
                        fragmentTransaction.addToBackStack(null).commit();

                        break;
                    case R.id.nav_preferences:
                        //Preferences is selected
                        PreferencesFragment preferencesFragment = new PreferencesFragment();
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, preferencesFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                        break;
                }
                return true;
            }
        });

    }

}



