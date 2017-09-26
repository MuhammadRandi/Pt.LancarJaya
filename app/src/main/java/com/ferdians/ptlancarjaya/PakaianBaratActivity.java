package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class PakaianBaratActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaianbarat);

        ListView listDetail = (ListView)findViewById(R.id.activity_pakaianbarat);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Mayoritas Pakaian pengantin di Jawa Barat","Baju Pengantin",R.drawable.pengantinsunda));
        dtbudaya.add(new Budaya("Mayoritas Pakaian Adat di Jawa Barat","Baju Adat",R.drawable.sunda));
        dtbudaya.add(new Budaya("Mayoritas Pakaian Remaja di Jawa Barat","Baju Mojang & Jejaka ",R.drawable.mojangjejaka));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
