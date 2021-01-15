package com.example.easydrive;

public class WarningLights {

    private String ImgWL;
    private String WLName;
    private String WLtype;

    public WarningLights(String imgWL, String WLName, String WLtype) {
        this.ImgWL = imgWL;
        this.WLName = WLName;
        this.WLtype = WLtype;
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
