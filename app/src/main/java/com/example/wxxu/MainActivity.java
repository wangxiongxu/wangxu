package com.example.wxxu;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.wxxu.adap.VpAdAp;
import com.example.wxxu.frag.Frag;
import com.example.wxxu.frag.FragHot;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTab;
    private ViewPager mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTab = (TabLayout) findViewById(R.id.tab);
        mVp = (ViewPager) findViewById(R.id.vp);
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Fragment> fragments = new ArrayList<>();
        strings.add("热门");
        strings.add("关注");
        fragments.add(new FragHot());
        fragments.add(new Frag());
        //调用adap
        VpAdAp vpAdAp = new VpAdAp(getSupportFragmentManager(), strings, fragments);
        //配合vp和tab
        mVp.setAdapter(vpAdAp);
        mTab.setupWithViewPager(mVp);

    }
}
