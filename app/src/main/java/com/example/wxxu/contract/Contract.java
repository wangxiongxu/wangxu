package com.example.wxxu.contract;

import com.example.wxxu.bean.Bean;

import java.util.List;

public interface Contract {
    interface Model {
       void getModel(CallBack callBack);
    }

    interface View {
        void getIfView(List<Bean> bean);
    }

    interface Presenter {
        void getPresenter();
    }
}
