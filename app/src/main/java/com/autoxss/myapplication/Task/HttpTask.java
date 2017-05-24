package com.autoxss.myapplication.Task;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.autoxss.myapplication.util.HttpUtil;

/**
 * Created by Huihui on 2017/5/24.
 */
public class HttpTask extends AsyncTask<String, Void, Bitmap> {
    private ImageView iv;

    public HttpTask(ImageView iv) {
        this.iv = iv;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        return HttpUtil.getBitmap(params[0]);
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        iv.setImageBitmap(bitmap);
    }
}
