package com.autoxss.myapplication.bean;

import java.util.List;

/**
 * Created by Huihui on 2017/5/10.
 */
public class ShopDetail {
    private String id;
    private String name;
    private String phone;
    private String city;
    private List<String> positions;

    public ShopDetail() {
    }

    public ShopDetail(String id, String name, String phone, String city, List<String> positions) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.positions = positions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }
}
