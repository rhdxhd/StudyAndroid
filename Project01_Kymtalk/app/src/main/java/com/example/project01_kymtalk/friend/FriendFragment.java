package com.example.project01_kymtalk.friend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_kymtalk.R;
import com.example.project01_kymtalk.databinding.FragmentFriendBinding;

public class FriendFragment extends Fragment {
    FragmentFriendBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFriendBinding.inflate(inflater , container , false);


        return binding.getRoot();
    }
}