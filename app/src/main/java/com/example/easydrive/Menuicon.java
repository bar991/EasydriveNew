package com.example.easydrive;

import android.content.Context;

import java.util.ArrayList;

public class Menuicon {
    private String ImgMI;
    private String MIName;

    public Menuicon(String imgMI, String MIName) {
        ImgMI = imgMI;
        this.MIName = MIName;
    }
    public Menuicon(){}



    public String getImgMI() {
        return ImgMI;
    }

    public void setImgMI(String imgMI) {
        ImgMI = imgMI;
    }

    public String getMIName() {
        return MIName;
    }

    public void setMIName(String MIName) {
        this.MIName = MIName;
    }

    @Override
    public String toString() {
        return "Menuicon{" +
                "ImgMI='" + ImgMI + '\'' +
                ", MIName='" + MIName + '\'' +
                '}';
    }
}
