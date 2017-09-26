package com.ferdians.ptlancarjaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> dtkelas = new ArrayList<>();
        dtkelas.add("Home");
        dtkelas.add("Provinsi");
        dtkelas.add("About Us");
        dtkelas.add("Admin");
        ListView listKelas = (ListView) findViewById(R.id.activity_main);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dtkelas);
        listKelas.setAdapter(adapter);
        listKelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this,HomeActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,ProvinsiActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,DeveloperActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,AdminActivity.class));
                        break;

                }

            }
        });
    }

}

