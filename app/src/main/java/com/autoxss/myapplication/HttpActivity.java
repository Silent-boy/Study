package com.autoxss.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.autoxss.myapplication.Task.HttpTask;

public class HttpActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
        iv = ((ImageView) findViewById(R.id.iv));
    }

    public void click(View v) {
        HttpTask task = new HttpTask(iv);
        task.execute("http://img.zcool.cn/community/01bf1655e514b16ac7251df840273f.jpg");
    }
}
