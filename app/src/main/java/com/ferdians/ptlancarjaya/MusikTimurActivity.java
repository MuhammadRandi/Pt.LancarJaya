package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class MusikTimurActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiktimur);

        ListView listDetail = (ListView)findViewById(R.id.activity_musiktimur);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Angklung Reog",R.drawable.angklungreogjatim));
        dtbudaya.add(new Budaya("Terompet Reog",R.drawable.saronenjatim));
        dtbudaya.add(new Budaya("Saronen",R.drawable.terompetreogjatim));
        dtbudaya.add(new Budaya("Gamelan",R.drawable.gamelan));
        dtbudaya.add(new Budaya("Bonang",R.drawable.bonang1));
        dtbudaya.add(new Budaya("Kendang",R.drawable.kendang));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
