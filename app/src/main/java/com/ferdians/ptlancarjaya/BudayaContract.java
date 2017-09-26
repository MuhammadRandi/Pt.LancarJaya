package com.ferdians.ptlancarjaya;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by User on 30/04/2017.
 */

public final class BudayaContract {
    private BudayaContract() {}


    public static final String AUTHORITY = "org.d3ifcool.pets4192";
    public static final Uri BASE_URI = Uri.parse("content://" + AUTHORITY);
    /* Inner class that defines the table contents */
    public static class budaya implements BaseColumns {
        public static final String TABLE_NAME = "mahasiswa";
        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_WEIGHT = "weight";

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_URI, TABLE_NAME);
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + budaya.TABLE_NAME + " (" +
                    budaya._ID + " INTEGER PRIMARY KEY," +
                    budaya.COLUMN_NAME + " TEXT," +
                    budaya.COLUMN_BREED + " TEXT)";
}
