package com.ferdians.ptlancarjaya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 15/03/2017.
 */

public class AdapterBudaya extends BaseAdapter {
    private ArrayList<Budaya> dtbudaya;
    private Context mContext;
    private int mColorResource;

    public AdapterBudaya(ArrayList<Budaya> dtbudaya, Context mContext, int mColorResource) {
        this.dtbudaya = dtbudaya;
        this.mContext = mContext;
        this.mColorResource = mColorResource;
    }

    @Override
    public int getCount() {
        return dtbudaya.size();
    }

    @Override
    public Budaya getItem(int position) {
        return dtbudaya.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater)
                    mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item,parent,false);
        }
        LinearLayout linear = (LinearLayout)convertView.findViewById(R.id.basic);
        TextView tvNama = (TextView) convertView.findViewById(R.id.nama);
        TextView tvNim = (TextView) convertView.findViewById(R.id.nim);
        ImageView ivFoto = (ImageView)convertView.findViewById(R.id.fotosiswa);

        linear.setBackgroundResource(mColorResource);
        tvNama.setText(getItem(position).getNama());
        tvNim.setText(getItem(position).getNim());
        ivFoto.setImageResource(getItem(position).getmImageResource());


        return convertView;
    }
}



