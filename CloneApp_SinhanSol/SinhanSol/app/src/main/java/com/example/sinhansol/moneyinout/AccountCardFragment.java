package com.example.sinhansol.moneyinout;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentAccountCardBinding;


public class AccountCardFragment extends Fragment {
    FragmentAccountCardBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountCardBinding.inflate(inflater, container, false);
        binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ReadyActivity.class);
            startActivity(intent);
        });
        return binding.getRoot();
    }
}