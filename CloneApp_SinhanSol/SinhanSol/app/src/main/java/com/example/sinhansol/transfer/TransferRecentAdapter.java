package com.example.sinhansol.transfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemTransferRecentBinding;

public class TransferRecentAdapter extends RecyclerView.Adapter<TransferRecentAdapter.RecentViewHolder> {

    @NonNull
    @Override
    public RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTransferRecentBinding binding = ItemTransferRecentBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new RecentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class RecentViewHolder extends RecyclerView.ViewHolder{
        ItemTransferRecentBinding binding;
        public RecentViewHolder(@NonNull ItemTransferRecentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
