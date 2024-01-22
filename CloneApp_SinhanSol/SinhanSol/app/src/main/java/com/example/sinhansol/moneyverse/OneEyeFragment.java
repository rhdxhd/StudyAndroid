package com.example.sinhansol.moneyverse;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentOneEyeBinding;

public class OneEyeFragment extends Fragment implements View.OnClickListener {
    FragmentOneEyeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOneEyeBinding.inflate(inflater, container, false);
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
        binding.tv5.setOnClickListener(this);



        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
}