package com.example.sinhansol.transactionhistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvHistoryDailyBinding;

public class HistoryDailyRecvAdapter extends RecyclerView.Adapter<HistoryDailyRecvAdapter.HistoryDailyViewHolder> {

    @NonNull
    @Override
    public HistoryDailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvHistoryDailyBinding binding = ItemRecvHistoryDailyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new HistoryDailyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryDailyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class HistoryDailyViewHolder extends RecyclerView.ViewHolder {
        ItemRecvHistoryDailyBinding binding;

        public HistoryDailyViewHolder(@NonNull ItemRecvHistoryDailyBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
