package com.autoxss.myapplication.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Huihui on 2017/6/2.
 */
public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();

        //获取电话号
        String num = bundle.getString(Intent.EXTRA_PHONE_NUMBER);
        Log.e("HuiHui", "onReceive: " + num);
    }
}
