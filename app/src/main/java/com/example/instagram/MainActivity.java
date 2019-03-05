package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

// Not finished.
// Remember to fix some things before continuing next week.
// Check required stories for what you have missed.

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParseUser currentUser = ParseUser.getCurrentUser();
        if(currentUser != null) {
            gotMainActivity();
        }

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String username = etUsername.getText().toString();
               String password = etPassword.getText().toString();
               login(username, password);
           }
        });
    }

    private void login(String username, String password) {
        // TODO: navigate to new activity if the user has signed properly
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(e != null) {
                    Log.e(TAG, "Issue with login");
                    e.printStackTrace();
                    return;
                }
                gotMainActivity();
            }
        });
    }

    private void gotMainActivity() {
        Log.d(TAG, "Navigating to Main Activity");
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
        finish();
    }
}
