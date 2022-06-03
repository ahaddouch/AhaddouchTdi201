package com.example.ahaddouchtdi201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ajouterSoc extends AppCompatActivity {
EditText t1,t2,t3;
Button btn1,btn2;
MyDatabase db;
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
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Societe s = new Societe();
                s.setNom(t1.getText().toString());
                s.setSecteur(t2.getText().toString());
                s.setNbEmploiye(Integer.valueOf(t3.getText().toString()));



                if (MyDatabase.AddSociete(db.getWritableDatabase(), s) == -1)

                Toast.makeText(ajouterSoc.this,"Insertion Echoue",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText( ajouterSoc.this, "Insertion reussie", Toast.LENGTH_SHORT).show();
            }
        });
        db=new MyDatabase(this);



    }
}