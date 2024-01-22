package com.example.sinhansol.transfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemTransferMyBinding;

public class TransferMyRecvAdapter extends RecyclerView.Adapter<TransferMyRecvAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTransferMyBinding binding = ItemTransferMyBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ItemTransferMyBinding binding;
        public MyViewHolder(@NonNull ItemTransferMyBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
