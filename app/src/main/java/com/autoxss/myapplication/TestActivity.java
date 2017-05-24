package com.autoxss.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.autoxss.myapplication.bean.UserInfo;

public class TestActivity extends AppCompatActivity {

    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tv_test = ((TextView) findViewById(R.id.tv_test));
//        String str = getIntent().getStringExtra("value");
//        tv_test.setText(str);
        UserInfo userInfo = (UserInfo) getIntent().getSerializableExtra("value");
        tv_test.setText("第二个页面");
        tv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("HuiHui", "onStart: " + "第二个页面");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("HuiHui", "onResume: " + "第二个页面");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("HuiHui", "onPause: " + "第二个页面");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("HuiHui", "onStop: " + "第二个页面");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("HuiHui", "onRestart: " + "第二个页面");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("HuiHui", "onDestroy: " + "第二个页面");
    }
}
