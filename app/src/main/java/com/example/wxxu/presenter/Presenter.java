package com.example.wxxu.presenter;

import com.example.wxxu.bean.Bean;
import com.example.wxxu.contract.CallBack;
import com.example.wxxu.contract.Contract;
import com.example.wxxu.model.Model;

import java.util.List;

public class Presenter implements Contract.Presenter {
    Contract.View view;
    private final Model model;

    public Presenter(Contract.View view) {
        this.view = view;
        model = new Model();

    }

    @Override
    public void getPresenter() {
        model.getModel(new CallBack() {
            @Override
            public void getCa(List<Bean> b) {
                view.getIfView(b);
            }
        });
    }
}
