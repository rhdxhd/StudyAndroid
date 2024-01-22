package com.example.sinhansol.moneyinout;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ItemRecvDepositCheckBinding;

public class DepositRecvAdapter extends RecyclerView.Adapter<DepositRecvAdapter.DepositViewHolder> {
    Context context;

    public DepositRecvAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public DepositViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvDepositCheckBinding binding = ItemRecvDepositCheckBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new DepositViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DepositViewHolder h, int i) {
        h.binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class DepositViewHolder extends RecyclerView.ViewHolder {
        ItemRecvDepositCheckBinding binding;
        public DepositViewHolder(@NonNull ItemRecvDepositCheckBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
