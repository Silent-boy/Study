package com.autoxss.myapplication.util;

import com.autoxss.myapplication.bean.Shop;
import com.autoxss.myapplication.bean.ShopDetail;
import com.autoxss.myapplication.bean.Suites;
import com.autoxss.myapplication.bean.Ware;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huihui on 2017/5/10.
 */
public class ParseJson {

    public static Shop getShopInfo(String json) {
        Shop shop = null;
        List<String> positions;
        List<Suites> suiteList;
        List<Ware> wareList;
        ShopDetail shopDetail;
        Suites suites;
        Ware ware;
        try {
            JSONObject object = new JSONObject(json);
            JSONObject sDetailObject = object.getJSONObject("shop_detail");
            /**
             *  private String id;
             private String name;
             private String phone;
             private String city;
             private List<String> positions;
             */
            String id = sDetailObject.getString("id");
            String name = sDetailObject.getString("name");
            String phone = sDetailObject.getString("phone");
            String city = sDetailObject.getString("city");
            JSONArray positionList = sDetailObject.getJSONArray("position");
            positions = new ArrayList<>();
            for (int i = 0; i < positionList.length(); i++) {
                positions.add(positionList.getString(i));
            }
            String comments_count = sDetailObject.getString("comments_count");
            JSONArray suitesArray = sDetailObject.getJSONArray("suites");
            suiteList = new ArrayList<>();
            for (int i = 0; i < suitesArray.length(); i++) {
                JSONObject suiteObject = suitesArray.getJSONObject(i);
                String sid = suiteObject.getString("id");
                String sname = suiteObject.getString("name");
                String price = suiteObject.getString("origin_price");
                JSONArray wareArray = suiteObject.getJSONArray("wares");
                wareList = new ArrayList<>();
                for (int j = 0; j < wareArray.length(); j++) {
                    JSONObject wareObject = wareArray.getJSONObject(j);
                    String wname = wareObject.getString("name");
                    String sale_price = wareObject.getString("sale_price");
                    ware = new Ware(sale_price, wname);
                    wareList.add(ware);
                }
                suites = new Suites(sid, sname, price, wareList);
                suiteList.add(suites);
            }
            shopDetail = new ShopDetail(id, name, phone, city, positions);
            shop = new Shop(shopDetail, comments_count, suiteList);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return shop;
    }
}
