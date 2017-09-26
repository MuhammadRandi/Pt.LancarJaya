package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class PrasastiTengahActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prasastitengah);

        ListView listDetail = (ListView)findViewById(R.id.activity_prasastitengah);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Magelang","Prasasti Canggal",R.drawable.canggal2magelang));
        dtbudaya.add(new Budaya("Magelang","Prasasti Kelurak",R.drawable.kelurakmagelang));
        dtbudaya.add(new Budaya("Magelang","Prasasti Mantyasih",R.drawable.mantyasihmagelang));
        dtbudaya.add(new Budaya("Batang","Prasasti Sojomerto",R.drawable.sojomertobatang));
        dtbudaya.add(new Budaya("Salatiga","Prasasti Plumpungan",R.drawable.plumpungansalatiga));
        dtbudaya.add(new Budaya("Tumenggung","Prasasti Gondosuli",R.drawable.gondosulitemanggung));
        dtbudaya.add(new Budaya("Tumenggung","Prasasti Kayumwungan",R.drawable.kayumwungantumengung));
        dtbudaya.add(new Budaya("Sragen","Prasasti Sankhara",R.drawable.sankharasragen));
        dtbudaya.add(new Budaya("Tumenggung","Prasasti Tri Tepusan",R.drawable.tritepusantemanggung));
        dtbudaya.add(new Budaya("Sleman","Prasasti Kalasan",R.drawable.kalasansleman));
        dtbudaya.add(new Budaya("Salatiga","Prasasti Ngadoman",R.drawable.ngadomansalatiga));
        dtbudaya.add(new Budaya("Magelang","Prasasti Tukmas",R.drawable.tukmasmagelang));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
