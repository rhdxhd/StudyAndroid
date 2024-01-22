package com.example.sinhansol.transactionhistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvHistoryBinding;

import java.util.ArrayList;

public class HistoryRecvAdapter extends RecyclerView.Adapter<HistoryRecvAdapter.HistoryViewHolder> {
    ArrayList<String> list;
    Context context;

    public HistoryRecvAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvHistoryBinding binding = ItemRecvHistoryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new HistoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder h, int i) {
        h.binding.historyDate.setText(list.get(i));
        HistoryDailyRecvAdapter adapter = new HistoryDailyRecvAdapter();
        h.binding.recvDaily.setAdapter(adapter);
        h.binding.recvDaily.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder{
        ItemRecvHistoryBinding binding;
        public HistoryViewHolder(@NonNull ItemRecvHistoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
