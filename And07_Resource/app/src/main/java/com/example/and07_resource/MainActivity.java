package com.example.and07_resource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private class MainActivity extends AppCompatActivity{}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shape_layout);

        Log.d(TAG, "String res : " + R.string);
        Log.d(TAG, "onCreate: ");
    }
}