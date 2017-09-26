package com.ferdians.ptlancarjaya;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by User on 15/03/2017.
 */

public class AdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        // Setup FAB to open EditorActivity
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminActivity.this, EditorActivity.class);
                startActivity(intent);
            }
        });
    }

    private void  displayInfo(){
        Cursor c = getContentResolver().query(BudayaContract.budaya.CONTENT_URI, null, null, null, null);

        StringBuilder builder =  new StringBuilder();
        while(c.moveToNext()) {
            builder.append(c.getString(c.getColumnIndex(BudayaContract.budaya._ID))).append(" - ");
            builder.append(c.getString(c.getColumnIndex(BudayaContract.budaya.COLUMN_NAME))).append(" - ");
            builder.append(c.getString(c.getColumnIndex(BudayaContract.budaya.COLUMN_BREED))).append("\n");
        }

        TextView info = (TextView) findViewById(R.id.text_view_pet);
        info.setText("Number of Pets : " + c.getCount() + "\n\n" + builder.toString());
        c.close();
    }

    private void insertData(){

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(BudayaContract.budaya.COLUMN_NAME, "Toto");
        values.put(BudayaContract.budaya.COLUMN_BREED, "Terrier");
        values.put(BudayaContract.budaya.COLUMN_GENDER, 0);
        values.put(BudayaContract.budaya.COLUMN_WEIGHT, 13);

        getContentResolver().insert(BudayaContract.budaya.CONTENT_URI, values);
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayInfo();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Insert dummy data" menu option
            case R.id.action_insert_dummy_data:
                insertData();
                displayInfo();
                return true;
            // Respond to a click on the "Delete all entries" menu option
            case R.id.action_delete_all_entries:
                // Do nothing for now
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
