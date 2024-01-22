package com.example.sinhansol;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.databinding.FragmentProductBinding;


public class ProductFragment extends Fragment implements View.OnClickListener {

    FragmentProductBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProductBinding.inflate(inflater, container, false);
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
        binding.ready15.setOnClickListener(this);
        binding.ready16.setOnClickListener(this);
        binding.ready17.setOnClickListener(this);
        binding.ready18.setOnClickListener(this);


        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
}