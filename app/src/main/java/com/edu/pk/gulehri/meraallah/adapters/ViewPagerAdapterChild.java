package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishChild;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduChild;

/**
 * Created by Shahid Iqbal on 5/26/2021
 */

public class ViewPagerAdapterChild extends FragmentPagerAdapter {
    private final int tabCount;

    public ViewPagerAdapterChild(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentUrduChild();
            case 0:
            default:
                return new FragmentEnglishChild();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
