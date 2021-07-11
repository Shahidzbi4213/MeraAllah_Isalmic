package com.edu.pk.gulehri.meraallah.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishJanaza;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduJanaza;

public class ViewPagerAdapterJanaza extends FragmentPagerAdapter {
    private final int tabCount;

    public ViewPagerAdapterJanaza(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FragmentUrduJanaza();
            case 0:
            default:
                return new FragmentEnglishJanaza();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
