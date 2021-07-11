package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishAblution;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduAblution;

public class ViewPagerAdapterAblution extends FragmentPagerAdapter {
    private final int TabCount;

    public ViewPagerAdapterAblution(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        TabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentUrduAblution();
            case 0:
            default:
                return new FragmentEnglishAblution();
        }

    }

    @Override
    public int getCount() {
        return TabCount;
    }
}
