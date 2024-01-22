package com.example.sinhansol.allmenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ItemMenuRecv2Binding;

import java.util.ArrayList;

public class AllMenuAdapter extends RecyclerView.Adapter<AllMenuAdapter.ViewHolder> {


    LayoutInflater inflater;

    ArrayList<String> list;

    Context context;


    public AllMenuAdapter(LayoutInflater inflater, ArrayList<String> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMenuRecv2Binding binding = ItemMenuRecv2Binding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.menuRecv2DetailList.setText(list.get(i));
        h.binding.menuRecv2DetailList.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }







    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemMenuRecv2Binding binding;

        public ViewHolder(@NonNull ItemMenuRecv2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
