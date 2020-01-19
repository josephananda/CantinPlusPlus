package com.dscproject.cantinplusplus;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new PageOneOpenFragment();
                break;
            case 1:
                fragment = new PageTwoOpenFragment();
                break;
            case 2:
                fragment = new PageThreeOpenFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
