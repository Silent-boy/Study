package com.autoxss.myapplication.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * ������������
 *
 * @author Administrator
 */
public class HttpUtil {


    /**
     * 判断网络是否连接
     */

    public static boolean isNetworkConn(Context context) {
        boolean flag = false;

        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo info = manager.getActiveNetworkInfo();

        if (info != null) {
            return info.isConnected();
        }

        return flag;
    }

    public static byte[] getHttpResult(String path) {

        HttpURLConnection connection = null;

        ByteArrayOutputStream outputStream = null;

        try {
            URL url = new URL(path);

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.connect();

            if (connection.getResponseCode() == 200) {

                outputStream = new ByteArrayOutputStream();

                InputStream iStream = connection.getInputStream();

                byte[] buffer = new byte[1024];
                int len = 0;

                while ((len = iStream.read(buffer)) != -1) {

                    outputStream.write(buffer, 0, len);
                    outputStream.flush();
                }

                return outputStream.toByteArray();
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (connection != null) {

                connection.disconnect();
            }
            if (outputStream != null) {

                try {
                    outputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    public static Bitmap getBitmap(String path) {

        HttpURLConnection connection = null;

        ByteArrayOutputStream outputStream = null;
        Bitmap bitmap;

        try {
            URL url = new URL(path);

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.connect();

            if (connection.getResponseCode() == 200) {

                outputStream = new ByteArrayOutputStream();

                InputStream iStream = connection.getInputStream();

                bitmap = BitmapFactory.decodeStream(iStream);

                return bitmap;
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (connection != null) {

                connection.disconnect();
            }
            if (outputStream != null) {

                try {
                    outputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return null;
    }


    public static String getHttpStrResult(String path) {

        HttpURLConnection connection = null;

        try {
            URL url = new URL(path);

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.connect();

            if (connection.getResponseCode() == 200) {

                StringBuffer stringBuffer = new StringBuffer();

                InputStream iStream = connection.getInputStream();

                byte[] buffer = new byte[1024];
                int len = 0;

                while ((len = iStream.read(buffer)) != -1) {

                    stringBuffer.append(new String(buffer, 0, len));

                }

                return stringBuffer.toString();
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (connection != null) {

                connection.disconnect();
            }
        }

        return null;
    }

}
