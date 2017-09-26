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

public class BaratActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barat);
        ArrayList<String> dtkelas = new ArrayList<>();
        dtkelas.add("Candi");
        dtkelas.add("Prasasti");
        dtkelas.add("Pakaian Adat");
        dtkelas.add("Alat Musik");
        dtkelas.add("Makanan Khas");
        dtkelas.add("Rumah Adat");
        dtkelas.add("Kesenian Daerah");
        dtkelas.add("Senjata Daerah");



        ListView listKelas = (ListView) findViewById(R.id.activity_barat);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dtkelas);
        listKelas.setAdapter(adapter);
        listKelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(BaratActivity.this,CandiBaratActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(BaratActivity.this,PrasastiBaratActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(BaratActivity.this,PakaianBaratActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(BaratActivity.this,MusikBaratActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(BaratActivity.this,MakananBaratActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(BaratActivity.this,RumahBaratActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(BaratActivity.this,KesenianBaratActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(BaratActivity.this,SenjataBaratActivity.class));
                        break;

                }

            }
        });
    }

}






