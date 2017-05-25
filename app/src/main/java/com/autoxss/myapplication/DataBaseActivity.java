package com.autoxss.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.autoxss.myapplication.dbmanager.DbManager;

public class DataBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_name;
    private Button btn_insert;
    private Button btn_query;
    private DbManager manager;
    private TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);
        initView();
    }

    private void initView() {
        et_name = ((EditText) findViewById(R.id.et_name));
        btn_insert = ((Button) findViewById(R.id.btn_insert));
        btn_query = ((Button) findViewById(R.id.btn_query));
        tv_name = ((TextView) findViewById(R.id.tv_name));
        btn_insert.setOnClickListener(this);
        btn_query.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_insert:
                manager = new DbManager(DataBaseActivity.this);
                manager.insert(et_name.getText().toString());
                break;
            case R.id.btn_query:
                manager = new DbManager(DataBaseActivity.this);
                Cursor cursor = manager.query();
                while (cursor.moveToNext()) {
                    String name = cursor.getString(cursor.getColumnIndex("name"));
                    tv_name.setText(name);
                }
                break;
        }
    }
}
