package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishNamaz;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduNamaz;

public class ViewPagerAdapterNamaz extends FragmentPagerAdapter {

    private final int tabCount;

    public ViewPagerAdapterNamaz(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentUrduNamaz();
            case 0:
            default:
                return new FragmentEnglishNamaz();
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
