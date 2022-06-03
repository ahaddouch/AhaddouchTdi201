package com.example.ahaddouchtdi201;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {
    static public String dbName="societes.db";
    static public String tableName="Societe";
    static public String col1="ID";
    static public String col2="Raison_Sociale";
    static public String col3="Raison_Sociale";
    static public String col4="nb_employe";




    public MyDatabase(Context context) {
        super(context, dbName, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
