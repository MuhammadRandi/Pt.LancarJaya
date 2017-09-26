package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class MakananTengahActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanantengah);

        ListView listDetail = (ListView)findViewById(R.id.activity_makanantengah);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Semarang","Lumpia ",R.drawable.lumpiasmrg));
        dtbudaya.add(new Budaya("Semarang","Tahu Petis ",R.drawable.tahupetissmrg));
        dtbudaya.add(new Budaya("Brebes","Telor Asin ",R.drawable.telurasinbrebes));
        dtbudaya.add(new Budaya("Purwokerto","Tempe Mendoan ",R.drawable.tempemendoanpurwokerto));
        dtbudaya.add(new Budaya("Salatiga","Enting - enting Gepuk ",R.drawable.entingentinggepuksalatiga));
        dtbudaya.add(new Budaya("Pati","Nasi Gandul ",R.drawable.nasigandulpati));
        dtbudaya.add(new Budaya("Solo","Liwet ",R.drawable.liwetsolo));
        dtbudaya.add(new Budaya("Jepara","Rondho Royal ",R.drawable.rondhoroyaljepara));
        dtbudaya.add(new Budaya("Kudus","Soto Kudus ",R.drawable.sotokudus));
        dtbudaya.add(new Budaya("Magelang","Mangutbeong ",R.drawable.mangutbeongmagelang));
        dtbudaya.add(new Budaya("Cilacap","Brekecek ",R.drawable.brekecekcilacap));
        dtbudaya.add(new Budaya("Magelang","Grombyang ",R.drawable.grombyangpemalang));
        dtbudaya.add(new Budaya("Banyumas","Gethuk Goreng ",R.drawable.getukgorengbanyumas));
        dtbudaya.add(new Budaya("Kudus","Jenang Kudus ",R.drawable.jenangkudus));
        dtbudaya.add(new Budaya("Wonosobo","Mie Ongklok ",R.drawable.mieongklokwonosobo));
        dtbudaya.add(new Budaya("Semarang","Garang Asem ",R.drawable.garangasemsemarang));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
