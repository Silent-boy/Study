package com.autoxss.myapplication.Task;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/**
 * Created by Huihui on 2017/5/24.
 */
public class HttpTask extends AsyncTask<String,Void,Bitmap>{
    @Override
    protected Bitmap doInBackground(String... params) {
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
    }
}
