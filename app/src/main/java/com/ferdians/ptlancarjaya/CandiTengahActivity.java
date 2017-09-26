package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class CandiTengahActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canditengah);

        ListView listDetail = (ListView)findViewById(R.id.activity_canditengah);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Wonosobo","Candi Arjuna",R.drawable.arjunawonosobo));
        dtbudaya.add(new Budaya("Magelang","Candi Asu",R.drawable.asumagelang));
        dtbudaya.add(new Budaya("Magelang","Candi Banon",R.drawable.banonmagelang));
        dtbudaya.add(new Budaya("Dieng","Candi Bima",R.drawable.bimadieng));
        dtbudaya.add(new Budaya("Klaten","Candi Bubrah",R.drawable.bubrahklaten));
        dtbudaya.add(new Budaya("Magelang","Candi Canggal",R.drawable.canggalmagelang));
        dtbudaya.add(new Budaya("Salatiga","Candi Dukuh",R.drawable.dukuhsalatiga));
        dtbudaya.add(new Budaya("Dieng","Candi Kahuripan",R.drawable.kahuripandieng));
        dtbudaya.add(new Budaya("Magelang","Candi Pendem",R.drawable.pendemmagelang));
        dtbudaya.add(new Budaya("Magelang","Candi Selogriyo",R.drawable.selogriyomagelang));
        dtbudaya.add(new Budaya("Magelang","Candi Umbul",R.drawable.umbulmagelang));
        dtbudaya.add(new Budaya("Dieng","Candi Gatotkaca",R.drawable.gatotdieng));
        dtbudaya.add(new Budaya("Semarang","Candi Gedong Songo",R.drawable.gedongsongosemarang));
        dtbudaya.add(new Budaya("Magelang","Candi Gunung Wukir",R.drawable.gunungwukirmagelang));
        dtbudaya.add(new Budaya("Magelang","Candi Gunung Sari",R.drawable.gunungsarimagelang));
        dtbudaya.add(new Budaya("Klaten","Candi Karangnongko",R.drawable.karangnongkoklaten));
        dtbudaya.add(new Budaya("Karanganyar","Candi Kethek",R.drawable.kethekkaranganyar));
        dtbudaya.add(new Budaya("Temanggung","Candi Liyangan",R.drawable.liyangantemanggung));
        dtbudaya.add(new Budaya("Magelang","Candi Losari",R.drawable.losarimagelang));
        dtbudaya.add(new Budaya("Magelang","Candi Lumbung",R.drawable.lumbungmagelang));
        dtbudaya.add(new Budaya("Magelang","Candi Mendut",R.drawable.menudtmagelang));
        dtbudaya.add(new Budaya("Klaten","Candi Merak",R.drawable.merakklaten));
        dtbudaya.add(new Budaya("Magelang","Candi Ngawen",R.drawable.ngawenmagelang));
        dtbudaya.add(new Budaya("Semarang","Candi Ngempon",R.drawable.ngemponsemarang));
        dtbudaya.add(new Budaya("Semarang","Candi Pawon",R.drawable.pawonsemarang));
        dtbudaya.add(new Budaya("Klaten","Candi Plaosan",R.drawable.plaosanklaten));
        dtbudaya.add(new Budaya("Semarang","Candi Pringapus",R.drawable.priingapussemarang));
        dtbudaya.add(new Budaya("Klaten","Candi Sewu",R.drawable.sewuklaten));
        dtbudaya.add(new Budaya("Klaten","Candi Sojiwan",R.drawable.sojiwanklaten));
        dtbudaya.add(new Budaya("Solo","Candi Sukuh",R.drawable.sukuhsolo));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
