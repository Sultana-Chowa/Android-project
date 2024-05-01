package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class aboutus extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }

    public void done(View view) {
        Toast.makeText(aboutus.this, "Thanks For Your Feedback", Toast.LENGTH_SHORT).show();
    }
    public void backhome(View view) {
        Intent inte =new Intent(aboutus.this, home.class);
        startActivity(inte);
    }
}