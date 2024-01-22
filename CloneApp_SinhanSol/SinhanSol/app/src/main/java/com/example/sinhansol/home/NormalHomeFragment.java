package com.example.sinhansol.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.AccountAdapter;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentNormalHomeBinding;
import com.example.sinhansol.moneyinout.AccountCheckActivity;


public class NormalHomeFragment extends Fragment implements View.OnClickListener{
    FragmentNormalHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNormalHomeBinding.inflate(inflater, container, false);
        binding.viewpager2.setAdapter(new AccountAdapter(inflater, getContext()));
        binding.viewpager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        binding.viewpager2.setClipToPadding(false);
        binding.viewpager2.setClipChildren(false);
        binding.viewpager2.setOffscreenPageLimit(1);
        binding.viewpager2.setPadding(50, 0, 50, 0);
        binding.viewpager2.setPageTransformer(new MarginPageTransformer(25));
        binding.viewpager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int i) {
                super.onPageSelected(i);

            }
        });
        binding.accountCheck.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), AccountCheckActivity.class);

            startActivity(intent);
        });
        binding.ready1.setOnClickListener(this);
        binding.ready2.setOnClickListener(this);
        binding.ready3.setOnClickListener(this);
        binding.ready4.setOnClickListener(this);
        binding.ready5.setOnClickListener(this);
        binding.ready6.setOnClickListener(this);
        binding.ready7.setOnClickListener(this);
        binding.ready8.setOnClickListener(this);
        binding.ready9.setOnClickListener(this);
        binding.ready10.setOnClickListener(this);
        binding.ready11.setOnClickListener(this);
        binding.ready12.setOnClickListener(this);
        binding.ready13.setOnClickListener(this);
        binding.ready14.setOnClickListener(this);


        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
}