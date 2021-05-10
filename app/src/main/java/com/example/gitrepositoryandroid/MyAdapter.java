package com.example.gitrepositoryandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Animal> arrayList;
    private TextView name,age,race,weight;

    public MyAdapter(Context context, ArrayList<Animal> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        name = convertView.findViewById(R.id.name);
        age = convertView.findViewById(R.id.age);
        race = convertView.findViewById(R.id.race);
        weight = convertView.findViewById(R.id.weight);
        name.setText("> " + arrayList.get(position).getName());
        age.setText(arrayList.get(position).getAge());
        race.setText(arrayList.get(position).getRace());
        weight.setText(arrayList.get(position).getWeight());

        return convertView;

    }
}
