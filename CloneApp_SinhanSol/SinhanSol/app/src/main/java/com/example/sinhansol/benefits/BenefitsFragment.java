package com.example.sinhansol.benefits;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentBenefitsBinding;
import com.google.android.material.tabs.TabLayout;


public class BenefitsFragment extends Fragment {
    FragmentBenefitsBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBenefitsBinding.inflate(inflater, container, false);
        binding.tabNav.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==0){

                } else {
                    getChildFragmentManager().beginTransaction().replace(container.getId(), new BenefitsLifeFragment()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        binding.tabNav.selectTab(binding.tabNav.getTabAt(0));
        binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ReadyActivity.class);
            startActivity(intent);
        });


        return binding.getRoot();
    }
}