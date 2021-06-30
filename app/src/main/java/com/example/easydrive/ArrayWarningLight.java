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

public class  ArrayWarningLight extends ArrayAdapter<WarningLights> {
    private    Context ctx;
    private int ResourceId;
    private ArrayList<WarningLights> ary;

    public ArrayWarningLight(@NonNull Context context, int resource, @NonNull ArrayList<WarningLights> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.ResourceId = resource;
        this.ary = objects;
    }


    @Override
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
WarningLights c= this.ary.get(position);

        TextView tv1 = v.findViewById(R.id.WarningLightName);
        tv1.setText(c.getWLName());
        TextView tv2 = v.findViewById(R.id.WarningLightType);
        tv2.setText(c.getWLtype());
        ImageView tv3 = v.findViewById(R.id.imageView);
        AssetManager as= this.ctx.getAssets();
        try{
            InputStream in= as.open("pics/"+c.getImgWL());
;
            Drawable dr=Drawable.createFromStream(in,null);
            tv3.setImageDrawable(dr);
         } catch (IOException e){
            e.printStackTrace();
        }
        return v;
    }
}
