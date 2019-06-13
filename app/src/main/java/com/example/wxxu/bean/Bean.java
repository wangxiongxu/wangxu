package com.example.wxxu.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class Bean {
    @Id
    private Long id;
    private int title;
    private String biaoti;
    private String miaoshu;
    private String url;

    public Bean(int title, String biaoti, String miaoshu, String url) {
        this.title = title;
        this.biaoti = biaoti;
        this.miaoshu = miaoshu;
        this.url = url;
    }

    @Generated(hash = 939524826)
    public Bean(Long id, int title, String biaoti, String miaoshu, String url) {
        this.id = id;
        this.title = title;
        this.biaoti = biaoti;
        this.miaoshu = miaoshu;
        this.url = url;
    }
    @Generated(hash = 80546095)
    public Bean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getTitle() {
        return this.title;
    }
    public void setTitle(int title) {
        this.title = title;
    }
    public String getBiaoti() {
        return this.biaoti;
    }
    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti;
    }
    public String getMiaoshu() {
        return this.miaoshu;
    }
    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}
