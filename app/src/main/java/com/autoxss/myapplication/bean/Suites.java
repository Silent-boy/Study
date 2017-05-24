package com.autoxss.myapplication.bean;

import java.util.List;

/**
 * Created by Huihui on 2017/5/10.
 */
public class Suites {
    private String id;
    private String name;
    private String origin_price;
    private List<Ware> wares;

    public Suites() {
    }

    public Suites(String id, String name, String origin_price, List<Ware> wares) {
        this.id = id;
        this.name = name;
        this.origin_price = origin_price;
        this.wares = wares;
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

    public String getOrigin_price() {
        return origin_price;
    }

    public void setOrigin_price(String origin_price) {
        this.origin_price = origin_price;
    }

    public List<Ware> getWares() {
        return wares;
    }

    public void setWares(List<Ware> wares) {
        this.wares = wares;
    }
}
