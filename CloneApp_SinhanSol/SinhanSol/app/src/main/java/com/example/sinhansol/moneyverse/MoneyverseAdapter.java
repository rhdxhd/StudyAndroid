package com.example.sinhansol.moneyverse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ItemRecvMeneyverseBinding;

import java.util.ArrayList;

public class MoneyverseAdapter extends RecyclerView.Adapter<MoneyverseAdapter.MoneyverseViewHolder> {
    LayoutInflater inflater;
    Context context;
    ArrayList<MoneyverseDTO> list;

    public MoneyverseAdapter(LayoutInflater inflater, Context context, ArrayList<MoneyverseDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MoneyverseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvMeneyverseBinding binding = ItemRecvMeneyverseBinding.inflate(inflater, parent, false);
        return new MoneyverseViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MoneyverseViewHolder h, int i) {
        h.binding.tvTitle.setText(list.get(i).getTv_title());
        if(list.get(i).getTv_subtitle() == null){
            h.binding.tvSubtitle.setVisibility(View.GONE);
        } else {
            h.binding.tvSubtitle.setText(list.get(i).getTv_subtitle());
        }
        if(list.get(i).getTv_context() == null){
            h.binding.tvContext.setVisibility(View.GONE);
        } else {
            h.binding.tvContext.setText(list.get(i).getTv_context());
        }
        if(list.get(i).getTv_btn() == null){
            h.binding.tvBtn.setVisibility(View.GONE);
        } else {
            h.binding.tvBtn.setText(list.get(i).getTv_btn());
        }
        if(list.get(i).getImgv_src() == 0){
            h.binding.imgv.setVisibility(View.GONE);
        } else {
            h.binding.imgv.setImageResource(list.get(i).getImgv_src());
        }
        if(list.get(i).getBackground() != 0){
            h.binding.box.setBackground(context.getDrawable(R.drawable.round_corner_blue));
            h.binding.tvTitle.setTextColor(h.binding.getRoot().getResources().getColor(R.color.white));
            h.binding.tvSubtitle.setTextColor(h.binding.getRoot().getResources().getColor(R.color.white));
            h.binding.tvContext.setTextColor(h.binding.getRoot().getResources().getColor(R.color.white));
            h.binding.tvBtn.setTextColor(h.binding.getRoot().getResources().getColor(R.color.white));
        }
        h.binding.tvBtn.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
        h.binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(context, ReadyActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MoneyverseViewHolder extends RecyclerView.ViewHolder {
        ItemRecvMeneyverseBinding binding;
        public MoneyverseViewHolder(@NonNull ItemRecvMeneyverseBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
