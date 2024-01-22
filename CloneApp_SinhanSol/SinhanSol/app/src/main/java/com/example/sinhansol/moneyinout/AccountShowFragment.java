package com.example.sinhansol.moneyinout;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentAccountShowBinding;

public class AccountShowFragment extends Fragment implements View.OnClickListener {
    FragmentAccountShowBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountShowBinding.inflate(inflater, container, false);

        AccountRecvAdapter accountAdapter = new AccountRecvAdapter(getContext());
        binding.accountRecv.setAdapter(accountAdapter);
        binding.accountRecv.setLayoutManager(new LinearLayoutManager(getContext()));

        DepositRecvAdapter depositAdapter = new DepositRecvAdapter(getContext());
        binding.depositRecv.setAdapter(depositAdapter);
        binding.depositRecv.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.ready1.setOnClickListener(this);
        binding.ready2.setOnClickListener(this);
        binding.ready3.setOnClickListener(this);
        binding.ready4.setOnClickListener(this);


        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ReadyActivity.class);
        startActivity(intent);
    }
}