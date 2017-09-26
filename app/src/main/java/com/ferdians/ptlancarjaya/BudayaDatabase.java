package com.ferdians.ptlancarjaya;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 30/04/2017.
 */

public class BudayaDatabase extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Mahasiswa.db";

    public BudayaDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS = "CREATE TABLE " + BudayaContract.budaya.TABLE_NAME + " (" +
                BudayaContract.budaya._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                BudayaContract.budaya.COLUMN_NAME + " TEXT NOT NULL," +
                BudayaContract.budaya.COLUMN_BREED + " TEXT," +
                BudayaContract.budaya.COLUMN_GENDER + " INTEGER," +
                BudayaContract.budaya.COLUMN_WEIGHT + " INTEGER NOT NULL DEFAULT 0)";
        db.execSQL(SQL_CREATE_PETS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
