package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class amiri2select extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
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
        setContentView(R.layout.activity_amiri2select);
        mySpinner=findViewById(R.id.spinnerid);
        ArrayAdapter myAA = new ArrayAdapter(this, android.R.layout.simple_spinner_item,size);
        myAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAA);
        mySpinner.setOnItemSelectedListener(this);

        myfragmng=getSupportFragmentManager();
        FragmentTransaction myfragmenttransection=myfragmng.beginTransaction();
        myfragmenttransection.add(R.id.fragmentcontainer2, new amiri2Fragment()).commit();
    }
    public void place_orderr(View view) {
        Toast.makeText(this, "Size: "+sizetype, Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        sizetype=size[i];

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}