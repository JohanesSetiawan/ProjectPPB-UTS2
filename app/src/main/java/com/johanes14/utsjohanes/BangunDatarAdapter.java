package com.johanes14.utsjohanes;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.johanes14.utsjohanes.fragments.LingkaranFragment;
import com.johanes14.utsjohanes.fragments.PersegiFragment;
import com.johanes14.utsjohanes.fragments.SegitigaFragment;

public class BangunDatarAdapter extends FragmentStateAdapter {
    public BangunDatarAdapter(BangunDatar bangunDatar) {
        super(bangunDatar);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new LingkaranFragment();
            case 2:
                return new SegitigaFragment();
            default:
                return new PersegiFragment();
        }
    }
}

