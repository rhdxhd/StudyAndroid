package com.example.sinhansol.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        getChildFragmentManager().beginTransaction().replace(binding.container.getId(),new NormalHomeFragment()).commit();


        return binding.getRoot();
    }
    public void changeFragment(boolean isChecked){
        if(isChecked) {
            getChildFragmentManager().beginTransaction().replace(binding.container.getId(), new NormalHomeFragment()).commit();
        } else {
            getChildFragmentManager().beginTransaction().replace(binding.container.getId(),new EasyHomeFragment()).commit();
        }
    }
}