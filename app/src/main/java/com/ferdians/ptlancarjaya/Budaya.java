package com.ferdians.ptlancarjaya;

/**
 * Created by User on 15/03/2017.
 */

public class Budaya {
    private String nim;
    private String nama;
    private int mImageResource;

    public Budaya(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    public Budaya(String nim,int mImageResource){
        this.nim = nim;
        this.mImageResource = mImageResource;
    }
    public Budaya(String nim){
        this.nim = nim;
    }

    public Budaya(String nim, String nama, int mImageResource) {
        this.nim = nim;
        this.nama = nama;
        this.mImageResource = mImageResource;

    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }
}

