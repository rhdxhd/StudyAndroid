package com.example.project02_last;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project02_last.databinding.ItemRecvCusBinding;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    LayoutInflater inflater;


    public CustomerAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvCusBinding binding = ItemRecvCusBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

    }

    @Override
    public int getItemCount() {
        return ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemRecvCusBinding binding;

        public ViewHolder(@NonNull ItemRecvCusBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
