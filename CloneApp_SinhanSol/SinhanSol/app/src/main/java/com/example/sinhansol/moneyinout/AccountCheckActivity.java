package com.example.sinhansol.moneyinout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.ActivityAccountCheckBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class AccountCheckActivity extends AppCompatActivity {
    ActivityAccountCheckBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAccountCheckBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        AccountFragmentStateAdapter adapter = new AccountFragmentStateAdapter(this,getFragmentList());
        binding.pager2.setAdapter(adapter);

        binding.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                binding.accountCheckTab.getTabAt(i).select();
            }
        });
        binding.accountCheckTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        binding.backspace.setOnClickListener(v -> {
            finish();
        });

    }
    public ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new AccountShowFragment());
        list.add(new AccountCardFragment());
        list.add(new AccountPointFragment());


        return list;
    }
}