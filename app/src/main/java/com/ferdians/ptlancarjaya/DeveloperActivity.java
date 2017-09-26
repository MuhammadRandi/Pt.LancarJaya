package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class DeveloperActivity extends AppCompatActivity {
 int[] gambar=
    {
        R.drawable.edo,
        R.drawable.glo,
        R.drawable.hildan,
        R.drawable.randi

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        ListView listDetail = (ListView)findViewById(R.id.activity_developer);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("6706154192","Ferdiansyah Edo Setiawan",gambar[0]));
        dtbudaya.add(new Budaya("6706154166","Gloria Ruth Henisa Manurung",gambar[1]));
        dtbudaya.add(new Budaya("6706154102","Hildan Fawwaz Naufal",gambar[2]));
        dtbudaya.add(new Budaya("6706154182","Muhammad Randi",gambar[3]));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Developer);
        listDetail.setAdapter(adapter);
    }
}
