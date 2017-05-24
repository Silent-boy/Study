package com.autoxss.myapplication.bean;

import java.io.Serializable;

/**
 * Created by Huihui on 2017/5/10.
 */
public class Ware implements Serializable{
    private String sale_price;
    private String name;

    public Ware() {
    }

    public Ware(String sale_price, String name) {
        this.sale_price = sale_price;
        this.name = name;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
