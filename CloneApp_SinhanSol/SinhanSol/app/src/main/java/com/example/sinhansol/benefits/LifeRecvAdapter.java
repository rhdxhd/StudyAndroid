package com.example.sinhansol.benefits;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.databinding.ItemRecvLifeTagBinding;

import java.util.ArrayList;

public class LifeRecvAdapter extends RecyclerView.Adapter<LifeRecvAdapter.LifeViewHolder> {

    Context context;
    ArrayList<ArrayList<LifeDTO>> list;

    public LifeRecvAdapter(Context context, ArrayList<ArrayList<LifeDTO>> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public LifeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvLifeTagBinding binding = ItemRecvLifeTagBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LifeViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LifeViewHolder h, int i) {
        h.binding.tagTitle.setText(list.get(i).get(0).getTitle());
        h.binding.recvLifeDetail.setAdapter(new LifeDetailRecvAdapter(list.get(i), context));
        h.binding.recvLifeDetail.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LifeViewHolder extends RecyclerView.ViewHolder{
        ItemRecvLifeTagBinding binding;
        public LifeViewHolder(@NonNull ItemRecvLifeTagBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
