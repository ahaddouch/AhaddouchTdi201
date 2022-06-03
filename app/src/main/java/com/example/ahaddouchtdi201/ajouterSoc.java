package com.example.ahaddouchtdi201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ajouterSoc extends AppCompatActivity {
EditText t1,t2,t3;
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_soc);
        t1=findViewById(R.id.txtnom);
        t2=findViewById(R.id.txtsecteur);
        t3=findViewById(R.id.txtnb);
        btn1=findViewById(R.id.btnenr);
        btn2=findViewById(R.id.btnanul);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}