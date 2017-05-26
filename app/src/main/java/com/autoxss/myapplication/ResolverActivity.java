package com.autoxss.myapplication;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResolverActivity extends AppCompatActivity {

    private ListView lv;
    private ContentResolver contentResolver;
    private Uri uri = CallLog.Calls.CONTENT_URI;
    private String[] coumns = new String[]{CallLog.Calls._ID, CallLog.Calls.NUMBER, CallLog.Calls.DATE};
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private List<Map<String, Object>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resolver);
        lv = ((ListView) findViewById(R.id.lv));
        getData();
    }

    private void getData() {
        list = new ArrayList<>();
        contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(uri, coumns, null, null, null);
        while (cursor.moveToNext()) {
            Map<String, Object> map = new HashMap<String, Object>();
            long id = cursor.getLong(cursor.getColumnIndex(CallLog.Calls._ID));
            String number = cursor.getString(cursor.getColumnIndex(CallLog.Calls.NUMBER));
            long date = cursor.getLong(cursor.getColumnIndex(CallLog.Calls.DATE));
            map.put("id", id);
            map.put("number", number);
            map.put("date", format.format(date));
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.lv_call_item,
                new String[]{"number", "date"}, new int[]{R.id.tv_number, R.id.tv_date});
        lv.setAdapter(adapter);
    }


}
