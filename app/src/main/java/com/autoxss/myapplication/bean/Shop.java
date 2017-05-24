package com.autoxss.myapplication.bean;

import java.util.List;

/**
 * Created by Huihui on 2017/5/10.
 */
public class Shop {
    private ShopDetail shopDetail;
    private String comments_count;
    private List<Suites> suites;

    public Shop() {
    }

    public Shop(ShopDetail shopDetail, String comments_count, List<Suites> suites) {
        this.shopDetail = shopDetail;
        this.comments_count = comments_count;
        this.suites = suites;
    }

    public ShopDetail getShopDetail() {
        return shopDetail;
    }

    public void setShopDetail(ShopDetail shopDetail) {
        this.shopDetail = shopDetail;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

    public List<Suites> getSuites() {
        return suites;
    }

    public void setSuites(List<Suites> suites) {
        this.suites = suites;
    }
}
