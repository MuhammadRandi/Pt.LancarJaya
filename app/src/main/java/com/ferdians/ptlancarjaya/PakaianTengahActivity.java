package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 16/03/2017.
 */

public class PakaianTengahActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaiantengah);

        ListView listDetail = (ListView)findViewById(R.id.activity_pakaiantengah);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Mayoritas Pakaian pengantin di Jawa Timur & Jawa Tengah","Baju Pengantin",R.drawable.mantenanjawajateng));
        dtbudaya.add(new Budaya("Mayoritas Pakaian Remaja di Jawa Timur & Jawa Tengah","Baju Gus & Yuk ",R.drawable.gusyukjawajateng));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
