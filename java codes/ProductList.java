package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ProductList extends AppCompatActivity {

    ListView myListView;
    String[] countryName;
    String selectedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        myListView = findViewById(R.id.ListViewId);
        countryName = getResources().getStringArray(R.array.Country_name);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.sampleview,R.id.textViewId,countryName);

        myListView.setAdapter(myAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                selectedValue = countryName[position];
                if(selectedValue.equals("Shirt")){
                    Intent myIntent = new Intent(ProductList.this, ShirtView.class);
                    startActivity(myIntent);
                }
                else if(selectedValue.equals("Pant")){
                    Toast.makeText(ProductList.this, "Sorry!! This Section is under construction..", Toast.LENGTH_SHORT).show();
                }

                else if(selectedValue.equals("Shoes")){
                    Toast.makeText(ProductList.this, "Sorry!! This Section is under construction..", Toast.LENGTH_SHORT).show();
                }

                else if(selectedValue.equals("Kids Items")){
                    Toast.makeText(ProductList.this, "Sorry!! This Section is under construction..", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }

    public void backtohom(View view) {
        Intent myIntent = new Intent(ProductList.this,home.class);
        startActivity(myIntent);
    }
}