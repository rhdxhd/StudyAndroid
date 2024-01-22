package com.example.sinhansol.transfer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.ActivityTransferToBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TransferToActivity extends AppCompatActivity {
    ActivityTransferToBinding binding;
    ArrayList<Fragment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransferToBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = getFragmentList();
        changeFragment(list.get(0));
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                changeFragment(list.get(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(this, ReadyActivity.class);
            startActivity(intent);
        });
        binding.backspace.setOnClickListener(v -> {
            finish();
        });

    }
    public void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(binding.container.getId(), fragment).commit();
    }
    public ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new TransferFitFragment());
        list.add(new TransferGroupFragment());
        list.add(new TransferPhoneBookFragment());
        return list;
    }
}