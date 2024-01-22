package com.example.sinhansol.moneyinout;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ItemRecvAccountCheckBinding;
import com.example.sinhansol.transfer.TransferToActivity;

public class AccountRecvAdapter extends RecyclerView.Adapter<AccountRecvAdapter.AccountViewHolder> {
    Context context;

    public AccountRecvAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvAccountCheckBinding binding = ItemRecvAccountCheckBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new AccountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder h, int i) {
        h.binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
        h.binding.ready2.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
        h.binding.btnDeposit.setOnClickListener(v -> {
            Intent intent = new Intent(context, TransferToActivity.class);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class AccountViewHolder extends RecyclerView.ViewHolder {
        ItemRecvAccountCheckBinding binding;
        public AccountViewHolder(@NonNull ItemRecvAccountCheckBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
