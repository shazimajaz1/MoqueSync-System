package com.practice.moquesync.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.practice.moquesync.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup main activity as loading screen.


        //Start the navigation activity
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);
    }
}
