package com.example.wxxu.frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.wxxu.Main2Activity;
import com.example.wxxu.R;
import com.example.wxxu.adap.AdAp;
import com.example.wxxu.bean.Bean;
import com.example.wxxu.contract.Contract;

import java.util.List;

public class FragHot extends Fragment implements Contract.View {
    private View view;
    private RecyclerView mRec;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.hot, null);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        mRec = (RecyclerView) inflate.findViewById(R.id.rec);
        mRec.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public void getIfView(List<Bean> bean) {
        AdAp adAp = new AdAp(bean);
        mRec.setAdapter(adAp);
        adAp.setOncli(new AdAp.Oncli() {
            @Override
            public void getonli(String url) {
                Intent intent = new Intent(getContext(), Main2Activity.class);
                intent.putExtra("1",url);
                getActivity().startActivity(intent);
            }
        });
    }
}
