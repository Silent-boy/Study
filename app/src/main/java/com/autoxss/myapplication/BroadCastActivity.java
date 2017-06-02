package com.autoxss.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BroadCastActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        btn = ((Button) findViewById(R.id.btn));
        btn.setOnClickListener(this);
//        IntentFilter filter = new IntentFilter();
//        filter.setPriority(100);
//        filter.addAction("com.autoxss.myapplication..receiver.mybroadcastreceiver");
//        registerReceiver(new MyBroadCastReceiver(), filter);
    }

    @Override
    public void onClick(View v) {
//        Intent intent = new Intent();
//        // intent.setAction("com.autoxss.myapplication..receiver.mybroadcastreceiver");
//        intent.putExtra("value", "我是广播发送的");
////        sendBroadcast(intent);
//        sendOrderedBroadcast(intent, null);
    }
}
