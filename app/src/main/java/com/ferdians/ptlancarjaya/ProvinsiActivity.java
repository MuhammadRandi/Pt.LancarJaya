package com.ferdians.ptlancarjaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class ProvinsiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi);
        ArrayList<String> dtkelas = new ArrayList<>();
        dtkelas.add("Jawa Timur");
        dtkelas.add("Jawa Tengah");
        dtkelas.add("Jawa Barat");

        ListView listKelas = (ListView) findViewById(R.id.activity_provinsi);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dtkelas);
        listKelas.setAdapter(adapter);
        listKelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(ProvinsiActivity.this,TimurActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(ProvinsiActivity.this,TengahActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(ProvinsiActivity.this,BaratActivity.class));
                        break;

                }

            }
        });
    }

}



