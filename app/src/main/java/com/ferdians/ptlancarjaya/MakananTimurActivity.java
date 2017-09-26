package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class MakananTimurActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanantimur);

        ListView listDetail = (ListView)findViewById(R.id.activity_makanantimur);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Mojokerto","Onde - Onde ",R.drawable.ondemjk));
        dtbudaya.add(new Budaya("Lamongan","Nasi Borana ",R.drawable.boranlmgn));
        dtbudaya.add(new Budaya("Surabaya","Rujak Cingur ",R.drawable.rujakcingursby));
        dtbudaya.add(new Budaya("Surabaya","Pecel Semanggi ",R.drawable.pecelsemanggisby));
        dtbudaya.add(new Budaya("Surabaya","Lontong Balap ",R.drawable.lontongbalapsby));
        dtbudaya.add(new Budaya("Sidoarjo","Sate Kerang ",R.drawable.satekerangsidoarjo));
        dtbudaya.add(new Budaya("Surabaya","Lontong Kupang ",R.drawable.lontongkupangsby));
        dtbudaya.add(new Budaya("Madiun","Pecel Madiun ",R.drawable.pecelmadiun));
        dtbudaya.add(new Budaya("Lamongan","Soto Lamongan ",R.drawable.sotolmgn));
        dtbudaya.add(new Budaya("Gresik","Krawu ",R.drawable.krawugrsk));
        dtbudaya.add(new Budaya("Surabaya","Rawon ",R.drawable.rawonsby));
        dtbudaya.add(new Budaya("Banyuwangi","Sego Tepong ",R.drawable.segotepongbanyuwangi));
        dtbudaya.add(new Budaya("Banyuwangi","Rujak Soto ",R.drawable.rujaksotobanyuwangi));
        dtbudaya.add(new Budaya("Banyuwangi","Pecel Rawon ",R.drawable.pecelrawonbanyuwangi));
        dtbudaya.add(new Budaya("Ponorogo","Sego Becek ",R.drawable.segobecekponorogo));
        dtbudaya.add(new Budaya("Tuban","Kare Rajungan ",R.drawable.karerajungantuban));
        dtbudaya.add(new Budaya("Lamongan","Tahu Campur ",R.drawable.tahucampurlamongan));
        dtbudaya.add(new Budaya("Kediri","Gethuk Pisang ",R.drawable.gethukpisangkediri));
        dtbudaya.add(new Budaya("Madiun","Brem ",R.drawable.bremmadiun));
        dtbudaya.add(new Budaya("Madiun","Wingko Babat ",R.drawable.wingkobabatmadiun));
        dtbudaya.add(new Budaya("Jember","Suwar Suwir ",R.drawable.suwarsuwirjember));
        dtbudaya.add(new Budaya("Jember","Proll Tape ",R.drawable.proltapejember));
        dtbudaya.add(new Budaya("Tulungagung","Jenang Syabun ",R.drawable.jenangsyabuntlgagung));
        dtbudaya.add(new Budaya("Malang","Menjes ",R.drawable.menjesmlg));
        dtbudaya.add(new Budaya("Madura","Tajin Sobih ",R.drawable.tajinsobihmadura));
        dtbudaya.add(new Budaya("Malang","Puthu Lanang ",R.drawable.puthulanangmlg));
        dtbudaya.add(new Budaya("Surabaya","Krupuk Ikan ",R.drawable.krupukikansby));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}
