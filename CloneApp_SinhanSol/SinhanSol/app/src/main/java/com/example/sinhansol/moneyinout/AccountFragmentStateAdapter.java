package com.example.sinhansol.moneyinout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AccountFragmentStateAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> list;


    public AccountFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> list) {
        super(fragmentActivity);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
        return list.get(i);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
