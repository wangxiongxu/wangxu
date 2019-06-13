package com.example.wxxu;

import android.app.Application;

import com.example.wxxu.bean.Bean;
import com.example.wxxu.dao.DaoMaster;
import com.example.wxxu.dao.DaoSession;

public class MyApp extends Application {

    private static DaoSession daoSession;

    public static DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Bean bean1 = new Bean(0, "https://www.wanandroid.com/resources/image/pc/default_project_img.jpg", "水电费是的发送到发送到",
                "https://www.wanandroid.com/blog/show/2609");
        Bean bean2 = new Bean(1, "https://www.wanandroid.com/resources/image/pc/default_project_img.jpg", "水电费是的发送到发送到",
                "https://www.wanandroid.com/blog/show/2609");
        Bean bean3 = new Bean(2, "https://www.wanandroid.com/resources/image/pc/default_project_img.jpg", "水电费是的发送到发送到",
                "https://www.wanandroid.com/blog/show/2609");
        Bean bean4 = new Bean(1, "https://www.wanandroid.com/resources/image/pc/default_project_img.jpg", "水电费是的发送到发送到",
                "https://www.wanandroid.com/blog/show/2609");
        Bean bean5 = new Bean(2, "https://www.wanandroid.com/resources/image/pc/default_project_img.jpg", "水电费是的发送到发送到",
                "https://www.wanandroid.com/blog/show/2609");
        getdata();
        daoSession.insert(bean1);
        daoSession.insert(bean2);
        daoSession.insert(bean3);
        daoSession.insert(bean4);
        daoSession.insert(bean5);
    }

    private void getdata() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "hj.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        daoSession = daoMaster.newSession();
    }
}
