package com.example.android.chicagotourapp;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jaron on 9/17/16.
 */
public class AttractionFragmentPagerAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public AttractionFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new LandmarksFragment();
        } else {
            return new BarsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.museums);
        } else if (position == 2) {
            return mContext.getString(R.string.landmarks);
        } else {
            return mContext.getString(R.string.bars);
        }
    }
}
