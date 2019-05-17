package com.practice.worddefadmin.EventsAndNotificationManagerActivities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import com.practice.worddefadmin.R;

public class NewNotification extends AppCompatActivity {

    /*
        Member variables
     */
    private EditText notification_title;
    private EditText notification_description;
    //To-Do: Implement attach an image option
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_notification);

        //Change the activity title
        getSupportActionBar().setTitle("Create Notification");

        //Setup the class variables
        notification_title = findViewById(R.id.new_notification_title);
        notification_description = findViewById(R.id.new_notification_description);



    }

    /*
        This method is invoked when attach image button is clicked.
        @TODO
     */
    public void attachNewImage(View view) {

    }

    /*
        Invoked when user clicks send notification.
        Must check if there is data in both title and description fields.
        Do not send until both fields are provided.
        Attached image is optional, allow the user to send even if there
        is no image attached.
     */
    public void sendNotification(View view) {
        //Send only if both fields if both fields are not empty.
        if(notification_title.getText().toString().equals("")
            || notification_description.getText().toString().equals("")){
            if(notification_title.getText().toString().equals("")){
                Toast.makeText(this, "Title is required!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Description is required!", Toast.LENGTH_SHORT).show();
            }
        } else {
            //Perform the send notification process here
            boolean sent = sendMessage();
            if(sent){
                Toast.makeText(this, "Notification was sent", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Sending Notification Failed", Toast.LENGTH_SHORT).show();;
            }
        }
    }

    /*
        This is a helper method to send the notification.
        The method assumes that the required fields are not null.
     */
    private boolean sendMessage() {
        try {
            //Send the message here on a separate thread to prevent UI lag.
            RemoteMessage message = new RemoteMessage.Builder(getString(R.string.firebase_notification_topic))
                    .addData("title", notification_title.getText().toString())
                    .addData("description", notification_description.getText().toString())
                    .build();
            FirebaseMessaging.getInstance().send(message);
            return true;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
