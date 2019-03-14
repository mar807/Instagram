package com.example.instagram;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

public class Main2Activity extends AppCompatActivity {

    private final String TAG = "Main2Activity";

    private BottomNavigationView bottomNavigationView;

    public final static int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 1034;
    public String photoFileName = "photo.jpg";
    File photoFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    bottomNavigationView = findViewById(R.id.bottom_navigation);

    bottomNavigationView.setOnNavigationSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
       []
    });
}
