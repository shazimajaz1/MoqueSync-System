package com.practice.worddefadmin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    /*
        Member variables
     */
    private ProgressBar progressBar;
    private FirebaseAuth authentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        try {

            getSupportActionBar().setTitle("Login Information:  ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Setup progressbar
        progressBar = findViewById(R.id.login_progressBar);
        //Setup firebase authentication object
        authentication = FirebaseAuth.getInstance();
    }

    /*
        This method is invoked when the activity starts.
        Anything that must be done before the activity starts must be done
        in this method.
     */
    @Override
    protected void onStart() {
        super.onStart();

        //Check if user is already signed in

    }

    /*
        This method when called allows the user to create a new
     */
    private void createAccount(@NonNull String email, @NonNull String password) {
        authentication.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //If user is added, login the user
                        if (task.isSuccessful()) {
                            //Update the UI as necessary

                        } else {
                            //if sign in fails, tell the user what happened.
                            //The error can be retrieved using task.getException()
                        }
                    }


                });
    }

    /*
        This method signs in existing user with the given information
     */
    private void signInUser(@NonNull String email, @NonNull String password) {
        authentication.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            //Sign in is succeeded
                            //Get the user and update the UI Accordingly

                            //Launch the Main activity
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            LoginActivity.this.finish();
                        } else {
                            //Hide the progress bar
                            progressBar.setVisibility(ProgressBar.INVISIBLE);
                            //Sign in is failed, show the user error message
                            //Let the user Know what went wrong
                            Toast.makeText(LoginActivity.this,
                                    "Unable to sign in. Please check your information!", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }

    /*
        This method is called when the sign in button is clicked
     */
    public void signIn(View view) {

        //Show the progressbar
        progressBar.setVisibility(ProgressBar.VISIBLE);
        //Collect User Information from the Screen
        EditText emailView = findViewById(R.id.login_email_edit_text);
        String email = emailView.getText().toString();
        EditText passwordView = findViewById(R.id.login_password_edit_text);
        String password = passwordView.getText().toString();

        boolean isInfoComplete = !(email.equals("")) //check email
                && !(password.equals("")); //check password
        //Login with the provided data
        if (isInfoComplete) {
            signInUser(email, password);
        }
    }

    /*
        This method is called when the singUp button is clicked
     */
    public void signUp(View view) {
        //Sign Up the User with the given data
    }
}
