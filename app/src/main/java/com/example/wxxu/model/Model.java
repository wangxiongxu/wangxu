package com.example.wxxu.model;

import com.example.wxxu.MyApp;
import com.example.wxxu.bean.Bean;
import com.example.wxxu.contract.CallBack;
import com.example.wxxu.contract.Contract;
import com.example.wxxu.dao.DaoSession;

import java.util.List;

public class Model implements Contract.Model {
    @Override
    public void getModel(CallBack callBack) {
        DaoSession daoSession = MyApp.getDaoSession();
        List<Bean> beans = daoSession.loadAll(Bean.class);
        callBack.getCa(beans);
    }
}
