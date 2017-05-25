package com.autoxss.myapplication.dbmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.autoxss.myapplication.database.MyDbHelper;

/**
 * Created by Huihui on 2017/5/25.
 */
public class DbManager {
    private Context context;
    private SQLiteDatabase db;
    private MyDbHelper helper;

    public DbManager(Context context) {
        this.context = context;
        helper = new MyDbHelper(context);
    }

    /**
     * 插入数据
     */
    public void insert(String name) {
        db = helper.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        db.insert("users", null, values);
    }

    /**
     * 查询数据
     */
    public Cursor query() {
        db = helper.getReadableDatabase();
        return db.query("users", null, null, null, null, null, null);
    }


}
