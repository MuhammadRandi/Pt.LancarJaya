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

public class TimurActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timur);
        ArrayList<String> dtkelas = new ArrayList<>();
        dtkelas.add("Candi");
        dtkelas.add("Prasasti");
        dtkelas.add("Pakaian Adat");
        dtkelas.add("Alat Musik");
        dtkelas.add("Makanan Khas");
        dtkelas.add("Rumah Adat");
        dtkelas.add("Kesenian Daerah");
        dtkelas.add("Senjata Daerah");



        ListView listKelas = (ListView) findViewById(R.id.activity_timur);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dtkelas);
        listKelas.setAdapter(adapter);
        listKelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(TimurActivity.this,CandiTimurActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(TimurActivity.this,PrasastiTimurActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(TimurActivity.this,PakaianTimurActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(TimurActivity.this,MusikTimurActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(TimurActivity.this,MakananTimurActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(TimurActivity.this,RumahTimurActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(TimurActivity.this,KesenianTimurActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(TimurActivity.this,SenjataTimurActivity.class));
                        break;

                }

            }
        });
    }

}





