package com.example.easydrive;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


import java.util.ArrayList;

public class Dal extends SQLiteAssetHelper {
    public Dal(Context context) {

        super(context, "dbmdata.db", null, 1);
    }

    public void addMenuicon(String ImgMI, String MIName) {


        SQLiteDatabase db = getWritableDatabase();
        String sql_INSERT = "INSERT INTO mdata_tbi (ImgMI ,MIName) values(?,?)";
        SQLiteStatement statment = db.compileStatement(sql_INSERT);

        statment.bindString(1, ImgMI);
        statment.bindString(2, MIName);

        statment.execute();
    }

    public void addwarningalert(String img, String name, String type ) {


        SQLiteDatabase db1 = getWritableDatabase();
        String sql_INSERT2 = "INSERT INTO warning_alert (img,name ,type) values(?,?,?)";
        SQLiteStatement statment1 = db1.compileStatement(sql_INSERT2);

        statment1.bindString(1, img);
        statment1.bindString(2,name);
        statment1.bindString(3, type);


        statment1.execute();
    }
    public void addUser(String name, String password, String email, String phoneNum) {


        SQLiteDatabase db1 = getWritableDatabase();
        String sql_INSERT2 = "INSERT INTO Users_tbi (name ,password,email,phoneNum) values(?,?,?,?)";
        SQLiteStatement statment1 = db1.compileStatement(sql_INSERT2);

        statment1.bindString(1, name);
        statment1.bindString(2, password);
        statment1.bindString(3, email);
        statment1.bindString(4, phoneNum);

        statment1.execute();
    }

    public ArrayList<User> getAllUsers() {
        ArrayList<User> ary1 = new ArrayList<>();

        String st = "select * from Users_tbi";
        SQLiteDatabase db = getWritableDatabase();

        Cursor cursor = db.rawQuery(st, null);
        while (cursor.moveToNext()) {
            User u = new User();
            u.setName((cursor.getString(cursor.getColumnIndex("name"))));
            u.setPassword(cursor.getString(cursor.getColumnIndex("password")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("phoneNum")));



            ary1.add(u);
        }
        return ary1;

    }

    public Boolean checkUps(String name, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from Users_tbi where name = ? and password = ?", new String[]{name, password});
        if (cursor.getCount() > 0) return true;
        return false;
    }
    public int getcnt() {

        String st = "select * from android_metadata";
        SQLiteDatabase db = getWritableDatabase();
if ((st.equals("")))
    return 0;
else
    return 1;


        }

    public ArrayList<Menuicon> getAllMenuicon() {
        ArrayList<Menuicon> ary = new ArrayList<>();

        String st = "select * from mdata_tbi";
        SQLiteDatabase db = getWritableDatabase();

        Cursor cursor = db.rawQuery(st, null);
        while (cursor.moveToNext()) {
            Menuicon c = new Menuicon();
            c.setImgMI((cursor.getString(cursor.getColumnIndex("imgMI"))));
            c.setMIName(cursor.getString(cursor.getColumnIndex("MIName")));


            ary.add(c);
        }
        return ary;
    }
        public ArrayList<WarningLights> getAllalert() {
            ArrayList<WarningLights> ary1 = new ArrayList<>();

            String st1 = "select * from warning_alert";
            SQLiteDatabase db = getWritableDatabase();

            Cursor cursor = db.rawQuery(st1, null);
            while (cursor.moveToNext()) {
                WarningLights c = new WarningLights();
                c.setImgWL((cursor.getString(cursor.getColumnIndex("img"))));
                c.setWLName(cursor.getString(cursor.getColumnIndex("name")));
                c.setWLtype(cursor.getString(cursor.getColumnIndex("type")));


                ary1.add(c);
            }
            return ary1;

    }


    }

