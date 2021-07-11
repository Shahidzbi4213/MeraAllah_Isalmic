package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishHajj;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduHajj;

public class ViewPagerHajjAdaptor extends FragmentPagerAdapter {

    private final int tabCount;

    public ViewPagerHajjAdaptor(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentUrduHajj();
            case 0:
            default:
                return new FragmentEnglishHajj();
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
