package com.example.sinhansol.transfer;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentTransferGroupBinding;


public class TransferGroupFragment extends Fragment implements View.OnClickListener {
    FragmentTransferGroupBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTransferGroupBinding.inflate(inflater, container, false);

        binding.ready1.setOnClickListener(this);
        binding.ready2.setOnClickListener(this);



        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
}