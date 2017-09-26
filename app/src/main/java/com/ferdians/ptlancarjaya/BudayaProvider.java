package com.ferdians.ptlancarjaya;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.Nullable;

/**
 * Created by User on 30/04/2017.
 */

public class BudayaProvider extends ContentProvider {
    private BudayaDatabase mDBHelper;

    private static final int PETS = 100;
    private static final int PET_ID = 101;
    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        sUriMatcher.addURI(BudayaContract.AUTHORITY, BudayaContract.budaya.TABLE_NAME, PETS);
        sUriMatcher.addURI(BudayaContract.AUTHORITY, BudayaContract.budaya.TABLE_NAME + "/#", PET_ID);
    }

    @Override
    public boolean onCreate() {
        mDBHelper = new BudayaDatabase(getContext());
        return true;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = mDBHelper.getReadableDatabase();
        Cursor cursor;

        int match = sUriMatcher.match(uri);
        switch(match){
            case PETS:
                projection = new String[]{
                        BudayaContract.budaya.COLUMN_ID,
                        BudayaContract.budaya.COLUMN_NAME,
                        BudayaContract.budaya.COLUMN_BREED
                };
                cursor = db.query(BudayaContract.budaya.TABLE_NAME, projection, null, null, null, null, null);
                break;

            case PET_ID:
                projection = new String[]{
                        BudayaContract.budaya.COLUMN_ID,
                        BudayaContract.budaya.COLUMN_NAME,
                        BudayaContract.budaya.COLUMN_BREED,
                        BudayaContract.budaya.COLUMN_GENDER,
                        BudayaContract.budaya.COLUMN_WEIGHT
                };
                selection = BudayaContract.budaya.COLUMN_ID + " = ?";
                selectionArgs = new String[]{ String.valueOf(ContentUris.parseId(uri)) };
                cursor = db.query(BudayaContract.budaya.TABLE_NAME, projection, selection, selectionArgs, null, null, null);
                break;

            default:
                throw new IllegalArgumentException("Invalid URI : " + uri);
        }

        return cursor;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase db = mDBHelper.getWritableDatabase();
        long result;

        int match = sUriMatcher.match(uri);
        switch (match){
            case PETS:
                result = db.insert(BudayaContract.budaya.TABLE_NAME, null, contentValues);
                break;

            default:
                throw new IllegalArgumentException("Invalid URI : " + uri);
        }

        if (result == -1){
            return null;
        } else {
            return ContentUris.withAppendedId(uri, result);
        }
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
