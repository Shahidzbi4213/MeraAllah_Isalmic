package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishKalimas;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduKalimas;

public class ViewPagerAdapterKalimas extends FragmentPagerAdapter {
    private final int tabCount;

    public ViewPagerAdapterKalimas(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount  = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return new FragmentUrduKalimas();
            case 0:
            default:
                return new FragmentEnglishKalimas();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
