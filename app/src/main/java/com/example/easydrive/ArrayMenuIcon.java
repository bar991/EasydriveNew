package com.example.easydrive;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
public class ArrayMenuIcon extends ArrayAdapter<Menuicon> {
    private Context ctx;
    private int ResourceId;
    private ArrayList<Menuicon> ary;

    public ArrayMenuIcon(@NonNull Context context, int resource, @NonNull ArrayList<Menuicon> objects) {
        super(context, resource, objects);
        this.ctx =  context;
        this.ResourceId = resource;
        this.ary =  objects;
    }

    public int getCount() {
        return    this.ary.size();
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v= null;
        LayoutInflater li= (LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView==null)
            v= li.inflate(this.ResourceId,null);
        else
            v= convertView;
        Menuicon c= this.ary.get(position);

        TextView tv1 = v.findViewById(R.id.textView9);
        tv1.setText(c.getMIName());


        ImageView tv3 = v.findViewById(R.id.imageView2);
        AssetManager as= this.ctx.getAssets();
        try{
            InputStream in= as.open("pics/"+c.getImgMI());
            ;
            Drawable dr=Drawable.createFromStream(in,null);
            tv3.setImageDrawable(dr);
        } catch (IOException e){
            e.printStackTrace();
        }
        return v;
    }
}
