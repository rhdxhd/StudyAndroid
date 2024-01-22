package com.example.sinhansol.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentEasyHomeBinding;


public class EasyHomeFragment extends Fragment implements View.OnClickListener {

    FragmentEasyHomeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentEasyHomeBinding.inflate(inflater, container, false);

        setOnClick();


        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
    public void setOnClick(){
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
    }
}