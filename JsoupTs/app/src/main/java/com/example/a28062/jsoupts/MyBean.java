package com.example.a28062.jsoupts;



/**
 * Created by 28062 on 2018/4/16.
 */

public class MyBean {

    private String detailUrl;
    private String imageUrl;
    private String title;
    private String detail;

    public MyBean(String detailUrl, String imageUrl, String title, String detail){

        this.detail = detail;
        this.detailUrl = detailUrl;
        this.imageUrl = imageUrl;
        this.title = title;
    }


    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
