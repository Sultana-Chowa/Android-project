package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Pantview extends AppCompatActivity {
    TextView tv;
    String tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantview);
        tv= findViewById(R.id.t1ds);
        tx=tv.getText().toString();
        Toast.makeText(this, "Sorry!! This section is under constraction", Toast.LENGTH_SHORT).show();
    }
}