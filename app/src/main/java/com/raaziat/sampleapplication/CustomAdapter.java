package com.raaziat.sampleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] countryList = new String[]{"Pakistan", "Italy", "Germany", "France", "Italy", "Germany", "France", "Italy", "Germany", "France"};
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext) {
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.item_view, null);
        TextView textView = convertView.findViewById(R.id.txtView_heading);
        textView.setText(countryList[position]);
        return convertView;
    }
}
