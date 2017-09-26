package com.ferdians.ptlancarjaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class CandiTimurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canditimur);

        ListView listDetail = (ListView)findViewById(R.id.activity_canditimur);
        ArrayList<Budaya> dtbudaya = new ArrayList<>();
        dtbudaya.add(new Budaya("Mojokerto","Candi Bajang Ratu",R.drawable.bajangratu));
        dtbudaya.add(new Budaya("Mojokerto","Candi Tikus",R.drawable.tikus));
        dtbudaya.add(new Budaya("Mojokerto","Candi Wringin Lawang",R.drawable.wringinlawang));
        dtbudaya.add(new Budaya("Mojokerto","Candi Gentong",R.drawable.gentong));
        dtbudaya.add(new Budaya("Mojokerto","Candi Brahu",R.drawable.brahu));
        dtbudaya.add(new Budaya("Mojokerto","Candi Minak Jinggo",R.drawable.minakjinggo));
        dtbudaya.add(new Budaya("Mojokerto","Candi Bangkal",R.drawable.bangkalmjk));
        dtbudaya.add(new Budaya("Blitar","Candi Bacem",R.drawable.bacemblitar));
        dtbudaya.add(new Budaya("Malang","Candi Badut",R.drawable.badutmalang));
        dtbudaya.add(new Budaya("Tulungagung","Candi Boyolangu",R.drawable.boyolangutlgagung));
        dtbudaya.add(new Budaya("Pasuruan","Candi Belahan",R.drawable.belahanpasuruan));
        dtbudaya.add(new Budaya("Jember","Candi Deres",R.drawable.deresjember));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Dermo",R.drawable.dermosidoarjo));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Medalem",R.drawable.medalemsidoarjo));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Pamotan",R.drawable.pamotansidoarjo));
        dtbudaya.add(new Budaya("Tulungagung","Candi Penampihan",R.drawable.penampihantlgagung));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Sumur",R.drawable.sumursidoarjo));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Tawangalun",R.drawable.tawangalunsidoarjo));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Wangkal",R.drawable.wangkalsidoarjo));
        dtbudaya.add(new Budaya("Tulungagung","Candi Dadi",R.drawable.daditlgagung));
        dtbudaya.add(new Budaya("Kediri","Candi Dorok",R.drawable.dorokkediri));
        dtbudaya.add(new Budaya("Blitar","Candi Gambar Wetan",R.drawable.gambarwetanblitar));
        dtbudaya.add(new Budaya("Tulungagung","Candi Gayatri",R.drawable.gayatritlgagung));
        dtbudaya.add(new Budaya("Pasuruan","Candi Gunung Gangsir",R.drawable.gununggangsirpasuruan));
        dtbudaya.add(new Budaya("Probolinggo","Candi Jabung",R.drawable.jabungprobolinggo));
        dtbudaya.add(new Budaya("Malang","Candi Jago",R.drawable.jagomalang));
        dtbudaya.add(new Budaya("Pasuruan","Candi Jawi",R.drawable.jawipasuruan));
        dtbudaya.add(new Budaya("Blitar","Candi Kalicilik",R.drawable.kalicilikblitar));
        dtbudaya.add(new Budaya("Probolinggo","Candi Kedaton",R.drawable.kedatonprobolinggo));
        dtbudaya.add(new Budaya("Malang","Candi Kidal",R.drawable.kidalmalang));
        dtbudaya.add(new Budaya("Blitar","Candi Kotes",R.drawable.kotesblitar));
        dtbudaya.add(new Budaya("Lumajang","Candi Kunir",R.drawable.kunirlumajang));
        dtbudaya.add(new Budaya("Nganjuk","Candi Lor",R.drawable.lornganjuk));
        dtbudaya.add(new Budaya("Tulungagung","Candi Meja",R.drawable.mejatulungagung));
        dtbudaya.add(new Budaya("Tulungagung","Candi Mirigambar",R.drawable.mirigambartlgagung));
        dtbudaya.add(new Budaya("Nganjuk","Candi Ngetos",R.drawable.ngetosnganjuk));
        dtbudaya.add(new Budaya("Blitar","Candi Penataran",R.drawable.penataranblitar));
        dtbudaya.add(new Budaya("Sidoarjo","Candi Pari",R.drawable.parisidoarjo));
        dtbudaya.add(new Budaya("Blitar","Candi Plumbangan",R.drawable.plumbanganblitar));
        dtbudaya.add(new Budaya("Blitar","Candi Rambut Monte",R.drawable.rambutmonteblitar));
        dtbudaya.add(new Budaya("Jombang","Candi Rimbi",R.drawable.rimbijombang));
        dtbudaya.add(new Budaya("Malang","Candi Songgoriti",R.drawable.songgoritimalang));
        dtbudaya.add(new Budaya("Tulungagung","Candi Sanggrahan",R.drawable.sanggrahantlgagung));
        dtbudaya.add(new Budaya("Blitar","Candi Sawentar",R.drawable.sawentarblitar));
        dtbudaya.add(new Budaya("Tulungagung","Candi Selomangleng",R.drawable.selomanglengtlgagung));
        dtbudaya.add(new Budaya("Blitar","Candi Simping",R.drawable.simpingblitar));
        dtbudaya.add(new Budaya("Malang","Candi Singosari",R.drawable.singosarimlg));
        dtbudaya.add(new Budaya("Kediri","Candi Tondowongso",R.drawable.tondowongsokediri));
        dtbudaya.add(new Budaya("Malang","Candi Sumberawan",R.drawable.sumberawanmlg));
        dtbudaya.add(new Budaya("Kediri","Candi Surawana",R.drawable.surawarnakdiri));
        dtbudaya.add(new Budaya("Kediri","Candi Tegowangi",R.drawable.tegowangikediri));
        dtbudaya.add(new Budaya("Blitar","Candi Tepas",R.drawable.tepasblitar));
        dtbudaya.add(new Budaya("Blitar","Candi Wringin Branjang",R.drawable.wringinbranjangblitar));

        AdapterBudaya adapter = new AdapterBudaya(dtbudaya,this,R.color.Home);
        listDetail.setAdapter(adapter);
    }
}


