package com.practice.moquesync;

import android.app.Application;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/*
    Any preferences and and services that are required at run time
    must be created and instantiated here.
 */

public class RunAtStart extends Application {
    /*
        Member variables and class constants

     */
    public static final String SUBSCRIPTION_RESPONSE_MESSAGE_TAG = "Subscription Tag";
    /*
        This method is run when the application starts.
     */
    @Override
    public void onCreate() {
        super.onCreate();

        //Subscribe the application to a topic.
        FirebaseMessaging.getInstance().subscribeToTopic(getString(R.string.firebase_notification_topic))
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    String responseMessage = "Subscribed to the to " + getString(R.string.firebase_notification_topic);
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(!task.isSuccessful()){
                            responseMessage = "Subscribe failed to " + getString(R.string.firebase_notification_topic);
                        }
                        Log.d(SUBSCRIPTION_RESPONSE_MESSAGE_TAG, responseMessage);
                        Toast.makeText(getApplicationContext(), responseMessage, Toast.LENGTH_LONG).show();
                    }
                });


    }
}
