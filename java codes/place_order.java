package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class place_order extends AppCompatActivity {
    EditText name, address, mobile;
    RadioGroup myq1RadioGroup;
    RadioButton sv, hm, dm, cb;
    TextView settx;
    String name1, mob1, add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        name= findViewById(R.id.nameid);
        address= findViewById(R.id.addressid);
        mobile=findViewById(R.id.mobid);
        settx=findViewById(R.id.txtid);
        myq1RadioGroup= findViewById(R.id.q1radiogrpId);


    }

    public void saveinfo(View view) {
        name1=name.getText().toString();
        mob1=mobile.getText().toString();
        add=address.getText().toString();

        Toast.makeText(this, "Your Oder is Placed",
                Toast.LENGTH_SHORT).show();

        if(myq1RadioGroup.getCheckedRadioButtonId()==R.id.savarid){
            settx.setText("Name: "+name1+" Number: "+mob1+" Adress: "+add+" Savar");
        }
        else if(myq1RadioGroup.getCheckedRadioButtonId()==R.id.dhamid){
            settx.setText("Name: "+name1+" Number: "+mob1+" Adress: "+add+" Dhamrai");
        }
        else if(myq1RadioGroup.getCheckedRadioButtonId()==R.id.cnbid){
            settx.setText("Name: "+name1+" Number: "+mob1+" Adress: "+add+" C&B");
        }
    }

    public void backhome(View view) {
        Intent intt = new Intent(place_order.this, home.class);
        startActivity(intt);
    }
}