package com.example.sinhansol.benefits;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ItemRecvLifeBinding;

import java.util.ArrayList;

public class BenefitsLifeRecvAdapter extends RecyclerView.Adapter<BenefitsLifeRecvAdapter.LifeRecvViewHolder> {
    ArrayList<BenefitsDTO> list;
    Context context;

    public BenefitsLifeRecvAdapter(ArrayList<BenefitsDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public LifeRecvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvLifeBinding binding = ItemRecvLifeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LifeRecvViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LifeRecvViewHolder h, int position) {
        int i = position%5;
        h.binding.imgv.setImageResource(list.get(i).getImgRes());
        h.binding.title.setText(list.get(i).getTitle());
        h.binding.tv1.setText(list.get(i).getContent1());
        h.binding.tv2.setText(list.get(i).getContent2());
        h.binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public class LifeRecvViewHolder extends RecyclerView.ViewHolder {
        ItemRecvLifeBinding binding;
        public LifeRecvViewHolder(@NonNull ItemRecvLifeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
