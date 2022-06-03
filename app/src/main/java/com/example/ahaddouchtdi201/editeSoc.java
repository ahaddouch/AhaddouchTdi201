package com.example.ahaddouchtdi201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class editeSoc extends AppCompatActivity {

    EditText t1,t2,t3;
    Button btn1,btn2;
    MyDatabase db;
    Societe s;
    ArrayList<Societe> ar;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edite_soc);
        t1=findViewById(R.id.ttnom);
        t2=findViewById(R.id.ttsecteur);
        t3=findViewById(R.id.ttnb);
        btn1=findViewById(R.id.btnmod);
        btn2=findViewById(R.id.btnsup);
        sp=findViewById(R.id.spp);
        db=new MyDatabase(this);
        ar = MyDatabase.getAllSociete(db.getReadableDatabase());
        ArrayList<Integer> items = new ArrayList<>();

        for(Societe s :ar){
            items.add(s.getId());
        }


        ArrayAdapter<String> ad = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,items);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                s=ar.get(i);
                t1.setText(String.valueOf(s.getNom()));
                t2.setText(String.valueOf(s.getSecteur()));
                t3.setText(String.valueOf(s.getNbEmploiye()));
                Toast.makeText(editeSoc.this, String.valueOf(s.getNom()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void modifier(View view) {
        if(MyDatabase.UpdateSociete(db.getWritableDatabase(),s)!=-1){
            Toast.makeText(getApplicationContext(),"Update Reussie",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Update Echoue",Toast.LENGTH_LONG).show();
        }
    }

    public void supprimer(View view) {
        if(MyDatabase.DeleteSociete(db.getWritableDatabase(),s.getId())!=-1){
            Toast.makeText(getApplicationContext(),"Delete Reussie",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"Delete Echoue",Toast.LENGTH_LONG).show();
        }
    }



    }
