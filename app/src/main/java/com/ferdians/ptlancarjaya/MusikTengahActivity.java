package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class MusikTengahActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiktengah);

        ListView listDetail = (ListView)findViewById(R.id.activity_musiktengah);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Kendang",R.drawable.kendang));
        dtbudaya.add(new Budaya("Bonang",R.drawable.bonang1));
        dtbudaya.add(new Budaya("Gong",R.drawable.gong));
        dtbudaya.add(new Budaya("Siter",R.drawable.siter));
        dtbudaya.add(new Budaya("Gambang",R.drawable.gambang));
        dtbudaya.add(new Budaya("Saron",R.drawable.saron));
        dtbudaya.add(new Budaya("Kenong",R.drawable.kenong));
        dtbudaya.add(new Budaya("Slenthem",R.drawable.slenthem));
        dtbudaya.add(new Budaya("Suling",R.drawable.suling1));
        dtbudaya.add(new Budaya("Demung",R.drawable.demung));


        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
