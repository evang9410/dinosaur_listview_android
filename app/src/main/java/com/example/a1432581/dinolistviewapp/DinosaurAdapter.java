package com.example.a1432581.dinolistviewapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 1432581 on 10/19/2016.
 */
public class DinosaurAdapter extends ArrayAdapter<Dinosaur> {
    private Context context;
    private int layoutResourceId;
    Dinosaur[] data = null;

    public DinosaurAdapter(Context c, int id, Dinosaur[] data){
        super(c,id,data);
        this.context = c;
        this.layoutResourceId = id;
        this.data = data;
    }
    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        View row = convertView;
        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId,parent,false);
            holder = new Holder();
            holder.img = (ImageView)row.findViewById(R.id.dino_icon);
            holder.tv = (TextView)row.findViewById(R.id.dino_name);
            row.setTag(holder);
        }
        else{
            holder = (Holder)row.getTag();
        }

        Dinosaur dino = data[position];
        holder.tv.setText(dino.getName());
        holder.img.setImageResource(dino.getDrawable());

        return row;

    }
}
