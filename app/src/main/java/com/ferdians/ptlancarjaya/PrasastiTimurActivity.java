package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class PrasastiTimurActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prasastitimur);

        ListView listDetail = (ListView)findViewById(R.id.activity_prasastitimur);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Trenggalek","Prasasti Kamulan",R.drawable.kamulantrenggalek));
        dtbudaya.add(new Budaya("Tulungagung","Prasasti Galunggung",R.drawable.galunggungtlgagung));
        dtbudaya.add(new Budaya("Kediri","Prasasti Jaring",R.drawable.jaringkediri));
        dtbudaya.add(new Budaya("Kediri","Prasasti Panumbangan",R.drawable.panumbangankediri));
        dtbudaya.add(new Budaya("Blitar","Prasasti Talan",R.drawable.talanblitar));
        dtbudaya.add(new Budaya("Malang","Prasasti Sanggurah",R.drawable.sanggurahmalang));
        dtbudaya.add(new Budaya("Mojokerto","Prasasti Pucangan",R.drawable.pucanganmjk));
        dtbudaya.add(new Budaya("Mojokerto","Prasasti Wurare",R.drawable.wuraremjk));
        dtbudaya.add(new Budaya("Kediri","Prasasti Mula Malurung",R.drawable.mulamalurungkediri));
        dtbudaya.add(new Budaya("Malang","Prasasti Manjusri",R.drawable.manjusrimlg));

    AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
    listDetail.setAdapter(adapter);
}
}
