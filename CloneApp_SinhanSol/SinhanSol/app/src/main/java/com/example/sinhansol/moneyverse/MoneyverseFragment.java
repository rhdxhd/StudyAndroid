package com.example.sinhansol.moneyverse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.databinding.FragmentMoneyverseBinding;
import com.google.android.material.tabs.TabLayout;

public class MoneyverseFragment extends Fragment {
    FragmentMoneyverseBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMoneyverseBinding.inflate(inflater, container, false);
        getChildFragmentManager().beginTransaction().replace(binding.container.getId(), new OneEyeFragment()).commit();
        binding.tabNav.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0) {
                    getChildFragmentManager().beginTransaction().replace(binding.container.getId(), new OneEyeFragment()).commit();
                } else if(tab.getPosition() == 1){
                    getChildFragmentManager().beginTransaction().replace(binding.container.getId(), new MoneyFragment()).commit();
                } else if(tab.getPosition() == 2){
                    getChildFragmentManager().beginTransaction().replace(binding.container.getId(), new SpendFragment()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return binding.getRoot();
    }
}