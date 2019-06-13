package com.example.wxxu.adap;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VpAdAp extends FragmentPagerAdapter {
    ArrayList<String> strings ;
    ArrayList<Fragment> fragments ;

    public VpAdAp(FragmentManager fm, ArrayList<String> strings, ArrayList<Fragment> fragments) {
        super(fm);
        this.strings = strings;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
