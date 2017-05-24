package com.autoxss.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.autoxss.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import com.autoxss.myapplication.bean.UserInfo;

/**
 * Created by Huihui on 2017/5/9.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<UserInfo> list;

    public MyAdapter(Context context, List<UserInfo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size() > 0 ? list.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.lv_item, parent, false);
        ImageView iv = (ImageView) view.findViewById(R.id.iv);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        UserInfo info = list.get(position);
        tv.setText(info.getName());
        Picasso.with(context).load(info.getImgUrl()).into(iv);
        return view;
    }
}
