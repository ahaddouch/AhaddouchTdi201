package com.example.ahaddouchtdi201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class listSoc extends AppCompatActivity {
    ListView ls;
    ArrayList<Societe> lists ;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_soc);
        ls=findViewById(R.id.lst);
        lists= MyDatabase.getAllSociete(db.getReadableDatabase());
        ArrayList<HashMap<String, Object>> list_items = new ArrayList<>();
        for (Societe s : lists) {
            HashMap<String, Object> it = new HashMap<>();
            it.put("nom", s.getNom());
            it.put("nb_employe", s.getNbEmploiye());
            list_items.add(it);
        }
        String[] from = {"nom","nb_employe"};
        int[] to = {R.id.r, R.id.c,};

        SimpleAdapter ad = new SimpleAdapter(this, list_items, R.layout.layout, from, to);
        ls.setAdapter(ad);

    }
}