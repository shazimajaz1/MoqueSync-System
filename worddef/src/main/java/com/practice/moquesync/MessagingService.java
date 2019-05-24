package com.practice.moquesync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MessagingService extends FirebaseMessagingService {

    /*
        Member variables and class constants
     */
    public static final String NOTIFICATION_MESSAGE_TAG = "NOTIFICATION_MESSAGE";

    /*
        This method is invoked when Notification is received.
     */

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {


        Log.d(NOTIFICATION_MESSAGE_TAG, "From" + remoteMessage.getFrom());

        //Assuming that app has already subscribed to the topic on which the notifications shall
        //be received, the code below creates the notification by extracting the data from the message

        //Check if the message sent is not empty.
        if(remoteMessage.getData().size() > 0){

            //Handle the message received here.
            //if the message received is an image, then use a task scheduler rather than
            //the UI thread.
            String message = remoteMessage.getFrom();
            Log.d(NOTIFICATION_MESSAGE_TAG, message);
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

        }

    }


    /*
        This method will be invoked whenever a new token is registered.
        A new token registration for the client app can be a result of
        the security of the token being compromised.
     */
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
    }
}
