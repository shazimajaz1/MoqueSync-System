package com.practice.worddefadmin.get_help;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.practice.worddefadmin.R;

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

        //Retrieve the Text from the edit text
        EditText message_editText = findViewById(R.id.help_message_edit_text);
        String message = message_editText.getText().toString();

        //Retrieve the user information.


        //Send the information to the developer in an email

    }


}
