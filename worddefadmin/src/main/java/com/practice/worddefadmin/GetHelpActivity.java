package com.practice.worddefadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetHelpActivity extends AppCompatActivity {

    /*
        Call Variables
     */
    private EditText message;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_help);

        //Setup the edits texts and buttons of the screen
        message = findViewById(R.id.help_message_edit_text);
        email = findViewById(R.id.help_your_email_edit_text);


    }

    /*
        This buttons gets the email and sends it to the developer.
     */
    public void sendEmail(View view) {

        //Retrieve the Text from the text view


        //Retrieve the user information.


        //Send the information to the developer in an email

    }
}
