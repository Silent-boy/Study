package com.autoxss.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.FileOutputStream;

public class StorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
        saveData();
        getData();
        saveOwnerData("内部数据存储");
    }

    /**
     * 内部数据存储
     *
     * @param content
     */
    private void saveOwnerData(String content) {
        try {
            FileOutputStream fos = openFileOutput("user.txt", MODE_PRIVATE);
            fos.write(content.getBytes());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 取出数据
     */
    private void getData() {
        SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
        String userName = sp.getString("userName", null);
    }

    /**
     * 存储数据方式
     */
    private void saveData() {
        SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("userName", "1234456");
        editor.commit();
    }


}
