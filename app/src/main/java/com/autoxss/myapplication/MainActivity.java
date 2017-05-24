package com.autoxss.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.autoxss.myapplication.adapter.MyAdapter;
import com.autoxss.myapplication.bean.UserInfo;
import com.autoxss.myapplication.bean.Ware;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lv;
    //private ArrayAdapter arrayAdapter;
    private List<UserInfo> userInfos;
    private MyAdapter adapter;
    private Ware ware;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        initList();
        initAdapter();
        ware = new Ware("100", "大保养");
        Log.e("HuiHui", "onCreate: " + "第一个页面");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("HuiHui", "onResume: " + "第一个页面");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("HuiHui", "onStart: " + "第一个页面");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("HuiHui", "onPause: " + "第一个页面");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("HuiHui", "onStop: " + "第一个页面");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("HuiHui", "onRestart: " + "第一个页面");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("HuiHui", "onDestroy: " + "第一个页面");
    }

    private void initList() {
        userInfos = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String url = "http://img1.imgtn.bdimg.com/it/u=1794894692,1423685501&fm=23&gp=0.jpg";
            String name = "张三" + i;
            UserInfo userInfo = new UserInfo(url, name);
            userInfos.add(userInfo);
        }

    }


    private void initAdapter() {
        adapter = new MyAdapter(this, userInfos);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, TestActivity.class);
        intent.putExtra("value",userInfos.get(position));
        startActivity(intent);
    }
}
