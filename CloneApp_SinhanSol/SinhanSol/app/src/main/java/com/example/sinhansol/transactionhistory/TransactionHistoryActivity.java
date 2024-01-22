package com.example.sinhansol.transactionhistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ActivityTransactionHistoryBinding;
import com.example.sinhansol.transfer.TransferToActivity;

import java.util.ArrayList;

public class TransactionHistoryActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityTransactionHistoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransactionHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        HistoryRecvAdapter adapter = new HistoryRecvAdapter(getDate(), this);
        binding.historyRecv.setAdapter(adapter);
        binding.historyRecv.setLayoutManager(new LinearLayoutManager(this));

        binding.ready1.setOnClickListener(this);
        binding.ready2.setOnClickListener(this);
        binding.ready3.setOnClickListener(this);
        binding.backspace.setOnClickListener(v -> {
            finish();
        });
        binding.ready5.setOnClickListener(this);
        binding.deposit.setOnClickListener(v -> {
            Intent intent = new Intent(this, TransferToActivity.class);
            startActivity(intent);
        });

    }
    public ArrayList<String> getDate(){
        ArrayList<String> list = new ArrayList<>();
        list.add("2023.12.04");
        list.add("2023.12.03");
        list.add("2023.12.01");
        return list;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ReadyActivity.class);
        startActivity(intent);
    }
}