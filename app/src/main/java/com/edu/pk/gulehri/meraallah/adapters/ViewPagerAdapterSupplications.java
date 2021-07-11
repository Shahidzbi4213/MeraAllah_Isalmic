package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishSupplications;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduSupplications;

public class ViewPagerAdapterSupplications extends FragmentPagerAdapter {
    private final int pagesCounter;

    public ViewPagerAdapterSupplications(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        pagesCounter = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentUrduSupplications();
            case 0:
            default:
                return new FragmentEnglishSupplications();
        }
    }

    @Override
    public int getCount() {
        return pagesCounter;
    }
}
