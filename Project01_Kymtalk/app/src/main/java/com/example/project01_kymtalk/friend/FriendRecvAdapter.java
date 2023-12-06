package com.example.project01_kymtalk.friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemFriendRecvBinding;

import java.util.ArrayList;

public class FriendRecvAdapter extends RecyclerView.Adapter<FriendRecvAdapter.ViewHolder> {

    LayoutInflater inflater;//parent를 이용해서 초기화 하는 방법 나중에.
    ArrayList<FriendDTO> list;

    public FriendRecvAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFriendRecvBinding binding = ItemFriendRecvBinding.inflate(inflater , parent , false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource( list.get(i).getProfileImg() );
        h.binding.tvName.setText( list.get(i).getName() );
        h.binding.tvMsg.setText( list.get(i).getMsg() );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //1.ViewHolder( view )-> Binding을 사용해보기
    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemFriendRecvBinding binding;//모든 위젯 종류를 씀.(사용할거)
        public ViewHolder(@NonNull ItemFriendRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}