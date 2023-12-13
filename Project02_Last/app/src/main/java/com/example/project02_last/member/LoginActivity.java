package com.example.project02_last.member;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.project02_last.R;
import com.example.project02_last.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {


    ActivityLoginBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //error..
        Glide.with(this).load("https://c.tenor.com/DtO_BhH5NUAAAAAC/tenor.gif")
                .error(R.drawable.ic_launcher_foreground) // 에러 발생..
                .fallback(R.drawable.ic_launcher_background) // null을 넘김..
                .into(binding.imgvLogo);

    }
}