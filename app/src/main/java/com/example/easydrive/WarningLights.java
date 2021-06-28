package com.example.easydrive;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class WarningLights {
    private ImageView L;
    private String ImgWL;
    private String WLName;
    private String WLtype;
    private String Adress;
    public WarningLights(String imgWL, String WLName, String WLtype, String Adress) {
        this.ImgWL = imgWL;
        this.WLName = WLName;
        this.WLtype = WLtype;
        this.Adress= Adress;
    }
    public WarningLights(String imgWL, String WLName, String WLtype) {
        this.ImgWL = imgWL;
        this.WLName = WLName;
        this.WLtype = WLtype;
    }
    public WarningLights(){}
    public WarningLights(ImageView L, String WLName, String WLtype) {
        this.L =L;
        this.WLName = WLName;
        this.WLtype = WLtype;
    }

    public ImageView getL() {
        return L;
    }

    public String getImgWL() {
        return ImgWL;
    }

    public void setImgWL(String imgWL) {
        ImgWL = imgWL;
    }

    public String getWLName() {
        return WLName;
    }

    public void setWLName(String WLName) {
        this.WLName = WLName;
    }

    public String getWLtype() {
        return WLtype;
    }

    public void setWLtype(String WLtype) {
        this.WLtype = WLtype;
    }

    @Override
    public String toString() {
        return "WarningLights{" +
                "ImgWL='" + ImgWL + '\'' +
                ", WLName='" + WLName + '\'' +
                ", WLtype='" + WLtype + '\'' +
                '}';
    }
}
