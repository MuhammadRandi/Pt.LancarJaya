package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class MusikBaratActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musikbarat);

        ListView listDetail = (ListView)findViewById(R.id.activity_musikbarat);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Angklung",R.drawable.angklung));
        dtbudaya.add(new Budaya("Arumba",R.drawable.arumba));
        dtbudaya.add(new Budaya("Calung",R.drawable.calung));
        dtbudaya.add(new Budaya("Celempung",R.drawable.celempung));
        dtbudaya.add(new Budaya("Karinding",R.drawable.karinding));
        dtbudaya.add(new Budaya("Suling",R.drawable.suling1));
        dtbudaya.add(new Budaya("Kacapi",R.drawable.kecapi));
        dtbudaya.add(new Budaya("Rebab",R.drawable.rebab));
        dtbudaya.add(new Budaya("Tarawangsa",R.drawable.tarawangsa));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
