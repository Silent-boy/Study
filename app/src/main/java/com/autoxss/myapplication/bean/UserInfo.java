package com.autoxss.myapplication.bean;

import java.io.Serializable;

/**
 * Created by Huihui on 2017/5/9.
 */
public class UserInfo implements Serializable{
    private String imgUrl;
    private String name;

    public UserInfo() {
    }

    public UserInfo(String imgUrl, String name) {
        this.imgUrl = imgUrl;
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
