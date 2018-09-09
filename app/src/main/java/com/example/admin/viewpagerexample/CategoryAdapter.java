package com.example.admin.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new LamborghiniFragment();
        }
        else if(position == 1){
            return new FordFragment();
        }
        else{
            return new BugattiFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
