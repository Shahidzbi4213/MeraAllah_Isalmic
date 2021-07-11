package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentZakkatEnglish;
import com.edu.pk.gulehri.meraallah.fragments.FragmentZakkatUrdu;

public class ViewPagerAdapterZakkat extends FragmentPagerAdapter {
    private final int tabCount;

    public ViewPagerAdapterZakkat(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentZakkatUrdu();
            case 0:
            default:
                return new FragmentZakkatEnglish();
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
