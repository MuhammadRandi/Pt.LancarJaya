package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class MakananBaratActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makananbarat);

        ListView listDetail = (ListView)findViewById(R.id.activity_makananbarat);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Bandung","Cireng ",R.drawable.cirengbdg));
        dtbudaya.add(new Budaya("Ciamis","Hayam Bekakak ",R.drawable.hayambekakakciamis));
        dtbudaya.add(new Budaya("Cirebon","Kerupuk Melarat ",R.drawable.krupukmelaratcirebon));
        dtbudaya.add(new Budaya("Cirebon","Sega Lengko ",R.drawable.segalengkocirebon));




        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
