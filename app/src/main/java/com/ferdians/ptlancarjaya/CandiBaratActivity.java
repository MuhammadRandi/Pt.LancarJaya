package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class CandiBaratActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candibarat);

        ListView listDetail = (ListView)findViewById(R.id.activity_candibarat);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Karawang","Candi Batujaya",R.drawable.batujayakarawang));
        dtbudaya.add(new Budaya("Rancaekek","Candi Bojongmenje",R.drawable.bojongmenjerancaekek));
        dtbudaya.add(new Budaya("Garut","Candi Cangkuang",R.drawable.cangkuanggarut));
        dtbudaya.add(new Budaya("Karawang","Candi Cibuaya",R.drawable.cibuayakarawang));
        dtbudaya.add(new Budaya("Ciamis","Candi Karangkamulyan",R.drawable.karangkamulyanciamis));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
