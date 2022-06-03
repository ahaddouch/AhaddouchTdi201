package com.example.ahaddouchtdi201;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {
    static public String dbName="societes.db";
    static public String tableName="Societe";
    static public String col1="ID";
    static public String col2="Raison_Sociale";
    static public String col3="Secteur_activite";
    static public String col4="nb_employe";




    public MyDatabase(Context context) {
        super(context, dbName, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = String.format("create table %s (%s integer autoincrement primary key, %s text, %s text, %s integer )",tableName,col1,col2,col3,col4);
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "drop table " + tableName;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
    public static long AddSociete(SQLiteDatabase sqLiteDatabase, Societe contact) {
        ContentValues cv = new ContentValues();

        cv.put(col2, contact.getNom());
        cv.put(col3, contact.getSecteur());
        cv.put(col4, contact.getNbEmploiye());
        return sqLiteDatabase.insert(tableName, null, cv);
    }



}
