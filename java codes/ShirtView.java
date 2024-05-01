package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShirtView extends AppCompatActivity {
    ImageView amiri11, amiri2, amiri3;
    ImageView amiri4, amiri5, amiri6;
    Button order, goback;
    TextView a1t, a2t,a3t,a4t,a5t,a6t;
    String t1,t2,t3,t4,t5,t6;
    FragmentManager myfragmng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirt_view);
        goback=(Button) findViewById(R.id.gobackid);
        amiri11=(ImageView) findViewById(R.id.amiri1);
        amiri2=(ImageView) findViewById(R.id.amiri2);
        amiri3=(ImageView) findViewById(R.id.amiri3);
        amiri4=(ImageView) findViewById(R.id.amiri4);
        amiri5=(ImageView) findViewById(R.id.amiri5);
        amiri6=(ImageView) findViewById(R.id.amiri6);
        a1t=(TextView) findViewById(R.id.a1tid);
        a2t=(TextView) findViewById(R.id.a2tid);
        a3t=(TextView) findViewById(R.id.a3tid);
        a4t=(TextView) findViewById(R.id.a4tid);
        a4t=(TextView) findViewById(R.id.a5tid);
        a6t=(TextView) findViewById(R.id.a6tid);



        amiri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ShirtView.this, amiri2select.class);

                startActivity(intent);
            }
        });
        amiri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ShirtView.this, amiri3select.class);

                startActivity(intent);
            }
        });
        amiri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(ShirtView.this, "Nor available!! Please Try something else..", Toast.LENGTH_SHORT).show();
            }
        });
        amiri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(ShirtView.this, "Nor available!! Please Try something else..", Toast.LENGTH_SHORT).show();
            }
        });
        amiri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(ShirtView.this, "Nor available!! Please Try something else..", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void gobacklist(View view) {
        Intent myIntent = new Intent(ShirtView.this,home.class);
        startActivity(myIntent);
    }

    public void amirifnc(View view) {
        Intent intent = new Intent(ShirtView.this, shirtselect.class);

        startActivity(intent);
    }
}