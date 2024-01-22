package com.example.sinhansol.benefits;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ItemRecvLifeTagDetailBinding;

import java.util.ArrayList;

public class LifeDetailRecvAdapter extends RecyclerView.Adapter<LifeDetailRecvAdapter.LifeDetailViewHolder> {
    ArrayList<LifeDTO> list;
    Context context;

    public LifeDetailRecvAdapter(ArrayList<LifeDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public LifeDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvLifeTagDetailBinding binding = ItemRecvLifeTagDetailBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LifeDetailViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LifeDetailViewHolder h, int i) {
        h.binding.itemTitle.setText(list.get(i+1).getTitle());
        h.binding.imgv.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
        h.binding.imgv.setImageResource(list.get(i+1).getImgRes());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LifeDetailViewHolder extends RecyclerView.ViewHolder{
        ItemRecvLifeTagDetailBinding binding;
        public LifeDetailViewHolder(@NonNull ItemRecvLifeTagDetailBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
