package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class shirtselect extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    ImageView image;
    TextView priceset;
    Spinner mySpinner;
    String[]size={"S","M","XL","XXL","XXXL"};
    String sizetype;
    String price;
    FragmentManager myfragmng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirtselect);
        mySpinner=findViewById(R.id.spinnerid);
        ArrayAdapter myAA = new ArrayAdapter(this, android.R.layout.simple_spinner_item,size);
        myAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAA);
        mySpinner.setOnItemSelectedListener(this);


        myfragmng=getSupportFragmentManager();
        FragmentTransaction myfragmenttransection=myfragmng.beginTransaction();
        myfragmenttransection.add(R.id.fragmentcontainer, new shirtfragment()).commit();
    }
    public void place_orderr(View view) {
        Toast.makeText(this, "Size: "+sizetype, Toast.LENGTH_SHORT).show();
        Intent myintent= new Intent(shirtselect.this, place_order.class);

        startActivity(myintent);

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        sizetype=size[i];

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void cancel(View view) {
        Intent myintent= new Intent(shirtselect.this, ShirtView.class);
        startActivity(myintent);
    }
}