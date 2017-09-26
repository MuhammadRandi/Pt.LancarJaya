package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class PrasastiBaratActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prasastibarat);

        ListView listDetail = (ListView)findViewById(R.id.activity_prasastibarat);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Bogor","Prasasti Kebon Kopi",R.drawable.kebonkopibogor));
        dtbudaya.add(new Budaya("Bekasi","Prasasti Tugu",R.drawable.tugubekasi));
        dtbudaya.add(new Budaya("Banten","Prasasti Lebak",R.drawable.lebakbogor));
        dtbudaya.add(new Budaya("Bogor","Prasasti Ciaruteun",R.drawable.ciaruteunbogor));
        dtbudaya.add(new Budaya("Bogor","Prasasti Muara Cianten",R.drawable.muaraciantenbogor));
        dtbudaya.add(new Budaya("Bogor","Prasasti Jambu",R.drawable.jambubogor));
        dtbudaya.add(new Budaya("Bogor","Prasasti Pasir Awi",R.drawable.pasirawibogor));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
