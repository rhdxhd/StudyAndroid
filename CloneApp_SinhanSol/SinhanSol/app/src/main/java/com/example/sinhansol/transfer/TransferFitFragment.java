package com.example.sinhansol.transfer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentTransferFitBinding;


public class TransferFitFragment extends Fragment {
    FragmentTransferFitBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTransferFitBinding.inflate(inflater, container, false);


        binding.recvMyAccount.setAdapter(new TransferMyRecvAdapter());
        binding.recvMyAccount.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recvRecent.setAdapter(new TransferRecentAdapter());
        binding.recvRecent.setLayoutManager(new LinearLayoutManager(getContext()));


        return binding.getRoot();
    }
}