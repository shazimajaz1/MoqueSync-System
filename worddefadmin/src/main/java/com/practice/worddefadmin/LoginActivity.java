package com.practice.worddefadmin;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth authentication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
                if(task.isSuccessful()){
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
    private void signInUser(@NonNull String email, @NonNull String password){
        authentication.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            //Sign in is succeeded
                            //Get the user and update the UI Accordingly
                        } else {
                            //Sign in is failed, show the user error message
                            //Let the user Know what went wrong
                        }
                    }
                });
    }

    /*
        This method is called when the sign in button is clicked
     */
    public void signIn(View view) {
        //Sign In the user with the given data
    }

    /*
        This method is called when the singUp button is clicked
     */
    public void signUp(View view) {
        //Sign Up the User with the given data
    }
}
